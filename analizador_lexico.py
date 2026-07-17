from antlr4 import *
from ExprLexer import ExprLexer


class AnalizadorLexico:

    def __init__(self):
        self.lexer = None
        self.tokens = None
        self.errores = []

    def analizar(self, codigo):

        self.errores.clear()

        entrada = InputStream(codigo)

        self.lexer = ExprLexer(entrada)

        self.tokens = CommonTokenStream(self.lexer)
        self.tokens.fill()

        # Buscar tokens ERROR
        for token in self.tokens.tokens:

            if token.type == Token.EOF:
                continue

            nombre = self.lexer.symbolicNames[token.type]

            if nombre == "ERROR":

                self.errores.append({
                    "Línea": token.line,
                    "Columna": token.column,
                    "Lexema": token.text,
                    "Mensaje": f"Carácter no reconocido: '{token.text}'"
                })

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
        return self.errores

    def imprimir_tokens(self):

        print("\nTOKENS")
        print("-" * 80)

        print(
            f"{'LEXEMA':<20}"
            f"{'TOKEN':<20}"
            f"{'TIPO':<8}"
            f"{'LÍNEA':<10}"
            f"{'COLUMNA':<10}"
        )

        print("-" * 80)

        for token in self.tokens.tokens:

            if token.type == Token.EOF:
                continue

            print(
                f"{token.text:<20}"
                f"{self.lexer.symbolicNames[token.type]:<20}"
                f"{token.type:<8}"
                f"{token.line:<10}"
                f"{token.column:<10}"
            )

    def imprimir_errores(self):

        print("\nERRORES LÉXICOS")
        print("-" * 80)

        if len(self.errores) == 0:

            print("No se encontraron errores léxicos.")

        else:

            for error in self.errores:

                print(
                    f"Línea {error['Línea']}, "
                    f"Columna {error['Columna']} | "
                    f"Lexema: {error['Lexema']} | "
                    f"{error['Mensaje']}"
                )