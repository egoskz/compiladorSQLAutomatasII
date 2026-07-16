from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener

from ExprLexer import ExprLexer
from ExprParser import ExprParser


class MiErrorListener(ErrorListener):

    def __init__(self):
        super().__init__()
        self.errores = []

    def syntaxError(self, recognizer, offendingSymbol,
                    line, column, msg, e):

        self.errores.append({
            "Línea": line,
            "Columna": column,
            "Mensaje": msg
        })


class HelperSintactico:

    def analizar(self, codigo):

        lexer = ExprLexer(InputStream(codigo))
        stream = CommonTokenStream(lexer)
        parser = ExprParser(stream)

        parser.removeErrorListeners()

        listener = MiErrorListener()
        parser.addErrorListener(listener)

        parser.inicio()

        if len(listener.errores) == 0:
            return True, "No se encontraron errores sintácticos.", []

        return False, "Se encontraron errores sintácticos.", listener.errores