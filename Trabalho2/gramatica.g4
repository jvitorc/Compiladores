grammar gramatica;

program: statement 
    | funclist 
    |
    ;

funclist: funcdef funclist 
        | funcdef
        ;

funcdef: DEF IDENT PARENTEA paramlist PARENTEF CHAVEA statelist CHAVEF;


a: INT 
    | FLOAT 
    | STRING
    ;

paramlist: a IDENT VIRGULA paramlist 
        | a IDENT
        ;

statement: vardecl PONTOEVIRGULA 
    | atribstat PONTOEVIRGULA
    | printstat PONTOEVIRGULA
    | readstat PONTOEVIRGULA
    | returnstat PONTOEVIRGULA
    | ifstat
    | forstat
    | CHAVEA statelist CHAVEF
    | BREAK PONTOEVIRGULA
    | PONTOEVIRGULA
    ;

b: COLCHA INT_CONSTANT COLCHF b
    |
    ;

vardecl: a IDENT b;

c: expression
    | allocexpression
    | funccall
    ;

atribstat: lvalue ATRIBUICAO c;


funccall: IDENT PARENTEA paramlistcall PARENTEF;

paramlistcall: IDENT VIRGULA paramlistcall 
    | IDENT
    |
    ;

printstat: PRINT expression;

readstat: READ lvalue;

returnstat: RETURN;

ifstat: IF PARENTEA expression PARENTEF statement;

forstat: FOR PARENTEA atribstat PONTOEVIRGULA expression PONTOEVIRGULA atribstat PARENTEF statement;

statelist: statement statelist
    | statement
    ;

d: CHAVEA numexpression CHAVEF
    | CHAVEA numexpression CHAVEF d
    ;

allocexpression: NEW a d;

comparadores: MENORQUE 
    | MAIORQUE
    | MENOREIGUAL 
    | MAIOREIGUAL 
    | IGUAL
    | DIFERENTE
    ;

expression: numexpression comparadores numexpression
    | numexpression
    ;

maisoumenos: MAIS 
    | MENOS
    ;

e: maisoumenos term e
    |
    ;

numexpression: term e;

mdm: MULTIPLICACAO 
    | DIVISAO 
    | MODULO
    ;

f: mdm unaryexpr f
    |
    ;

term: unaryexpr f;

unaryexpr: maisoumenos factor
    | factor
    ;


factor: INT_CONSTANT
    | FLOAT_CONSTANT
    | STRING_CONSTANT
    | NULL
    | lvalue
    | PARENTEA numexpression PARENTEF
    ;

g: COLCHA numexpression COLCHF g
    |
    ;

lvalue: IDENT g;

DEF: 'def';
INT: 'int';
STRING: 'string';
FLOAT: 'float';
BREAK: 'break';
ATRIBUICAO: '=';
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
VIRGULA: ',';
PONTOEVIRGULA: ';';
MENORQUE: '<';
MAIORQUE: '>';
MENOREIGUAL: '<=';
MAIOREIGUAL: '>=';
IGUAL: '==';
DIFERENTE: '!=';
MAIS: '+';
MENOS: '-';
MULTIPLICACAO: '*';
DIVISAO: '/';
MODULO: '%';

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