grammar gramatica;

program: statement 
    | funclist 
    |
    ;

funclist: funcdef funclist 
        | funcdef
        ;

funcdef: DEF IDENT PARENTEA paramlist PARENTEF CHAVEA statelist CHAVEF;


a returns [value]: INT {$value = 'int'} 
    | FLOAT {$value = 'float'}
    | STRING {$value = 'string'}
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

b[inhr] returns [syn]: COLCHA INT_CONSTANT COLCHF b["vector(%s, %s)" %($inhr, $INT_CONSTANT.text)] {$syn = $b.syn}
    | {$syn = $inhr}
    ;

vardecl: a IDENT b[$a.value] {insert_symbol_table($IDENT.text, $b.syn)};

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

maisoumenos returns [value]: MAIS {$value = $MAIS.text} 
    | MENOS {$value = $MENOS.text}
    ;

e[inhr] returns [syn]: maisoumenos term e[Node($maisoumenos.value, $inhr, $term.node)] {$syn = $e.syn}
    | {$syn = $inhr}
    ;

numexpression returns [$node]: term e[$term.node] {$node = $term.node} {insert_expression_table($e.syn.pre_order([]))};

mdm returns [value]: MULTIPLICACAO {$value = $MULTIPLICACAO.text}
    | DIVISAO {$value = $DIVISAO.text}
    | MODULO {$value = $MODULO.text}
     ;

f[inhr] returns [syn]: mdm unaryexpr f[Node($mdm.value, $inhr, $unaryexpr.node)] {$syn = $f.syn}
    | {$syn = $inhr}
    ;

term returns [node]: unaryexpr f[$unaryexpr.node] {$node = $f.syn};

unaryexpr returns [node]: maisoumenos factor {$node = Node($maisoumenos.value, right=$factor.node)}
    | factor {$node = $factor.node}
    ;


factor returns [node]: INT_CONSTANT {$node = Leaf('INT_CONSTANT', $INT_CONSTANT.text) }
    | FLOAT_CONSTANT {$node = Leaf('FLOAT_CONSTANT', $FLOAT_CONSTANT.text)}
    | STRING_CONSTANT {$node = Leaf('STRING_CONSTANT', $STRING_CONSTANT.text)}
    | NULL {$node = Leaf('NULL.type', $NULL.text)}
    | lvalue {$node = $lvalue.node}
    | PARENTEA numexpression {$node = $numexpression.node} PARENTEF
    ;

g: COLCHA numexpression COLCHF g
    |
    ;

lvalue returns [node]: IDENT {$node = Leaf('IDENT', $IDENT.text)} g;

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