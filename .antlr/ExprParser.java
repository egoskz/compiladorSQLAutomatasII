// Generated from c:/Users/HP/Downloads/compiladorSQL/compiladorSQLAutomatasII/Expr.g4 by ANTLR 4.13.1
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
		CREATE=1, DATABASE=2, USE=3, TABLE=4, ALTER=5, DROP=6, TRUNCATE=7, SELECT=8, 
		INSERT=9, UPDATE=10, DELETE=11, INTO=12, VALUES=13, FROM=14, WHERE=15, 
		SET=16, GROUP=17, ORDER=18, BY=19, HAVING=20, JOIN=21, INNER=22, LEFT=23, 
		RIGHT=24, FULL=25, ON=26, AS=27, DISTINCT=28, LIMIT=29, PRIMARY=30, FOREIGN=31, 
		KEY=32, REFERENCES=33, NOT=34, NULL=35, UNIQUE=36, CHECK=37, DEFAULT=38, 
		AUTO_INCREMENT=39, AND=40, OR=41, LIKE=42, IN=43, BETWEEN=44, IS=45, EXISTS=46, 
		INT=47, INTEGER=48, BIGINT=49, SMALLINT=50, FLOAT=51, DOUBLE=52, DECIMAL=53, 
		NUMERIC=54, CHAR=55, VARCHAR=56, TEXT=57, DATE=58, TIME=59, DATETIME=60, 
		TIMESTAMP=61, BOOLEAN=62, BIT=63, MAS=64, MENOS=65, MULT=66, DIV=67, MOD=68, 
		IGUAL=69, MENOR=70, MAYOR=71, MENORIGUAL=72, MAYORIGUAL=73, DIFERENTE=74, 
		PARIZQ=75, PARDER=76, CORIZQ=77, CORDER=78, COMA=79, PUNTO=80, PUNTOYCOMA=81, 
		DECIMAL_NUM=82, ENTERO=83, CADENA=84, ID=85, COMENTARIO=86, COMENTARIO_BLOQUE=87, 
		WS=88, ERROR=89;
	public static final int
		RULE_inicio = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CREATE'", "'DATABASE'", "'USE'", "'TABLE'", "'ALTER'", "'DROP'", 
			"'TRUNCATE'", "'SELECT'", "'INSERT'", "'UPDATE'", "'DELETE'", "'INTO'", 
			"'VALUES'", "'FROM'", "'WHERE'", "'SET'", "'GROUP'", "'ORDER'", "'BY'", 
			"'HAVING'", "'JOIN'", "'INNER'", "'LEFT'", "'RIGHT'", "'FULL'", "'ON'", 
			"'AS'", "'DISTINCT'", "'LIMIT'", "'PRIMARY'", "'FOREIGN'", "'KEY'", "'REFERENCES'", 
			"'NOT'", "'NULL'", "'UNIQUE'", "'CHECK'", "'DEFAULT'", "'AUTO_INCREMENT'", 
			"'AND'", "'OR'", "'LIKE'", "'IN'", "'BETWEEN'", "'IS'", "'EXISTS'", "'INT'", 
			"'INTEGER'", "'BIGINT'", "'SMALLINT'", "'FLOAT'", "'DOUBLE'", "'DECIMAL'", 
			"'NUMERIC'", "'CHAR'", "'VARCHAR'", "'TEXT'", "'DATE'", "'TIME'", "'DATETIME'", 
			"'TIMESTAMP'", "'BOOLEAN'", "'BIT'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'='", "'<'", "'>'", "'<='", "'>='", null, "'('", "')'", "'['", "']'", 
			"','", "'.'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "DATABASE", "USE", "TABLE", "ALTER", "DROP", "TRUNCATE", 
			"SELECT", "INSERT", "UPDATE", "DELETE", "INTO", "VALUES", "FROM", "WHERE", 
			"SET", "GROUP", "ORDER", "BY", "HAVING", "JOIN", "INNER", "LEFT", "RIGHT", 
			"FULL", "ON", "AS", "DISTINCT", "LIMIT", "PRIMARY", "FOREIGN", "KEY", 
			"REFERENCES", "NOT", "NULL", "UNIQUE", "CHECK", "DEFAULT", "AUTO_INCREMENT", 
			"AND", "OR", "LIKE", "IN", "BETWEEN", "IS", "EXISTS", "INT", "INTEGER", 
			"BIGINT", "SMALLINT", "FLOAT", "DOUBLE", "DECIMAL", "NUMERIC", "CHAR", 
			"VARCHAR", "TEXT", "DATE", "TIME", "DATETIME", "TIMESTAMP", "BOOLEAN", 
			"BIT", "MAS", "MENOS", "MULT", "DIV", "MOD", "IGUAL", "MENOR", "MAYOR", 
			"MENORIGUAL", "MAYORIGUAL", "DIFERENTE", "PARIZQ", "PARDER", "CORIZQ", 
			"CORDER", "COMA", "PUNTO", "PUNTOYCOMA", "DECIMAL_NUM", "ENTERO", "CADENA", 
			"ID", "COMENTARIO", "COMENTARIO_BLOQUE", "WS", "ERROR"
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
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
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

	public static final String _serializedATN =
		"\u0004\u0001Y\u0005\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0002\u0001\u0000"+
		"\u0000\u0000\u0002\u0003\u0005\u0000\u0000\u0001\u0003\u0001\u0001\u0000"+
		"\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}