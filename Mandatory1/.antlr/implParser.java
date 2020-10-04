// Generated from /home/jackktis/Mandatory1/impl.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, T__2=3, NOT=4, OPAR=5, CPAR=6, OBRACE=7, CBRACE=8, IF=9, 
		ELSE=10, WHILE=11, MULDEV=12, ADDSUB=13, CONST=14, COMPARE=15, AND=16, 
		OR=17, ID=18, FLOAT=19, ALPHA=20, NUM=21, WHITESPACE=22, COMMENT=23, COMMENT2=24;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_command = 2, RULE_expr = 3, RULE_condition = 4, 
		RULE_stat = 5, RULE_if_stat = 6, RULE_while_stat = 7, RULE_condition_block = 8, 
		RULE_stat_block = 9, RULE_block = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "command", "expr", "condition", "stat", "if_stat", 
			"while_stat", "condition_block", "stat_block", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'output'", "'!'", "'('", "')'", "'{'", "'}'", "'if'", 
			"'else'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NOT", "OPAR", "CPAR", "OBRACE", "CBRACE", "IF", 
			"ELSE", "WHILE", "MULDEV", "ADDSUB", "CONST", "COMPARE", "AND", "OR", 
			"ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << IF) | (1L << ELSE) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(22);
				((StartContext)_localctx).command = command();
				((StartContext)_localctx).cs.add(((StartContext)_localctx).command);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case IF:
			case ELSE:
			case WHILE:
			case ID:
				_localctx = new SingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				((SingleCommandContext)_localctx).c = command();
				}
				break;
			case OBRACE:
				_localctx = new MultipleCommandsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(OBRACE);
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << IF) | (1L << ELSE) | (1L << WHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(32);
					((MultipleCommandsContext)_localctx).command = command();
					((MultipleCommandsContext)_localctx).cs.add(((MultipleCommandsContext)_localctx).command);
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(38);
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
	public static class ElseContext extends CommandContext {
		public ConditionContext c;
		public TerminalNode ELSE() { return getToken(implParser.ELSE, 0); }
		public TerminalNode OPAR() { return getToken(implParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(implParser.CPAR, 0); }
		public TerminalNode OBRACE() { return getToken(implParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(implParser.CBRACE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ElseContext(CommandContext ctx) { copyFrom(ctx); }
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
		public TerminalNode IF() { return getToken(implParser.IF, 0); }
		public TerminalNode OPAR() { return getToken(implParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(implParser.CPAR, 0); }
		public TerminalNode OBRACE() { return getToken(implParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(implParser.CBRACE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfContext(CommandContext ctx) { copyFrom(ctx); }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((AssignmentContext)_localctx).x = match(ID);
				setState(42);
				match(T__0);
				setState(43);
				((AssignmentContext)_localctx).e = expr(0);
				setState(44);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__2);
				setState(47);
				((OutputContext)_localctx).e = expr(0);
				setState(48);
				match(T__1);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(IF);
				setState(51);
				match(OPAR);
				setState(52);
				((IfContext)_localctx).c = condition(0);
				setState(53);
				match(CPAR);
				setState(54);
				match(OBRACE);
				setState(55);
				match(CBRACE);
				}
				break;
			case ELSE:
				_localctx = new ElseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(ELSE);
				setState(58);
				match(OPAR);
				setState(59);
				((ElseContext)_localctx).c = condition(0);
				setState(60);
				match(CPAR);
				setState(61);
				match(OBRACE);
				setState(62);
				match(CBRACE);
				}
				break;
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				match(WHILE);
				setState(65);
				match(OPAR);
				setState(66);
				((WhileLoopContext)_localctx).c = condition(0);
				setState(67);
				match(CPAR);
				setState(68);
				((WhileLoopContext)_localctx).p = program();
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
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(73);
				((ConstantContext)_localctx).c = match(CONST);
				}
				break;
			case ADDSUB:
				{
				_localctx = new MinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				((MinusContext)_localctx).op = match(ADDSUB);
				setState(75);
				((MinusContext)_localctx).e = expr(3);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			case OPAR:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(OPAR);
				setState(78);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(79);
				match(CPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(84);
						((MultiplicationContext)_localctx).op = match(MULDEV);
						setState(85);
						((MultiplicationContext)_localctx).e2 = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						((AdditionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(87);
						((AdditionContext)_localctx).op = match(ADDSUB);
						setState(88);
						((AdditionContext)_localctx).e2 = expr(5);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

			setState(95);
			((CompareExpressionsContext)_localctx).e1 = expr(0);
			setState(96);
			((CompareExpressionsContext)_localctx).op = match(COMPARE);
			setState(97);
			((CompareExpressionsContext)_localctx).e2 = expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ConditionContext(_parentctx, _parentState));
						((AndContext)_localctx).con1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(99);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(100);
						((AndContext)_localctx).op = match(AND);
						setState(101);
						((AndContext)_localctx).con2 = condition(3);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ConditionContext(_parentctx, _parentState));
						((OrContext)_localctx).con1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(102);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(103);
						((OrContext)_localctx).op = match(OR);
						setState(104);
						((OrContext)_localctx).con2 = condition(2);
						}
						break;
					}
					} 
				}
				setState(109);
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

	public static class StatContext extends ParserRuleContext {
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stat);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				if_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				while_stat();
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(implParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(implParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(implParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(implParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IF);
			setState(115);
			condition_block();
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					match(ELSE);
					setState(117);
					match(IF);
					setState(118);
					condition_block();
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(124);
				match(ELSE);
				setState(125);
				stat_block();
				}
				break;
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(implParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(WHILE);
			setState(129);
			expr(0);
			setState(130);
			stat_block();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			expr(0);
			setState(133);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(implParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(implParser.CBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stat_block);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(OBRACE);
				setState(136);
				block();
				setState(137);
				match(CBRACE);
				}
				break;
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				stat();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==WHILE) {
				{
				{
				setState(142);
				stat();
				}
				}
				setState(147);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\7\3"+
		"$\n\3\f\3\16\3\'\13\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\7\3\7\5\7s\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\b\3\b\5\b\u0081\n\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u008f\n\13\3\f\7\f\u0092"+
		"\n\f\f\f\16\f\u0095\13\f\3\f\2\4\b\n\r\2\4\6\b\n\f\16\20\22\24\26\2\2"+
		"\2\u009e\2\33\3\2\2\2\4)\3\2\2\2\6H\3\2\2\2\bS\3\2\2\2\n`\3\2\2\2\fr\3"+
		"\2\2\2\16t\3\2\2\2\20\u0082\3\2\2\2\22\u0086\3\2\2\2\24\u008e\3\2\2\2"+
		"\26\u0093\3\2\2\2\30\32\5\6\4\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2"+
		"\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\2\2\3\37\3\3\2"+
		"\2\2 *\5\6\4\2!%\7\t\2\2\"$\5\6\4\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&"+
		"\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(*\7\n\2\2) \3\2\2\2)!\3\2\2\2*\5\3\2\2\2"+
		"+,\7\24\2\2,-\7\3\2\2-.\5\b\5\2./\7\4\2\2/I\3\2\2\2\60\61\7\5\2\2\61\62"+
		"\5\b\5\2\62\63\7\4\2\2\63I\3\2\2\2\64\65\7\13\2\2\65\66\7\7\2\2\66\67"+
		"\5\n\6\2\678\7\b\2\289\7\t\2\29:\7\n\2\2:I\3\2\2\2;<\7\f\2\2<=\7\7\2\2"+
		"=>\5\n\6\2>?\7\b\2\2?@\7\t\2\2@A\7\n\2\2AI\3\2\2\2BC\7\r\2\2CD\7\7\2\2"+
		"DE\5\n\6\2EF\7\b\2\2FG\5\4\3\2GI\3\2\2\2H+\3\2\2\2H\60\3\2\2\2H\64\3\2"+
		"\2\2H;\3\2\2\2HB\3\2\2\2I\7\3\2\2\2JK\b\5\1\2KT\7\20\2\2LM\7\17\2\2MT"+
		"\5\b\5\5NT\7\24\2\2OP\7\7\2\2PQ\5\b\5\2QR\7\b\2\2RT\3\2\2\2SJ\3\2\2\2"+
		"SL\3\2\2\2SN\3\2\2\2SO\3\2\2\2T]\3\2\2\2UV\f\7\2\2VW\7\16\2\2W\\\5\b\5"+
		"\bXY\f\6\2\2YZ\7\17\2\2Z\\\5\b\5\7[U\3\2\2\2[X\3\2\2\2\\_\3\2\2\2][\3"+
		"\2\2\2]^\3\2\2\2^\t\3\2\2\2_]\3\2\2\2`a\b\6\1\2ab\5\b\5\2bc\7\21\2\2c"+
		"d\5\b\5\2dm\3\2\2\2ef\f\4\2\2fg\7\22\2\2gl\5\n\6\5hi\f\3\2\2ij\7\23\2"+
		"\2jl\5\n\6\4ke\3\2\2\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\13\3\2"+
		"\2\2om\3\2\2\2ps\5\16\b\2qs\5\20\t\2rp\3\2\2\2rq\3\2\2\2s\r\3\2\2\2tu"+
		"\7\13\2\2u{\5\22\n\2vw\7\f\2\2wx\7\13\2\2xz\5\22\n\2yv\3\2\2\2z}\3\2\2"+
		"\2{y\3\2\2\2{|\3\2\2\2|\u0080\3\2\2\2}{\3\2\2\2~\177\7\f\2\2\177\u0081"+
		"\5\24\13\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\17\3\2\2\2\u0082\u0083"+
		"\7\r\2\2\u0083\u0084\5\b\5\2\u0084\u0085\5\24\13\2\u0085\21\3\2\2\2\u0086"+
		"\u0087\5\b\5\2\u0087\u0088\5\24\13\2\u0088\23\3\2\2\2\u0089\u008a\7\t"+
		"\2\2\u008a\u008b\5\26\f\2\u008b\u008c\7\n\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008f\5\f\7\2\u008e\u0089\3\2\2\2\u008e\u008d\3\2\2\2\u008f\25\3\2\2"+
		"\2\u0090\u0092\5\f\7\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\27\3\2\2\2\u0095\u0093\3\2\2\2\20\33"+
		"%)HS[]kmr{\u0080\u008e\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}