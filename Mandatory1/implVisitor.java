// Generated from impl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link implParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface implVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(implParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleCommand}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCommand(implParser.SingleCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultipleCommands}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleCommands(implParser.MultipleCommandsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(implParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Output}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(implParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(implParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(implParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(implParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(implParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(implParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(implParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(implParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(implParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(implParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(implParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(implParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(implParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(implParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(implParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpressions}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpressions(implParser.CompareExpressionsContext ctx);
}