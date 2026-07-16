from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from ExprLexer import ExprLexer

class ErroresLexicos(ErrorListener):

    def __init__(self):
        self.lista = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.lista.append([line, column, msg])

class AnalizadorLexico:

    def __init__(self):
        self.lexer = None
        self.tokens = None
        self.errores = ErroresLexicos()

    def analizar(self, codigo):
        entrada = InputStream(codigo)
        self.lexer = ExprLexer(entrada)
        self.lexer.removeErrorListeners()
        self.lexer.addErrorListener(self.errores)
        self.tokens = CommonTokenStream(self.lexer)
        self.tokens.fill()

    def obtener_tokens(self):
        lista = []

        for token in self.tokens.tokens:
            if token.type == Token.EOF:
                continue

            lista.append({
                "Lexema": token.text,
                "Token": self.lexer.symbolicNames[token.type],
                "Tipo": token.type,
                "Línea": token.line,
                "Columna": token.column
            })

        return lista


    def obtener_errores(self):
        return self.errores.lista

    def imprimir_tokens(self):
        print("\nTOKENS")
        print("-" * 70)
        print(
            f"{'LEXEMA':<20}"
            f"{'TOKEN':<15}"
            f"{'TIPO':<15}"
            f"{'LINEA':<8}"
            f"{'COLUMNA':<10}"
        )
        print("-" * 70)

        for token in self.tokens.tokens:
            if token.type == Token.EOF:
                continue
            nombre = self.lexer.symbolicNames[token.type]

            print(
                f"{token.text:<20}"
                f"{nombre:<15}"
                f"{token.type:<15}"
                f"{token.line:<8}"
                f"{token.column:<10}"
            )

    def imprimir_errores(self):
        print("\nERRORES LEXICOS")
        print("-" * 40)
        if len(self.errores.lista) == 0:
            print("No hay errores lexicos")
        else:
            for error in self.errores.lista:
                print(
                    f"Linea {error[0]}, columna {error[1]}: {error[2]}"
                )
    
    