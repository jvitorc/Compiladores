import importlib
import sys
from antlr4 import *
from gramaticaLexer import gramaticaLexer
from gramaticaParser import gramaticaParser
from arvore import *
from tabela import *

def main(argv):
    input_stream = FileStream('in.txt', encoding='utf-8')
    lexer = gramaticaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    stream.getNumberOfOnChannelTokens()
    parser = gramaticaParser(stream)
    tree = parser.program()
    expression()
    symbol()
    breaks()

def expression():
    print("\n\tExpressoes em pre-order:")
    for x in range(len(expression_table)):
        print("exp", x, ':', expression_table[x][0], expression_table[x][1])

def symbol():
    print("\n\tTabela de simbolo dos identificadores:")
    print("nome\ttipo")
    for x, y in symbol_table.items():
        token = y[0]
        print(x, y[1], sep='\t')

def breaks():
    if len(erros_breaks) == 0:
        print("\nBreak: Todos os 'break' estao dentro de lacos")
    else:
        print("\n\tBreaks fora de lacos")
        for x in erros_breaks:
            print(x)

if __name__ == '__main__':
    main(sys.argv)

    