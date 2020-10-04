// Generated from impl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, MULDEV=12, STRIG=13, CONST=14, COMPARE=15, ID=16, FLOAT=17, 
		ALPHA=18, NUM=19, WHITESPACE=20, COMMENT=21, COMMENT2=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "MULDEV", "STRIG", "CONST", "COMPARE", "ID", "FLOAT", 
			"ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'output'", "'while'", "'('", "')'", 
			"'!='", "'=='", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"MULDEV", "STRIG", "CONST", "COMPARE", "ID", "FLOAT", "ALPHA", "NUM", 
			"WHITESPACE", "COMMENT", "COMMENT2"
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


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\6\17W\n\17\r\17\16\17X\3\17\3\17\6\17]\n\17\r\17\16\17^\5\17"+
		"a\n\17\3\20\3\20\3\20\3\20\5\20g\n\20\3\21\3\21\3\21\7\21l\n\21\f\21\16"+
		"\21o\13\21\3\22\5\22r\n\22\3\22\6\22u\n\22\r\22\16\22v\3\22\3\22\6\22"+
		"{\n\22\r\22\16\22|\5\22\177\n\22\3\23\3\23\3\24\3\24\3\25\6\25\u0086\n"+
		"\25\r\25\16\25\u0087\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0090\n\26\f\26"+
		"\16\26\u0093\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u009d"+
		"\n\27\f\27\16\27\u00a0\13\27\3\27\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30\3\2\n\4\2,,\61\61\4\2--//\3\2\62;\t\2C\\aac"+
		"|\u00c7\u00c8\u00da\u00da\u00e7\u00e8\u00fa\u00fa\5\2\13\f\17\17\"\"\3"+
		"\2\f\f\3\2,,\3\2\61\61\2\u00b3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2"+
		"\13\67\3\2\2\2\r>\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25K\3\2"+
		"\2\2\27N\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35V\3\2\2\2\37f\3\2\2\2!h\3\2"+
		"\2\2#q\3\2\2\2%\u0080\3\2\2\2\'\u0082\3\2\2\2)\u0085\3\2\2\2+\u008b\3"+
		"\2\2\2-\u0096\3\2\2\2/\60\7}\2\2\60\4\3\2\2\2\61\62\7\177\2\2\62\6\3\2"+
		"\2\2\63\64\7?\2\2\64\b\3\2\2\2\65\66\7=\2\2\66\n\3\2\2\2\678\7q\2\289"+
		"\7w\2\29:\7v\2\2:;\7r\2\2;<\7w\2\2<=\7v\2\2=\f\3\2\2\2>?\7y\2\2?@\7j\2"+
		"\2@A\7k\2\2AB\7n\2\2BC\7g\2\2C\16\3\2\2\2DE\7*\2\2E\20\3\2\2\2FG\7+\2"+
		"\2G\22\3\2\2\2HI\7#\2\2IJ\7?\2\2J\24\3\2\2\2KL\7?\2\2LM\7?\2\2M\26\3\2"+
		"\2\2NO\7(\2\2OP\7(\2\2P\30\3\2\2\2QR\t\2\2\2R\32\3\2\2\2ST\t\3\2\2T\34"+
		"\3\2\2\2UW\t\4\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y`\3\2\2\2Z"+
		"\\\7\60\2\2[]\t\4\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2"+
		"\2\2`Z\3\2\2\2`a\3\2\2\2a\36\3\2\2\2bc\7#\2\2cg\7?\2\2de\7?\2\2eg\7?\2"+
		"\2fb\3\2\2\2fd\3\2\2\2g \3\2\2\2hm\5%\23\2il\5%\23\2jl\5\'\24\2ki\3\2"+
		"\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\"\3\2\2\2om\3\2\2\2pr\7"+
		"/\2\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\5\'\24\2ts\3\2\2\2uv\3\2\2\2vt\3"+
		"\2\2\2vw\3\2\2\2w~\3\2\2\2xz\7\60\2\2y{\5\'\24\2zy\3\2\2\2{|\3\2\2\2|"+
		"z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~x\3\2\2\2~\177\3\2\2\2\177$\3\2\2\2\u0080"+
		"\u0081\t\5\2\2\u0081&\3\2\2\2\u0082\u0083\t\4\2\2\u0083(\3\2\2\2\u0084"+
		"\u0086\t\6\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\25\2\2\u008a"+
		"*\3\2\2\2\u008b\u008c\7\61\2\2\u008c\u008d\7\61\2\2\u008d\u0091\3\2\2"+
		"\2\u008e\u0090\n\7\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\b\26\2\2\u0095,\3\2\2\2\u0096\u0097\7\61\2\2\u0097\u0098\7,\2\2"+
		"\u0098\u009e\3\2\2\2\u0099\u009d\n\b\2\2\u009a\u009b\7,\2\2\u009b\u009d"+
		"\n\t\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\b\27\2\2\u00a5.\3\2\2\2\21\2X^`fkmqv|~\u0087\u0091\u009c\u009e"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}