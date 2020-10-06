// Generated from /home/s195479/visualStudio/Mandatory1/impl.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
<<<<<<< HEAD
		T__9=10, T__10=11, T__11=12, T__12=13, MULDEV=14, ADDSUB=15, CONST=16, 
		COMPARE=17, NOT=18, AND=19, OR=20, ID=21, FLOAT=22, ALPHA=23, NUM=24, 
=======
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, MULDEV=15, ADDSUB=16, 
		CONST=17, COMPARE=18, AND=19, OR=20, ID=21, FLOAT=22, ALPHA=23, NUM=24, 
>>>>>>> forI
		WHITESPACE=25, COMMENT=26, COMMENT2=27;
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
<<<<<<< HEAD
			null, "'{'", "'}'", "'='", "';'", "'['", "']'", "'output'", "'if'", "'('", 
			"')'", "'else'", "'elseif'", "'while'", null, null, null, null, "'~'"
=======
			null, "'{'", "'}'", "'='", "';'", "'output'", "'if'", "'('", "')'", "'else'", 
			"'elseif'", "'while'", "'for'", "'..'", "'++'"
>>>>>>> forI
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
<<<<<<< HEAD
			null, null, "MULDEV", "ADDSUB", "CONST", "COMPARE", "NOT", "AND", "OR", 
=======
			null, null, null, "MULDEV", "ADDSUB", "CONST", "COMPARE", "AND", "OR", 
