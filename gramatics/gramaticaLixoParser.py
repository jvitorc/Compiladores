# Generated from gramaticaLixo.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t")
        buf.write("\36\4\2\t\2\4\3\t\3\3\2\3\2\5\2\t\n\2\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\5\3\21\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\31\n\3")
        buf.write("\f\3\16\3\34\13\3\3\3\2\3\4\4\2\4\2\4\3\2\6\7\3\2\4\5")
        buf.write("\2\37\2\b\3\2\2\2\4\20\3\2\2\2\6\t\5\4\3\2\7\t\3\2\2\2")
        buf.write("\b\6\3\2\2\2\b\7\3\2\2\2\t\3\3\2\2\2\n\13\b\3\1\2\13\f")
        buf.write("\7\b\2\2\f\r\5\4\3\2\r\16\7\t\2\2\16\21\3\2\2\2\17\21")
        buf.write("\7\3\2\2\20\n\3\2\2\2\20\17\3\2\2\2\21\32\3\2\2\2\22\23")
        buf.write("\f\5\2\2\23\24\t\2\2\2\24\31\5\4\3\6\25\26\f\4\2\2\26")
        buf.write("\27\t\3\2\2\27\31\5\4\3\5\30\22\3\2\2\2\30\25\3\2\2\2")
        buf.write("\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2")
        buf.write("\2\34\32\3\2\2\2\6\b\20\30\32")
        return buf.getvalue()


class gramaticaLixoParser ( Parser ):

    grammarFileName = "gramaticaLixo.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "'+'", "'-'", "'*'", "'/'", 
                     "'('", "')'" ]

    symbolicNames = [ "<INVALID>", "INT", "MAIS", "MENOS", "MULT", "DIV", 
                      "PARANTABER", "PARANTFECH" ]

    RULE_prog = 0
    RULE_expr = 1

    ruleNames =  [ "prog", "expr" ]

    EOF = Token.EOF
    INT=1
    MAIS=2
    MENOS=3
    MULT=4
    DIV=5
    PARANTABER=6
    PARANTFECH=7

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class ProgContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(gramaticaLixoParser.ExprContext,0)


        def getRuleIndex(self):
            return gramaticaLixoParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)




    def prog(self):

        localctx = gramaticaLixoParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        try:
            self.state = 6
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaLixoParser.INT, gramaticaLixoParser.PARANTABER]:
                self.enterOuterAlt(localctx, 1)
                self.state = 4
                self.expr(0)
                pass
            elif token in [gramaticaLixoParser.EOF]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ExprContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return gramaticaLixoParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class ParContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a gramaticaLixoParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def PARANTABER(self):
            return self.getToken(gramaticaLixoParser.PARANTABER, 0)
        def expr(self):
            return self.getTypedRuleContext(gramaticaLixoParser.ExprContext,0)

        def PARANTFECH(self):
            return self.getToken(gramaticaLixoParser.PARANTFECH, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPar" ):
                listener.enterPar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPar" ):
                listener.exitPar(self)


    class NumContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a gramaticaLixoParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def INT(self):
            return self.getToken(gramaticaLixoParser.INT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNum" ):
                listener.enterNum(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNum" ):
                listener.exitNum(self)


    class OpBinContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a gramaticaLixoParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(gramaticaLixoParser.ExprContext)
            else:
                return self.getTypedRuleContext(gramaticaLixoParser.ExprContext,i)

        def MULT(self):
            return self.getToken(gramaticaLixoParser.MULT, 0)
        def DIV(self):
            return self.getToken(gramaticaLixoParser.DIV, 0)
        def MAIS(self):
            return self.getToken(gramaticaLixoParser.MAIS, 0)
        def MENOS(self):
            return self.getToken(gramaticaLixoParser.MENOS, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpBin" ):
                listener.enterOpBin(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpBin" ):
                listener.exitOpBin(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = gramaticaLixoParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 2
        self.enterRecursionRule(localctx, 2, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 14
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaLixoParser.PARANTABER]:
                localctx = gramaticaLixoParser.ParContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 9
                self.match(gramaticaLixoParser.PARANTABER)
                self.state = 10
                self.expr(0)
                self.state = 11
                self.match(gramaticaLixoParser.PARANTFECH)
                pass
            elif token in [gramaticaLixoParser.INT]:
                localctx = gramaticaLixoParser.NumContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 13
                self.match(gramaticaLixoParser.INT)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 24
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 22
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                    if la_ == 1:
                        localctx = gramaticaLixoParser.OpBinContext(self, gramaticaLixoParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 16
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 17
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==gramaticaLixoParser.MULT or _la==gramaticaLixoParser.DIV):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 18
                        self.expr(4)
                        pass

                    elif la_ == 2:
                        localctx = gramaticaLixoParser.OpBinContext(self, gramaticaLixoParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 19
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 20
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==gramaticaLixoParser.MAIS or _la==gramaticaLixoParser.MENOS):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 21
                        self.expr(3)
                        pass

             
                self.state = 26
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[1] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 2)
         




