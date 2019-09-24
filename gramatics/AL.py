import importlib
import sys
from antlr4 import *
from gramaticaAntlrLexer import gramaticaAntlrLexer
from gramaticaAntlrParser import gramaticaAntlrParser
 
def main(argv):
    input_stream = FileStream(argv[1])
    print(type(input_stream))
    lexer = gramaticaAntlrLexer(input_stream.encode("ascii"))
    stream = CommonTokenStream(lexer)
    parser = gramaticaAntlrParser(stream)
    tree = parser.startRule()
 
if __name__ == '__main__':
    main(sys.argv)