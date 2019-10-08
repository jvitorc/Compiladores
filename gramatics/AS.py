import importlib
import sys
from antlr4 import *
from gramaticas.gramaticaAntlrLexer import gramaticaAntlrLexer
from gramaticas.gramaticaAntlrParser import gramaticaAntlrParser


def main(argv):
    input_stream = FileStream(argv[1], encoding='utf-8')
    lexer = gramaticaAntlrLexer(input_stream)
    stream = CommonTokenStream(lexer)
    stream.getNumberOfOnChannelTokens()
    try:
        parser = gramaticaAntlrParser(stream)
        tree = parser.program()
    print(tree.getText())

    tokenPrimaria = ''
    for x in stream.getTokens(0, 1):
        tokenPrimaria = x
    print(x)

if __name__ == '__main__':
    main(sys.argv)

    