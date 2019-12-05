grammar gramatica;

program returns[code, next]: {$next = Label()} statement[$next] {$code = $statement.code + getLabel($next)} {print(getCode($code))}
    | funclist[$next] {$code = $funclist.code} {print(getCode($code))}
    | {$code = " "} {print(getCode($code))}
    ;

funclist[next] returns [code, begin]: {$begin = Label()} funcdef[$begin] funclist[$next] {$code = $funcdef.code + getLabel($begin) + $funclist.code}
        | funcdef[$begin] {$code = $funcdef.code}
        ;

funcdef[next] returns[begin, code]: {$begin = Label()} DEF IDENT PARENTEA paramlist PARENTEF CHAVEA statelist[$next] CHAVEF;

a returns [value]: INT {$value = $INT.text} 
    | FLOAT {$value = FLOAT.text}
    | STRING {$value = STRING.text}
    ;

paramlist: a IDENT VIRGULA paramlist 
        | a IDENT
        ;

statement[next] returns [code]: vardecl PONTOEVIRGULA {$code = getNewLine()}
    | atribstat PONTOEVIRGULA {$code = $atribstat.code}
    | printstat PONTOEVIRGULA {$code = $printstat.code}
    | readstat PONTOEVIRGULA {$code = $readstat.code}
    | returnstat PONTOEVIRGULA {$code = $returnstat.code} 
    | ifstat[$next] {$code = $ifstat.code} 
    | forstat[$next] {$code = $forstat.code} 
    | CHAVEA statelist[$next] CHAVEF {$code = $statelist.code} 
    | BREAK PONTOEVIRGULA {$code = "break" + getNewLine()}
    | PONTOEVIRGULA {$code = getNewLine()}
    ;

b: COLCHA INT_CONSTANT COLCHF b
    |
    ;

vardecl: a IDENT b;

c returns [code, result]: expression {$code = $expression.code} {$result = $expression.result} 
    | allocexpression {$code = $allocexpression.code} {$result = $allocexpression.result}
    | funccall {$code = $funccall.code} {$result = $funccall.result}
    ;

atribstat returns [code]: lvalue ATRIBUICAO c {$code = $c.code + $lvalue.code + " = " + $c.result + getNewLine() };

funccall returns [code, result]: IDENT PARENTEA paramlistcall PARENTEF {$result = getTemp()} {$code = $paramlistcall.code + $result + " = call " + getFunc($IDENT.text) + "," + str($paramlistcall.numero) + getNewLine()};

paramlistcall returns [code, numero]: IDENT VIRGULA paramlistcall {$code = "param " + $IDENT.text + getNewLine() + $paramlistcall.code} {$numero = $paramlistcall.numero + 1}
    | IDENT {$code = "param " + $IDENT.text + getNewLine()} {$numero = 1}
    | {$code = ""} {$numero = 0}
    ;

printstat returns [code]: PRINT expression {$code = $expression.code + "print " + $expression.result + getNewLine() };

readstat returns [code]: READ lvalue {$code = "read " + $lvalue.code + getNewLine()};

returnstat returns [code]: RETURN {$code = "return" + getNewLine()};

ifstat[next] returns [code, labelFalse]: IF PARENTEA expression PARENTEF statement[$next] {$code = $expression.code + "if " + $expression.result + " == 0 goto " + $next + getNewLine() + $statement.code}
    | {$labelFalse = Label()} IF PARENTEA expression PARENTEF statement[$next] ELSE statement2[$next] {$code = $expression.code + "if " + $expression.result + " == 0 goto " + $labelFalse + getNewLine() + $statement.code + getLabel($labelFalse) + $statement2.code}
    ;

statement2[next] returns [code]: statement[$next] {$code = $statement.code};

forstat[next] returns [code, begin]: {$begin = Label()} FOR PARENTEA atribstat PONTOEVIRGULA expression PONTOEVIRGULA atribstat2 PARENTEF statement[$next] {$code = $atribstat.code + getLabel($begin) + $expression.code + "if " + $expression.result + " == 0 goto " + $next + getNewLine() + $statement.code + $atribstat2.code + "goto " + $begin + getNewLine()};

atribstat2 returns [code]: atribstat {$code = $atribstat.code};

statelist[next] returns [code, begin]: {$begin = Label()} statement[$begin] statelist[$next] {$code = $statement.code + getLabel($begin) + $statelist.code}
    | statement[$next] {$code = $statement.code}
    ;

d[tipo] returns [code, result]: COLCHA numexpression COLCHF {$result = getVector($tipo, $numexpression.result)} {$code = $numexpression.code}
    | COLCHA numexpression COLCHF d[getVector($tipo, $numexpression.result)] {$result = $d.result} {$code = $numexpression.code + $d.code}
    ;

allocexpression returns [code, result]: NEW a d[$a.value] {$result = "new " + $d.result} {$code = $d.code};

comparadores returns [value]: MENORQUE {$value = $MENORQUE.text} 
    | MAIORQUE {$value = $MAIORQUE.text}
    | MENOREIGUAL {$value = $MENOREIGUAL.text}
    | MAIOREIGUAL {$value = $MAIOREIGUAL.text}
    | IGUAL {$value = $IGUAL.text}
    | DIFERENTE {$value = $DIFERENTE.text} 
    ;

expression returns [code, result]: numexpression comparadores numexpression2 {$result = getTemp()} {$code = $numexpression.code + $numexpression2.code + $result + " = " + $numexpression.result + $comparadores.value + $numexpression2.result + getNewLine()}
    | numexpression {$result = $numexpression.result} {$code = $numexpression.code}
    ;

numexpression2 returns [code, result]: numexpression {$result = $numexpression.result} {$code = $numexpression.code};

maisoumenos returns [value]: MAIS {$value = $MAIS.text} 
    | MENOS {$value = $MENOS.text}
    ;

e[inhr] returns [syn]: maisoumenos term e[Node($maisoumenos.value, $inhr, $term.node)] {$syn = $e.syn}
    | {$syn = $inhr}
    ;

numexpression returns [node, result, code]: term e[$term.node] {$node = $e.syn} {insert_expression_table($e.syn)} {$code = $e.syn.gerar_codigo()} {$result = $e.syn.result};

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


factor returns [node]: INT_CONSTANT {$node = Leaf($INT_CONSTANT, 'int',[]) }
    | FLOAT_CONSTANT {$node = Leaf($FLOAT_CONSTANT, 'float',[])}
    | STRING_CONSTANT {$node = Leaf($STRING_CONSTANT, 'str',[])}
    | NULL {$node = Leaf($NULL, 'null', [])}
    | lvalue {$node = $lvalue.node}
    | PARENTEA numexpression {$node = $numexpression.node} PARENTEF
    ;

g: COLCHA numexpression COLCHF g
    |
    ;

lvalue returns [node, code]: IDENT {$node = Leaf($IDENT, 'ident', [])} g {$code = $IDENT.text};

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