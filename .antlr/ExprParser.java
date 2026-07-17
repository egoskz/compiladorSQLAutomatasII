// Generated from c:/Users/HP/Downloads/comp/compiladorSQLAutomatasII/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, DATABASE=2, USE=3, TABLE=4, DROP=5, SELECT=6, INSERT=7, UPDATE=8, 
		LOGIN=9, ON=10, CASCADE=11, DELETE=12, RESTRICT=13, INTO=14, VALUES=15, 
		FROM=16, WHERE=17, SET=18, PRIMARY=19, KEY=20, NOT=21, NULL=22, UNIQUE=23, 
		INT=24, INTEGER=25, BIGINT=26, SMALLINT=27, FLOAT=28, DOUBLE=29, DECIMAL=30, 
		NUMERIC=31, CHAR=32, VARCHAR=33, TEXT=34, DATE=35, TIME=36, DATETIME=37, 
		TIMESTAMP=38, BOOLEAN=39, BIT=40, IGUAL=41, MENOR=42, MAYOR=43, MENORIGUAL=44, 
		MAYORIGUAL=45, DIFERENTE=46, PARIZQ=47, PARDER=48, CORIZQ=49, CORDER=50, 
		COMA=51, PUNTOYCOMA=52, PUNTO=53, DECIMAL_NUM=54, ENTERO=55, CADENA=56, 
		COMENTARIO=57, COMENTARIO_BLOQUE=58, WS=59, ALTER=60, ADD=61, MODIFY=62, 
		COLUMN=63, AUTO_INCREMENT=64, DEFAULT=65, INDEX=66, VIEW=67, AS=68, JOIN=69, 
		INNER=70, LEFT=71, RIGHT=72, FULL=73, GROUP=74, BY=75, HAVING=76, ORDER=77, 
		ASC=78, DESC=79, DISTINCT=80, COUNT=81, SUM=82, AVG=83, MIN=84, MAX=85, 
		AND=86, TRUE=87, FALSE=88, PROCEDURE=89, CALL=90, BEGIN=91, END=92, TRIGGER=93, 
		BEFORE=94, AFTER=95, FOR=96, EACH=97, ROW=98, NEW=99, OLD=100, START=101, 
		TRANSACTION=102, COMMIT=103, ROLLBACK=104, IN=105, OUT=106, INOUT=107, 
		MAS=108, MENOS=109, MULT=110, DIV=111, OR=112, NOW=113, CURRENT_DATE=114, 
		CURRENT_TIME=115, CONCAT=116, UPPER=117, LOWER=118, LENGTH=119, CHECK=120, 
		CONSTRAINT=121, FOREIGN=122, REFERENCES=123, ID=124, ERROR=125;
	public static final int
		RULE_inicio = 0, RULE_sentencia = 1, RULE_crearBaseDatos = 2, RULE_crearLogin = 3, 
		RULE_usarBaseDatos = 4, RULE_eliminarTabla = 5, RULE_crearTabla = 6, RULE_elementoTabla = 7, 
		RULE_columna = 8, RULE_modificadorColumna = 9, RULE_accionReferencia = 10, 
		RULE_alterarTabla = 11, RULE_crearIndice = 12, RULE_crearVista = 13, RULE_tipoDato = 14, 
		RULE_restricciones = 15, RULE_insertar = 16, RULE_bloqueValores = 17, 
		RULE_listaColumnas = 18, RULE_listaValores = 19, RULE_seleccionar = 20, 
		RULE_seleccionarSinPuntoYComa = 21, RULE_listaSeleccion = 22, RULE_tablaOrigen = 23, 
		RULE_joinClause = 24, RULE_condicionJoin = 25, RULE_listaOrden = 26, RULE_ordenColumna = 27, 
		RULE_direccionOrden = 28, RULE_expresionSelect = 29, RULE_alias = 30, 
		RULE_actualizar = 31, RULE_asignacion = 32, RULE_eliminar = 33, RULE_procedimiento = 34, 
		RULE_parametros = 35, RULE_parametro = 36, RULE_sentenciaProcedimiento = 37, 
		RULE_asignacionVariable = 38, RULE_llamadaProcedimiento = 39, RULE_argumentos = 40, 
		RULE_condicion = 41, RULE_comparacion = 42, RULE_operador = 43, RULE_valor = 44, 
		RULE_expresion = 45, RULE_referencia = 46, RULE_literal = 47, RULE_expresionAritmetica = 48, 
		RULE_termino = 49, RULE_factor = 50, RULE_funcionSQL = 51, RULE_listaExpresiones = 52, 
		RULE_trigger = 53, RULE_tiempoTrigger = 54, RULE_eventoTrigger = 55, RULE_accionTrigger = 56, 
		RULE_asignacionTrigger = 57, RULE_referenciaTrigger = 58, RULE_transaccion = 59, 
		RULE_commitStmt = 60, RULE_rollbackStmt = 61;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "sentencia", "crearBaseDatos", "crearLogin", "usarBaseDatos", 
			"eliminarTabla", "crearTabla", "elementoTabla", "columna", "modificadorColumna", 
			"accionReferencia", "alterarTabla", "crearIndice", "crearVista", "tipoDato", 
			"restricciones", "insertar", "bloqueValores", "listaColumnas", "listaValores", 
			"seleccionar", "seleccionarSinPuntoYComa", "listaSeleccion", "tablaOrigen", 
			"joinClause", "condicionJoin", "listaOrden", "ordenColumna", "direccionOrden", 
			"expresionSelect", "alias", "actualizar", "asignacion", "eliminar", "procedimiento", 
			"parametros", "parametro", "sentenciaProcedimiento", "asignacionVariable", 
			"llamadaProcedimiento", "argumentos", "condicion", "comparacion", "operador", 
			"valor", "expresion", "referencia", "literal", "expresionAritmetica", 
			"termino", "factor", "funcionSQL", "listaExpresiones", "trigger", "tiempoTrigger", 
			"eventoTrigger", "accionTrigger", "asignacionTrigger", "referenciaTrigger", 
			"transaccion", "commitStmt", "rollbackStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CREATE'", "'DATABASE'", "'USE'", "'TABLE'", "'DROP'", "'SELECT'", 
			"'INSERT'", "'UPDATE'", "'LOGIN'", "'ON'", "'CASCADE'", "'DELETE'", "'RESTRICT'", 
			"'INTO'", "'VALUES'", "'FROM'", "'WHERE'", "'SET'", "'PRIMARY'", "'KEY'", 
			"'NOT'", "'NULL'", "'UNIQUE'", "'INT'", "'INTEGER'", "'BIGINT'", "'SMALLINT'", 
			"'FLOAT'", "'DOUBLE'", "'DECIMAL'", "'NUMERIC'", "'CHAR'", "'VARCHAR'", 
			"'TEXT'", "'DATE'", "'TIME'", "'DATETIME'", "'TIMESTAMP'", "'BOOLEAN'", 
			"'BIT'", "'='", "'<'", "'>'", "'<='", "'>='", null, "'('", "')'", "'['", 
			"']'", "','", "';'", "'.'", null, null, null, null, null, null, "'ALTER'", 
			"'ADD'", "'MODIFY'", "'COLUMN'", "'AUTO_INCREMENT'", "'DEFAULT'", "'INDEX'", 
			"'VIEW'", "'AS'", "'JOIN'", "'INNER'", "'LEFT'", "'RIGHT'", "'FULL'", 
			"'GROUP'", "'BY'", "'HAVING'", "'ORDER'", "'ASC'", "'DESC'", "'DISTINCT'", 
			"'COUNT'", "'SUM'", "'AVG'", "'MIN'", "'MAX'", "'AND'", "'TRUE'", "'FALSE'", 
			"'PROCEDURE'", "'CALL'", "'BEGIN'", "'END'", "'TRIGGER'", "'BEFORE'", 
			"'AFTER'", "'FOR'", "'EACH'", "'ROW'", "'NEW'", "'OLD'", "'START'", "'TRANSACTION'", 
			"'COMMIT'", "'ROLLBACK'", "'IN'", "'OUT'", "'INOUT'", "'+'", "'-'", "'*'", 
			"'/'", "'OR'", "'NOW'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CONCAT'", 
			"'UPPER'", "'LOWER'", "'LENGTH'", "'CHECK'", "'CONSTRAINT'", "'FOREIGN'", 
			"'REFERENCES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "DATABASE", "USE", "TABLE", "DROP", "SELECT", "INSERT", 
			"UPDATE", "LOGIN", "ON", "CASCADE", "DELETE", "RESTRICT", "INTO", "VALUES", 
			"FROM", "WHERE", "SET", "PRIMARY", "KEY", "NOT", "NULL", "UNIQUE", "INT", 
			"INTEGER", "BIGINT", "SMALLINT", "FLOAT", "DOUBLE", "DECIMAL", "NUMERIC", 
			"CHAR", "VARCHAR", "TEXT", "DATE", "TIME", "DATETIME", "TIMESTAMP", "BOOLEAN", 
			"BIT", "IGUAL", "MENOR", "MAYOR", "MENORIGUAL", "MAYORIGUAL", "DIFERENTE", 
			"PARIZQ", "PARDER", "CORIZQ", "CORDER", "COMA", "PUNTOYCOMA", "PUNTO", 
			"DECIMAL_NUM", "ENTERO", "CADENA", "COMENTARIO", "COMENTARIO_BLOQUE", 
			"WS", "ALTER", "ADD", "MODIFY", "COLUMN", "AUTO_INCREMENT", "DEFAULT", 
			"INDEX", "VIEW", "AS", "JOIN", "INNER", "LEFT", "RIGHT", "FULL", "GROUP", 
			"BY", "HAVING", "ORDER", "ASC", "DESC", "DISTINCT", "COUNT", "SUM", "AVG", 
			"MIN", "MAX", "AND", "TRUE", "FALSE", "PROCEDURE", "CALL", "BEGIN", "END", 
			"TRIGGER", "BEFORE", "AFTER", "FOR", "EACH", "ROW", "NEW", "OLD", "START", 
			"TRANSACTION", "COMMIT", "ROLLBACK", "IN", "OUT", "INOUT", "MAS", "MENOS", 
			"MULT", "DIV", "OR", "NOW", "CURRENT_DATE", "CURRENT_TIME", "CONCAT", 
			"UPPER", "LOWER", "LENGTH", "CHECK", "CONSTRAINT", "FOREIGN", "REFERENCES", 
			"ID", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504606851562L) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 26625L) != 0)) {
				{
				{
				setState(124);
				sentencia();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public CrearBaseDatosContext crearBaseDatos() {
			return getRuleContext(CrearBaseDatosContext.class,0);
		}
		public CrearLoginContext crearLogin() {
			return getRuleContext(CrearLoginContext.class,0);
		}
		public UsarBaseDatosContext usarBaseDatos() {
			return getRuleContext(UsarBaseDatosContext.class,0);
		}
		public CrearTablaContext crearTabla() {
			return getRuleContext(CrearTablaContext.class,0);
		}
		public EliminarTablaContext eliminarTabla() {
			return getRuleContext(EliminarTablaContext.class,0);
		}
		public AlterarTablaContext alterarTabla() {
			return getRuleContext(AlterarTablaContext.class,0);
		}
		public CrearIndiceContext crearIndice() {
			return getRuleContext(CrearIndiceContext.class,0);
		}
		public CrearVistaContext crearVista() {
			return getRuleContext(CrearVistaContext.class,0);
		}
		public InsertarContext insertar() {
			return getRuleContext(InsertarContext.class,0);
		}
		public SeleccionarContext seleccionar() {
			return getRuleContext(SeleccionarContext.class,0);
		}
		public ActualizarContext actualizar() {
			return getRuleContext(ActualizarContext.class,0);
		}
		public EliminarContext eliminar() {
			return getRuleContext(EliminarContext.class,0);
		}
		public ProcedimientoContext procedimiento() {
			return getRuleContext(ProcedimientoContext.class,0);
		}
		public TriggerContext trigger() {
			return getRuleContext(TriggerContext.class,0);
		}
		public TransaccionContext transaccion() {
			return getRuleContext(TransaccionContext.class,0);
		}
		public CommitStmtContext commitStmt() {
			return getRuleContext(CommitStmtContext.class,0);
		}
		public RollbackStmtContext rollbackStmt() {
			return getRuleContext(RollbackStmtContext.class,0);
		}
		public LlamadaProcedimientoContext llamadaProcedimiento() {
			return getRuleContext(LlamadaProcedimientoContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				crearBaseDatos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				crearLogin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				usarBaseDatos();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				crearTabla();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				eliminarTabla();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				alterarTabla();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				crearIndice();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
				crearVista();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(140);
				insertar();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(141);
				seleccionar();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(142);
				actualizar();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(143);
				eliminar();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(144);
				procedimiento();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(145);
				trigger();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(146);
				transaccion();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(147);
				commitStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(148);
				rollbackStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(149);
				llamadaProcedimiento();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrearBaseDatosContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(ExprParser.DATABASE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public CrearBaseDatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearBaseDatos; }
	}

	public final CrearBaseDatosContext crearBaseDatos() throws RecognitionException {
		CrearBaseDatosContext _localctx = new CrearBaseDatosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_crearBaseDatos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(CREATE);
			setState(153);
			match(DATABASE);
			setState(154);
			match(ID);
			setState(155);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrearLoginContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode LOGIN() { return getToken(ExprParser.LOGIN, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public CrearLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearLogin; }
	}

	public final CrearLoginContext crearLogin() throws RecognitionException {
		CrearLoginContext _localctx = new CrearLoginContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_crearLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(CREATE);
			setState(158);
			match(LOGIN);
			setState(159);
			match(ID);
			setState(160);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsarBaseDatosContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(ExprParser.USE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public UsarBaseDatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usarBaseDatos; }
	}

	public final UsarBaseDatosContext usarBaseDatos() throws RecognitionException {
		UsarBaseDatosContext _localctx = new UsarBaseDatosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_usarBaseDatos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(USE);
			setState(163);
			match(ID);
			setState(164);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EliminarTablaContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public EliminarTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eliminarTabla; }
	}

	public final EliminarTablaContext eliminarTabla() throws RecognitionException {
		EliminarTablaContext _localctx = new EliminarTablaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eliminarTabla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(DROP);
			setState(167);
			match(TABLE);
			setState(168);
			match(ID);
			setState(169);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrearTablaContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(ExprParser.PARIZQ, 0); }
		public List<ElementoTablaContext> elementoTabla() {
			return getRuleContexts(ElementoTablaContext.class);
		}
		public ElementoTablaContext elementoTabla(int i) {
			return getRuleContext(ElementoTablaContext.class,i);
		}
		public TerminalNode PARDER() { return getToken(ExprParser.PARDER, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public CrearTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearTabla; }
	}

	public final CrearTablaContext crearTabla() throws RecognitionException {
		CrearTablaContext _localctx = new CrearTablaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_crearTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(CREATE);
			setState(172);
			match(TABLE);
			setState(173);
			match(ID);
			setState(174);
			match(PARIZQ);
			setState(175);
			elementoTabla();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(176);
				match(COMA);
				setState(177);
				elementoTabla();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(PARDER);
			setState(184);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementoTablaContext extends ParserRuleContext {
		public ColumnaContext columna() {
			return getRuleContext(ColumnaContext.class,0);
		}
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public List<TerminalNode> PARIZQ() { return getTokens(ExprParser.PARIZQ); }
		public TerminalNode PARIZQ(int i) {
			return getToken(ExprParser.PARIZQ, i);
		}
		public List<ListaColumnasContext> listaColumnas() {
			return getRuleContexts(ListaColumnasContext.class);
		}
		public ListaColumnasContext listaColumnas(int i) {
			return getRuleContext(ListaColumnasContext.class,i);
		}
		public List<TerminalNode> PARDER() { return getTokens(ExprParser.PARDER); }
		public TerminalNode PARDER(int i) {
			return getToken(ExprParser.PARDER, i);
		}
		public TerminalNode FOREIGN() { return getToken(ExprParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(ExprParser.REFERENCES, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<AccionReferenciaContext> accionReferencia() {
			return getRuleContexts(AccionReferenciaContext.class);
		}
		public AccionReferenciaContext accionReferencia(int i) {
			return getRuleContext(AccionReferenciaContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(ExprParser.CONSTRAINT, 0); }
		public TerminalNode CHECK() { return getToken(ExprParser.CHECK, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(ExprParser.UNIQUE, 0); }
		public ElementoTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoTabla; }
	}

	public final ElementoTablaContext elementoTabla() throws RecognitionException {
		ElementoTablaContext _localctx = new ElementoTablaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elementoTabla);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				columna();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(PRIMARY);
				setState(188);
				match(KEY);
				setState(189);
				match(PARIZQ);
				setState(190);
				listaColumnas();
				setState(191);
				match(PARDER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(FOREIGN);
				setState(194);
				match(KEY);
				setState(195);
				match(PARIZQ);
				setState(196);
				listaColumnas();
				setState(197);
				match(PARDER);
				setState(198);
				match(REFERENCES);
				setState(199);
				match(ID);
				setState(200);
				match(PARIZQ);
				setState(201);
				listaColumnas();
				setState(202);
				match(PARDER);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(203);
					accionReferencia();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(CONSTRAINT);
				setState(210);
				match(ID);
				setState(211);
				match(FOREIGN);
				setState(212);
				match(KEY);
				setState(213);
				match(PARIZQ);
				setState(214);
				listaColumnas();
				setState(215);
				match(PARDER);
				setState(216);
				match(REFERENCES);
				setState(217);
				match(ID);
				setState(218);
				match(PARIZQ);
				setState(219);
				listaColumnas();
				setState(220);
				match(PARDER);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(221);
					accionReferencia();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(CONSTRAINT);
				setState(228);
				match(ID);
				setState(229);
				match(CHECK);
				setState(230);
				match(PARIZQ);
				setState(231);
				condicion();
				setState(232);
				match(PARDER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				match(CONSTRAINT);
				setState(235);
				match(ID);
				setState(236);
				match(UNIQUE);
				setState(237);
				match(PARIZQ);
				setState(238);
				listaColumnas();
				setState(239);
				match(PARDER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public List<ModificadorColumnaContext> modificadorColumna() {
			return getRuleContexts(ModificadorColumnaContext.class);
		}
		public ModificadorColumnaContext modificadorColumna(int i) {
			return getRuleContext(ModificadorColumnaContext.class,i);
		}
		public TerminalNode REFERENCES() { return getToken(ExprParser.REFERENCES, 0); }
		public TerminalNode PARIZQ() { return getToken(ExprParser.PARIZQ, 0); }
		public ListaColumnasContext listaColumnas() {
			return getRuleContext(ListaColumnasContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(ExprParser.PARDER, 0); }
		public List<AccionReferenciaContext> accionReferencia() {
			return getRuleContexts(AccionReferenciaContext.class);
		}
		public AccionReferenciaContext accionReferencia(int i) {
			return getRuleContext(AccionReferenciaContext.class,i);
		}
		public ColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna; }
	}

	public final ColumnaContext columna() throws RecognitionException {
		ColumnaContext _localctx = new ColumnaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columna);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(ID);
				setState(244);
				tipoDato();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11010048L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 72057594037927939L) != 0)) {
					{
					{
					setState(245);
					modificadorColumna();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(REFERENCES);
				setState(252);
				match(ID);
				setState(253);
				match(PARIZQ);
				setState(254);
				listaColumnas();
				setState(255);
				match(PARDER);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(256);
					accionReferencia();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModificadorColumnaContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(ExprParser.UNIQUE, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(ExprParser.AUTO_INCREMENT, 0); }
		public TerminalNode DEFAULT() { return getToken(ExprParser.DEFAULT, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(ExprParser.CHECK, 0); }
		public TerminalNode PARIZQ() { return getToken(ExprParser.PARIZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(ExprParser.PARDER, 0); }
		public ModificadorColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificadorColumna; }
	}

	public final ModificadorColumnaContext modificadorColumna() throws RecognitionException {
		ModificadorColumnaContext _localctx = new ModificadorColumnaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modificadorColumna);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(PRIMARY);
				setState(265);
				match(KEY);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(NOT);
				setState(267);
				match(NULL);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(UNIQUE);
				}
				break;
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(AUTO_INCREMENT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				match(DEFAULT);
				setState(271);
				valor();
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				match(CHECK);
				setState(273);
				match(PARIZQ);
				setState(274);
				condicion();
				setState(275);
				match(PARDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccionReferenciaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(ExprParser.DELETE, 0); }
		public TerminalNode CASCADE() { return getToken(ExprParser.CASCADE, 0); }
		public TerminalNode UPDATE() { return getToken(ExprParser.UPDATE, 0); }
		public TerminalNode RESTRICT() { return getToken(ExprParser.RESTRICT, 0); }
		public AccionReferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accionReferencia; }
	}

	public final AccionReferenciaContext accionReferencia() throws RecognitionException {
		AccionReferenciaContext _localctx = new AccionReferenciaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_accionReferencia);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(ON);
				setState(280);
				match(DELETE);
				setState(281);
				match(CASCADE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(ON);
				setState(283);
				match(UPDATE);
				setState(284);
				match(CASCADE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(ON);
				setState(286);
				match(DELETE);
				setState(287);
				match(RESTRICT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(ON);
				setState(289);
				match(UPDATE);
				setState(290);
				match(RESTRICT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterarTablaContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ExprParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public TerminalNode ADD() { return getToken(ExprParser.ADD, 0); }
		public ColumnaContext columna() {
			return getRuleContext(ColumnaContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(ExprParser.CONSTRAINT, 0); }
		public TerminalNode CHECK() { return getToken(ExprParser.CHECK, 0); }
		public TerminalNode PARIZQ() { return getToken(ExprParser.PARIZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(ExprParser.PARDER, 0); }
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(ExprParser.COLUMN, 0); }
		public TerminalNode MODIFY() { return getToken(ExprParser.MODIFY, 0); }
		public AlterarTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterarTabla; }
	}

	public final AlterarTablaContext alterarTabla() throws RecognitionException {
		AlterarTablaContext _localctx = new AlterarTablaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alterarTabla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ALTER);
			setState(294);
			match(TABLE);
			setState(295);
			match(ID);
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(296);
				match(ADD);
				setState(297);
				columna();
				}
				break;
			case 2:
				{
				setState(298);
				match(ADD);
				setState(299);
				match(CONSTRAINT);
				setState(300);
				match(ID);
				setState(301);
				match(CHECK);
				setState(302);
				match(PARIZQ);
				setState(303);
				condicion();
				setState(304);
				match(PARDER);
				}
				break;
			case 3:
				{
				setState(306);
				match(DROP);
				setState(307);
				match(COLUMN);
				setState(308);
				match(ID);
				}
				break;
			case 4:
				{
				setState(309);
				match(MODIFY);
				setState(310);
				columna();
				}
				break;
			}
			setState(313);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrearIndiceContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(ExprParser.INDEX, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public TerminalNode PARIZQ() { return getToken(ExprParser.PARIZQ, 0); }
		public ListaColumnasContext listaColumnas() {
			return getRuleContext(ListaColumnasContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(ExprParser.PARDER, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public CrearIndiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearIndice; }
	}

	public final CrearIndiceContext crearIndice() throws RecognitionException {
		CrearIndiceContext _localctx = new CrearIndiceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_crearIndice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(CREATE);
			setState(316);
			match(INDEX);
			setState(317);
			match(ID);
			setState(318);
			match(ON);
			setState(319);
			match(ID);
			setState(320);
			match(PARIZQ);
			setState(321);
			listaColumnas();
			setState(322);
			match(PARDER);
			setState(323);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrearVistaContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(ExprParser.VIEW, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public SeleccionarSinPuntoYComaContext seleccionarSinPuntoYComa() {
			return getRuleContext(SeleccionarSinPuntoYComaContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public CrearVistaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearVista; }
	}

	public final CrearVistaContext crearVista() throws RecognitionException {
		CrearVistaContext _localctx = new CrearVistaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_crearVista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(CREATE);
			setState(326);
			match(VIEW);
			setState(327);
			match(ID);
			setState(328);
			match(AS);
			setState(329);
			seleccionarSinPuntoYComa();
			setState(330);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoDatoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(ExprParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(ExprParser.BIGINT, 0); }
		public TerminalNode SMALLINT() { return getToken(ExprParser.SMALLINT, 0); }
		public TerminalNode FLOAT() { return getToken(ExprParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(ExprParser.DOUBLE, 0); }
		public TerminalNode DECIMAL() { return getToken(ExprParser.DECIMAL, 0); }
		public TerminalNode PARIZQ() { return getToken(ExprParser.PARIZQ, 0); }
		public List<TerminalNode> ENTERO() { return getTokens(ExprParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(ExprParser.ENTERO, i);
		}
		public TerminalNode COMA() { return getToken(ExprParser.COMA, 0); }
		public TerminalNode PARDER() { return getToken(ExprParser.PARDER, 0); }
		public TerminalNode NUMERIC() { return getToken(ExprParser.NUMERIC, 0); }
		public TerminalNode CHAR() { return getToken(ExprParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(ExprParser.VARCHAR, 0); }
		public TerminalNode TEXT() { return getToken(ExprParser.TEXT, 0); }
		public TerminalNode DATE() { return getToken(ExprParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(ExprParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(ExprParser.DATETIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(ExprParser.TIMESTAMP, 0); }
		public TerminalNode BOOLEAN() { return getToken(ExprParser.BOOLEAN, 0); }
		public TerminalNode BIT() { return getToken(ExprParser.BIT, 0); }
		public TipoDatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDato; }
	}

	public final TipoDatoContext tipoDato() throws RecognitionException {
		TipoDatoContext _localctx = new TipoDatoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipoDato);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(INT);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(INTEGER);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(BIGINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				match(SMALLINT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				match(DOUBLE);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
				match(DECIMAL);
				setState(339);
				match(PARIZQ);
				setState(340);
				match(ENTERO);
				setState(341);
				match(COMA);
				setState(342);
				match(ENTERO);
				setState(343);
				match(PARDER);
				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 8);
				{
				setState(344);
				match(NUMERIC);
				setState(345);
				match(PARIZQ);
				setState(346);
				match(ENTERO);
				setState(347);
				match(COMA);
				setState(348);
				match(ENTERO);
				setState(349);
				match(PARDER);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(350);
				match(CHAR);
				setState(351);
				match(PARIZQ);
				setState(352);
				match(ENTERO);
				setState(353);
				match(PARDER);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(354);
				match(VARCHAR);
				setState(355);
				match(PARIZQ);
				setState(356);
				match(ENTERO);
				setState(357);
				match(PARDER);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 11);
				{
				setState(358);
				match(TEXT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 12);
				{
				setState(359);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 13);
				{
				setState(360);
				match(TIME);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 14);
				{
				setState(361);
				match(DATETIME);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 15);
				{
				setState(362);
				match(TIMESTAMP);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 16);
				{
				setState(363);
				match(BOOLEAN);
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 17);
				{
				setState(364);
				match(BIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RestriccionesContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(ExprParser.UNIQUE, 0); }
		public RestriccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restricciones; }
	}

	public final RestriccionesContext restricciones() throws RecognitionException {
		RestriccionesContext _localctx = new RestriccionesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_restricciones);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(PRIMARY);
				setState(368);
				match(KEY);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(NOT);
				setState(370);
				match(NULL);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertarContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ExprParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ExprParser.INTO, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(ExprParser.PARIZQ, 0); }
		public ListaColumnasContext listaColumnas() {
			return getRuleContext(ListaColumnasContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(ExprParser.PARDER, 0); }
		public TerminalNode VALUES() { return getToken(ExprParser.VALUES, 0); }
		public BloqueValoresContext bloqueValores() {
			return getRuleContext(BloqueValoresContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public InsertarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertar; }
	}

	public final InsertarContext insertar() throws RecognitionException {
		InsertarContext _localctx = new InsertarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_insertar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(INSERT);
			setState(375);
			match(INTO);
			setState(376);
			match(ID);
			setState(377);
			match(PARIZQ);
			setState(378);
			listaColumnas();
			setState(379);
			match(PARDER);
			setState(380);
			match(VALUES);
			setState(381);
			bloqueValores();
			setState(382);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueValoresContext extends ParserRuleContext {
		public List<TerminalNode> PARIZQ() { return getTokens(ExprParser.PARIZQ); }
		public TerminalNode PARIZQ(int i) {
			return getToken(ExprParser.PARIZQ, i);
		}
		public List<ListaValoresContext> listaValores() {
			return getRuleContexts(ListaValoresContext.class);
		}
		public ListaValoresContext listaValores(int i) {
			return getRuleContext(ListaValoresContext.class,i);
		}
		public List<TerminalNode> PARDER() { return getTokens(ExprParser.PARDER); }
		public TerminalNode PARDER(int i) {
			return getToken(ExprParser.PARDER, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public BloqueValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueValores; }
	}

	public final BloqueValoresContext bloqueValores() throws RecognitionException {
		BloqueValoresContext _localctx = new BloqueValoresContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bloqueValores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(PARIZQ);
			setState(385);
			listaValores();
			setState(386);
			match(PARDER);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(387);
				match(COMA);
				setState(388);
				match(PARIZQ);
				setState(389);
				listaValores();
				setState(390);
				match(PARDER);
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaColumnasContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ListaColumnasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaColumnas; }
	}

	public final ListaColumnasContext listaColumnas() throws RecognitionException {
		ListaColumnasContext _localctx = new ListaColumnasContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listaColumnas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(ID);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(398);
				match(COMA);
				setState(399);
				match(ID);
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaValoresContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ListaValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaValores; }
	}

	public final ListaValoresContext listaValores() throws RecognitionException {
		ListaValoresContext _localctx = new ListaValoresContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listaValores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			valor();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(406);
				match(COMA);
				setState(407);
				valor();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeleccionarContext extends ParserRuleContext {
		public SeleccionarSinPuntoYComaContext seleccionarSinPuntoYComa() {
			return getRuleContext(SeleccionarSinPuntoYComaContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public SeleccionarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionar; }
	}

	public final SeleccionarContext seleccionar() throws RecognitionException {
		SeleccionarContext _localctx = new SeleccionarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_seleccionar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			seleccionarSinPuntoYComa();
			setState(414);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeleccionarSinPuntoYComaContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ExprParser.SELECT, 0); }
		public ListaSeleccionContext listaSeleccion() {
			return getRuleContext(ListaSeleccionContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public TablaOrigenContext tablaOrigen() {
			return getRuleContext(TablaOrigenContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(ExprParser.DISTINCT, 0); }
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(ExprParser.WHERE, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(ExprParser.GROUP, 0); }
		public List<TerminalNode> BY() { return getTokens(ExprParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(ExprParser.BY, i);
		}
		public ListaColumnasContext listaColumnas() {
			return getRuleContext(ListaColumnasContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(ExprParser.HAVING, 0); }
		public TerminalNode ORDER() { return getToken(ExprParser.ORDER, 0); }
		public ListaOrdenContext listaOrden() {
			return getRuleContext(ListaOrdenContext.class,0);
		}
		public SeleccionarSinPuntoYComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionarSinPuntoYComa; }
	}

	public final SeleccionarSinPuntoYComaContext seleccionarSinPuntoYComa() throws RecognitionException {
		SeleccionarSinPuntoYComaContext _localctx = new SeleccionarSinPuntoYComaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_seleccionarSinPuntoYComa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(SELECT);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(417);
				match(DISTINCT);
				}
			}

			setState(420);
			listaSeleccion();
			setState(421);
			match(FROM);
			setState(422);
			tablaOrigen();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 31L) != 0)) {
				{
				{
				setState(423);
				joinClause();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(429);
				match(WHERE);
				setState(430);
				condicion();
				}
			}

			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(433);
				match(GROUP);
				setState(434);
				match(BY);
				setState(435);
				listaColumnas();
				}
			}

			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(438);
				match(HAVING);
				setState(439);
				condicion();
				}
			}

			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(442);
				match(ORDER);
				setState(443);
				match(BY);
				setState(444);
				listaOrden();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaSeleccionContext extends ParserRuleContext {
		public List<ExpresionSelectContext> expresionSelect() {
			return getRuleContexts(ExpresionSelectContext.class);
		}
		public ExpresionSelectContext expresionSelect(int i) {
			return getRuleContext(ExpresionSelectContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ListaSeleccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaSeleccion; }
	}

	public final ListaSeleccionContext listaSeleccion() throws RecognitionException {
		ListaSeleccionContext _localctx = new ListaSeleccionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listaSeleccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			expresionSelect();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(448);
				match(COMA);
				setState(449);
				expresionSelect();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TablaOrigenContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TablaOrigenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablaOrigen; }
	}

	public final TablaOrigenContext tablaOrigen() throws RecognitionException {
		TablaOrigenContext _localctx = new TablaOrigenContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tablaOrigen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(ID);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(456);
				match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinClauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(ExprParser.JOIN, 0); }
		public TablaOrigenContext tablaOrigen() {
			return getRuleContext(TablaOrigenContext.class,0);
		}
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public CondicionJoinContext condicionJoin() {
			return getRuleContext(CondicionJoinContext.class,0);
		}
		public TerminalNode INNER() { return getToken(ExprParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(ExprParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(ExprParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(ExprParser.FULL, 0); }
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_joinClause);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(JOIN);
				setState(460);
				tablaOrigen();
				setState(461);
				match(ON);
				setState(462);
				condicionJoin();
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(INNER);
				setState(465);
				match(JOIN);
				setState(466);
				tablaOrigen();
				setState(467);
				match(ON);
				setState(468);
				condicionJoin();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(LEFT);
				setState(471);
				match(JOIN);
				setState(472);
				tablaOrigen();
				setState(473);
				match(ON);
				setState(474);
				condicionJoin();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				match(RIGHT);
				setState(477);
				match(JOIN);
				setState(478);
				tablaOrigen();
				setState(479);
				match(ON);
				setState(480);
				condicionJoin();
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
				match(FULL);
				setState(483);
				match(JOIN);
				setState(484);
				tablaOrigen();
				setState(485);
				match(ON);
				setState(486);
				condicionJoin();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionJoinContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(ExprParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(ExprParser.PUNTO, i);
		}
		public TerminalNode IGUAL() { return getToken(ExprParser.IGUAL, 0); }
		public CondicionJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionJoin; }
	}

	public final CondicionJoinContext condicionJoin() throws RecognitionException {
		CondicionJoinContext _localctx = new CondicionJoinContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condicionJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(ID);
			setState(491);
			match(PUNTO);
			setState(492);
			match(ID);
			setState(493);
			match(IGUAL);
			setState(494);
			match(ID);
			setState(495);
			match(PUNTO);
			setState(496);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaOrdenContext extends ParserRuleContext {
		public List<OrdenColumnaContext> ordenColumna() {
			return getRuleContexts(OrdenColumnaContext.class);
		}
		public OrdenColumnaContext ordenColumna(int i) {
			return getRuleContext(OrdenColumnaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ListaOrdenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaOrden; }
	}

	public final ListaOrdenContext listaOrden() throws RecognitionException {
		ListaOrdenContext _localctx = new ListaOrdenContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listaOrden);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			ordenColumna();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(499);
				match(COMA);
				setState(500);
				ordenColumna();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrdenColumnaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public DireccionOrdenContext direccionOrden() {
			return getRuleContext(DireccionOrdenContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(ExprParser.PUNTO, 0); }
		public OrdenColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenColumna; }
	}

	public final OrdenColumnaContext ordenColumna() throws RecognitionException {
		OrdenColumnaContext _localctx = new OrdenColumnaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ordenColumna);
		int _la;
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(ID);
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(507);
					direccionOrden();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(ID);
				setState(511);
				match(PUNTO);
				setState(512);
				match(ID);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(513);
					direccionOrden();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DireccionOrdenContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(ExprParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ExprParser.DESC, 0); }
		public DireccionOrdenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direccionOrden; }
	}

	public final DireccionOrdenContext direccionOrden() throws RecognitionException {
		DireccionOrdenContext _localctx = new DireccionOrdenContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_direccionOrden);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionSelectContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(ExprParser.MULT, 0); }
		public ReferenciaContext referencia() {
			return getRuleContext(ReferenciaContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public FuncionSQLContext funcionSQL() {
			return getRuleContext(FuncionSQLContext.class,0);
		}
		public ExpresionSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionSelect; }
	}

	public final ExpresionSelectContext expresionSelect() throws RecognitionException {
		ExpresionSelectContext _localctx = new ExpresionSelectContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expresionSelect);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(MULT);
				}
				break;
			case NEW:
			case OLD:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				referencia();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(522);
					alias();
					}
				}

				}
				break;
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case NOW:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CONCAT:
			case UPPER:
			case LOWER:
			case LENGTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				funcionSQL();
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(526);
					alias();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(AS);
			setState(532);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualizarContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(ExprParser.UPDATE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode SET() { return getToken(ExprParser.SET, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public TerminalNode WHERE() { return getToken(ExprParser.WHERE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public ActualizarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizar; }
	}

	public final ActualizarContext actualizar() throws RecognitionException {
		ActualizarContext _localctx = new ActualizarContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_actualizar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(UPDATE);
			setState(535);
			match(ID);
			setState(536);
			match(SET);
			setState(537);
			asignacion();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(538);
				match(COMA);
				setState(539);
				asignacion();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(545);
				match(WHERE);
				setState(546);
				condicion();
				}
			}

			setState(549);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(ExprParser.IGUAL, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(ID);
			setState(552);
			match(IGUAL);
			setState(553);
			valor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EliminarContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(ExprParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public TerminalNode WHERE() { return getToken(ExprParser.WHERE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public EliminarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eliminar; }
	}

	public final EliminarContext eliminar() throws RecognitionException {
		EliminarContext _localctx = new EliminarContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_eliminar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(DELETE);
			setState(556);
			match(FROM);
			setState(557);
			match(ID);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(558);
				match(WHERE);
				setState(559);
				condicion();
				}
			}

			setState(562);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedimientoContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(ExprParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(ExprParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(ExprParser.PARDER, 0); }
		public TerminalNode BEGIN() { return getToken(ExprParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ExprParser.END, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public List<TerminalNode> DIV() { return getTokens(ExprParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ExprParser.DIV, i);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<SentenciaProcedimientoContext> sentenciaProcedimiento() {
			return getRuleContexts(SentenciaProcedimientoContext.class);
		}
		public SentenciaProcedimientoContext sentenciaProcedimiento(int i) {
			return getRuleContext(SentenciaProcedimientoContext.class,i);
		}
		public ProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimiento; }
	}

	public final ProcedimientoContext procedimiento() throws RecognitionException {
		ProcedimientoContext _localctx = new ProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_procedimiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(CREATE);
			setState(565);
			match(PROCEDURE);
			setState(566);
			match(ID);
			setState(567);
			match(PARIZQ);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 524295L) != 0)) {
				{
				setState(568);
				parametros();
				}
			}

			setState(571);
			match(PARDER);
			setState(572);
			match(BEGIN);
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4544L) != 0) || _la==ID) {
				{
				{
				setState(573);
				sentenciaProcedimiento();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			match(END);
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUNTOYCOMA:
				{
				setState(580);
				match(PUNTOYCOMA);
				}
				break;
			case DIV:
				{
				setState(581);
				match(DIV);
				setState(582);
				match(DIV);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			parametro();
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(586);
				match(COMA);
				setState(587);
				parametro();
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode IN() { return getToken(ExprParser.IN, 0); }
		public TerminalNode OUT() { return getToken(ExprParser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(ExprParser.INOUT, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 7L) != 0)) {
				{
				setState(593);
				_la = _input.LA(1);
				if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(596);
			match(ID);
			setState(597);
			tipoDato();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaProcedimientoContext extends ParserRuleContext {
		public InsertarContext insertar() {
			return getRuleContext(InsertarContext.class,0);
		}
		public ActualizarContext actualizar() {
			return getRuleContext(ActualizarContext.class,0);
		}
		public EliminarContext eliminar() {
			return getRuleContext(EliminarContext.class,0);
		}
		public SeleccionarContext seleccionar() {
			return getRuleContext(SeleccionarContext.class,0);
		}
		public AsignacionVariableContext asignacionVariable() {
			return getRuleContext(AsignacionVariableContext.class,0);
		}
		public SentenciaProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaProcedimiento; }
	}

	public final SentenciaProcedimientoContext sentenciaProcedimiento() throws RecognitionException {
		SentenciaProcedimientoContext _localctx = new SentenciaProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sentenciaProcedimiento);
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				insertar();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				actualizar();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				eliminar();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				seleccionar();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(603);
				asignacionVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(ExprParser.IGUAL, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public AsignacionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionVariable; }
	}

	public final AsignacionVariableContext asignacionVariable() throws RecognitionException {
		AsignacionVariableContext _localctx = new AsignacionVariableContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_asignacionVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(ID);
			setState(607);
			match(IGUAL);
			setState(608);
			valor();
			setState(609);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaProcedimientoContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(ExprParser.CALL, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(ExprParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(ExprParser.PARDER, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public LlamadaProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaProcedimiento; }
	}

	public final LlamadaProcedimientoContext llamadaProcedimiento() throws RecognitionException {
		LlamadaProcedimientoContext _localctx = new LlamadaProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_llamadaProcedimiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(CALL);
			setState(612);
			match(ID);
			setState(613);
			match(PARIZQ);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126241527058923520L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 9341554655455L) != 0)) {
				{
				setState(614);
				argumentos();
				}
			}

			setState(617);
			match(PARDER);
			setState(618);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			valor();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(621);
				match(COMA);
				setState(622);
				valor();
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public List<ComparacionContext> comparacion() {
			return getRuleContexts(ComparacionContext.class);
		}
		public ComparacionContext comparacion(int i) {
			return getRuleContext(ComparacionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ExprParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ExprParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ExprParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ExprParser.OR, i);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			comparacion();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				setState(633);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(629);
					match(AND);
					setState(630);
					comparacion();
					}
					break;
				case OR:
					{
					setState(631);
					match(OR);
					setState(632);
					comparacion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public TerminalNode PARIZQ() { return getToken(ExprParser.PARIZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(ExprParser.PARDER, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_comparacion);
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				expresion();
				setState(639);
				operador();
				setState(640);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(PARIZQ);
				setState(643);
				condicion();
				setState(644);
				match(PARDER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(ExprParser.IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(ExprParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(ExprParser.MAYOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(ExprParser.MENORIGUAL, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(ExprParser.MAYORIGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(ExprParser.DIFERENTE, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 138538465099776L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_valor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionAritmeticaContext expresionAritmetica() {
			return getRuleContext(ExpresionAritmeticaContext.class,0);
		}
		public FuncionSQLContext funcionSQL() {
			return getRuleContext(FuncionSQLContext.class,0);
		}
		public ReferenciaContext referencia() {
			return getRuleContext(ReferenciaContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expresion);
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				expresionAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				funcionSQL();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				referencia();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenciaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode PUNTO() { return getToken(ExprParser.PUNTO, 0); }
		public TerminalNode NEW() { return getToken(ExprParser.NEW, 0); }
		public TerminalNode OLD() { return getToken(ExprParser.OLD, 0); }
		public ReferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencia; }
	}

	public final ReferenciaContext referencia() throws RecognitionException {
		ReferenciaContext _localctx = new ReferenciaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_referencia);
		try {
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(ID);
				setState(660);
				match(PUNTO);
				setState(661);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
				match(NEW);
				setState(663);
				match(PUNTO);
				setState(664);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				match(OLD);
				setState(666);
				match(PUNTO);
				setState(667);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(ExprParser.ENTERO, 0); }
		public TerminalNode DECIMAL_NUM() { return getToken(ExprParser.DECIMAL_NUM, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public TerminalNode TRUE() { return getToken(ExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExprParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789570568192L) != 0) || _la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionAritmeticaContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> MAS() { return getTokens(ExprParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(ExprParser.MAS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(ExprParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(ExprParser.MENOS, i);
		}
		public ExpresionAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionAritmetica; }
	}

	public final ExpresionAritmeticaContext expresionAritmetica() throws RecognitionException {
		ExpresionAritmeticaContext _localctx = new ExpresionAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expresionAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			termino();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAS || _la==MENOS) {
				{
				{
				setState(673);
				_la = _input.LA(1);
				if ( !(_la==MAS || _la==MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(674);
				termino();
				}
				}
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(ExprParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(ExprParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ExprParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ExprParser.DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			factor();
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(681);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(682);
				factor();
				}
				}
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ReferenciaContext referencia() {
			return getRuleContext(ReferenciaContext.class,0);
		}
		public FuncionSQLContext funcionSQL() {
			return getRuleContext(FuncionSQLContext.class,0);
		}
		public TerminalNode PARIZQ() { return getToken(ExprParser.PARIZQ, 0); }
		public ExpresionAritmeticaContext expresionAritmetica() {
			return getRuleContext(ExpresionAritmeticaContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(ExprParser.PARDER, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_factor);
		try {
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case DECIMAL_NUM:
			case ENTERO:
			case CADENA:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				literal();
				}
				break;
			case NEW:
			case OLD:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				referencia();
				}
				break;
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case NOW:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CONCAT:
			case UPPER:
			case LOWER:
			case LENGTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(690);
				funcionSQL();
				}
				break;
			case PARIZQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(691);
				match(PARIZQ);
				setState(692);
				expresionAritmetica();
				setState(693);
				match(PARDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionSQLContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(ExprParser.COUNT, 0); }
		public TerminalNode PARIZQ() { return getToken(ExprParser.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(ExprParser.PARDER, 0); }
		public TerminalNode MULT() { return getToken(ExprParser.MULT, 0); }
		public ReferenciaContext referencia() {
			return getRuleContext(ReferenciaContext.class,0);
		}
		public TerminalNode SUM() { return getToken(ExprParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(ExprParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(ExprParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ExprParser.MAX, 0); }
		public TerminalNode NOW() { return getToken(ExprParser.NOW, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(ExprParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(ExprParser.CURRENT_TIME, 0); }
		public TerminalNode CONCAT() { return getToken(ExprParser.CONCAT, 0); }
		public ListaExpresionesContext listaExpresiones() {
			return getRuleContext(ListaExpresionesContext.class,0);
		}
		public TerminalNode UPPER() { return getToken(ExprParser.UPPER, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode LOWER() { return getToken(ExprParser.LOWER, 0); }
		public TerminalNode LENGTH() { return getToken(ExprParser.LENGTH, 0); }
		public FuncionSQLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionSQL; }
	}

	public final FuncionSQLContext funcionSQL() throws RecognitionException {
		FuncionSQLContext _localctx = new FuncionSQLContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_funcionSQL);
		try {
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				match(COUNT);
				setState(698);
				match(PARIZQ);
				setState(701);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(699);
					match(MULT);
					}
					break;
				case NEW:
				case OLD:
				case ID:
					{
					setState(700);
					referencia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(703);
				match(PARDER);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				match(SUM);
				setState(705);
				match(PARIZQ);
				setState(706);
				referencia();
				setState(707);
				match(PARDER);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				match(AVG);
				setState(710);
				match(PARIZQ);
				setState(711);
				referencia();
				setState(712);
				match(PARDER);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(714);
				match(MIN);
				setState(715);
				match(PARIZQ);
				setState(716);
				referencia();
				setState(717);
				match(PARDER);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(719);
				match(MAX);
				setState(720);
				match(PARIZQ);
				setState(721);
				referencia();
				setState(722);
				match(PARDER);
				}
				break;
			case NOW:
				enterOuterAlt(_localctx, 6);
				{
				setState(724);
				match(NOW);
				setState(725);
				match(PARIZQ);
				setState(726);
				match(PARDER);
				}
				break;
			case CURRENT_DATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(727);
				match(CURRENT_DATE);
				setState(728);
				match(PARIZQ);
				setState(729);
				match(PARDER);
				}
				break;
			case CURRENT_TIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(730);
				match(CURRENT_TIME);
				setState(731);
				match(PARIZQ);
				setState(732);
				match(PARDER);
				}
				break;
			case CONCAT:
				enterOuterAlt(_localctx, 9);
				{
				setState(733);
				match(CONCAT);
				setState(734);
				match(PARIZQ);
				setState(735);
				listaExpresiones();
				setState(736);
				match(PARDER);
				}
				break;
			case UPPER:
				enterOuterAlt(_localctx, 10);
				{
				setState(738);
				match(UPPER);
				setState(739);
				match(PARIZQ);
				setState(740);
				expresion();
				setState(741);
				match(PARDER);
				}
				break;
			case LOWER:
				enterOuterAlt(_localctx, 11);
				{
				setState(743);
				match(LOWER);
				setState(744);
				match(PARIZQ);
				setState(745);
				expresion();
				setState(746);
				match(PARDER);
				}
				break;
			case LENGTH:
				enterOuterAlt(_localctx, 12);
				{
				setState(748);
				match(LENGTH);
				setState(749);
				match(PARIZQ);
				setState(750);
				expresion();
				setState(751);
				match(PARDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaExpresionesContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ListaExpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpresiones; }
	}

	public final ListaExpresionesContext listaExpresiones() throws RecognitionException {
		ListaExpresionesContext _localctx = new ListaExpresionesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_listaExpresiones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			expresion();
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(756);
				match(COMA);
				setState(757);
				expresion();
				}
				}
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode TRIGGER() { return getToken(ExprParser.TRIGGER, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TiempoTriggerContext tiempoTrigger() {
			return getRuleContext(TiempoTriggerContext.class,0);
		}
		public EventoTriggerContext eventoTrigger() {
			return getRuleContext(EventoTriggerContext.class,0);
		}
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public TerminalNode FOR() { return getToken(ExprParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(ExprParser.EACH, 0); }
		public TerminalNode ROW() { return getToken(ExprParser.ROW, 0); }
		public TerminalNode BEGIN() { return getToken(ExprParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ExprParser.END, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public List<AccionTriggerContext> accionTrigger() {
			return getRuleContexts(AccionTriggerContext.class);
		}
		public AccionTriggerContext accionTrigger(int i) {
			return getRuleContext(AccionTriggerContext.class,i);
		}
		public TriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger; }
	}

	public final TriggerContext trigger() throws RecognitionException {
		TriggerContext _localctx = new TriggerContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(CREATE);
			setState(764);
			match(TRIGGER);
			setState(765);
			match(ID);
			setState(766);
			tiempoTrigger();
			setState(767);
			eventoTrigger();
			setState(768);
			match(ON);
			setState(769);
			match(ID);
			setState(770);
			match(FOR);
			setState(771);
			match(EACH);
			setState(772);
			match(ROW);
			setState(773);
			match(BEGIN);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4480L) != 0) || _la==ID) {
				{
				{
				setState(774);
				accionTrigger();
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
			match(END);
			setState(781);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TiempoTriggerContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(ExprParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(ExprParser.AFTER, 0); }
		public TiempoTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiempoTrigger; }
	}

	public final TiempoTriggerContext tiempoTrigger() throws RecognitionException {
		TiempoTriggerContext _localctx = new TiempoTriggerContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_tiempoTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_la = _input.LA(1);
			if ( !(_la==BEFORE || _la==AFTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventoTriggerContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ExprParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(ExprParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(ExprParser.DELETE, 0); }
		public EventoTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventoTrigger; }
	}

	public final EventoTriggerContext eventoTrigger() throws RecognitionException {
		EventoTriggerContext _localctx = new EventoTriggerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_eventoTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4480L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccionTriggerContext extends ParserRuleContext {
		public InsertarContext insertar() {
			return getRuleContext(InsertarContext.class,0);
		}
		public ActualizarContext actualizar() {
			return getRuleContext(ActualizarContext.class,0);
		}
		public EliminarContext eliminar() {
			return getRuleContext(EliminarContext.class,0);
		}
		public AsignacionTriggerContext asignacionTrigger() {
			return getRuleContext(AsignacionTriggerContext.class,0);
		}
		public AccionTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accionTrigger; }
	}

	public final AccionTriggerContext accionTrigger() throws RecognitionException {
		AccionTriggerContext _localctx = new AccionTriggerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_accionTrigger);
		try {
			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				insertar();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				actualizar();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(789);
				eliminar();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(790);
				asignacionTrigger();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionTriggerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(ExprParser.IGUAL, 0); }
		public ReferenciaTriggerContext referenciaTrigger() {
			return getRuleContext(ReferenciaTriggerContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public AsignacionTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionTrigger; }
	}

	public final AsignacionTriggerContext asignacionTrigger() throws RecognitionException {
		AsignacionTriggerContext _localctx = new AsignacionTriggerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_asignacionTrigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(ID);
			setState(794);
			match(IGUAL);
			setState(795);
			referenciaTrigger();
			setState(796);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenciaTriggerContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(ExprParser.NEW, 0); }
		public TerminalNode PUNTO() { return getToken(ExprParser.PUNTO, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode OLD() { return getToken(ExprParser.OLD, 0); }
		public ReferenciaTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenciaTrigger; }
	}

	public final ReferenciaTriggerContext referenciaTrigger() throws RecognitionException {
		ReferenciaTriggerContext _localctx = new ReferenciaTriggerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_referenciaTrigger);
		try {
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				match(NEW);
				setState(799);
				match(PUNTO);
				setState(800);
				match(ID);
				}
				break;
			case OLD:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				match(OLD);
				setState(802);
				match(PUNTO);
				setState(803);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransaccionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(ExprParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(ExprParser.TRANSACTION, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public TransaccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaccion; }
	}

	public final TransaccionContext transaccion() throws RecognitionException {
		TransaccionContext _localctx = new TransaccionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_transaccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(START);
			setState(807);
			match(TRANSACTION);
			setState(808);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommitStmtContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(ExprParser.COMMIT, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public CommitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commitStmt; }
	}

	public final CommitStmtContext commitStmt() throws RecognitionException {
		CommitStmtContext _localctx = new CommitStmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_commitStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(COMMIT);
			setState(811);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RollbackStmtContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(ExprParser.ROLLBACK, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(ExprParser.PUNTOYCOMA, 0); }
		public RollbackStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollbackStmt; }
	}

	public final RollbackStmtContext rollbackStmt() throws RecognitionException {
		RollbackStmtContext _localctx = new RollbackStmtContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_rollbackStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(ROLLBACK);
			setState(814);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001}\u0331\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0001\u0000\u0005\u0000~\b\u0000\n\u0000\f\u0000"+
		"\u0081\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0097\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00b3\b\u0006\n\u0006\f\u0006\u00b6\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00cd\b\u0007\n\u0007\f\u0007"+
		"\u00d0\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00df\b\u0007\n\u0007\f\u0007\u00e2"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00f2\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00f7\b\b\n\b\f\b\u00fa\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u0102\b\b\n\b\f\b\u0105\t\b\u0003\b\u0107"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0116\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0124\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0138\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u016e\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0175\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0189\b\u0011\n\u0011\f\u0011\u018c\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0191\b\u0012\n\u0012\f\u0012\u0194\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0199\b\u0013\n\u0013\f\u0013\u019c"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01a3\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u01a9\b\u0015\n\u0015\f\u0015\u01ac\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u01b0\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01b5\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01b9\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01be\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u01c3\b\u0016\n\u0016\f\u0016\u01c6\t\u0016"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01ca\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01e9\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01f6\b\u001a"+
		"\n\u001a\f\u001a\u01f9\t\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u01fd"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0203"+
		"\b\u001b\u0003\u001b\u0205\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u020c\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0210\b\u001d\u0003\u001d\u0212\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u021d\b\u001f\n\u001f\f\u001f\u0220\t\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u0224\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u0231\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u023a\b\"\u0001\"\u0001\"\u0001\"\u0005\"\u023f\b\"\n\"\f\"\u0242\t"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0248\b\"\u0001#\u0001#\u0001"+
		"#\u0005#\u024d\b#\n#\f#\u0250\t#\u0001$\u0003$\u0253\b$\u0001$\u0001$"+
		"\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u025d\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0268\b"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0005(\u0270\b(\n(\f("+
		"\u0273\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u027a\b)\n)\f)\u027d"+
		"\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0287"+
		"\b*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0003-\u0291"+
		"\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u029d\b.\u0001/\u0001/\u00010\u00010\u00010\u00050\u02a4\b0\n"+
		"0\f0\u02a7\t0\u00011\u00011\u00011\u00051\u02ac\b1\n1\f1\u02af\t1\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u02b8\b2\u00013\u0001"+
		"3\u00013\u00013\u00033\u02be\b3\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u02f2\b3\u00014\u00014\u00014\u0005"+
		"4\u02f7\b4\n4\f4\u02fa\t4\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00055\u0308\b5\n5\f5\u030b\t5\u0001"+
		"5\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u00018\u0001"+
		"8\u00038\u0318\b8\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0003:\u0325\b:\u0001;\u0001;\u0001;\u0001;\u0001"+
		"<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0000\u0000>\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\u0000\b\u0001\u0000NO\u0001"+
		"\u0000ik\u0001\u0000).\u0003\u0000\u0016\u001668WX\u0001\u0000lm\u0001"+
		"\u0000no\u0001\u0000^_\u0002\u0000\u0007\b\f\f\u0371\u0000\u007f\u0001"+
		"\u0000\u0000\u0000\u0002\u0096\u0001\u0000\u0000\u0000\u0004\u0098\u0001"+
		"\u0000\u0000\u0000\u0006\u009d\u0001\u0000\u0000\u0000\b\u00a2\u0001\u0000"+
		"\u0000\u0000\n\u00a6\u0001\u0000\u0000\u0000\f\u00ab\u0001\u0000\u0000"+
		"\u0000\u000e\u00f1\u0001\u0000\u0000\u0000\u0010\u0106\u0001\u0000\u0000"+
		"\u0000\u0012\u0115\u0001\u0000\u0000\u0000\u0014\u0123\u0001\u0000\u0000"+
		"\u0000\u0016\u0125\u0001\u0000\u0000\u0000\u0018\u013b\u0001\u0000\u0000"+
		"\u0000\u001a\u0145\u0001\u0000\u0000\u0000\u001c\u016d\u0001\u0000\u0000"+
		"\u0000\u001e\u0174\u0001\u0000\u0000\u0000 \u0176\u0001\u0000\u0000\u0000"+
		"\"\u0180\u0001\u0000\u0000\u0000$\u018d\u0001\u0000\u0000\u0000&\u0195"+
		"\u0001\u0000\u0000\u0000(\u019d\u0001\u0000\u0000\u0000*\u01a0\u0001\u0000"+
		"\u0000\u0000,\u01bf\u0001\u0000\u0000\u0000.\u01c7\u0001\u0000\u0000\u0000"+
		"0\u01e8\u0001\u0000\u0000\u00002\u01ea\u0001\u0000\u0000\u00004\u01f2"+
		"\u0001\u0000\u0000\u00006\u0204\u0001\u0000\u0000\u00008\u0206\u0001\u0000"+
		"\u0000\u0000:\u0211\u0001\u0000\u0000\u0000<\u0213\u0001\u0000\u0000\u0000"+
		">\u0216\u0001\u0000\u0000\u0000@\u0227\u0001\u0000\u0000\u0000B\u022b"+
		"\u0001\u0000\u0000\u0000D\u0234\u0001\u0000\u0000\u0000F\u0249\u0001\u0000"+
		"\u0000\u0000H\u0252\u0001\u0000\u0000\u0000J\u025c\u0001\u0000\u0000\u0000"+
		"L\u025e\u0001\u0000\u0000\u0000N\u0263\u0001\u0000\u0000\u0000P\u026c"+
		"\u0001\u0000\u0000\u0000R\u0274\u0001\u0000\u0000\u0000T\u0286\u0001\u0000"+
		"\u0000\u0000V\u0288\u0001\u0000\u0000\u0000X\u028a\u0001\u0000\u0000\u0000"+
		"Z\u0290\u0001\u0000\u0000\u0000\\\u029c\u0001\u0000\u0000\u0000^\u029e"+
		"\u0001\u0000\u0000\u0000`\u02a0\u0001\u0000\u0000\u0000b\u02a8\u0001\u0000"+
		"\u0000\u0000d\u02b7\u0001\u0000\u0000\u0000f\u02f1\u0001\u0000\u0000\u0000"+
		"h\u02f3\u0001\u0000\u0000\u0000j\u02fb\u0001\u0000\u0000\u0000l\u030f"+
		"\u0001\u0000\u0000\u0000n\u0311\u0001\u0000\u0000\u0000p\u0317\u0001\u0000"+
		"\u0000\u0000r\u0319\u0001\u0000\u0000\u0000t\u0324\u0001\u0000\u0000\u0000"+
		"v\u0326\u0001\u0000\u0000\u0000x\u032a\u0001\u0000\u0000\u0000z\u032d"+
		"\u0001\u0000\u0000\u0000|~\u0003\u0002\u0001\u0000}|\u0001\u0000\u0000"+
		"\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0000\u0000\u0001\u0083"+
		"\u0001\u0001\u0000\u0000\u0000\u0084\u0097\u0003\u0004\u0002\u0000\u0085"+
		"\u0097\u0003\u0006\u0003\u0000\u0086\u0097\u0003\b\u0004\u0000\u0087\u0097"+
		"\u0003\f\u0006\u0000\u0088\u0097\u0003\n\u0005\u0000\u0089\u0097\u0003"+
		"\u0016\u000b\u0000\u008a\u0097\u0003\u0018\f\u0000\u008b\u0097\u0003\u001a"+
		"\r\u0000\u008c\u0097\u0003 \u0010\u0000\u008d\u0097\u0003(\u0014\u0000"+
		"\u008e\u0097\u0003>\u001f\u0000\u008f\u0097\u0003B!\u0000\u0090\u0097"+
		"\u0003D\"\u0000\u0091\u0097\u0003j5\u0000\u0092\u0097\u0003v;\u0000\u0093"+
		"\u0097\u0003x<\u0000\u0094\u0097\u0003z=\u0000\u0095\u0097\u0003N\'\u0000"+
		"\u0096\u0084\u0001\u0000\u0000\u0000\u0096\u0085\u0001\u0000\u0000\u0000"+
		"\u0096\u0086\u0001\u0000\u0000\u0000\u0096\u0087\u0001\u0000\u0000\u0000"+
		"\u0096\u0088\u0001\u0000\u0000\u0000\u0096\u0089\u0001\u0000\u0000\u0000"+
		"\u0096\u008a\u0001\u0000\u0000\u0000\u0096\u008b\u0001\u0000\u0000\u0000"+
		"\u0096\u008c\u0001\u0000\u0000\u0000\u0096\u008d\u0001\u0000\u0000\u0000"+
		"\u0096\u008e\u0001\u0000\u0000\u0000\u0096\u008f\u0001\u0000\u0000\u0000"+
		"\u0096\u0090\u0001\u0000\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000"+
		"\u0096\u0092\u0001\u0000\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0003\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0001\u0000\u0000"+
		"\u0099\u009a\u0005\u0002\u0000\u0000\u009a\u009b\u0005|\u0000\u0000\u009b"+
		"\u009c\u00054\u0000\u0000\u009c\u0005\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005\u0001\u0000\u0000\u009e\u009f\u0005\t\u0000\u0000\u009f\u00a0\u0005"+
		"|\u0000\u0000\u00a0\u00a1\u00054\u0000\u0000\u00a1\u0007\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a4\u0005|\u0000\u0000"+
		"\u00a4\u00a5\u00054\u0000\u0000\u00a5\t\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0005\u0000\u0000\u00a7\u00a8\u0005\u0004\u0000\u0000\u00a8"+
		"\u00a9\u0005|\u0000\u0000\u00a9\u00aa\u00054\u0000\u0000\u00aa\u000b\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005\u0001\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0004\u0000\u0000\u00ad\u00ae\u0005|\u0000\u0000\u00ae\u00af\u0005/\u0000"+
		"\u0000\u00af\u00b4\u0003\u000e\u0007\u0000\u00b0\u00b1\u00053\u0000\u0000"+
		"\u00b1\u00b3\u0003\u000e\u0007\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u00050\u0000\u0000\u00b8"+
		"\u00b9\u00054\u0000\u0000\u00b9\r\u0001\u0000\u0000\u0000\u00ba\u00f2"+
		"\u0003\u0010\b\u0000\u00bb\u00bc\u0005\u0013\u0000\u0000\u00bc\u00bd\u0005"+
		"\u0014\u0000\u0000\u00bd\u00be\u0005/\u0000\u0000\u00be\u00bf\u0003$\u0012"+
		"\u0000\u00bf\u00c0\u00050\u0000\u0000\u00c0\u00f2\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0005z\u0000\u0000\u00c2\u00c3\u0005\u0014\u0000\u0000\u00c3"+
		"\u00c4\u0005/\u0000\u0000\u00c4\u00c5\u0003$\u0012\u0000\u00c5\u00c6\u0005"+
		"0\u0000\u0000\u00c6\u00c7\u0005{\u0000\u0000\u00c7\u00c8\u0005|\u0000"+
		"\u0000\u00c8\u00c9\u0005/\u0000\u0000\u00c9\u00ca\u0003$\u0012\u0000\u00ca"+
		"\u00ce\u00050\u0000\u0000\u00cb\u00cd\u0003\u0014\n\u0000\u00cc\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00f2"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0005y\u0000\u0000\u00d2\u00d3\u0005|\u0000\u0000\u00d3\u00d4\u0005z"+
		"\u0000\u0000\u00d4\u00d5\u0005\u0014\u0000\u0000\u00d5\u00d6\u0005/\u0000"+
		"\u0000\u00d6\u00d7\u0003$\u0012\u0000\u00d7\u00d8\u00050\u0000\u0000\u00d8"+
		"\u00d9\u0005{\u0000\u0000\u00d9\u00da\u0005|\u0000\u0000\u00da\u00db\u0005"+
		"/\u0000\u0000\u00db\u00dc\u0003$\u0012\u0000\u00dc\u00e0\u00050\u0000"+
		"\u0000\u00dd\u00df\u0003\u0014\n\u0000\u00de\u00dd\u0001\u0000\u0000\u0000"+
		"\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005y\u0000\u0000\u00e4"+
		"\u00e5\u0005|\u0000\u0000\u00e5\u00e6\u0005x\u0000\u0000\u00e6\u00e7\u0005"+
		"/\u0000\u0000\u00e7\u00e8\u0003R)\u0000\u00e8\u00e9\u00050\u0000\u0000"+
		"\u00e9\u00f2\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005y\u0000\u0000\u00eb"+
		"\u00ec\u0005|\u0000\u0000\u00ec\u00ed\u0005\u0017\u0000\u0000\u00ed\u00ee"+
		"\u0005/\u0000\u0000\u00ee\u00ef\u0003$\u0012\u0000\u00ef\u00f0\u00050"+
		"\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ba\u0001\u0000"+
		"\u0000\u0000\u00f1\u00bb\u0001\u0000\u0000\u0000\u00f1\u00c1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00d1\u0001\u0000\u0000\u0000\u00f1\u00e3\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ea\u0001\u0000\u0000\u0000\u00f2\u000f\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0005|\u0000\u0000\u00f4\u00f8\u0003\u001c\u000e"+
		"\u0000\u00f5\u00f7\u0003\u0012\t\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u0107\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005{\u0000\u0000\u00fc"+
		"\u00fd\u0005|\u0000\u0000\u00fd\u00fe\u0005/\u0000\u0000\u00fe\u00ff\u0003"+
		"$\u0012\u0000\u00ff\u0103\u00050\u0000\u0000\u0100\u0102\u0003\u0014\n"+
		"\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000"+
		"\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0106\u00f3\u0001\u0000\u0000\u0000\u0106\u00fb\u0001\u0000\u0000"+
		"\u0000\u0107\u0011\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0013\u0000"+
		"\u0000\u0109\u0116\u0005\u0014\u0000\u0000\u010a\u010b\u0005\u0015\u0000"+
		"\u0000\u010b\u0116\u0005\u0016\u0000\u0000\u010c\u0116\u0005\u0017\u0000"+
		"\u0000\u010d\u0116\u0005@\u0000\u0000\u010e\u010f\u0005A\u0000\u0000\u010f"+
		"\u0116\u0003X,\u0000\u0110\u0111\u0005x\u0000\u0000\u0111\u0112\u0005"+
		"/\u0000\u0000\u0112\u0113\u0003R)\u0000\u0113\u0114\u00050\u0000\u0000"+
		"\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0108\u0001\u0000\u0000\u0000"+
		"\u0115\u010a\u0001\u0000\u0000\u0000\u0115\u010c\u0001\u0000\u0000\u0000"+
		"\u0115\u010d\u0001\u0000\u0000\u0000\u0115\u010e\u0001\u0000\u0000\u0000"+
		"\u0115\u0110\u0001\u0000\u0000\u0000\u0116\u0013\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0005\n\u0000\u0000\u0118\u0119\u0005\f\u0000\u0000\u0119"+
		"\u0124\u0005\u000b\u0000\u0000\u011a\u011b\u0005\n\u0000\u0000\u011b\u011c"+
		"\u0005\b\u0000\u0000\u011c\u0124\u0005\u000b\u0000\u0000\u011d\u011e\u0005"+
		"\n\u0000\u0000\u011e\u011f\u0005\f\u0000\u0000\u011f\u0124\u0005\r\u0000"+
		"\u0000\u0120\u0121\u0005\n\u0000\u0000\u0121\u0122\u0005\b\u0000\u0000"+
		"\u0122\u0124\u0005\r\u0000\u0000\u0123\u0117\u0001\u0000\u0000\u0000\u0123"+
		"\u011a\u0001\u0000\u0000\u0000\u0123\u011d\u0001\u0000\u0000\u0000\u0123"+
		"\u0120\u0001\u0000\u0000\u0000\u0124\u0015\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0005<\u0000\u0000\u0126\u0127\u0005\u0004\u0000\u0000\u0127\u0137"+
		"\u0005|\u0000\u0000\u0128\u0129\u0005=\u0000\u0000\u0129\u0138\u0003\u0010"+
		"\b\u0000\u012a\u012b\u0005=\u0000\u0000\u012b\u012c\u0005y\u0000\u0000"+
		"\u012c\u012d\u0005|\u0000\u0000\u012d\u012e\u0005x\u0000\u0000\u012e\u012f"+
		"\u0005/\u0000\u0000\u012f\u0130\u0003R)\u0000\u0130\u0131\u00050\u0000"+
		"\u0000\u0131\u0138\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0005\u0000"+
		"\u0000\u0133\u0134\u0005?\u0000\u0000\u0134\u0138\u0005|\u0000\u0000\u0135"+
		"\u0136\u0005>\u0000\u0000\u0136\u0138\u0003\u0010\b\u0000\u0137\u0128"+
		"\u0001\u0000\u0000\u0000\u0137\u012a\u0001\u0000\u0000\u0000\u0137\u0132"+
		"\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u00054\u0000\u0000\u013a\u0017\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005\u0001\u0000\u0000\u013c\u013d\u0005"+
		"B\u0000\u0000\u013d\u013e\u0005|\u0000\u0000\u013e\u013f\u0005\n\u0000"+
		"\u0000\u013f\u0140\u0005|\u0000\u0000\u0140\u0141\u0005/\u0000\u0000\u0141"+
		"\u0142\u0003$\u0012\u0000\u0142\u0143\u00050\u0000\u0000\u0143\u0144\u0005"+
		"4\u0000\u0000\u0144\u0019\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0001"+
		"\u0000\u0000\u0146\u0147\u0005C\u0000\u0000\u0147\u0148\u0005|\u0000\u0000"+
		"\u0148\u0149\u0005D\u0000\u0000\u0149\u014a\u0003*\u0015\u0000\u014a\u014b"+
		"\u00054\u0000\u0000\u014b\u001b\u0001\u0000\u0000\u0000\u014c\u016e\u0005"+
		"\u0018\u0000\u0000\u014d\u016e\u0005\u0019\u0000\u0000\u014e\u016e\u0005"+
		"\u001a\u0000\u0000\u014f\u016e\u0005\u001b\u0000\u0000\u0150\u016e\u0005"+
		"\u001c\u0000\u0000\u0151\u016e\u0005\u001d\u0000\u0000\u0152\u0153\u0005"+
		"\u001e\u0000\u0000\u0153\u0154\u0005/\u0000\u0000\u0154\u0155\u00057\u0000"+
		"\u0000\u0155\u0156\u00053\u0000\u0000\u0156\u0157\u00057\u0000\u0000\u0157"+
		"\u016e\u00050\u0000\u0000\u0158\u0159\u0005\u001f\u0000\u0000\u0159\u015a"+
		"\u0005/\u0000\u0000\u015a\u015b\u00057\u0000\u0000\u015b\u015c\u00053"+
		"\u0000\u0000\u015c\u015d\u00057\u0000\u0000\u015d\u016e\u00050\u0000\u0000"+
		"\u015e\u015f\u0005 \u0000\u0000\u015f\u0160\u0005/\u0000\u0000\u0160\u0161"+
		"\u00057\u0000\u0000\u0161\u016e\u00050\u0000\u0000\u0162\u0163\u0005!"+
		"\u0000\u0000\u0163\u0164\u0005/\u0000\u0000\u0164\u0165\u00057\u0000\u0000"+
		"\u0165\u016e\u00050\u0000\u0000\u0166\u016e\u0005\"\u0000\u0000\u0167"+
		"\u016e\u0005#\u0000\u0000\u0168\u016e\u0005$\u0000\u0000\u0169\u016e\u0005"+
		"%\u0000\u0000\u016a\u016e\u0005&\u0000\u0000\u016b\u016e\u0005\'\u0000"+
		"\u0000\u016c\u016e\u0005(\u0000\u0000\u016d\u014c\u0001\u0000\u0000\u0000"+
		"\u016d\u014d\u0001\u0000\u0000\u0000\u016d\u014e\u0001\u0000\u0000\u0000"+
		"\u016d\u014f\u0001\u0000\u0000\u0000\u016d\u0150\u0001\u0000\u0000\u0000"+
		"\u016d\u0151\u0001\u0000\u0000\u0000\u016d\u0152\u0001\u0000\u0000\u0000"+
		"\u016d\u0158\u0001\u0000\u0000\u0000\u016d\u015e\u0001\u0000\u0000\u0000"+
		"\u016d\u0162\u0001\u0000\u0000\u0000\u016d\u0166\u0001\u0000\u0000\u0000"+
		"\u016d\u0167\u0001\u0000\u0000\u0000\u016d\u0168\u0001\u0000\u0000\u0000"+
		"\u016d\u0169\u0001\u0000\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000"+
		"\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000"+
		"\u016e\u001d\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u0013\u0000\u0000"+
		"\u0170\u0175\u0005\u0014\u0000\u0000\u0171\u0172\u0005\u0015\u0000\u0000"+
		"\u0172\u0175\u0005\u0016\u0000\u0000\u0173\u0175\u0005\u0017\u0000\u0000"+
		"\u0174\u016f\u0001\u0000\u0000\u0000\u0174\u0171\u0001\u0000\u0000\u0000"+
		"\u0174\u0173\u0001\u0000\u0000\u0000\u0175\u001f\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0005\u0007\u0000\u0000\u0177\u0178\u0005\u000e\u0000\u0000"+
		"\u0178\u0179\u0005|\u0000\u0000\u0179\u017a\u0005/\u0000\u0000\u017a\u017b"+
		"\u0003$\u0012\u0000\u017b\u017c\u00050\u0000\u0000\u017c\u017d\u0005\u000f"+
		"\u0000\u0000\u017d\u017e\u0003\"\u0011\u0000\u017e\u017f\u00054\u0000"+
		"\u0000\u017f!\u0001\u0000\u0000\u0000\u0180\u0181\u0005/\u0000\u0000\u0181"+
		"\u0182\u0003&\u0013\u0000\u0182\u018a\u00050\u0000\u0000\u0183\u0184\u0005"+
		"3\u0000\u0000\u0184\u0185\u0005/\u0000\u0000\u0185\u0186\u0003&\u0013"+
		"\u0000\u0186\u0187\u00050\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000"+
		"\u0188\u0183\u0001\u0000\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b#\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d"+
		"\u0192\u0005|\u0000\u0000\u018e\u018f\u00053\u0000\u0000\u018f\u0191\u0005"+
		"|\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000"+
		"\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000"+
		"\u0000\u0000\u0193%\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000"+
		"\u0000\u0195\u019a\u0003X,\u0000\u0196\u0197\u00053\u0000\u0000\u0197"+
		"\u0199\u0003X,\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019c\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001"+
		"\u0000\u0000\u0000\u019b\'\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0003*\u0015\u0000\u019e\u019f\u00054\u0000\u0000"+
		"\u019f)\u0001\u0000\u0000\u0000\u01a0\u01a2\u0005\u0006\u0000\u0000\u01a1"+
		"\u01a3\u0005P\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0003,\u0016\u0000\u01a5\u01a6\u0005\u0010\u0000\u0000\u01a6\u01aa\u0003"+
		".\u0017\u0000\u01a7\u01a9\u00030\u0018\u0000\u01a8\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01af\u0001\u0000\u0000"+
		"\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005\u0011\u0000"+
		"\u0000\u01ae\u01b0\u0003R)\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b4\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u0005J\u0000\u0000\u01b2\u01b3\u0005K\u0000\u0000\u01b3\u01b5\u0003"+
		"$\u0012\u0000\u01b4\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005L\u0000"+
		"\u0000\u01b7\u01b9\u0003R)\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bd\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0005M\u0000\u0000\u01bb\u01bc\u0005K\u0000\u0000\u01bc\u01be\u0003"+
		"4\u001a\u0000\u01bd\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000"+
		"\u0000\u0000\u01be+\u0001\u0000\u0000\u0000\u01bf\u01c4\u0003:\u001d\u0000"+
		"\u01c0\u01c1\u00053\u0000\u0000\u01c1\u01c3\u0003:\u001d\u0000\u01c2\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5-\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c9\u0005"+
		"|\u0000\u0000\u01c8\u01ca\u0005|\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca/\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0005E\u0000\u0000\u01cc\u01cd\u0003.\u0017\u0000\u01cd\u01ce"+
		"\u0005\n\u0000\u0000\u01ce\u01cf\u00032\u0019\u0000\u01cf\u01e9\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d1\u0005F\u0000\u0000\u01d1\u01d2\u0005E\u0000"+
		"\u0000\u01d2\u01d3\u0003.\u0017\u0000\u01d3\u01d4\u0005\n\u0000\u0000"+
		"\u01d4\u01d5\u00032\u0019\u0000\u01d5\u01e9\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u0005G\u0000\u0000\u01d7\u01d8\u0005E\u0000\u0000\u01d8\u01d9\u0003"+
		".\u0017\u0000\u01d9\u01da\u0005\n\u0000\u0000\u01da\u01db\u00032\u0019"+
		"\u0000\u01db\u01e9\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005H\u0000\u0000"+
		"\u01dd\u01de\u0005E\u0000\u0000\u01de\u01df\u0003.\u0017\u0000\u01df\u01e0"+
		"\u0005\n\u0000\u0000\u01e0\u01e1\u00032\u0019\u0000\u01e1\u01e9\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e3\u0005I\u0000\u0000\u01e3\u01e4\u0005E\u0000"+
		"\u0000\u01e4\u01e5\u0003.\u0017\u0000\u01e5\u01e6\u0005\n\u0000\u0000"+
		"\u01e6\u01e7\u00032\u0019\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8"+
		"\u01cb\u0001\u0000\u0000\u0000\u01e8\u01d0\u0001\u0000\u0000\u0000\u01e8"+
		"\u01d6\u0001\u0000\u0000\u0000\u01e8\u01dc\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e91\u0001\u0000\u0000\u0000\u01ea\u01eb"+
		"\u0005|\u0000\u0000\u01eb\u01ec\u00055\u0000\u0000\u01ec\u01ed\u0005|"+
		"\u0000\u0000\u01ed\u01ee\u0005)\u0000\u0000\u01ee\u01ef\u0005|\u0000\u0000"+
		"\u01ef\u01f0\u00055\u0000\u0000\u01f0\u01f1\u0005|\u0000\u0000\u01f13"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f7\u00036\u001b\u0000\u01f3\u01f4\u0005"+
		"3\u0000\u0000\u01f4\u01f6\u00036\u001b\u0000\u01f5\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f85\u0001\u0000\u0000\u0000"+
		"\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01fc\u0005|\u0000\u0000\u01fb"+
		"\u01fd\u00038\u001c\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fd\u0205\u0001\u0000\u0000\u0000\u01fe\u01ff"+
		"\u0005|\u0000\u0000\u01ff\u0200\u00055\u0000\u0000\u0200\u0202\u0005|"+
		"\u0000\u0000\u0201\u0203\u00038\u001c\u0000\u0202\u0201\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u0001\u0000\u0000"+
		"\u0000\u0204\u01fa\u0001\u0000\u0000\u0000\u0204\u01fe\u0001\u0000\u0000"+
		"\u0000\u02057\u0001\u0000\u0000\u0000\u0206\u0207\u0007\u0000\u0000\u0000"+
		"\u02079\u0001\u0000\u0000\u0000\u0208\u0212\u0005n\u0000\u0000\u0209\u020b"+
		"\u0003\\.\u0000\u020a\u020c\u0003<\u001e\u0000\u020b\u020a\u0001\u0000"+
		"\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u0212\u0001\u0000"+
		"\u0000\u0000\u020d\u020f\u0003f3\u0000\u020e\u0210\u0003<\u001e\u0000"+
		"\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000"+
		"\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u0208\u0001\u0000\u0000\u0000"+
		"\u0211\u0209\u0001\u0000\u0000\u0000\u0211\u020d\u0001\u0000\u0000\u0000"+
		"\u0212;\u0001\u0000\u0000\u0000\u0213\u0214\u0005D\u0000\u0000\u0214\u0215"+
		"\u0005|\u0000\u0000\u0215=\u0001\u0000\u0000\u0000\u0216\u0217\u0005\b"+
		"\u0000\u0000\u0217\u0218\u0005|\u0000\u0000\u0218\u0219\u0005\u0012\u0000"+
		"\u0000\u0219\u021e\u0003@ \u0000\u021a\u021b\u00053\u0000\u0000\u021b"+
		"\u021d\u0003@ \u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021d\u0220\u0001"+
		"\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021f\u0001"+
		"\u0000\u0000\u0000\u021f\u0223\u0001\u0000\u0000\u0000\u0220\u021e\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0005\u0011\u0000\u0000\u0222\u0224\u0003"+
		"R)\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0226\u00054\u0000\u0000"+
		"\u0226?\u0001\u0000\u0000\u0000\u0227\u0228\u0005|\u0000\u0000\u0228\u0229"+
		"\u0005)\u0000\u0000\u0229\u022a\u0003X,\u0000\u022aA\u0001\u0000\u0000"+
		"\u0000\u022b\u022c\u0005\f\u0000\u0000\u022c\u022d\u0005\u0010\u0000\u0000"+
		"\u022d\u0230\u0005|\u0000\u0000\u022e\u022f\u0005\u0011\u0000\u0000\u022f"+
		"\u0231\u0003R)\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001"+
		"\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0005"+
		"4\u0000\u0000\u0233C\u0001\u0000\u0000\u0000\u0234\u0235\u0005\u0001\u0000"+
		"\u0000\u0235\u0236\u0005Y\u0000\u0000\u0236\u0237\u0005|\u0000\u0000\u0237"+
		"\u0239\u0005/\u0000\u0000\u0238\u023a\u0003F#\u0000\u0239\u0238\u0001"+
		"\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0001"+
		"\u0000\u0000\u0000\u023b\u023c\u00050\u0000\u0000\u023c\u0240\u0005[\u0000"+
		"\u0000\u023d\u023f\u0003J%\u0000\u023e\u023d\u0001\u0000\u0000\u0000\u023f"+
		"\u0242\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240"+
		"\u0241\u0001\u0000\u0000\u0000\u0241\u0243\u0001\u0000\u0000\u0000\u0242"+
		"\u0240\u0001\u0000\u0000\u0000\u0243\u0247\u0005\\\u0000\u0000\u0244\u0248"+
		"\u00054\u0000\u0000\u0245\u0246\u0005o\u0000\u0000\u0246\u0248\u0005o"+
		"\u0000\u0000\u0247\u0244\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000"+
		"\u0000\u0000\u0248E\u0001\u0000\u0000\u0000\u0249\u024e\u0003H$\u0000"+
		"\u024a\u024b\u00053\u0000\u0000\u024b\u024d\u0003H$\u0000\u024c\u024a"+
		"\u0001\u0000\u0000\u0000\u024d\u0250\u0001\u0000\u0000\u0000\u024e\u024c"+
		"\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024fG\u0001"+
		"\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0251\u0253\u0007"+
		"\u0001\u0000\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0252\u0253\u0001"+
		"\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0005"+
		"|\u0000\u0000\u0255\u0256\u0003\u001c\u000e\u0000\u0256I\u0001\u0000\u0000"+
		"\u0000\u0257\u025d\u0003 \u0010\u0000\u0258\u025d\u0003>\u001f\u0000\u0259"+
		"\u025d\u0003B!\u0000\u025a\u025d\u0003(\u0014\u0000\u025b\u025d\u0003"+
		"L&\u0000\u025c\u0257\u0001\u0000\u0000\u0000\u025c\u0258\u0001\u0000\u0000"+
		"\u0000\u025c\u0259\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000"+
		"\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025dK\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0005|\u0000\u0000\u025f\u0260\u0005)\u0000\u0000\u0260\u0261"+
		"\u0003X,\u0000\u0261\u0262\u00054\u0000\u0000\u0262M\u0001\u0000\u0000"+
		"\u0000\u0263\u0264\u0005Z\u0000\u0000\u0264\u0265\u0005|\u0000\u0000\u0265"+
		"\u0267\u0005/\u0000\u0000\u0266\u0268\u0003P(\u0000\u0267\u0266\u0001"+
		"\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u0269\u0001"+
		"\u0000\u0000\u0000\u0269\u026a\u00050\u0000\u0000\u026a\u026b\u00054\u0000"+
		"\u0000\u026bO\u0001\u0000\u0000\u0000\u026c\u0271\u0003X,\u0000\u026d"+
		"\u026e\u00053\u0000\u0000\u026e\u0270\u0003X,\u0000\u026f\u026d\u0001"+
		"\u0000\u0000\u0000\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272Q\u0001\u0000"+
		"\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u027b\u0003T*\u0000"+
		"\u0275\u0276\u0005V\u0000\u0000\u0276\u027a\u0003T*\u0000\u0277\u0278"+
		"\u0005p\u0000\u0000\u0278\u027a\u0003T*\u0000\u0279\u0275\u0001\u0000"+
		"\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a\u027d\u0001\u0000"+
		"\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000"+
		"\u0000\u0000\u027cS\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000"+
		"\u0000\u027e\u027f\u0003Z-\u0000\u027f\u0280\u0003V+\u0000\u0280\u0281"+
		"\u0003Z-\u0000\u0281\u0287\u0001\u0000\u0000\u0000\u0282\u0283\u0005/"+
		"\u0000\u0000\u0283\u0284\u0003R)\u0000\u0284\u0285\u00050\u0000\u0000"+
		"\u0285\u0287\u0001\u0000\u0000\u0000\u0286\u027e\u0001\u0000\u0000\u0000"+
		"\u0286\u0282\u0001\u0000\u0000\u0000\u0287U\u0001\u0000\u0000\u0000\u0288"+
		"\u0289\u0007\u0002\u0000\u0000\u0289W\u0001\u0000\u0000\u0000\u028a\u028b"+
		"\u0003Z-\u0000\u028bY\u0001\u0000\u0000\u0000\u028c\u0291\u0003`0\u0000"+
		"\u028d\u0291\u0003f3\u0000\u028e\u0291\u0003\\.\u0000\u028f\u0291\u0003"+
		"^/\u0000\u0290\u028c\u0001\u0000\u0000\u0000\u0290\u028d\u0001\u0000\u0000"+
		"\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u028f\u0001\u0000\u0000"+
		"\u0000\u0291[\u0001\u0000\u0000\u0000\u0292\u029d\u0005|\u0000\u0000\u0293"+
		"\u0294\u0005|\u0000\u0000\u0294\u0295\u00055\u0000\u0000\u0295\u029d\u0005"+
		"|\u0000\u0000\u0296\u0297\u0005c\u0000\u0000\u0297\u0298\u00055\u0000"+
		"\u0000\u0298\u029d\u0005|\u0000\u0000\u0299\u029a\u0005d\u0000\u0000\u029a"+
		"\u029b\u00055\u0000\u0000\u029b\u029d\u0005|\u0000\u0000\u029c\u0292\u0001"+
		"\u0000\u0000\u0000\u029c\u0293\u0001\u0000\u0000\u0000\u029c\u0296\u0001"+
		"\u0000\u0000\u0000\u029c\u0299\u0001\u0000\u0000\u0000\u029d]\u0001\u0000"+
		"\u0000\u0000\u029e\u029f\u0007\u0003\u0000\u0000\u029f_\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a5\u0003b1\u0000\u02a1\u02a2\u0007\u0004\u0000\u0000\u02a2"+
		"\u02a4\u0003b1\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a4\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a6a\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000"+
		"\u0000\u0000\u02a8\u02ad\u0003d2\u0000\u02a9\u02aa\u0007\u0005\u0000\u0000"+
		"\u02aa\u02ac\u0003d2\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02af"+
		"\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae"+
		"\u0001\u0000\u0000\u0000\u02aec\u0001\u0000\u0000\u0000\u02af\u02ad\u0001"+
		"\u0000\u0000\u0000\u02b0\u02b8\u0003^/\u0000\u02b1\u02b8\u0003\\.\u0000"+
		"\u02b2\u02b8\u0003f3\u0000\u02b3\u02b4\u0005/\u0000\u0000\u02b4\u02b5"+
		"\u0003`0\u0000\u02b5\u02b6\u00050\u0000\u0000\u02b6\u02b8\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b0\u0001\u0000\u0000\u0000\u02b7\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b2\u0001\u0000\u0000\u0000\u02b7\u02b3\u0001\u0000"+
		"\u0000\u0000\u02b8e\u0001\u0000\u0000\u0000\u02b9\u02ba\u0005Q\u0000\u0000"+
		"\u02ba\u02bd\u0005/\u0000\u0000\u02bb\u02be\u0005n\u0000\u0000\u02bc\u02be"+
		"\u0003\\.\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02bc\u0001"+
		"\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02f2\u0005"+
		"0\u0000\u0000\u02c0\u02c1\u0005R\u0000\u0000\u02c1\u02c2\u0005/\u0000"+
		"\u0000\u02c2\u02c3\u0003\\.\u0000\u02c3\u02c4\u00050\u0000\u0000\u02c4"+
		"\u02f2\u0001\u0000\u0000\u0000\u02c5\u02c6\u0005S\u0000\u0000\u02c6\u02c7"+
		"\u0005/\u0000\u0000\u02c7\u02c8\u0003\\.\u0000\u02c8\u02c9\u00050\u0000"+
		"\u0000\u02c9\u02f2\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005T\u0000\u0000"+
		"\u02cb\u02cc\u0005/\u0000\u0000\u02cc\u02cd\u0003\\.\u0000\u02cd\u02ce"+
		"\u00050\u0000\u0000\u02ce\u02f2\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005"+
		"U\u0000\u0000\u02d0\u02d1\u0005/\u0000\u0000\u02d1\u02d2\u0003\\.\u0000"+
		"\u02d2\u02d3\u00050\u0000\u0000\u02d3\u02f2\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d5\u0005q\u0000\u0000\u02d5\u02d6\u0005/\u0000\u0000\u02d6\u02f2\u0005"+
		"0\u0000\u0000\u02d7\u02d8\u0005r\u0000\u0000\u02d8\u02d9\u0005/\u0000"+
		"\u0000\u02d9\u02f2\u00050\u0000\u0000\u02da\u02db\u0005s\u0000\u0000\u02db"+
		"\u02dc\u0005/\u0000\u0000\u02dc\u02f2\u00050\u0000\u0000\u02dd\u02de\u0005"+
		"t\u0000\u0000\u02de\u02df\u0005/\u0000\u0000\u02df\u02e0\u0003h4\u0000"+
		"\u02e0\u02e1\u00050\u0000\u0000\u02e1\u02f2\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e3\u0005u\u0000\u0000\u02e3\u02e4\u0005/\u0000\u0000\u02e4\u02e5\u0003"+
		"Z-\u0000\u02e5\u02e6\u00050\u0000\u0000\u02e6\u02f2\u0001\u0000\u0000"+
		"\u0000\u02e7\u02e8\u0005v\u0000\u0000\u02e8\u02e9\u0005/\u0000\u0000\u02e9"+
		"\u02ea\u0003Z-\u0000\u02ea\u02eb\u00050\u0000\u0000\u02eb\u02f2\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ed\u0005w\u0000\u0000\u02ed\u02ee\u0005/\u0000"+
		"\u0000\u02ee\u02ef\u0003Z-\u0000\u02ef\u02f0\u00050\u0000\u0000\u02f0"+
		"\u02f2\u0001\u0000\u0000\u0000\u02f1\u02b9\u0001\u0000\u0000\u0000\u02f1"+
		"\u02c0\u0001\u0000\u0000\u0000\u02f1\u02c5\u0001\u0000\u0000\u0000\u02f1"+
		"\u02ca\u0001\u0000\u0000\u0000\u02f1\u02cf\u0001\u0000\u0000\u0000\u02f1"+
		"\u02d4\u0001\u0000\u0000\u0000\u02f1\u02d7\u0001\u0000\u0000\u0000\u02f1"+
		"\u02da\u0001\u0000\u0000\u0000\u02f1\u02dd\u0001\u0000\u0000\u0000\u02f1"+
		"\u02e2\u0001\u0000\u0000\u0000\u02f1\u02e7\u0001\u0000\u0000\u0000\u02f1"+
		"\u02ec\u0001\u0000\u0000\u0000\u02f2g\u0001\u0000\u0000\u0000\u02f3\u02f8"+
		"\u0003Z-\u0000\u02f4\u02f5\u00053\u0000\u0000\u02f5\u02f7\u0003Z-\u0000"+
		"\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f7\u02fa\u0001\u0000\u0000\u0000"+
		"\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000"+
		"\u02f9i\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fb"+
		"\u02fc\u0005\u0001\u0000\u0000\u02fc\u02fd\u0005]\u0000\u0000\u02fd\u02fe"+
		"\u0005|\u0000\u0000\u02fe\u02ff\u0003l6\u0000\u02ff\u0300\u0003n7\u0000"+
		"\u0300\u0301\u0005\n\u0000\u0000\u0301\u0302\u0005|\u0000\u0000\u0302"+
		"\u0303\u0005`\u0000\u0000\u0303\u0304\u0005a\u0000\u0000\u0304\u0305\u0005"+
		"b\u0000\u0000\u0305\u0309\u0005[\u0000\u0000\u0306\u0308\u0003p8\u0000"+
		"\u0307\u0306\u0001\u0000\u0000\u0000\u0308\u030b\u0001\u0000\u0000\u0000"+
		"\u0309\u0307\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000"+
		"\u030a\u030c\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000"+
		"\u030c\u030d\u0005\\\u0000\u0000\u030d\u030e\u00054\u0000\u0000\u030e"+
		"k\u0001\u0000\u0000\u0000\u030f\u0310\u0007\u0006\u0000\u0000\u0310m\u0001"+
		"\u0000\u0000\u0000\u0311\u0312\u0007\u0007\u0000\u0000\u0312o\u0001\u0000"+
		"\u0000\u0000\u0313\u0318\u0003 \u0010\u0000\u0314\u0318\u0003>\u001f\u0000"+
		"\u0315\u0318\u0003B!\u0000\u0316\u0318\u0003r9\u0000\u0317\u0313\u0001"+
		"\u0000\u0000\u0000\u0317\u0314\u0001\u0000\u0000\u0000\u0317\u0315\u0001"+
		"\u0000\u0000\u0000\u0317\u0316\u0001\u0000\u0000\u0000\u0318q\u0001\u0000"+
		"\u0000\u0000\u0319\u031a\u0005|\u0000\u0000\u031a\u031b\u0005)\u0000\u0000"+
		"\u031b\u031c\u0003t:\u0000\u031c\u031d\u00054\u0000\u0000\u031ds\u0001"+
		"\u0000\u0000\u0000\u031e\u031f\u0005c\u0000\u0000\u031f\u0320\u00055\u0000"+
		"\u0000\u0320\u0325\u0005|\u0000\u0000\u0321\u0322\u0005d\u0000\u0000\u0322"+
		"\u0323\u00055\u0000\u0000\u0323\u0325\u0005|\u0000\u0000\u0324\u031e\u0001"+
		"\u0000\u0000\u0000\u0324\u0321\u0001\u0000\u0000\u0000\u0325u\u0001\u0000"+
		"\u0000\u0000\u0326\u0327\u0005e\u0000\u0000\u0327\u0328\u0005f\u0000\u0000"+
		"\u0328\u0329\u00054\u0000\u0000\u0329w\u0001\u0000\u0000\u0000\u032a\u032b"+
		"\u0005g\u0000\u0000\u032b\u032c\u00054\u0000\u0000\u032cy\u0001\u0000"+
		"\u0000\u0000\u032d\u032e\u0005h\u0000\u0000\u032e\u032f\u00054\u0000\u0000"+
		"\u032f{\u0001\u0000\u0000\u0000:\u007f\u0096\u00b4\u00ce\u00e0\u00f1\u00f8"+
		"\u0103\u0106\u0115\u0123\u0137\u016d\u0174\u018a\u0192\u019a\u01a2\u01aa"+
		"\u01af\u01b4\u01b8\u01bd\u01c4\u01c9\u01e8\u01f7\u01fc\u0202\u0204\u020b"+
		"\u020f\u0211\u021e\u0223\u0230\u0239\u0240\u0247\u024e\u0252\u025c\u0267"+
		"\u0271\u0279\u027b\u0286\u0290\u029c\u02a5\u02ad\u02b7\u02bd\u02f1\u02f8"+
		"\u0309\u0317\u0324";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}