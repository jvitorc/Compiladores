import importlib
import sys
from antlr4 import *
from antlr4.error.ErrorStrategy import DefaultErrorStrategy
from gramaticas.gramaticaAntlrLexer import gramaticaAntlrLexer
from gramaticas.gramaticaAntlrParser import gramaticaAntlrParser


class MyErrorStrategy(DefaultErrorStrategy):

    Erro = False

    def __init__(self):
        super().__init__()

    # This is called by {@link #reportError} when the exception is a
    # {@link NoViableAltException}.
    #
    # @see #reportError
    #
    # @param recognizer the parser instance
    # @param e the recognition exception
    #
    def reportNoViableAlternative(self, recognizer:Parser, e:NoViableAltException):
        tokens = recognizer.getTokenStream()
        if tokens is not None:
            if e.startToken.type==Token.EOF:
                input = "<EOF>"
            else:
                input = tokens.getText((e.startToken, e.offendingToken))
        else:
            input = "<unknown input>"

        token = e.offendingToken

        type_ = (
            gramaticaAntlrLexer.symbolicNames[token.type]
        )

        MyErrorStrategy.Erro = True
        msg = "\nRegraProdução: %s\nToken: %s (%s)" %(str(recognizer._ctx.toStringTree([],recognizer)), str(token.text), str(type_))

        print("Erro Sintatico")       
        recognizer.notifyErrorListeners(msg, e.offendingToken, e)



def main(argv):
    input_stream = FileStream(argv[1], encoding='utf-8')
    lexer = gramaticaAntlrLexer(input_stream)
    stream = CommonTokenStream(lexer)
    stream.getNumberOfOnChannelTokens()
    parser = gramaticaAntlrParser(stream)
    parser._errHandler = MyErrorStrategy()
    tree = parser.program()
    #parser.notifyErrorListeners('TESTE')

    if MyErrorStrategy.Erro:
        print("\nForma sentencial:")
        print(tree.toStringTree([],parser))
    else:
        print("Sucesso!")

if __name__ == '__main__':
    main(sys.argv)

    