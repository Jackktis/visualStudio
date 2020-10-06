// Generated from /home/s195479/visualStudio/Mandatory1/impl.g4 by ANTLR 4.8
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
		T__9=10, T__10=11, MULDEV=12, ADDSUB=13, CONST=14, COMPARE=15, AND=16, 
		OR=17, ID=18, FLOAT=19, ALPHA=20, NUM=21, WHITESPACE=22, COMMENT=23, COMMENT2=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "MULDEV", "ADDSUB", "CONST", "COMPARE", "AND", "OR", 
			"ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'output'", "'if'", "'('", "')'", "'else'", 
			"'elseif'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"MULDEV", "ADDSUB", "CONST", "COMPARE", "AND", "OR", "ID", "FLOAT", "ALPHA", 
			"NUM", "WHITESPACE", "COMMENT", "COMMENT2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17a\n\17\r"+
		"\17\16\17b\3\17\3\17\6\17g\n\17\r\17\16\17h\5\17k\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20v\n\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\7\23\u0081\n\23\f\23\16\23\u0084\13\23\3\24\5\24\u0087"+
		"\n\24\3\24\6\24\u008a\n\24\r\24\16\24\u008b\3\24\3\24\6\24\u0090\n\24"+
		"\r\24\16\24\u0091\5\24\u0094\n\24\3\25\3\25\3\26\3\26\3\27\6\27\u009b"+
		"\n\27\r\27\16\27\u009c\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00a5\n\30\f"+
		"\30\16\30\u00a8\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00b2"+
		"\n\31\f\31\16\31\u00b5\13\31\3\31\3\31\3\31\3\31\3\31\2\2\32\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\13\4\2,,\61\61\4\2--//\3\2\62"+
		";\4\2>>@@\t\2C\\aac|\u00c7\u00c8\u00da\u00da\u00e7\u00e8\u00fa\u00fa\5"+
		"\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61\2\u00cb\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3"+
		"\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\rB\3\2\2\2\17"+
		"E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25N\3\2\2\2\27U\3\2\2\2\31[\3\2\2\2"+
		"\33]\3\2\2\2\35`\3\2\2\2\37u\3\2\2\2!w\3\2\2\2#z\3\2\2\2%}\3\2\2\2\'\u0086"+
		"\3\2\2\2)\u0095\3\2\2\2+\u0097\3\2\2\2-\u009a\3\2\2\2/\u00a0\3\2\2\2\61"+
		"\u00ab\3\2\2\2\63\64\7}\2\2\64\4\3\2\2\2\65\66\7\177\2\2\66\6\3\2\2\2"+
		"\678\7?\2\28\b\3\2\2\29:\7=\2\2:\n\3\2\2\2;<\7q\2\2<=\7w\2\2=>\7v\2\2"+
		">?\7r\2\2?@\7w\2\2@A\7v\2\2A\f\3\2\2\2BC\7k\2\2CD\7h\2\2D\16\3\2\2\2E"+
		"F\7*\2\2F\20\3\2\2\2GH\7+\2\2H\22\3\2\2\2IJ\7g\2\2JK\7n\2\2KL\7u\2\2L"+
		"M\7g\2\2M\24\3\2\2\2NO\7g\2\2OP\7n\2\2PQ\7u\2\2QR\7g\2\2RS\7k\2\2ST\7"+
		"h\2\2T\26\3\2\2\2UV\7y\2\2VW\7j\2\2WX\7k\2\2XY\7n\2\2YZ\7g\2\2Z\30\3\2"+
		"\2\2[\\\t\2\2\2\\\32\3\2\2\2]^\t\3\2\2^\34\3\2\2\2_a\t\4\2\2`_\3\2\2\2"+
		"ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cj\3\2\2\2df\7\60\2\2eg\t\4\2\2fe\3\2\2"+
		"\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jd\3\2\2\2jk\3\2\2\2k\36\3\2"+
		"\2\2lm\7#\2\2mv\7?\2\2no\7?\2\2ov\7?\2\2pv\t\5\2\2qr\7@\2\2rv\7?\2\2s"+
		"t\7>\2\2tv\7?\2\2ul\3\2\2\2un\3\2\2\2up\3\2\2\2uq\3\2\2\2us\3\2\2\2v "+
		"\3\2\2\2wx\7(\2\2xy\7(\2\2y\"\3\2\2\2z{\7~\2\2{|\7~\2\2|$\3\2\2\2}\u0082"+
		"\5)\25\2~\u0081\5)\25\2\177\u0081\5+\26\2\u0080~\3\2\2\2\u0080\177\3\2"+
		"\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"&\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\7/\2\2\u0086\u0085\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u008a\5+\26\2\u0089\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u0093\3\2\2\2\u008d\u008f\7\60\2\2\u008e\u0090\5+\26\2\u008f\u008e\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u0094\3\2\2\2\u0094(\3\2\2\2"+
		"\u0095\u0096\t\6\2\2\u0096*\3\2\2\2\u0097\u0098\t\4\2\2\u0098,\3\2\2\2"+
		"\u0099\u009b\t\7\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\27\2\2"+
		"\u009f.\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a6"+
		"\3\2\2\2\u00a3\u00a5\n\b\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00aa\b\30\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac"+
		"\u00ad\7,\2\2\u00ad\u00b3\3\2\2\2\u00ae\u00b2\n\t\2\2\u00af\u00b0\7,\2"+
		"\2\u00b0\u00b2\n\n\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\b\31\2\2\u00ba\62\3\2\2\2\21\2bhju\u0080\u0082\u0086"+
		"\u008b\u0091\u0093\u009c\u00a6\u00b1\u00b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}