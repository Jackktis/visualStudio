grammar impl;

/* A small imperative language */

start   :  cs+=command* EOF ;

program : c=command                        # SingleCommand
	| '{' cs+=command* '}'                 # MultipleCommands
	;
	
command : x=ID '=' e=expr ';'	           # Assignment
	| 'output' e=expr ';'                  # Output
    | 'while' '('c=condition')' p=program  # WhileLoop
	;
	
expr : c=CONST                             # Constant 
     | e1=expr op=MULDEV e2=expr           # Multiplication
     | e1=expr op=ADDSUB e2=expr           # Addition
     | op=ADDSUB e=expr                    # Minus
	 | x=ID		                           # Variable
     | '(' e=expr ')'                      # Parenthesis 
     ;

MULDEV : ('*' | '/');
ADDSUB : ('+' | '-');

CONST : [0-9]+ ('.' [0-9]+)? ;             


condition : e1=expr '!=' e2=expr           		# Unequal
	  | e1=expr '==' e2=expr               		# equal
	  | con1=condition '&&' con2=condition 		# and
	  | e1=expr '>' e2=expr						# Greater_than
	  | e1=expr '>=' e2=expr					# Greater_than_or_equals
	  | e1=expr '<' e2=expr						# Lesser_than
	  | e1=expr '<=' e2=expr					# Lesser_than_or_equals
	  ;  

COMPARE : ('!=' | '==');

ID    : ALPHA (ALPHA|NUM)* ;	
FLOAT : '-'? NUM+ ('.' NUM+)? ;

ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
