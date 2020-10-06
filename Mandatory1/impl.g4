grammar impl;

/* A small imperative language */

start   :  cs+=command* EOF ;

program : c=command                                          # SingleCommand
	| '{' cs+=command* '}'                                   # MultipleCommands
	;
	
command : x=ID '=' e=expr ';'	                             # Assignment
	| x=ID '[' e1=expr ']' '=' e2=expr ';'					 # Array
	| 'output' e=expr ';'                                    # Output
	| 'if' '(' con1=condition ')' p=program ('else' p2=program)+	#IfElseStmt
	| 'if' '(' con1=condition ')' p=program ('elseif' '(' con2=condition ')' p2=program ) ( 'else' p3=program )+ #ElseIfStmt
    | 'while' '('con1=condition')' p=program                 # WhileLoop
	//| 'for' '(' i=expr '..' n=expr')' p=program              #ForI
	;
	
expr : c=CONST                                               # Constant 
     | e1=expr op=MULDEV e2=expr                             # Multiplication
     | e1=expr op=ADDSUB e2=expr                             # Addition
     | op=ADDSUB e=expr                                      # Minus
	 | x=ID		                                             # Variable
	 | x=ID '[' e1=expr ']'								     # ArrayVar
     | '(' e=expr ')'                                        # Parenthesis 
     ;

condition :  e1=expr op=COMPARE e2=expr                      # CompareExpressions
	  | con1=condition op=AND con2=condition 		         # And
	  | con1=condition op=OR con2=condition 		         # Or
	  ;  


MULDEV : ('*' | '/');
ADDSUB : ('+' | '-');

CONST : [0-9]+ ('.' [0-9]+)? ;             

COMPARE : ('!=' | '==' | '>' | '<' | '>=' | '<=');
AND : ('&&');
OR : ('||');
ID    : ALPHA (ALPHA|NUM)* ;	
FLOAT : '-'? NUM+ ('.' NUM+)? ;

ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;
