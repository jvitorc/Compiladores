import importlib
import sys
from antlr4 import *
from gramaticaAntlrLexer import gramaticaAntlrLexer
from gramaticaAntlrParser import gramaticaAntlrParser
 
def main(argv):
    a = open(argv[1], 'rt', encoding='ascii')
    input_stream = a
    print(type(input_stream))
    lexer = gramaticaAntlrLexer(input_stream)
    stream = CommonTokenStream(lexer)
    # parser = gramaticaAntlrParser(stream)
    # tree = parser.startRule()
 
if __name__ == '__main__':
    main(sys.argv)