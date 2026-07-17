// Generated from c:/Users/HP/Downloads/comp/compiladorSQLAutomatasII/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(ExprParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(ExprParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(ExprParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(ExprParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#crearBaseDatos}.
	 * @param ctx the parse tree
	 */
	void enterCrearBaseDatos(ExprParser.CrearBaseDatosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#crearBaseDatos}.
	 * @param ctx the parse tree
	 */
	void exitCrearBaseDatos(ExprParser.CrearBaseDatosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#crearLogin}.
	 * @param ctx the parse tree
	 */
	void enterCrearLogin(ExprParser.CrearLoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#crearLogin}.
	 * @param ctx the parse tree
	 */
	void exitCrearLogin(ExprParser.CrearLoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#usarBaseDatos}.
	 * @param ctx the parse tree
	 */
	void enterUsarBaseDatos(ExprParser.UsarBaseDatosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#usarBaseDatos}.
	 * @param ctx the parse tree
	 */
	void exitUsarBaseDatos(ExprParser.UsarBaseDatosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#eliminarTabla}.
	 * @param ctx the parse tree
	 */
	void enterEliminarTabla(ExprParser.EliminarTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#eliminarTabla}.
	 * @param ctx the parse tree
	 */
	void exitEliminarTabla(ExprParser.EliminarTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#crearTabla}.
	 * @param ctx the parse tree
	 */
	void enterCrearTabla(ExprParser.CrearTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#crearTabla}.
	 * @param ctx the parse tree
	 */
	void exitCrearTabla(ExprParser.CrearTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumna(ExprParser.ColumnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumna(ExprParser.ColumnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void enterTipoDato(ExprParser.TipoDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void exitTipoDato(ExprParser.TipoDatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#restricciones}.
	 * @param ctx the parse tree
	 */
	void enterRestricciones(ExprParser.RestriccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#restricciones}.
	 * @param ctx the parse tree
	 */
	void exitRestricciones(ExprParser.RestriccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#insertar}.
	 * @param ctx the parse tree
	 */
	void enterInsertar(ExprParser.InsertarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#insertar}.
	 * @param ctx the parse tree
	 */
	void exitInsertar(ExprParser.InsertarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#listaColumnas}.
	 * @param ctx the parse tree
	 */
	void enterListaColumnas(ExprParser.ListaColumnasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#listaColumnas}.
	 * @param ctx the parse tree
	 */
	void exitListaColumnas(ExprParser.ListaColumnasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#listaValores}.
	 * @param ctx the parse tree
	 */
	void enterListaValores(ExprParser.ListaValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#listaValores}.
	 * @param ctx the parse tree
	 */
	void exitListaValores(ExprParser.ListaValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#seleccionar}.
	 * @param ctx the parse tree
	 */
	void enterSeleccionar(ExprParser.SeleccionarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#seleccionar}.
	 * @param ctx the parse tree
	 */
	void exitSeleccionar(ExprParser.SeleccionarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#columnas}.
	 * @param ctx the parse tree
	 */
	void enterColumnas(ExprParser.ColumnasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#columnas}.
	 * @param ctx the parse tree
	 */
	void exitColumnas(ExprParser.ColumnasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#actualizar}.
	 * @param ctx the parse tree
	 */
	void enterActualizar(ExprParser.ActualizarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#actualizar}.
	 * @param ctx the parse tree
	 */
	void exitActualizar(ExprParser.ActualizarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(ExprParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(ExprParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#eliminar}.
	 * @param ctx the parse tree
	 */
	void enterEliminar(ExprParser.EliminarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#eliminar}.
	 * @param ctx the parse tree
	 */
	void exitEliminar(ExprParser.EliminarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(ExprParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(ExprParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(ExprParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(ExprParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(ExprParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(ExprParser.ValorContext ctx);
}