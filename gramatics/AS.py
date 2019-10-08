import importlib
import sys
from antlr4 import *
from gramaticaAntlrLexer import gramaticaAntlrLexer
from gramaticaAntlrParser import gramaticaAntlrParser

class AS:

    def __init__(self):
        input_stream = FileStream(argv[1], encoding='utf-8')
        lexer = gramaticaAntlrLexer(input_stream)
        stream = CommonTokenStream(lexer)
        stream.getNumberOfOnChannelTokens()
        for x in stream.getTokens(0, 1000):
            print(x.text)
        parser = gramaticaAntlrParser(stream)
        tree = parser.program()
        print(tree.getText())

    