// Generated from /home/jackktis/Mandatory1/impl.g4 by ANTLR 4.8
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
		T__9=10, T__10=11, T__11=12, T__12=13, MULDEV=14, ADDSUB=15, CONST=16, 
		COMPARE=17, CONDITIONER=18, ID=19, FLOAT=20, ALPHA=21, NUM=22, WHITESPACE=23, 
		COMMENT=24, COMMENT2=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "MULDEV", "ADDSUB", "CONST", "COMPARE", 
			"CONDITIONER", "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", 
			"COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'output'", "'while'", "'('", "')'", 
			"'=='", "'>'", "'>='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "MULDEV", "ADDSUB", "CONST", "COMPARE", "CONDITIONER", "ID", 
			"FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00b6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21a\n\21"+
		"\r\21\16\21b\3\21\3\21\6\21g\n\21\r\21\16\21h\5\21k\n\21\3\22\3\22\3\22"+
		"\3\22\5\22q\n\22\3\23\3\23\3\23\3\23\5\23w\n\23\3\24\3\24\3\24\7\24|\n"+
		"\24\f\24\16\24\177\13\24\3\25\5\25\u0082\n\25\3\25\6\25\u0085\n\25\r\25"+
		"\16\25\u0086\3\25\3\25\6\25\u008b\n\25\r\25\16\25\u008c\5\25\u008f\n\25"+
		"\3\26\3\26\3\27\3\27\3\30\6\30\u0096\n\30\r\30\16\30\u0097\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\7\31\u00a0\n\31\f\31\16\31\u00a3\13\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\7\32\u00ad\n\32\f\32\16\32\u00b0\13\32\3"+
		"\32\3\32\3\32\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\3\2\n\4\2,,\61\61\4\2--//\3\2\62;\t\2C\\aac|\u00c7\u00c8\u00da"+
		"\u00da\u00e7\u00e8\u00fa\u00fa\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61"+
		"\61\2\u00c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2"+
		"\2\2\t;\3\2\2\2\13=\3\2\2\2\rD\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23N\3\2"+
		"\2\2\25Q\3\2\2\2\27S\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35[\3\2\2\2\37]\3"+
		"\2\2\2!`\3\2\2\2#p\3\2\2\2%v\3\2\2\2\'x\3\2\2\2)\u0081\3\2\2\2+\u0090"+
		"\3\2\2\2-\u0092\3\2\2\2/\u0095\3\2\2\2\61\u009b\3\2\2\2\63\u00a6\3\2\2"+
		"\2\65\66\7}\2\2\66\4\3\2\2\2\678\7\177\2\28\6\3\2\2\29:\7?\2\2:\b\3\2"+
		"\2\2;<\7=\2\2<\n\3\2\2\2=>\7q\2\2>?\7w\2\2?@\7v\2\2@A\7r\2\2AB\7w\2\2"+
		"BC\7v\2\2C\f\3\2\2\2DE\7y\2\2EF\7j\2\2FG\7k\2\2GH\7n\2\2HI\7g\2\2I\16"+
		"\3\2\2\2JK\7*\2\2K\20\3\2\2\2LM\7+\2\2M\22\3\2\2\2NO\7?\2\2OP\7?\2\2P"+
		"\24\3\2\2\2QR\7@\2\2R\26\3\2\2\2ST\7@\2\2TU\7?\2\2U\30\3\2\2\2VW\7>\2"+
		"\2W\32\3\2\2\2XY\7>\2\2YZ\7?\2\2Z\34\3\2\2\2[\\\t\2\2\2\\\36\3\2\2\2]"+
		"^\t\3\2\2^ \3\2\2\2_a\t\4\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2"+
		"cj\3\2\2\2df\7\60\2\2eg\t\4\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2ik\3\2\2\2jd\3\2\2\2jk\3\2\2\2k\"\3\2\2\2lm\7#\2\2mq\7?\2\2no\7?\2\2"+
		"oq\7?\2\2pl\3\2\2\2pn\3\2\2\2q$\3\2\2\2rs\7(\2\2sw\7(\2\2tu\7~\2\2uw\7"+
		"~\2\2vr\3\2\2\2vt\3\2\2\2w&\3\2\2\2x}\5+\26\2y|\5+\26\2z|\5-\27\2{y\3"+
		"\2\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~(\3\2\2\2\177}\3\2\2"+
		"\2\u0080\u0082\7/\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\u0085\5-\27\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008e\3\2\2\2\u0088\u008a\7\60"+
		"\2\2\u0089\u008b\5-\27\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0088\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f*\3\2\2\2\u0090\u0091\t\5\2\2\u0091,\3\2"+
		"\2\2\u0092\u0093\t\4\2\2\u0093.\3\2\2\2\u0094\u0096\t\6\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\b\30\2\2\u009a\60\3\2\2\2\u009b\u009c\7\61"+
		"\2\2\u009c\u009d\7\61\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\n\7\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\b\31\2\2\u00a5"+
		"\62\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8\7,\2\2\u00a8\u00ae\3\2\2"+
		"\2\u00a9\u00ad\n\b\2\2\u00aa\u00ab\7,\2\2\u00ab\u00ad\n\t\2\2\u00ac\u00a9"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7,"+
		"\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\32\2\2\u00b5"+
		"\64\3\2\2\2\22\2bhjpv{}\u0081\u0086\u008c\u008e\u0097\u00a1\u00ac\u00ae"+
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