>>>>>>> forI
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__12) | (1L << ID))) != 0)) {
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
			case T__6:
			case T__7:
			case T__12:
			case ID:
				_localctx = new SingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				((SingleCommandContext)_localctx).c = command();
				}
				break;
			case T__0:
				_localctx = new MultipleCommandsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(T__0);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__12) | (1L << ID))) != 0)) {
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
				match(T__1);
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
<<<<<<< HEAD
	public static class ArrayContext extends CommandContext {
		public Token x;
		public ExprContext e1;
		public ExprContext e2;
=======
	public static class ForIContext extends CommandContext {
		public Token x;
		public ExprContext e1;
		public ExprContext e2;
		public ProgramContext p;
>>>>>>> forI
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class ElseIfStmtContext extends CommandContext {
		public ConditionContext con1;
		public ProgramContext p;
		public ConditionContext con2;
		public ProgramContext p2;
		public ProgramContext p3;
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
		public ElseIfStmtContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class IfElseStmtContext extends CommandContext {
		public ConditionContext con1;
		public ProgramContext p;
		public ProgramContext p2;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
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
		public ConditionContext con1;
		public ProgramContext p;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public WhileLoopContext(CommandContext ctx) { copyFrom(ctx); }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			int _alt;
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				((AssignmentContext)_localctx).x = match(ID);
				setState(30);
				match(T__2);
				setState(31);
				((AssignmentContext)_localctx).e = expr(0);
				setState(32);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				((ArrayContext)_localctx).x = match(ID);
				setState(35);
				match(T__4);
				setState(36);
				((ArrayContext)_localctx).e1 = expr(0);
				setState(37);
				match(T__5);
				setState(38);
				match(T__2);
				setState(39);
				((ArrayContext)_localctx).e2 = expr(0);
				setState(40);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(T__6);
				setState(43);
				((OutputContext)_localctx).e = expr(0);
				setState(44);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(T__7);
				setState(47);
				match(T__8);
				setState(48);
				((IfElseStmtContext)_localctx).con1 = condition(0);
				setState(49);
				match(T__9);
				setState(50);
				((IfElseStmtContext)_localctx).p = program();
				setState(53); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(51);
						match(T__10);
						setState(52);
						((IfElseStmtContext)_localctx).p2 = program();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(55); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				_localctx = new ElseIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				match(T__7);
				setState(58);
				match(T__8);
				setState(59);
				((ElseIfStmtContext)_localctx).con1 = condition(0);
				setState(60);
				match(T__9);
				setState(61);
				((ElseIfStmtContext)_localctx).p = program();
				{
				setState(62);
				match(T__11);
				setState(63);
				match(T__8);
				setState(64);
				((ElseIfStmtContext)_localctx).con2 = condition(0);
				setState(65);
				match(T__9);
				setState(66);
				((ElseIfStmtContext)_localctx).p2 = program();
				}
				setState(70); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(68);
						match(T__10);
						setState(69);
						((ElseIfStmtContext)_localctx).p3 = program();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(72); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
<<<<<<< HEAD
				match(T__12);
				setState(75);
				match(T__8);
				setState(76);
				((WhileLoopContext)_localctx).con1 = condition(0);
				setState(77);
				match(T__9);
				setState(78);
				((WhileLoopContext)_localctx).p = program();
=======
				((ForIContext)_localctx).x = match(ID);
				setState(75);
				match(T__2);
				setState(76);
				((ForIContext)_localctx).e1 = expr(0);
				setState(77);
				match(T__12);
				setState(78);
				((ForIContext)_localctx).e2 = expr(0);
				setState(79);
				match(T__7);
				setState(80);
				((ForIContext)_localctx).p = program();
>>>>>>> forI
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
	public static class ArrayVarContext extends ExprContext {
		public Token x;
		public ExprContext e1;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayVarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ConstantContext extends ExprContext {
		public Token c;
		public TerminalNode CONST() { return getToken(implParser.CONST, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IncrementContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncrementContext(ExprContext ctx) { copyFrom(ctx); }
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
<<<<<<< HEAD
			setState(96);
=======
			setState(93);
>>>>>>> forI
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(85);
				((ConstantContext)_localctx).c = match(CONST);
				}
				break;
			case 2:
				{
				_localctx = new MinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				((MinusContext)_localctx).op = match(ADDSUB);
<<<<<<< HEAD
				setState(85);
=======
				setState(87);
>>>>>>> forI
				((MinusContext)_localctx).e = expr(4);
				}
				break;
			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			case 4:
				{
				_localctx = new ArrayVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
<<<<<<< HEAD
				setState(87);
				((ArrayVarContext)_localctx).x = match(ID);
				setState(88);
				match(T__4);
				setState(89);
				((ArrayVarContext)_localctx).e1 = expr(0);
				setState(90);
				match(T__5);
				}
				break;
			case 5:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(T__8);
				setState(93);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(94);
				match(T__9);
=======
				setState(89);
				match(T__6);
				setState(90);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(91);
				match(T__7);
>>>>>>> forI
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
<<<<<<< HEAD
			setState(106);
=======
			setState(105);
>>>>>>> forI
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
<<<<<<< HEAD
					setState(104);
=======
					setState(103);
>>>>>>> forI
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
<<<<<<< HEAD
						setState(98);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(99);
						((MultiplicationContext)_localctx).op = match(MULDEV);
						setState(100);
=======
						setState(95);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(96);
						((MultiplicationContext)_localctx).op = match(MULDEV);
						setState(97);
>>>>>>> forI
						((MultiplicationContext)_localctx).e2 = expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						((AdditionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
<<<<<<< HEAD
						setState(101);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(102);
						((AdditionContext)_localctx).op = match(ADDSUB);
						setState(103);
						((AdditionContext)_localctx).e2 = expr(6);
=======
						setState(98);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(99);
						((AdditionContext)_localctx).op = match(ADDSUB);
						setState(100);
						((AdditionContext)_localctx).e2 = expr(6);
						}
						break;
					case 3:
						{
						_localctx = new IncrementContext(new ExprContext(_parentctx, _parentState));
						((IncrementContext)_localctx).e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(102);
						match(T__13);
>>>>>>> forI
						}
						break;
					}
					} 
				}
<<<<<<< HEAD
				setState(108);
=======
				setState(107);
>>>>>>> forI
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

<<<<<<< HEAD
			setState(110);
			((CompareExpressionsContext)_localctx).e1 = expr(0);
			setState(111);
			((CompareExpressionsContext)_localctx).op = match(COMPARE);
			setState(112);
			((CompareExpressionsContext)_localctx).e2 = expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
=======
			setState(109);
			((CompareExpressionsContext)_localctx).e1 = expr(0);
			setState(110);
			((CompareExpressionsContext)_localctx).op = match(COMPARE);
			setState(111);
			((CompareExpressionsContext)_localctx).e2 = expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
>>>>>>> forI
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
<<<<<<< HEAD
					setState(120);
=======
					setState(119);
>>>>>>> forI
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ConditionContext(_parentctx, _parentState));
						((AndContext)_localctx).con1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
<<<<<<< HEAD
						setState(114);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(115);
						((AndContext)_localctx).op = match(AND);
						setState(116);
=======
						setState(113);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(114);
						((AndContext)_localctx).op = match(AND);
						setState(115);
>>>>>>> forI
						((AndContext)_localctx).con2 = condition(3);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ConditionContext(_parentctx, _parentState));
						((OrContext)_localctx).con1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
<<<<<<< HEAD
						setState(117);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(118);
						((OrContext)_localctx).op = match(OR);
						setState(119);
=======
						setState(116);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(117);
						((OrContext)_localctx).op = match(OR);
						setState(118);
>>>>>>> forI
						((OrContext)_localctx).con2 = condition(2);
						}
						break;
					}
					} 
				}
