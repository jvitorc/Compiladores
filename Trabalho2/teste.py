import importlib
import sys
from antlr4 import *
from gramaticaLexer import gramaticaLexer
from gramaticaParser import gramaticaParser


def main(argv):
    input_stream = FileStream(argv[1], encoding='utf-8')
    lexer = gramaticaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    stream.getNumberOfOnChannelTokens()
    parser = gramaticaParser(stream)
    tree = parser.program()
    #parser.notifyErrorListeners('TESTE')


if __name__ == '__main__':
    main(sys.argv)

    