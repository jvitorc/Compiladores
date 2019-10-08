grammar gramaticaAntlr;

program: statement
        |
        ;

statement: vardecl ENDLINE
        | atribstat ENDLINE
        | printstat ENDLINE
        | readstat ENDLINE
        | returnstat ENDLINE
        | ifstat 
        | forstat
        | CHAVEA statelist CHAVEF
        | BREAK ENDLINE
        | ENDLINE
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

forstat: FOR PARENTEA atribstat ENDLINE expression ENDLINE atribstat PARENTEF statement;

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
IDENT: [a-zA-Z][a-zA-Z0-9_]*;
INT_CONSTANT: [0-9]+;
FLOAT_CONSTANT: '0.0' | [1-9][0-9]*'.'[0-9]+;
STRING_CONSTANT: '"'[a-zA-Z_0-9]*'"';
WS : [ \t\r\n]+ -> skip;