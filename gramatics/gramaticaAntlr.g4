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
b:  COLCHA INT_CONTANT COLCHF
    | COLCHA INT_CONTANT COLCHF b
    |
    ;

atribstat:  lvalue EQUAL expression
            | lvalue EQUAL allocexpression
            ;

printstat: PRINT expression;
readstat: READ lvalue;
returnstat: RETURN;

ifstat: IF PARENTEA expression PARENTEF statelist
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
            | numexpression D numexpression
            ;

term: unaryexpr e;

e:  F unaryexpr
    | F unaryexpr e
    | 
    ;

unaryexpr
