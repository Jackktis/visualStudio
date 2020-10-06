grammar impl;

/* A small imperative language */

start   :  cs+=command* EOF ;

program : c=command                                          # SingleCommand
	| '{' cs+=command* '}'                                   # MultipleCommands
	;
	
command : x=ID '=' e=expr ';'	                             # Assignment
	| 'output' e=expr ';'                                    # Output
	| 'if' '(' c=condition ')' p=program                     # if               // mellem tuborg parateserne skal der stå program
	| 'if' '(' c=condition ')' p=program ('else' p2=program)+	#IfElseStmt
	| 'if' '(' con1=condition ')' p=program ('elseif' '(' con2=condition ')' p2=program ) ( 'else' p3=program )+ #ElseIfStmt
    | 'while' '('c=condition')' p=program                    # WhileLoop
	;
	
expr : c=CONST                                               # Constant 
     | e1=expr op=MULDEV e2=expr                             # Multiplication
     | e1=expr op=ADDSUB e2=expr                             # Addition
     | op=ADDSUB e=expr                                      # Minus
	 | x=ID		                                             # Variable
     | '(' e=expr ')'                                        # Parenthesis 
     ;

condition :  e1=expr op=COMPARE e2=expr                      # CompareExpressions
	  | con1=condition op=AND con2=condition 		         # And
	  | con1=condition op=OR con2=condition 		         # Or
	  ;  


// -------------------------------------------- statements ------------------------------------------------------
/* 
stat : if_stat 
     | while_stat
	 ;

if_stat : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?;

while_stat : WHILE expr stat_block;

condition_block
 : expr stat_block
 ;

stat_block
 : OBRACE block CBRACE
 | stat
 ;

block
 : stat*
 ;
*/
// --------------------------------------------- grammar -------------------------------------------------------

NOT : '!';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
IF : 'if';
ELSE : 'else';
WHILE : 'while';

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
