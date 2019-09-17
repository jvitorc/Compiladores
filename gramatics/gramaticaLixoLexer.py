# Generated from gramaticaLixo.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t")
        buf.write("\"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\3\2\6\2\23\n\2\r\2\16\2\24\3\3\3\3\3\4\3\4\3")
        buf.write("\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13")
        buf.write("\7\r\b\17\t\3\2\2\2\"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2")
        buf.write("\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2")
        buf.write("\3\22\3\2\2\2\5\26\3\2\2\2\7\30\3\2\2\2\t\32\3\2\2\2\13")
        buf.write("\34\3\2\2\2\r\36\3\2\2\2\17 \3\2\2\2\21\23\7\62\2\2\22")
        buf.write("\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2")
        buf.write("\25\4\3\2\2\2\26\27\7-\2\2\27\6\3\2\2\2\30\31\7/\2\2\31")
        buf.write("\b\3\2\2\2\32\33\7,\2\2\33\n\3\2\2\2\34\35\7\61\2\2\35")
        buf.write("\f\3\2\2\2\36\37\7*\2\2\37\16\3\2\2\2 !\7+\2\2!\20\3\2")
        buf.write("\2\2\4\2\24\2")
        return buf.getvalue()


class gramaticaLixoLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    INT = 1
    MAIS = 2
    MENOS = 3
    MULT = 4
    DIV = 5
    PARANTABER = 6
    PARANTFECH = 7

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'+'", "'-'", "'*'", "'/'", "'('", "')'" ]

    symbolicNames = [ "<INVALID>",
            "INT", "MAIS", "MENOS", "MULT", "DIV", "PARANTABER", "PARANTFECH" ]

    ruleNames = [ "INT", "MAIS", "MENOS", "MULT", "DIV", "PARANTABER", "PARANTFECH" ]

    grammarFileName = "gramaticaLixo.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


