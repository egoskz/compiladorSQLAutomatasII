# Generated from Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,89,5,2,0,7,0,1,0,1,0,1,0,0,0,1,0,0,0,3,0,2,1,0,0,0,2,3,5,0,0,
        1,3,1,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'CREATE'", "'DATABASE'", "'USE'", "'TABLE'", 
                     "'ALTER'", "'DROP'", "'TRUNCATE'", "'SELECT'", "'INSERT'", 
                     "'UPDATE'", "'DELETE'", "'INTO'", "'VALUES'", "'FROM'", 
                     "'WHERE'", "'SET'", "'GROUP'", "'ORDER'", "'BY'", "'HAVING'", 
                     "'JOIN'", "'INNER'", "'LEFT'", "'RIGHT'", "'FULL'", 
                     "'ON'", "'AS'", "'DISTINCT'", "'LIMIT'", "'PRIMARY'", 
                     "'FOREIGN'", "'KEY'", "'REFERENCES'", "'NOT'", "'NULL'", 
                     "'UNIQUE'", "'CHECK'", "'DEFAULT'", "'AUTO_INCREMENT'", 
                     "'AND'", "'OR'", "'LIKE'", "'IN'", "'BETWEEN'", "'IS'", 
                     "'EXISTS'", "'INT'", "'INTEGER'", "'BIGINT'", "'SMALLINT'", 
                     "'FLOAT'", "'DOUBLE'", "'DECIMAL'", "'NUMERIC'", "'CHAR'", 
                     "'VARCHAR'", "'TEXT'", "'DATE'", "'TIME'", "'DATETIME'", 
                     "'TIMESTAMP'", "'BOOLEAN'", "'BIT'", "'+'", "'-'", 
                     "'*'", "'/'", "'%'", "'='", "'<'", "'>'", "'<='", "'>='", 
                     "<INVALID>", "'('", "')'", "'['", "']'", "','", "'.'", 
                     "';'" ]

    symbolicNames = [ "<INVALID>", "CREATE", "DATABASE", "USE", "TABLE", 
                      "ALTER", "DROP", "TRUNCATE", "SELECT", "INSERT", "UPDATE", 
                      "DELETE", "INTO", "VALUES", "FROM", "WHERE", "SET", 
                      "GROUP", "ORDER", "BY", "HAVING", "JOIN", "INNER", 
                      "LEFT", "RIGHT", "FULL", "ON", "AS", "DISTINCT", "LIMIT", 
                      "PRIMARY", "FOREIGN", "KEY", "REFERENCES", "NOT", 
                      "NULL", "UNIQUE", "CHECK", "DEFAULT", "AUTO_INCREMENT", 
                      "AND", "OR", "LIKE", "IN", "BETWEEN", "IS", "EXISTS", 
                      "INT", "INTEGER", "BIGINT", "SMALLINT", "FLOAT", "DOUBLE", 
                      "DECIMAL", "NUMERIC", "CHAR", "VARCHAR", "TEXT", "DATE", 
                      "TIME", "DATETIME", "TIMESTAMP", "BOOLEAN", "BIT", 
                      "MAS", "MENOS", "MULT", "DIV", "MOD", "IGUAL", "MENOR", 
                      "MAYOR", "MENORIGUAL", "MAYORIGUAL", "DIFERENTE", 
                      "PARIZQ", "PARDER", "CORIZQ", "CORDER", "COMA", "PUNTO", 
                      "PUNTOYCOMA", "DECIMAL_NUM", "ENTERO", "CADENA", "ID", 
                      "COMENTARIO", "COMENTARIO_BLOQUE", "WS", "ERROR" ]

    RULE_inicio = 0

    ruleNames =  [ "inicio" ]

    EOF = Token.EOF
    CREATE=1
    DATABASE=2
    USE=3
    TABLE=4
    ALTER=5
    DROP=6
    TRUNCATE=7
    SELECT=8
    INSERT=9
    UPDATE=10
    DELETE=11
    INTO=12
    VALUES=13
    FROM=14
    WHERE=15
    SET=16
    GROUP=17
    ORDER=18
    BY=19
    HAVING=20
    JOIN=21
    INNER=22
    LEFT=23
    RIGHT=24
    FULL=25
    ON=26
    AS=27
    DISTINCT=28
    LIMIT=29
    PRIMARY=30
    FOREIGN=31
    KEY=32
    REFERENCES=33
    NOT=34
    NULL=35
    UNIQUE=36
    CHECK=37
    DEFAULT=38
    AUTO_INCREMENT=39
    AND=40
    OR=41
    LIKE=42
    IN=43
    BETWEEN=44
    IS=45
    EXISTS=46
    INT=47
    INTEGER=48
    BIGINT=49
    SMALLINT=50
    FLOAT=51
    DOUBLE=52
    DECIMAL=53
    NUMERIC=54
    CHAR=55
    VARCHAR=56
    TEXT=57
    DATE=58
    TIME=59
    DATETIME=60
    TIMESTAMP=61
    BOOLEAN=62
    BIT=63
    MAS=64
    MENOS=65
    MULT=66
    DIV=67
    MOD=68
    IGUAL=69
    MENOR=70
    MAYOR=71
    MENORIGUAL=72
    MAYORIGUAL=73
    DIFERENTE=74
    PARIZQ=75
    PARDER=76
    CORIZQ=77
    CORDER=78
    COMA=79
    PUNTO=80
    PUNTOYCOMA=81
    DECIMAL_NUM=82
    ENTERO=83
    CADENA=84
    ID=85
    COMENTARIO=86
    COMENTARIO_BLOQUE=87
    WS=88
    ERROR=89

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class InicioContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_inicio

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInicio" ):
                listener.enterInicio(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInicio" ):
                listener.exitInicio(self)




    def inicio(self):

        localctx = ExprParser.InicioContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_inicio)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 2
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





