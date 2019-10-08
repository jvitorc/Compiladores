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
    parser = gramaticaAntlrParser(stream)
    tree = parser.program()
    #parser.notifyErrorListeners('TESTE')
    print("\nForma sentencial:")
    print(tree.toStringTree([],parser))


if __name__ == '__main__':
    main(sys.argv)

    