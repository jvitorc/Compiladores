grammar gramaticaLixo;

prog: expr
        |
        ;

expr: PARANTABER expr PARANTFECH # par
        | expr op=(MULT|DIV) expr # OpBin
        | expr op=(MAIS|MENOS) expr # OpBin
        | INT # num
        ;

INT : '0'+;
MAIS : '+';
MENOS : '-';
MULT : '*';
DIV : '/';
PARANTABER : '(';
PARANTFECH : ')';