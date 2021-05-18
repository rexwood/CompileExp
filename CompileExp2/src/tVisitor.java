// Generated from t.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(@NotNull tParser.BContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link tParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull tParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link tParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull tParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link tParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull tParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link tParser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL(@NotNull tParser.LContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link tParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull tParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RtLt}
	 * labeled alternative in {@link tParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRtLt(@NotNull tParser.RtLtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bp}
	 * labeled alternative in {@link tParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBp(@NotNull tParser.BpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleF}
	 * labeled alternative in {@link tParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleF(@NotNull tParser.SingleFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int16}
	 * labeled alternative in {@link tParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt16(@NotNull tParser.Int16Context ctx);
	/**
	 * Visit a parse tree produced by {@link tParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(@NotNull tParser.PContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link tParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(@NotNull tParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if2}
	 * labeled alternative in {@link tParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf2(@NotNull tParser.If2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code if1}
	 * labeled alternative in {@link tParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf1(@NotNull tParser.If1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code int10}
	 * labeled alternative in {@link tParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt10(@NotNull tParser.Int10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code int8}
	 * labeled alternative in {@link tParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt8(@NotNull tParser.Int8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link tParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull tParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleT}
	 * labeled alternative in {@link tParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleT(@NotNull tParser.SingleTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link tParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull tParser.AssignContext ctx);
}