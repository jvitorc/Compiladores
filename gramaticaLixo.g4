    PROGRAM: STATEMENT
            |
            ;
    
    STATEMENT: VARDECL ';' #BinaryOp 
            | 'break' ';' #Break
            | ';' #EndLine
            ;
    VARDECL: INT 
            ;
    
    INT : ('0'..'9')+;