<<<<<<< HEAD
				setState(124);
=======
				setState(123);
>>>>>>> forI
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
<<<<<<< HEAD
=======
		case 2:
			return precpred(_ctx, 1);
>>>>>>> forI
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
<<<<<<< HEAD
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0080\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\5\3\36\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\6\48\n\4\r\4\16\49\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\6\4I\n\4\r\4\16\4J\3\4\3\4\3\4\3\4\3\4\3\4\5\4S\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5c\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\6\2\4\b\n\7\2\4\6\b\n\2\2\2"+
		"\u008c\2\17\3\2\2\2\4\35\3\2\2\2\6R\3\2\2\2\bb\3\2\2\2\no\3\2\2\2\f\16"+
		"\5\6\4\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3"+
		"\2\2\2\21\17\3\2\2\2\22\23\7\2\2\3\23\3\3\2\2\2\24\36\5\6\4\2\25\31\7"+
		"\3\2\2\26\30\5\6\4\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3"+
		"\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\36\7\4\2\2\35\24\3\2\2\2\35\25\3"+
		"\2\2\2\36\5\3\2\2\2\37 \7\27\2\2 !\7\5\2\2!\"\5\b\5\2\"#\7\6\2\2#S\3\2"+
		"\2\2$%\7\27\2\2%&\7\7\2\2&\'\5\b\5\2\'(\7\b\2\2()\7\5\2\2)*\5\b\5\2*+"+
		"\7\6\2\2+S\3\2\2\2,-\7\t\2\2-.\5\b\5\2./\7\6\2\2/S\3\2\2\2\60\61\7\n\2"+
		"\2\61\62\7\13\2\2\62\63\5\n\6\2\63\64\7\f\2\2\64\67\5\4\3\2\65\66\7\r"+
		"\2\2\668\5\4\3\2\67\65\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:S\3\2\2"+
		"\2;<\7\n\2\2<=\7\13\2\2=>\5\n\6\2>?\7\f\2\2?@\5\4\3\2@A\7\16\2\2AB\7\13"+
		"\2\2BC\5\n\6\2CD\7\f\2\2DE\5\4\3\2EH\3\2\2\2FG\7\r\2\2GI\5\4\3\2HF\3\2"+
		"\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KS\3\2\2\2LM\7\17\2\2MN\7\13\2\2NO\5"+
		"\n\6\2OP\7\f\2\2PQ\5\4\3\2QS\3\2\2\2R\37\3\2\2\2R$\3\2\2\2R,\3\2\2\2R"+
		"\60\3\2\2\2R;\3\2\2\2RL\3\2\2\2S\7\3\2\2\2TU\b\5\1\2Uc\7\22\2\2VW\7\21"+
		"\2\2Wc\5\b\5\6Xc\7\27\2\2YZ\7\27\2\2Z[\7\7\2\2[\\\5\b\5\2\\]\7\b\2\2]"+
		"c\3\2\2\2^_\7\13\2\2_`\5\b\5\2`a\7\f\2\2ac\3\2\2\2bT\3\2\2\2bV\3\2\2\2"+
		"bX\3\2\2\2bY\3\2\2\2b^\3\2\2\2cl\3\2\2\2de\f\b\2\2ef\7\20\2\2fk\5\b\5"+
		"\tgh\f\7\2\2hi\7\21\2\2ik\5\b\5\bjd\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2"+
		"\2\2lm\3\2\2\2m\t\3\2\2\2nl\3\2\2\2op\b\6\1\2pq\5\b\5\2qr\7\23\2\2rs\5"+
		"\b\5\2s|\3\2\2\2tu\f\4\2\2uv\7\25\2\2v{\5\n\6\5wx\f\3\2\2xy\7\26\2\2y"+
		"{\5\n\6\4zt\3\2\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\13\3\2\2"+
		"\2~|\3\2\2\2\r\17\31\359JRbjlz|";
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4\60\n\4\r\4\16\4"+
		"\61\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4A\n\4\r\4\16"+
		"\4B\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4U\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6z\n\6\f\6\16\6}\13\6\3\6\2\4\b\n\7\2\4\6\b\n\2\2\2\u008b"+
		"\2\17\3\2\2\2\4\35\3\2\2\2\6T\3\2\2\2\b_\3\2\2\2\nn\3\2\2\2\f\16\5\6\4"+
		"\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2"+
		"\21\17\3\2\2\2\22\23\7\2\2\3\23\3\3\2\2\2\24\36\5\6\4\2\25\31\7\3\2\2"+
		"\26\30\5\6\4\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2"+
		"\32\34\3\2\2\2\33\31\3\2\2\2\34\36\7\4\2\2\35\24\3\2\2\2\35\25\3\2\2\2"+
		"\36\5\3\2\2\2\37 \7\27\2\2 !\7\5\2\2!\"\5\b\5\2\"#\7\6\2\2#U\3\2\2\2$"+
		"%\7\7\2\2%&\5\b\5\2&\'\7\6\2\2\'U\3\2\2\2()\7\b\2\2)*\7\t\2\2*+\5\n\6"+
		"\2+,\7\n\2\2,/\5\4\3\2-.\7\13\2\2.\60\5\4\3\2/-\3\2\2\2\60\61\3\2\2\2"+
		"\61/\3\2\2\2\61\62\3\2\2\2\62U\3\2\2\2\63\64\7\b\2\2\64\65\7\t\2\2\65"+
		"\66\5\n\6\2\66\67\7\n\2\2\678\5\4\3\289\7\f\2\29:\7\t\2\2:;\5\n\6\2;<"+
		"\7\n\2\2<=\5\4\3\2=@\3\2\2\2>?\7\13\2\2?A\5\4\3\2@>\3\2\2\2AB\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2CU\3\2\2\2DE\7\r\2\2EF\7\t\2\2FG\5\n\6\2GH\7\n\2\2"+
		"HI\5\4\3\2IU\3\2\2\2JK\7\16\2\2KL\7\t\2\2LM\7\27\2\2MN\7\5\2\2NO\5\b\5"+
		"\2OP\7\17\2\2PQ\5\b\5\2QR\7\n\2\2RS\5\4\3\2SU\3\2\2\2T\37\3\2\2\2T$\3"+
		"\2\2\2T(\3\2\2\2T\63\3\2\2\2TD\3\2\2\2TJ\3\2\2\2U\7\3\2\2\2VW\b\5\1\2"+
		"W`\7\23\2\2XY\7\22\2\2Y`\5\b\5\6Z`\7\27\2\2[\\\7\t\2\2\\]\5\b\5\2]^\7"+
		"\n\2\2^`\3\2\2\2_V\3\2\2\2_X\3\2\2\2_Z\3\2\2\2_[\3\2\2\2`k\3\2\2\2ab\f"+
		"\b\2\2bc\7\21\2\2cj\5\b\5\tde\f\7\2\2ef\7\22\2\2fj\5\b\5\bgh\f\3\2\2h"+
		"j\7\20\2\2ia\3\2\2\2id\3\2\2\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2"+
		"l\t\3\2\2\2mk\3\2\2\2no\b\6\1\2op\5\b\5\2pq\7\24\2\2qr\5\b\5\2r{\3\2\2"+
		"\2st\f\4\2\2tu\7\25\2\2uz\5\n\6\5vw\f\3\2\2wx\7\26\2\2xz\5\n\6\4ys\3\2"+
		"\2\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\13\3\2\2\2}{\3\2\2\2\r\17"+
		"\31\35\61BT_iky{";
>>>>>>> forI
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}