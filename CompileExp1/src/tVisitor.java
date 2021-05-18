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
	 * Visit a parse tree produced by the {@code op}
	 * labeled alternative in {@link tParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(@NotNull tParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reserved}
	 * labeled alternative in {@link tParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserved(@NotNull tParser.ReservedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real}
	 * labeled alternative in {@link tParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(@NotNull tParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link tParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull tParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link tParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull tParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link tParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull tParser.IntContext ctx);
}