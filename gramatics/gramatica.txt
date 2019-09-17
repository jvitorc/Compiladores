    PROGRAM: STATEMENT
            |
            ;
    
    STATEMENT: VARDECL ';' #BinaryOp 
            | ATRIBSTAT ';' #BinaryOp
            | PRINTSTAT ';' #BinaryOp
            | READSTAT ';' #BinaryOp
            | RETURNSTAT ';' #BinaryOp
            | IFSTAT ';' #BinaryOp
            | FORSTAT ';' #BinaryOp
            | '{' STATELIST '}' #BinaryListOp 
            | 'break' ';' #Break
            | ';' #EndLine
            ;
    
    VARDECL: A ident B
    
    A: int | float | string
    B: [int_constant] | [int_constant]B | &

    ATRIBSTAT: LVALUE = EXPRESSION | LVALUE = ALLOCEXPRESSION

    PRINTSTAT: print EXPRESSION
    READSTAT: read LVALUE
    RETURNSTAT: return

    IFSTAT: if(EXPRESSION) STATEMENT | if(EXPRESSION) STATEMENT else STATEMENT

    FORSTAT: for(ATRIBSTAT';' NUMEXPRESSION';' ATRIBSTAT) STATEMENT

    STATELIST: STATEMENT | STATEMENT STATELIST

    ALLOCEXPRESSION: new A C
    C: [EXPRESSION] | [EXPRESSION]C

    EXPRESSION: NUMEXPRESSION | NUMEXPRESSION D NUMEXPRESSION
    D: < | > | <= | >= | == | !=

    TERM: UNARYEXPR E
    E: F UNARYEXPR | F UNARYEXPR E | &
    F: * | \ | %

    #Colocamos EXPRESSION entre parênteses porque é uma expressão, mas não temos certeza
    UNARYEXPR: int_constant | float_constant | string_constant | null | LVALUE | (EXPRESSION)

    LVALUE: ident G
    G: [EXPRESSION] | [EXPRESSION]G | &