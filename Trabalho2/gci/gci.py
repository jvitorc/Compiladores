import importlib
import sys
from antlr4 import *
from antlr4.tree.Trees import Trees
from gramaticaLexer import gramaticaLexer
from gramaticaParser import gramaticaParser
from arvore import *

def main(argv):
    input_stream = FileStream(argv[1], encoding='utf-8')
    lexer = gramaticaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    stream.getNumberOfOnChannelTokens()
    parser = gramaticaParser(stream)
    
    print("\n\n\tGeracao de codigo Intermediario\n")
    tree = parser.program()

if __name__ == '__main__':
    main(sys.argv)

    