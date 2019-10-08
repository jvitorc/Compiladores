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
NULL: 'null';
NEW: 'new';
COMPARADORES: '<' | '>' | '<=' | '>=' | '==' | '!=';
MAISOUMENOS: '+' | '-';
MDP: '*' | '/' | '%';

// Caracteres especiais
fragment CESPECIAL:
(
':'
| ';'
| '.'
| ','
| '+'
| '-'
| '*'
| '/'
| '%'
| '?'
| '!'
| '|'
| ' '
| '_'
| '['
| ']'
| '('
| ')'
| '{'
| '}'
| '<'
| '>'
| '@'
| '#'
| '$'
| '^'
| '&'
| '~'
| [\u0060]
| [\u005C]
| [\u00C0-\u00C5]
| [\u00C7-\u00CF]
| [\u00D1-\u00D6]
| [\u00D9-\u00DC]
| [\u00E0-\u00E4]
| [\u00E7-\u00EF]
| [\u00F2-\u00F6]
| [\u00F9-\u00FC]
);


// TOKENS IDENTIFICADOR DE PALAVRAS DIVERSAS
IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
INT_CONSTANT: '0' | ('1'..'9')('0'..'9')*;
FLOAT_CONSTANT: ( '0' | ('1'..'9')('0'..'9')* )'.'('0'..'9')+;
STRING_CONSTANT:  '"'('a'..'z'|'A'..'Z'|'_'|'0'..'9'| CESPECIAL)*'"';
WS : [ \r\t\n]+ -> skip;
