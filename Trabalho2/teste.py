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

def expression():
    print("\n\tExpressoes em pre-order:")
    for x in range(len(expression_table)):
        print("exp", x, ':', expression_table[x])

def symbol():
    print("\n\tTabela de simbolo dos identificadores:")
    for x, y in symbol_table.items():
        print(x, ":", y)

if __name__ == '__main__':
    main(sys.argv)

    