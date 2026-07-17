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
        4,1,59,222,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,1,0,5,0,44,8,0,10,0,12,0,47,9,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,3,1,59,8,1,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,
        4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,5,
        6,87,8,6,10,6,12,6,90,9,6,1,6,1,6,1,6,1,7,1,7,1,7,5,7,98,8,7,10,
        7,12,7,101,9,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,
        8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,8,3,8,126,8,8,1,9,1,9,1,
        9,1,9,1,9,3,9,133,8,9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,
        10,1,10,1,10,1,10,1,11,1,11,1,11,5,11,150,8,11,10,11,12,11,153,9,
        11,1,12,1,12,1,12,5,12,158,8,12,10,12,12,12,161,9,12,1,13,1,13,1,
        13,1,13,1,13,1,13,3,13,169,8,13,1,13,1,13,1,14,1,14,1,14,1,14,5,
        14,177,8,14,10,14,12,14,180,9,14,3,14,182,8,14,1,15,1,15,1,15,1,
        15,1,15,1,15,5,15,190,8,15,10,15,12,15,193,9,15,1,15,1,15,3,15,197,
        8,15,1,15,1,15,1,16,1,16,1,16,1,16,1,17,1,17,1,17,1,17,1,17,3,17,
        210,8,17,1,17,1,17,1,18,1,18,1,18,1,18,1,19,1,19,1,20,1,20,1,20,
        0,0,21,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,
        0,2,1,0,39,44,1,0,52,55,236,0,45,1,0,0,0,2,58,1,0,0,0,4,60,1,0,0,
        0,6,65,1,0,0,0,8,70,1,0,0,0,10,74,1,0,0,0,12,79,1,0,0,0,14,94,1,
        0,0,0,16,125,1,0,0,0,18,132,1,0,0,0,20,134,1,0,0,0,22,146,1,0,0,
        0,24,154,1,0,0,0,26,162,1,0,0,0,28,181,1,0,0,0,30,183,1,0,0,0,32,
        200,1,0,0,0,34,204,1,0,0,0,36,213,1,0,0,0,38,217,1,0,0,0,40,219,
        1,0,0,0,42,44,3,2,1,0,43,42,1,0,0,0,44,47,1,0,0,0,45,43,1,0,0,0,
        45,46,1,0,0,0,46,48,1,0,0,0,47,45,1,0,0,0,48,49,5,0,0,1,49,1,1,0,
        0,0,50,59,3,4,2,0,51,59,3,8,4,0,52,59,3,12,6,0,53,59,3,20,10,0,54,
        59,3,26,13,0,55,59,3,30,15,0,56,59,3,34,17,0,57,59,3,10,5,0,58,50,
        1,0,0,0,58,51,1,0,0,0,58,52,1,0,0,0,58,53,1,0,0,0,58,54,1,0,0,0,
        58,55,1,0,0,0,58,56,1,0,0,0,58,57,1,0,0,0,59,3,1,0,0,0,60,61,5,1,
        0,0,61,62,5,2,0,0,62,63,5,55,0,0,63,64,5,50,0,0,64,5,1,0,0,0,65,
        66,5,1,0,0,66,67,5,9,0,0,67,68,5,55,0,0,68,69,5,50,0,0,69,7,1,0,
        0,0,70,71,5,3,0,0,71,72,5,55,0,0,72,73,5,50,0,0,73,9,1,0,0,0,74,
        75,5,5,0,0,75,76,5,4,0,0,76,77,5,55,0,0,77,78,5,50,0,0,78,11,1,0,
        0,0,79,80,5,1,0,0,80,81,5,4,0,0,81,82,5,55,0,0,82,83,5,45,0,0,83,
        88,3,14,7,0,84,85,5,49,0,0,85,87,3,14,7,0,86,84,1,0,0,0,87,90,1,
        0,0,0,88,86,1,0,0,0,88,89,1,0,0,0,89,91,1,0,0,0,90,88,1,0,0,0,91,
        92,5,46,0,0,92,93,5,50,0,0,93,13,1,0,0,0,94,95,5,55,0,0,95,99,3,
        16,8,0,96,98,3,18,9,0,97,96,1,0,0,0,98,101,1,0,0,0,99,97,1,0,0,0,
        99,100,1,0,0,0,100,15,1,0,0,0,101,99,1,0,0,0,102,126,5,21,0,0,103,
        126,5,22,0,0,104,126,5,23,0,0,105,126,5,24,0,0,106,126,5,25,0,0,
        107,126,5,26,0,0,108,126,5,27,0,0,109,126,5,28,0,0,110,111,5,29,
        0,0,111,112,5,45,0,0,112,113,5,53,0,0,113,126,5,46,0,0,114,115,5,
        30,0,0,115,116,5,45,0,0,116,117,5,53,0,0,117,126,5,46,0,0,118,126,
        5,31,0,0,119,126,5,32,0,0,120,126,5,33,0,0,121,126,5,34,0,0,122,
        126,5,35,0,0,123,126,5,36,0,0,124,126,5,37,0,0,125,102,1,0,0,0,125,
        103,1,0,0,0,125,104,1,0,0,0,125,105,1,0,0,0,125,106,1,0,0,0,125,
        107,1,0,0,0,125,108,1,0,0,0,125,109,1,0,0,0,125,110,1,0,0,0,125,
        114,1,0,0,0,125,118,1,0,0,0,125,119,1,0,0,0,125,120,1,0,0,0,125,
        121,1,0,0,0,125,122,1,0,0,0,125,123,1,0,0,0,125,124,1,0,0,0,126,
        17,1,0,0,0,127,128,5,16,0,0,128,133,5,17,0,0,129,130,5,18,0,0,130,
        133,5,19,0,0,131,133,5,20,0,0,132,127,1,0,0,0,132,129,1,0,0,0,132,
        131,1,0,0,0,133,19,1,0,0,0,134,135,5,7,0,0,135,136,5,11,0,0,136,
        137,5,55,0,0,137,138,5,45,0,0,138,139,3,22,11,0,139,140,5,46,0,0,
        140,141,5,12,0,0,141,142,5,45,0,0,142,143,3,24,12,0,143,144,5,46,
        0,0,144,145,5,50,0,0,145,21,1,0,0,0,146,151,5,55,0,0,147,148,5,49,
        0,0,148,150,5,55,0,0,149,147,1,0,0,0,150,153,1,0,0,0,151,149,1,0,
        0,0,151,152,1,0,0,0,152,23,1,0,0,0,153,151,1,0,0,0,154,159,3,40,
        20,0,155,156,5,49,0,0,156,158,3,40,20,0,157,155,1,0,0,0,158,161,
        1,0,0,0,159,157,1,0,0,0,159,160,1,0,0,0,160,25,1,0,0,0,161,159,1,
        0,0,0,162,163,5,6,0,0,163,164,3,28,14,0,164,165,5,13,0,0,165,168,
        5,55,0,0,166,167,5,14,0,0,167,169,3,36,18,0,168,166,1,0,0,0,168,
        169,1,0,0,0,169,170,1,0,0,0,170,171,5,50,0,0,171,27,1,0,0,0,172,
        182,5,38,0,0,173,178,5,55,0,0,174,175,5,49,0,0,175,177,5,55,0,0,
        176,174,1,0,0,0,177,180,1,0,0,0,178,176,1,0,0,0,178,179,1,0,0,0,
        179,182,1,0,0,0,180,178,1,0,0,0,181,172,1,0,0,0,181,173,1,0,0,0,
        182,29,1,0,0,0,183,184,5,8,0,0,184,185,5,55,0,0,185,186,5,15,0,0,
        186,191,3,32,16,0,187,188,5,49,0,0,188,190,3,32,16,0,189,187,1,0,
        0,0,190,193,1,0,0,0,191,189,1,0,0,0,191,192,1,0,0,0,192,196,1,0,
        0,0,193,191,1,0,0,0,194,195,5,14,0,0,195,197,3,36,18,0,196,194,1,
        0,0,0,196,197,1,0,0,0,197,198,1,0,0,0,198,199,5,50,0,0,199,31,1,
        0,0,0,200,201,5,55,0,0,201,202,5,39,0,0,202,203,3,40,20,0,203,33,
        1,0,0,0,204,205,5,10,0,0,205,206,5,13,0,0,206,209,5,55,0,0,207,208,
        5,14,0,0,208,210,3,36,18,0,209,207,1,0,0,0,209,210,1,0,0,0,210,211,
        1,0,0,0,211,212,5,50,0,0,212,35,1,0,0,0,213,214,5,55,0,0,214,215,
        3,38,19,0,215,216,3,40,20,0,216,37,1,0,0,0,217,218,7,0,0,0,218,39,
        1,0,0,0,219,220,7,1,0,0,220,41,1,0,0,0,14,45,58,88,99,125,132,151,
        159,168,178,181,191,196,209
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'CREATE'", "'DATABASE'", "'USE'", "'TABLE'", 
                     "'DROP'", "'SELECT'", "'INSERT'", "'UPDATE'", "'LOGIN'", 
                     "'DELETE'", "'INTO'", "'VALUES'", "'FROM'", "'WHERE'", 
                     "'SET'", "'PRIMARY'", "'KEY'", "'NOT'", "'NULL'", "'UNIQUE'", 
                     "'INT'", "'INTEGER'", "'BIGINT'", "'SMALLINT'", "'FLOAT'", 
                     "'DOUBLE'", "'DECIMAL'", "'NUMERIC'", "'CHAR'", "'VARCHAR'", 
                     "'TEXT'", "'DATE'", "'TIME'", "'DATETIME'", "'TIMESTAMP'", 
                     "'BOOLEAN'", "'BIT'", "'*'", "'='", "'<'", "'>'", "'<='", 
                     "'>='", "<INVALID>", "'('", "')'", "'['", "']'", "','", 
                     "';'", "'.'" ]

    symbolicNames = [ "<INVALID>", "CREATE", "DATABASE", "USE", "TABLE", 
                      "DROP", "SELECT", "INSERT", "UPDATE", "LOGIN", "DELETE", 
                      "INTO", "VALUES", "FROM", "WHERE", "SET", "PRIMARY", 
                      "KEY", "NOT", "NULL", "UNIQUE", "INT", "INTEGER", 
                      "BIGINT", "SMALLINT", "FLOAT", "DOUBLE", "DECIMAL", 
                      "NUMERIC", "CHAR", "VARCHAR", "TEXT", "DATE", "TIME", 
                      "DATETIME", "TIMESTAMP", "BOOLEAN", "BIT", "MULT", 
                      "IGUAL", "MENOR", "MAYOR", "MENORIGUAL", "MAYORIGUAL", 
                      "DIFERENTE", "PARIZQ", "PARDER", "CORIZQ", "CORDER", 
                      "COMA", "PUNTOYCOMA", "PUNTO", "DECIMAL_NUM", "ENTERO", 
                      "CADENA", "ID", "COMENTARIO", "COMENTARIO_BLOQUE", 
                      "WS", "ERROR" ]

    RULE_inicio = 0
    RULE_sentencia = 1
    RULE_crearBaseDatos = 2
    RULE_crearLogin = 3
    RULE_usarBaseDatos = 4
    RULE_eliminarTabla = 5
    RULE_crearTabla = 6
    RULE_columna = 7
    RULE_tipoDato = 8
    RULE_restricciones = 9
    RULE_insertar = 10
    RULE_listaColumnas = 11
    RULE_listaValores = 12
    RULE_seleccionar = 13
    RULE_columnas = 14
    RULE_actualizar = 15
    RULE_asignacion = 16
    RULE_eliminar = 17
    RULE_condicion = 18
    RULE_operador = 19
    RULE_valor = 20

    ruleNames =  [ "inicio", "sentencia", "crearBaseDatos", "crearLogin", 
                   "usarBaseDatos", "eliminarTabla", "crearTabla", "columna", 
                   "tipoDato", "restricciones", "insertar", "listaColumnas", 
                   "listaValores", "seleccionar", "columnas", "actualizar", 
                   "asignacion", "eliminar", "condicion", "operador", "valor" ]

    EOF = Token.EOF
    CREATE=1
    DATABASE=2
    USE=3
    TABLE=4
    DROP=5
    SELECT=6
    INSERT=7
    UPDATE=8
    LOGIN=9
    DELETE=10
    INTO=11
    VALUES=12
    FROM=13
    WHERE=14
    SET=15
    PRIMARY=16
    KEY=17
    NOT=18
    NULL=19
    UNIQUE=20
    INT=21
    INTEGER=22
    BIGINT=23
    SMALLINT=24
    FLOAT=25
    DOUBLE=26
    DECIMAL=27
    NUMERIC=28
    CHAR=29
    VARCHAR=30
    TEXT=31
    DATE=32
    TIME=33
    DATETIME=34
    TIMESTAMP=35
    BOOLEAN=36
    BIT=37
    MULT=38
    IGUAL=39
    MENOR=40
    MAYOR=41
    MENORIGUAL=42
    MAYORIGUAL=43
    DIFERENTE=44
    PARIZQ=45
    PARDER=46
    CORIZQ=47
    CORDER=48
    COMA=49
    PUNTOYCOMA=50
    PUNTO=51
    DECIMAL_NUM=52
    ENTERO=53
    CADENA=54
    ID=55
    COMENTARIO=56
    COMENTARIO_BLOQUE=57
    WS=58
    ERROR=59

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

        def sentencia(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.SentenciaContext)
            else:
                return self.getTypedRuleContext(ExprParser.SentenciaContext,i)


        def getRuleIndex(self):
            return ExprParser.RULE_inicio




    def inicio(self):

        localctx = ExprParser.InicioContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_inicio)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 45
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1514) != 0):
                self.state = 42
                self.sentencia()
                self.state = 47
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 48
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SentenciaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def crearBaseDatos(self):
            return self.getTypedRuleContext(ExprParser.CrearBaseDatosContext,0)


        def usarBaseDatos(self):
            return self.getTypedRuleContext(ExprParser.UsarBaseDatosContext,0)


        def crearTabla(self):
            return self.getTypedRuleContext(ExprParser.CrearTablaContext,0)


        def insertar(self):
            return self.getTypedRuleContext(ExprParser.InsertarContext,0)


        def seleccionar(self):
            return self.getTypedRuleContext(ExprParser.SeleccionarContext,0)


        def actualizar(self):
            return self.getTypedRuleContext(ExprParser.ActualizarContext,0)


        def eliminar(self):
            return self.getTypedRuleContext(ExprParser.EliminarContext,0)


        def eliminarTabla(self):
            return self.getTypedRuleContext(ExprParser.EliminarTablaContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_sentencia




    def sentencia(self):

        localctx = ExprParser.SentenciaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_sentencia)
        try:
            self.state = 58
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 50
                self.crearBaseDatos()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 51
                self.usarBaseDatos()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 52
                self.crearTabla()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 53
                self.insertar()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 54
                self.seleccionar()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 55
                self.actualizar()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 56
                self.eliminar()
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 57
                self.eliminarTabla()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CrearBaseDatosContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CREATE(self):
            return self.getToken(ExprParser.CREATE, 0)

        def DATABASE(self):
            return self.getToken(ExprParser.DATABASE, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def PUNTOYCOMA(self):
            return self.getToken(ExprParser.PUNTOYCOMA, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_crearBaseDatos




    def crearBaseDatos(self):

        localctx = ExprParser.CrearBaseDatosContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_crearBaseDatos)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
            self.match(ExprParser.CREATE)
            self.state = 61
            self.match(ExprParser.DATABASE)
            self.state = 62
            self.match(ExprParser.ID)
            self.state = 63
            self.match(ExprParser.PUNTOYCOMA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CrearLoginContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CREATE(self):
            return self.getToken(ExprParser.CREATE, 0)

        def LOGIN(self):
            return self.getToken(ExprParser.LOGIN, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def PUNTOYCOMA(self):
            return self.getToken(ExprParser.PUNTOYCOMA, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_crearLogin




    def crearLogin(self):

        localctx = ExprParser.CrearLoginContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_crearLogin)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 65
            self.match(ExprParser.CREATE)
            self.state = 66
            self.match(ExprParser.LOGIN)
            self.state = 67
            self.match(ExprParser.ID)
            self.state = 68
            self.match(ExprParser.PUNTOYCOMA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class UsarBaseDatosContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def USE(self):
            return self.getToken(ExprParser.USE, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def PUNTOYCOMA(self):
            return self.getToken(ExprParser.PUNTOYCOMA, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_usarBaseDatos




    def usarBaseDatos(self):

        localctx = ExprParser.UsarBaseDatosContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_usarBaseDatos)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.match(ExprParser.USE)
            self.state = 71
            self.match(ExprParser.ID)
            self.state = 72
            self.match(ExprParser.PUNTOYCOMA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EliminarTablaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DROP(self):
            return self.getToken(ExprParser.DROP, 0)

        def TABLE(self):
            return self.getToken(ExprParser.TABLE, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def PUNTOYCOMA(self):
            return self.getToken(ExprParser.PUNTOYCOMA, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_eliminarTabla




    def eliminarTabla(self):

        localctx = ExprParser.EliminarTablaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_eliminarTabla)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 74
            self.match(ExprParser.DROP)
            self.state = 75
            self.match(ExprParser.TABLE)
            self.state = 76
            self.match(ExprParser.ID)
            self.state = 77
            self.match(ExprParser.PUNTOYCOMA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CrearTablaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CREATE(self):
            return self.getToken(ExprParser.CREATE, 0)

        def TABLE(self):
            return self.getToken(ExprParser.TABLE, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def PARIZQ(self):
            return self.getToken(ExprParser.PARIZQ, 0)

        def columna(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ColumnaContext)
            else:
                return self.getTypedRuleContext(ExprParser.ColumnaContext,i)


        def PARDER(self):
            return self.getToken(ExprParser.PARDER, 0)

        def PUNTOYCOMA(self):
            return self.getToken(ExprParser.PUNTOYCOMA, 0)

        def COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COMA)
            else:
                return self.getToken(ExprParser.COMA, i)

        def getRuleIndex(self):
            return ExprParser.RULE_crearTabla




    def crearTabla(self):

        localctx = ExprParser.CrearTablaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_crearTabla)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 79
            self.match(ExprParser.CREATE)
            self.state = 80
            self.match(ExprParser.TABLE)
            self.state = 81
            self.match(ExprParser.ID)
            self.state = 82
            self.match(ExprParser.PARIZQ)
            self.state = 83
            self.columna()
            self.state = 88
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==49:
                self.state = 84
                self.match(ExprParser.COMA)
                self.state = 85
                self.columna()
                self.state = 90
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 91
            self.match(ExprParser.PARDER)
            self.state = 92
            self.match(ExprParser.PUNTOYCOMA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ColumnaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def tipoDato(self):
            return self.getTypedRuleContext(ExprParser.TipoDatoContext,0)


        def restricciones(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.RestriccionesContext)
            else:
                return self.getTypedRuleContext(ExprParser.RestriccionesContext,i)


        def getRuleIndex(self):
            return ExprParser.RULE_columna




    def columna(self):

        localctx = ExprParser.ColumnaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_columna)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 94
            self.match(ExprParser.ID)
            self.state = 95
            self.tipoDato()
            self.state = 99
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1376256) != 0):
                self.state = 96
                self.restricciones()
                self.state = 101
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TipoDatoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(ExprParser.INT, 0)

        def INTEGER(self):
            return self.getToken(ExprParser.INTEGER, 0)

        def BIGINT(self):
            return self.getToken(ExprParser.BIGINT, 0)

        def SMALLINT(self):
            return self.getToken(ExprParser.SMALLINT, 0)

        def FLOAT(self):
            return self.getToken(ExprParser.FLOAT, 0)

        def DOUBLE(self):
            return self.getToken(ExprParser.DOUBLE, 0)

        def DECIMAL(self):
            return self.getToken(ExprParser.DECIMAL, 0)

        def NUMERIC(self):
            return self.getToken(ExprParser.NUMERIC, 0)

        def CHAR(self):
            return self.getToken(ExprParser.CHAR, 0)

        def PARIZQ(self):
            return self.getToken(ExprParser.PARIZQ, 0)

        def ENTERO(self):
            return self.getToken(ExprParser.ENTERO, 0)

        def PARDER(self):
            return self.getToken(ExprParser.PARDER, 0)

        def VARCHAR(self):
            return self.getToken(ExprParser.VARCHAR, 0)

        def TEXT(self):
            return self.getToken(ExprParser.TEXT, 0)

        def DATE(self):
            return self.getToken(ExprParser.DATE, 0)

        def TIME(self):
            return self.getToken(ExprParser.TIME, 0)

        def DATETIME(self):
            return self.getToken(ExprParser.DATETIME, 0)

        def TIMESTAMP(self):
            return self.getToken(ExprParser.TIMESTAMP, 0)

        def BOOLEAN(self):
            return self.getToken(ExprParser.BOOLEAN, 0)

        def BIT(self):
            return self.getToken(ExprParser.BIT, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_tipoDato




    def tipoDato(self):

        localctx = ExprParser.TipoDatoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_tipoDato)
        try:
            self.state = 125
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [21]:
                self.enterOuterAlt(localctx, 1)
                self.state = 102
                self.match(ExprParser.INT)
                pass
            elif token in [22]:
                self.enterOuterAlt(localctx, 2)
                self.state = 103
                self.match(ExprParser.INTEGER)
                pass
            elif token in [23]:
                self.enterOuterAlt(localctx, 3)
                self.state = 104
                self.match(ExprParser.BIGINT)
                pass
            elif token in [24]:
                self.enterOuterAlt(localctx, 4)
                self.state = 105
                self.match(ExprParser.SMALLINT)
                pass
            elif token in [25]:
                self.enterOuterAlt(localctx, 5)
                self.state = 106
                self.match(ExprParser.FLOAT)
                pass
            elif token in [26]:
                self.enterOuterAlt(localctx, 6)
                self.state = 107
                self.match(ExprParser.DOUBLE)
                pass
            elif token in [27]:
                self.enterOuterAlt(localctx, 7)
                self.state = 108
                self.match(ExprParser.DECIMAL)
                pass
            elif token in [28]:
                self.enterOuterAlt(localctx, 8)
                self.state = 109
                self.match(ExprParser.NUMERIC)
                pass
            elif token in [29]:
                self.enterOuterAlt(localctx, 9)
                self.state = 110
                self.match(ExprParser.CHAR)
                self.state = 111
                self.match(ExprParser.PARIZQ)
                self.state = 112
                self.match(ExprParser.ENTERO)
                self.state = 113
                self.match(ExprParser.PARDER)
                pass
            elif token in [30]:
                self.enterOuterAlt(localctx, 10)
                self.state = 114
                self.match(ExprParser.VARCHAR)
                self.state = 115
                self.match(ExprParser.PARIZQ)
                self.state = 116
                self.match(ExprParser.ENTERO)
                self.state = 117
                self.match(ExprParser.PARDER)
                pass
            elif token in [31]:
                self.enterOuterAlt(localctx, 11)
                self.state = 118
                self.match(ExprParser.TEXT)
                pass
            elif token in [32]:
                self.enterOuterAlt(localctx, 12)
                self.state = 119
                self.match(ExprParser.DATE)
                pass
            elif token in [33]:
                self.enterOuterAlt(localctx, 13)
                self.state = 120
                self.match(ExprParser.TIME)
                pass
            elif token in [34]:
                self.enterOuterAlt(localctx, 14)
                self.state = 121
                self.match(ExprParser.DATETIME)
                pass
            elif token in [35]:
                self.enterOuterAlt(localctx, 15)
                self.state = 122
                self.match(ExprParser.TIMESTAMP)
                pass
            elif token in [36]:
                self.enterOuterAlt(localctx, 16)
                self.state = 123
                self.match(ExprParser.BOOLEAN)
                pass
            elif token in [37]:
                self.enterOuterAlt(localctx, 17)
                self.state = 124
                self.match(ExprParser.BIT)
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


    class RestriccionesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PRIMARY(self):
            return self.getToken(ExprParser.PRIMARY, 0)

        def KEY(self):
            return self.getToken(ExprParser.KEY, 0)

        def NOT(self):
            return self.getToken(ExprParser.NOT, 0)

        def NULL(self):
            return self.getToken(ExprParser.NULL, 0)

        def UNIQUE(self):
            return self.getToken(ExprParser.UNIQUE, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_restricciones




    def restricciones(self):

        localctx = ExprParser.RestriccionesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_restricciones)
        try:
            self.state = 132
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16]:
                self.enterOuterAlt(localctx, 1)
                self.state = 127
                self.match(ExprParser.PRIMARY)
                self.state = 128
                self.match(ExprParser.KEY)
                pass
            elif token in [18]:
                self.enterOuterAlt(localctx, 2)
                self.state = 129
                self.match(ExprParser.NOT)
                self.state = 130
                self.match(ExprParser.NULL)
                pass
            elif token in [20]:
                self.enterOuterAlt(localctx, 3)
                self.state = 131
                self.match(ExprParser.UNIQUE)
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


    class InsertarContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INSERT(self):
            return self.getToken(ExprParser.INSERT, 0)

        def INTO(self):
            return self.getToken(ExprParser.INTO, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def PARIZQ(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PARIZQ)
            else:
                return self.getToken(ExprParser.PARIZQ, i)

        def listaColumnas(self):
            return self.getTypedRuleContext(ExprParser.ListaColumnasContext,0)


        def PARDER(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PARDER)
            else:
                return self.getToken(ExprParser.PARDER, i)

        def VALUES(self):
            return self.getToken(ExprParser.VALUES, 0)

        def listaValores(self):
            return self.getTypedRuleContext(ExprParser.ListaValoresContext,0)


        def PUNTOYCOMA(self):
            return self.getToken(ExprParser.PUNTOYCOMA, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_insertar




    def insertar(self):

        localctx = ExprParser.InsertarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_insertar)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 134
            self.match(ExprParser.INSERT)
            self.state = 135
            self.match(ExprParser.INTO)
            self.state = 136
            self.match(ExprParser.ID)
            self.state = 137
            self.match(ExprParser.PARIZQ)
            self.state = 138
            self.listaColumnas()
            self.state = 139
            self.match(ExprParser.PARDER)
            self.state = 140
            self.match(ExprParser.VALUES)
            self.state = 141
            self.match(ExprParser.PARIZQ)
            self.state = 142
            self.listaValores()
            self.state = 143
            self.match(ExprParser.PARDER)
            self.state = 144
            self.match(ExprParser.PUNTOYCOMA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ListaColumnasContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)

        def COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COMA)
            else:
                return self.getToken(ExprParser.COMA, i)

        def getRuleIndex(self):
            return ExprParser.RULE_listaColumnas




    def listaColumnas(self):

        localctx = ExprParser.ListaColumnasContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_listaColumnas)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 146
            self.match(ExprParser.ID)
            self.state = 151
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==49:
                self.state = 147
                self.match(ExprParser.COMA)
                self.state = 148
                self.match(ExprParser.ID)
                self.state = 153
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ListaValoresContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def valor(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ValorContext)
            else:
                return self.getTypedRuleContext(ExprParser.ValorContext,i)


        def COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COMA)
            else:
                return self.getToken(ExprParser.COMA, i)

        def getRuleIndex(self):
            return ExprParser.RULE_listaValores




    def listaValores(self):

        localctx = ExprParser.ListaValoresContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_listaValores)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 154
            self.valor()
            self.state = 159
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==49:
                self.state = 155
                self.match(ExprParser.COMA)
                self.state = 156
                self.valor()
                self.state = 161
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SeleccionarContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SELECT(self):
            return self.getToken(ExprParser.SELECT, 0)

        def columnas(self):
            return self.getTypedRuleContext(ExprParser.ColumnasContext,0)


        def FROM(self):
            return self.getToken(ExprParser.FROM, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def PUNTOYCOMA(self):
            return self.getToken(ExprParser.PUNTOYCOMA, 0)

        def WHERE(self):
            return self.getToken(ExprParser.WHERE, 0)

        def condicion(self):
            return self.getTypedRuleContext(ExprParser.CondicionContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_seleccionar




    def seleccionar(self):

        localctx = ExprParser.SeleccionarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_seleccionar)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 162
            self.match(ExprParser.SELECT)
            self.state = 163
            self.columnas()
            self.state = 164
            self.match(ExprParser.FROM)
            self.state = 165
            self.match(ExprParser.ID)
            self.state = 168
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==14:
                self.state = 166
                self.match(ExprParser.WHERE)
                self.state = 167
                self.condicion()


            self.state = 170
            self.match(ExprParser.PUNTOYCOMA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ColumnasContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MULT(self):
            return self.getToken(ExprParser.MULT, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)

        def COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COMA)
            else:
                return self.getToken(ExprParser.COMA, i)

        def getRuleIndex(self):
            return ExprParser.RULE_columnas




    def columnas(self):

        localctx = ExprParser.ColumnasContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_columnas)
        self._la = 0 # Token type
        try:
            self.state = 181
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [38]:
                self.enterOuterAlt(localctx, 1)
                self.state = 172
                self.match(ExprParser.MULT)
                pass
            elif token in [55]:
                self.enterOuterAlt(localctx, 2)
                self.state = 173
                self.match(ExprParser.ID)
                self.state = 178
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==49:
                    self.state = 174
                    self.match(ExprParser.COMA)
                    self.state = 175
                    self.match(ExprParser.ID)
                    self.state = 180
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

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


    class ActualizarContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def UPDATE(self):
            return self.getToken(ExprParser.UPDATE, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def SET(self):
            return self.getToken(ExprParser.SET, 0)

        def asignacion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.AsignacionContext)
            else:
                return self.getTypedRuleContext(ExprParser.AsignacionContext,i)


        def PUNTOYCOMA(self):
            return self.getToken(ExprParser.PUNTOYCOMA, 0)

        def COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COMA)
            else:
                return self.getToken(ExprParser.COMA, i)

        def WHERE(self):
            return self.getToken(ExprParser.WHERE, 0)

        def condicion(self):
            return self.getTypedRuleContext(ExprParser.CondicionContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_actualizar




    def actualizar(self):

        localctx = ExprParser.ActualizarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_actualizar)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 183
            self.match(ExprParser.UPDATE)
            self.state = 184
            self.match(ExprParser.ID)
            self.state = 185
            self.match(ExprParser.SET)
            self.state = 186
            self.asignacion()
            self.state = 191
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==49:
                self.state = 187
                self.match(ExprParser.COMA)
                self.state = 188
                self.asignacion()
                self.state = 193
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 196
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==14:
                self.state = 194
                self.match(ExprParser.WHERE)
                self.state = 195
                self.condicion()


            self.state = 198
            self.match(ExprParser.PUNTOYCOMA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AsignacionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def IGUAL(self):
            return self.getToken(ExprParser.IGUAL, 0)

        def valor(self):
            return self.getTypedRuleContext(ExprParser.ValorContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_asignacion




    def asignacion(self):

        localctx = ExprParser.AsignacionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_asignacion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 200
            self.match(ExprParser.ID)
            self.state = 201
            self.match(ExprParser.IGUAL)
            self.state = 202
            self.valor()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EliminarContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DELETE(self):
            return self.getToken(ExprParser.DELETE, 0)

        def FROM(self):
            return self.getToken(ExprParser.FROM, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def PUNTOYCOMA(self):
            return self.getToken(ExprParser.PUNTOYCOMA, 0)

        def WHERE(self):
            return self.getToken(ExprParser.WHERE, 0)

        def condicion(self):
            return self.getTypedRuleContext(ExprParser.CondicionContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_eliminar




    def eliminar(self):

        localctx = ExprParser.EliminarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_eliminar)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 204
            self.match(ExprParser.DELETE)
            self.state = 205
            self.match(ExprParser.FROM)
            self.state = 206
            self.match(ExprParser.ID)
            self.state = 209
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==14:
                self.state = 207
                self.match(ExprParser.WHERE)
                self.state = 208
                self.condicion()


            self.state = 211
            self.match(ExprParser.PUNTOYCOMA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CondicionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def operador(self):
            return self.getTypedRuleContext(ExprParser.OperadorContext,0)


        def valor(self):
            return self.getTypedRuleContext(ExprParser.ValorContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_condicion




    def condicion(self):

        localctx = ExprParser.CondicionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_condicion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 213
            self.match(ExprParser.ID)
            self.state = 214
            self.operador()
            self.state = 215
            self.valor()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OperadorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IGUAL(self):
            return self.getToken(ExprParser.IGUAL, 0)

        def MENOR(self):
            return self.getToken(ExprParser.MENOR, 0)

        def MAYOR(self):
            return self.getToken(ExprParser.MAYOR, 0)

        def MENORIGUAL(self):
            return self.getToken(ExprParser.MENORIGUAL, 0)

        def MAYORIGUAL(self):
            return self.getToken(ExprParser.MAYORIGUAL, 0)

        def DIFERENTE(self):
            return self.getToken(ExprParser.DIFERENTE, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_operador




    def operador(self):

        localctx = ExprParser.OperadorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_operador)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 217
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 34634616274944) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ValorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ENTERO(self):
            return self.getToken(ExprParser.ENTERO, 0)

        def DECIMAL_NUM(self):
            return self.getToken(ExprParser.DECIMAL_NUM, 0)

        def CADENA(self):
            return self.getToken(ExprParser.CADENA, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_valor




    def valor(self):

        localctx = ExprParser.ValorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_valor)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 219
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 67553994410557440) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





