# Generated from Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#inicio.
    def enterInicio(self, ctx:ExprParser.InicioContext):
        pass

    # Exit a parse tree produced by ExprParser#inicio.
    def exitInicio(self, ctx:ExprParser.InicioContext):
        pass



del ExprParser