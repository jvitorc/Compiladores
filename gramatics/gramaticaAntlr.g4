grammar gramaticaAntlr;

program: statement
        |
        ;

statement: vardecl ENDLINE # BinaryOp
        | atribstat ENDLINE #BinaryOp
        | printstat ENDLINE #BinaryOp
        | readstat ENDLINE #BinaryOp
        | returnstat ENDLINE #BinaryOp
        | ifstat ENDLINE #BinaryOp
        | forstat ENDLINE #BinaryOp
        | CHAVEA statelist CHAVEF #BinaryListOp
        | BREAK ENDLINE #Break
        | ENDLINE #EndLine
        ;

vardecl: a IDENT b;

a:  INT
    | FLOAT
    | STRING
    ;
b:  COLCHA INT_CONSTANT COLCHF
    | COLCHA INT_CONSTANT COLCHF b
    |
    ;

atribstat:  lvalue EQUAL expression
            | lvalue EQUAL allocexpression
            ;

printstat: PRINT expression;
readstat: READ lvalue;
returnstat: RETURN;

ifstat: IF PARENTEA expression PARENTEF statement
        | IF PARENTEA expression PARENTEF statement ELSE statement
        ;

forstat: FOR PARENTEA atribstat ENDLINE numexpression ENDLINE atribstat PARENTEF statement;

statelist: statement
            | statement statelist
            ;

allocexpression: NEW a c;

c: COLCHA expression COLCHF
    | COLCHA expression COLCHF c
    ;

expression: numexpression
            | numexpression COMPARADORES numexpression
            ;


numexpression: term n;

n: MAISOUMENOS term
        | MAISOUMENOS term n
        |
        ;

term: unaryexpr e;

// MDP : * , / , %
e:  MDP unaryexpr
    | MDP unaryexpr e
    |
    ;

unaryexpr: MAISOUMENOS factor 
        | factor
        ;

factor: INT_CONSTANT
        | FLOAT_CONSTANT
        | STRING_CONSTANT
        | NULL
        | lvalue
        | PARENTEA expression PARENTEF
        ;

lvalue: IDENT g;

g: COLCHA expression COLCHF
  | COLCHA expression COLCHF g
  |
  ;

// DEFINIR TOKEN

INT: 'int';
STRING: 'string';
FLOAT: 'float';
BREAK: 'break';
ENDLINE : ';';
EQUAL: '=';
PRINT: 'print';
CHAVEA: '{';
CHAVEF: '}';
COLCHA: '[';
COLCHF: ']';
READ: 'read';
RETURN: 'return';
PARENTEA: '(';
PARENTEF: ')';
IF: 'if';
ELSE: 'else';
FOR: 'for';
NEW: 'new';
COMPARADORES: '<' | '>' | '<=' | '>=' | '==' | '!=';
MAISOUMENOS: '+' | '-';
MDP: '*' | '/' | '%';
NULL: 'null';

// TOKENS IDENTIFICADOR DE PALAVRAS DIVERSAS
IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
INT_CONSTANT: '0' | ('1'..'9')('0'..'9')*;
FLOAT_CONSTANT: ( '0' | ('1'..'9')('0'..'9')* )'.'('0'..'9')+;
STRING_CONSTANT:  '"'('a'..'z'|'A'..'Z'|'_'|'0'..'9')*'"';
WS : '[ \r\t\n]+' -> skip;