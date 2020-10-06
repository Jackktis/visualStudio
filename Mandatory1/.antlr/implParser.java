// Generated from /home/gonhk/CT/Mandatory1/impl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NOT=5, OPAR=6, CPAR=7, OBRACE=8, CBRACE=9, 
		IF=10, ELSE=11, WHILE=12, MULDEV=13, ADDSUB=14, CONST=15, COMPARE=16, 
		AND=17, OR=18, ID=19, FLOAT=20, ALPHA=21, NUM=22, WHITESPACE=23, COMMENT=24, 
		COMMENT2=25;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_command = 2, RULE_expr = 3, RULE_condition = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "command", "expr", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'output'", "'elseif'", "'!'", "'('", "')'", "'{'", 
			"'}'", "'if'", "'else'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NOT", "OPAR", "CPAR", "OBRACE", "CBRACE", 
			"IF", "ELSE", "WHILE", "MULDEV", "ADDSUB", "CONST", "COMPARE", "AND", 
			"OR", "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
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
	public String getGrammarFileName() { return "impl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public implParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CommandContext command;
		public List<CommandContext> cs = new ArrayList<CommandContext>();
		public TerminalNode EOF() { return getToken(implParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << IF) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(10);
				((StartContext)_localctx).command = command();
				((StartContext)_localctx).cs.add(((StartContext)_localctx).command);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleCommandsContext extends ProgramContext {
		public CommandContext command;
		public List<CommandContext> cs = new ArrayList<CommandContext>();
		public TerminalNode OBRACE() { return getToken(implParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(implParser.CBRACE, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public MultipleCommandsContext(ProgramContext ctx) { copyFrom(ctx); }
	}
	public static class SingleCommandContext extends ProgramContext {
		public CommandContext c;
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public SingleCommandContext(ProgramContext ctx) { copyFrom(ctx); }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case IF:
			case WHILE:
			case ID:
				_localctx = new SingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				((SingleCommandContext)_localctx).c = command();
				}
				break;
			case OBRACE:
				_localctx = new MultipleCommandsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(OBRACE);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << IF) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(20);
					((MultipleCommandsContext)_localctx).command = command();
					((MultipleCommandsContext)_localctx).cs.add(((MultipleCommandsContext)_localctx).command);
					}
					}
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(26);
				match(CBRACE);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends CommandContext {
		public Token x;
		public ExprContext e;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class ElseIfStmtContext extends CommandContext {
		public ConditionContext con1;
		public ProgramContext p;
		public ConditionContext con2;
		public ProgramContext p2;
		public ProgramContext p3;
		public TerminalNode IF() { return getToken(implParser.IF, 0); }
		public List<TerminalNode> OPAR() { return getTokens(implParser.OPAR); }
		public TerminalNode OPAR(int i) {
			return getToken(implParser.OPAR, i);
		}
		public List<TerminalNode> CPAR() { return getTokens(implParser.CPAR); }
		public TerminalNode CPAR(int i) {
			return getToken(implParser.CPAR, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(implParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(implParser.ELSE, i);
		}
		public ElseIfStmtContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class IfElseStmtContext extends CommandContext {
		public ConditionContext c;
		public ProgramContext p;
		public ProgramContext p2;
		public TerminalNode IF() { return getToken(implParser.IF, 0); }
		public TerminalNode OPAR() { return getToken(implParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(implParser.CPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(implParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(implParser.ELSE, i);
		}
		public IfElseStmtContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class OutputContext extends CommandContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class WhileLoopContext extends CommandContext {
		public ConditionContext c;
		public ProgramContext p;
		public TerminalNode WHILE() { return getToken(implParser.WHILE, 0); }
		public TerminalNode OPAR() { return getToken(implParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(implParser.CPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public WhileLoopContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class IfContext extends CommandContext {
		public ConditionContext c;
		public ProgramContext p;
		public TerminalNode IF() { return getToken(implParser.IF, 0); }
		public TerminalNode OPAR() { return getToken(implParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(implParser.CPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public IfContext(CommandContext ctx) { copyFrom(ctx); }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			int _alt;
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				((AssignmentContext)_localctx).x = match(ID);
				setState(30);
				match(T__0);
				setState(31);
				((AssignmentContext)_localctx).e = expr(0);
				setState(32);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__2);
				setState(35);
				((OutputContext)_localctx).e = expr(0);
				setState(36);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(IF);
				setState(39);
				match(OPAR);
				setState(40);
				((IfContext)_localctx).c = condition(0);
				setState(41);
				match(CPAR);
				setState(42);
				((IfContext)_localctx).p = program();
				}
				break;
			case 4:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(IF);
				setState(45);
				match(OPAR);
				setState(46);
				((IfElseStmtContext)_localctx).c = condition(0);
				setState(47);
				match(CPAR);
				setState(48);
				((IfElseStmtContext)_localctx).p = program();
				setState(51); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(49);
						match(ELSE);
						setState(50);
						((IfElseStmtContext)_localctx).p2 = program();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(53); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				_localctx = new ElseIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(IF);
				setState(56);
				match(OPAR);
				setState(57);
				((ElseIfStmtContext)_localctx).con1 = condition(0);
				setState(58);
				match(CPAR);
				setState(59);
				((ElseIfStmtContext)_localctx).p = program();
				{
				setState(60);
				match(T__3);
				setState(61);
				match(OPAR);
				setState(62);
				((ElseIfStmtContext)_localctx).con2 = condition(0);
				setState(63);
				match(CPAR);
				setState(64);
				((ElseIfStmtContext)_localctx).p2 = program();
				}
				setState(68); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(66);
						match(ELSE);
						setState(67);
						((ElseIfStmtContext)_localctx).p3 = program();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(70); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				match(WHILE);
				setState(73);
				match(OPAR);
				setState(74);
				((WhileLoopContext)_localctx).c = condition(0);
				setState(75);
				match(CPAR);
				setState(76);
				((WhileLoopContext)_localctx).p = program();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext e;
		public TerminalNode OPAR() { return getToken(implParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(implParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULDEV() { return getToken(implParser.MULDEV, 0); }
		public MultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADDSUB() { return getToken(implParser.ADDSUB, 0); }
		public AdditionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VariableContext extends ExprContext {
		public Token x;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ConstantContext extends ExprContext {
		public Token c;
		public TerminalNode CONST() { return getToken(implParser.CONST, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MinusContext extends ExprContext {
		public Token op;
		public ExprContext e;
		public TerminalNode ADDSUB() { return getToken(implParser.ADDSUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MinusContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(81);
				((ConstantContext)_localctx).c = match(CONST);
				}
				break;
			case ADDSUB:
				{
				_localctx = new MinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				((MinusContext)_localctx).op = match(ADDSUB);
				setState(83);
				((MinusContext)_localctx).e = expr(3);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			case OPAR:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(OPAR);
				setState(86);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(87);
				match(CPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(92);
						((MultiplicationContext)_localctx).op = match(MULDEV);
						setState(93);
						((MultiplicationContext)_localctx).e2 = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						((AdditionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(95);
						((AdditionContext)_localctx).op = match(ADDSUB);
						setState(96);
						((AdditionContext)_localctx).e2 = expr(5);
						}
						break;
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrContext extends ConditionContext {
		public ConditionContext con1;
		public Token op;
		public ConditionContext con2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(implParser.OR, 0); }
		public OrContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	public static class AndContext extends ConditionContext {
		public ConditionContext con1;
		public Token op;
		public ConditionContext con2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(implParser.AND, 0); }
		public AndContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	public static class CompareExpressionsContext extends ConditionContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPARE() { return getToken(implParser.COMPARE, 0); }
		public CompareExpressionsContext(ConditionContext ctx) { copyFrom(ctx); }
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CompareExpressionsContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(103);
			((CompareExpressionsContext)_localctx).e1 = expr(0);
			setState(104);
			((CompareExpressionsContext)_localctx).op = match(COMPARE);
			setState(105);
			((CompareExpressionsContext)_localctx).e2 = expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ConditionContext(_parentctx, _parentState));
						((AndContext)_localctx).con1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(107);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(108);
						((AndContext)_localctx).op = match(AND);
						setState(109);
						((AndContext)_localctx).con2 = condition(3);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ConditionContext(_parentctx, _parentState));
						((OrContext)_localctx).con1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(110);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(111);
						((OrContext)_localctx).op = match(OR);
						setState(112);
						((OrContext)_localctx).con2 = condition(2);
						}
						break;
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 4:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\6\4\66\n\4\r\4\16\4\67\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\6\4G\n\4\r\4\16\4H\3\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5d\n\5\f"+
		"\5\16\5g\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6t\n\6\f\6"+
		"\16\6w\13\6\3\6\2\4\b\n\7\2\4\6\b\n\2\2\2\u0084\2\17\3\2\2\2\4\35\3\2"+
		"\2\2\6P\3\2\2\2\b[\3\2\2\2\nh\3\2\2\2\f\16\5\6\4\2\r\f\3\2\2\2\16\21\3"+
		"\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2\22\23\7"+
		"\2\2\3\23\3\3\2\2\2\24\36\5\6\4\2\25\31\7\n\2\2\26\30\5\6\4\2\27\26\3"+
		"\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3"+
		"\2\2\2\34\36\7\13\2\2\35\24\3\2\2\2\35\25\3\2\2\2\36\5\3\2\2\2\37 \7\25"+
		"\2\2 !\7\3\2\2!\"\5\b\5\2\"#\7\4\2\2#Q\3\2\2\2$%\7\5\2\2%&\5\b\5\2&\'"+
		"\7\4\2\2\'Q\3\2\2\2()\7\f\2\2)*\7\b\2\2*+\5\n\6\2+,\7\t\2\2,-\5\4\3\2"+
		"-Q\3\2\2\2./\7\f\2\2/\60\7\b\2\2\60\61\5\n\6\2\61\62\7\t\2\2\62\65\5\4"+
		"\3\2\63\64\7\r\2\2\64\66\5\4\3\2\65\63\3\2\2\2\66\67\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28Q\3\2\2\29:\7\f\2\2:;\7\b\2\2;<\5\n\6\2<=\7\t\2\2=>\5"+
		"\4\3\2>?\7\6\2\2?@\7\b\2\2@A\5\n\6\2AB\7\t\2\2BC\5\4\3\2CF\3\2\2\2DE\7"+
		"\r\2\2EG\5\4\3\2FD\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IQ\3\2\2\2JK\7"+
		"\16\2\2KL\7\b\2\2LM\5\n\6\2MN\7\t\2\2NO\5\4\3\2OQ\3\2\2\2P\37\3\2\2\2"+
		"P$\3\2\2\2P(\3\2\2\2P.\3\2\2\2P9\3\2\2\2PJ\3\2\2\2Q\7\3\2\2\2RS\b\5\1"+
		"\2S\\\7\21\2\2TU\7\20\2\2U\\\5\b\5\5V\\\7\25\2\2WX\7\b\2\2XY\5\b\5\2Y"+
		"Z\7\t\2\2Z\\\3\2\2\2[R\3\2\2\2[T\3\2\2\2[V\3\2\2\2[W\3\2\2\2\\e\3\2\2"+
		"\2]^\f\7\2\2^_\7\17\2\2_d\5\b\5\b`a\f\6\2\2ab\7\20\2\2bd\5\b\5\7c]\3\2"+
		"\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\t\3\2\2\2ge\3\2\2\2hi\b"+
		"\6\1\2ij\5\b\5\2jk\7\22\2\2kl\5\b\5\2lu\3\2\2\2mn\f\4\2\2no\7\23\2\2o"+
		"t\5\n\6\5pq\f\3\2\2qr\7\24\2\2rt\5\n\6\4sm\3\2\2\2sp\3\2\2\2tw\3\2\2\2"+
		"us\3\2\2\2uv\3\2\2\2v\13\3\2\2\2wu\3\2\2\2\r\17\31\35\67HP[cesu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}