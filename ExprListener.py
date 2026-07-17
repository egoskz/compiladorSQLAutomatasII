# Generated from Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#inicio.
    def enterInicio(self, ctx:ExprParser.InicioContext):
        pass

    # Exit a parse tree produced by ExprParser#inicio.
    def exitInicio(self, ctx:ExprParser.InicioContext):
        pass


    # Enter a parse tree produced by ExprParser#sentencia.
    def enterSentencia(self, ctx:ExprParser.SentenciaContext):
        pass

    # Exit a parse tree produced by ExprParser#sentencia.
    def exitSentencia(self, ctx:ExprParser.SentenciaContext):
        pass


    # Enter a parse tree produced by ExprParser#crearBaseDatos.
    def enterCrearBaseDatos(self, ctx:ExprParser.CrearBaseDatosContext):
        pass

    # Exit a parse tree produced by ExprParser#crearBaseDatos.
    def exitCrearBaseDatos(self, ctx:ExprParser.CrearBaseDatosContext):
        pass


    # Enter a parse tree produced by ExprParser#crearLogin.
    def enterCrearLogin(self, ctx:ExprParser.CrearLoginContext):
        pass

    # Exit a parse tree produced by ExprParser#crearLogin.
    def exitCrearLogin(self, ctx:ExprParser.CrearLoginContext):
        pass


    # Enter a parse tree produced by ExprParser#usarBaseDatos.
    def enterUsarBaseDatos(self, ctx:ExprParser.UsarBaseDatosContext):
        pass

    # Exit a parse tree produced by ExprParser#usarBaseDatos.
    def exitUsarBaseDatos(self, ctx:ExprParser.UsarBaseDatosContext):
        pass


    # Enter a parse tree produced by ExprParser#eliminarTabla.
    def enterEliminarTabla(self, ctx:ExprParser.EliminarTablaContext):
        pass

    # Exit a parse tree produced by ExprParser#eliminarTabla.
    def exitEliminarTabla(self, ctx:ExprParser.EliminarTablaContext):
        pass


    # Enter a parse tree produced by ExprParser#crearTabla.
    def enterCrearTabla(self, ctx:ExprParser.CrearTablaContext):
        pass

    # Exit a parse tree produced by ExprParser#crearTabla.
    def exitCrearTabla(self, ctx:ExprParser.CrearTablaContext):
        pass


    # Enter a parse tree produced by ExprParser#elementoTabla.
    def enterElementoTabla(self, ctx:ExprParser.ElementoTablaContext):
        pass

    # Exit a parse tree produced by ExprParser#elementoTabla.
    def exitElementoTabla(self, ctx:ExprParser.ElementoTablaContext):
        pass


    # Enter a parse tree produced by ExprParser#columna.
    def enterColumna(self, ctx:ExprParser.ColumnaContext):
        pass

    # Exit a parse tree produced by ExprParser#columna.
    def exitColumna(self, ctx:ExprParser.ColumnaContext):
        pass


    # Enter a parse tree produced by ExprParser#modificadorColumna.
    def enterModificadorColumna(self, ctx:ExprParser.ModificadorColumnaContext):
        pass

    # Exit a parse tree produced by ExprParser#modificadorColumna.
    def exitModificadorColumna(self, ctx:ExprParser.ModificadorColumnaContext):
        pass


    # Enter a parse tree produced by ExprParser#accionReferencia.
    def enterAccionReferencia(self, ctx:ExprParser.AccionReferenciaContext):
        pass

    # Exit a parse tree produced by ExprParser#accionReferencia.
    def exitAccionReferencia(self, ctx:ExprParser.AccionReferenciaContext):
        pass


    # Enter a parse tree produced by ExprParser#alterarTabla.
    def enterAlterarTabla(self, ctx:ExprParser.AlterarTablaContext):
        pass

    # Exit a parse tree produced by ExprParser#alterarTabla.
    def exitAlterarTabla(self, ctx:ExprParser.AlterarTablaContext):
        pass


    # Enter a parse tree produced by ExprParser#crearIndice.
    def enterCrearIndice(self, ctx:ExprParser.CrearIndiceContext):
        pass

    # Exit a parse tree produced by ExprParser#crearIndice.
    def exitCrearIndice(self, ctx:ExprParser.CrearIndiceContext):
        pass


    # Enter a parse tree produced by ExprParser#crearVista.
    def enterCrearVista(self, ctx:ExprParser.CrearVistaContext):
        pass

    # Exit a parse tree produced by ExprParser#crearVista.
    def exitCrearVista(self, ctx:ExprParser.CrearVistaContext):
        pass


    # Enter a parse tree produced by ExprParser#tipoDato.
    def enterTipoDato(self, ctx:ExprParser.TipoDatoContext):
        pass

    # Exit a parse tree produced by ExprParser#tipoDato.
    def exitTipoDato(self, ctx:ExprParser.TipoDatoContext):
        pass


    # Enter a parse tree produced by ExprParser#restricciones.
    def enterRestricciones(self, ctx:ExprParser.RestriccionesContext):
        pass

    # Exit a parse tree produced by ExprParser#restricciones.
    def exitRestricciones(self, ctx:ExprParser.RestriccionesContext):
        pass


    # Enter a parse tree produced by ExprParser#insertar.
    def enterInsertar(self, ctx:ExprParser.InsertarContext):
        pass

    # Exit a parse tree produced by ExprParser#insertar.
    def exitInsertar(self, ctx:ExprParser.InsertarContext):
        pass


    # Enter a parse tree produced by ExprParser#bloqueValores.
    def enterBloqueValores(self, ctx:ExprParser.BloqueValoresContext):
        pass

    # Exit a parse tree produced by ExprParser#bloqueValores.
    def exitBloqueValores(self, ctx:ExprParser.BloqueValoresContext):
        pass


    # Enter a parse tree produced by ExprParser#listaColumnas.
    def enterListaColumnas(self, ctx:ExprParser.ListaColumnasContext):
        pass

    # Exit a parse tree produced by ExprParser#listaColumnas.
    def exitListaColumnas(self, ctx:ExprParser.ListaColumnasContext):
        pass


    # Enter a parse tree produced by ExprParser#listaValores.
    def enterListaValores(self, ctx:ExprParser.ListaValoresContext):
        pass

    # Exit a parse tree produced by ExprParser#listaValores.
    def exitListaValores(self, ctx:ExprParser.ListaValoresContext):
        pass


    # Enter a parse tree produced by ExprParser#seleccionar.
    def enterSeleccionar(self, ctx:ExprParser.SeleccionarContext):
        pass

    # Exit a parse tree produced by ExprParser#seleccionar.
    def exitSeleccionar(self, ctx:ExprParser.SeleccionarContext):
        pass


    # Enter a parse tree produced by ExprParser#seleccionarSinPuntoYComa.
    def enterSeleccionarSinPuntoYComa(self, ctx:ExprParser.SeleccionarSinPuntoYComaContext):
        pass

    # Exit a parse tree produced by ExprParser#seleccionarSinPuntoYComa.
    def exitSeleccionarSinPuntoYComa(self, ctx:ExprParser.SeleccionarSinPuntoYComaContext):
        pass


    # Enter a parse tree produced by ExprParser#listaSeleccion.
    def enterListaSeleccion(self, ctx:ExprParser.ListaSeleccionContext):
        pass

    # Exit a parse tree produced by ExprParser#listaSeleccion.
    def exitListaSeleccion(self, ctx:ExprParser.ListaSeleccionContext):
        pass


    # Enter a parse tree produced by ExprParser#tablaOrigen.
    def enterTablaOrigen(self, ctx:ExprParser.TablaOrigenContext):
        pass

    # Exit a parse tree produced by ExprParser#tablaOrigen.
    def exitTablaOrigen(self, ctx:ExprParser.TablaOrigenContext):
        pass


    # Enter a parse tree produced by ExprParser#joinClause.
    def enterJoinClause(self, ctx:ExprParser.JoinClauseContext):
        pass

    # Exit a parse tree produced by ExprParser#joinClause.
    def exitJoinClause(self, ctx:ExprParser.JoinClauseContext):
        pass


    # Enter a parse tree produced by ExprParser#condicionJoin.
    def enterCondicionJoin(self, ctx:ExprParser.CondicionJoinContext):
        pass

    # Exit a parse tree produced by ExprParser#condicionJoin.
    def exitCondicionJoin(self, ctx:ExprParser.CondicionJoinContext):
        pass


    # Enter a parse tree produced by ExprParser#listaOrden.
    def enterListaOrden(self, ctx:ExprParser.ListaOrdenContext):
        pass

    # Exit a parse tree produced by ExprParser#listaOrden.
    def exitListaOrden(self, ctx:ExprParser.ListaOrdenContext):
        pass


    # Enter a parse tree produced by ExprParser#ordenColumna.
    def enterOrdenColumna(self, ctx:ExprParser.OrdenColumnaContext):
        pass

    # Exit a parse tree produced by ExprParser#ordenColumna.
    def exitOrdenColumna(self, ctx:ExprParser.OrdenColumnaContext):
        pass


    # Enter a parse tree produced by ExprParser#direccionOrden.
    def enterDireccionOrden(self, ctx:ExprParser.DireccionOrdenContext):
        pass

    # Exit a parse tree produced by ExprParser#direccionOrden.
    def exitDireccionOrden(self, ctx:ExprParser.DireccionOrdenContext):
        pass


    # Enter a parse tree produced by ExprParser#expresionSelect.
    def enterExpresionSelect(self, ctx:ExprParser.ExpresionSelectContext):
        pass

    # Exit a parse tree produced by ExprParser#expresionSelect.
    def exitExpresionSelect(self, ctx:ExprParser.ExpresionSelectContext):
        pass


    # Enter a parse tree produced by ExprParser#alias.
    def enterAlias(self, ctx:ExprParser.AliasContext):
        pass

    # Exit a parse tree produced by ExprParser#alias.
    def exitAlias(self, ctx:ExprParser.AliasContext):
        pass


    # Enter a parse tree produced by ExprParser#actualizar.
    def enterActualizar(self, ctx:ExprParser.ActualizarContext):
        pass

    # Exit a parse tree produced by ExprParser#actualizar.
    def exitActualizar(self, ctx:ExprParser.ActualizarContext):
        pass


    # Enter a parse tree produced by ExprParser#asignacion.
    def enterAsignacion(self, ctx:ExprParser.AsignacionContext):
        pass

    # Exit a parse tree produced by ExprParser#asignacion.
    def exitAsignacion(self, ctx:ExprParser.AsignacionContext):
        pass


    # Enter a parse tree produced by ExprParser#eliminar.
    def enterEliminar(self, ctx:ExprParser.EliminarContext):
        pass

    # Exit a parse tree produced by ExprParser#eliminar.
    def exitEliminar(self, ctx:ExprParser.EliminarContext):
        pass


    # Enter a parse tree produced by ExprParser#procedimiento.
    def enterProcedimiento(self, ctx:ExprParser.ProcedimientoContext):
        pass

    # Exit a parse tree produced by ExprParser#procedimiento.
    def exitProcedimiento(self, ctx:ExprParser.ProcedimientoContext):
        pass


    # Enter a parse tree produced by ExprParser#parametros.
    def enterParametros(self, ctx:ExprParser.ParametrosContext):
        pass

    # Exit a parse tree produced by ExprParser#parametros.
    def exitParametros(self, ctx:ExprParser.ParametrosContext):
        pass


    # Enter a parse tree produced by ExprParser#parametro.
    def enterParametro(self, ctx:ExprParser.ParametroContext):
        pass

    # Exit a parse tree produced by ExprParser#parametro.
    def exitParametro(self, ctx:ExprParser.ParametroContext):
        pass


    # Enter a parse tree produced by ExprParser#sentenciaProcedimiento.
    def enterSentenciaProcedimiento(self, ctx:ExprParser.SentenciaProcedimientoContext):
        pass

    # Exit a parse tree produced by ExprParser#sentenciaProcedimiento.
    def exitSentenciaProcedimiento(self, ctx:ExprParser.SentenciaProcedimientoContext):
        pass


    # Enter a parse tree produced by ExprParser#asignacionVariable.
    def enterAsignacionVariable(self, ctx:ExprParser.AsignacionVariableContext):
        pass

    # Exit a parse tree produced by ExprParser#asignacionVariable.
    def exitAsignacionVariable(self, ctx:ExprParser.AsignacionVariableContext):
        pass


    # Enter a parse tree produced by ExprParser#llamadaProcedimiento.
    def enterLlamadaProcedimiento(self, ctx:ExprParser.LlamadaProcedimientoContext):
        pass

    # Exit a parse tree produced by ExprParser#llamadaProcedimiento.
    def exitLlamadaProcedimiento(self, ctx:ExprParser.LlamadaProcedimientoContext):
        pass


    # Enter a parse tree produced by ExprParser#argumentos.
    def enterArgumentos(self, ctx:ExprParser.ArgumentosContext):
        pass

    # Exit a parse tree produced by ExprParser#argumentos.
    def exitArgumentos(self, ctx:ExprParser.ArgumentosContext):
        pass


    # Enter a parse tree produced by ExprParser#condicion.
    def enterCondicion(self, ctx:ExprParser.CondicionContext):
        pass

    # Exit a parse tree produced by ExprParser#condicion.
    def exitCondicion(self, ctx:ExprParser.CondicionContext):
        pass


    # Enter a parse tree produced by ExprParser#comparacion.
    def enterComparacion(self, ctx:ExprParser.ComparacionContext):
        pass

    # Exit a parse tree produced by ExprParser#comparacion.
    def exitComparacion(self, ctx:ExprParser.ComparacionContext):
        pass


    # Enter a parse tree produced by ExprParser#operador.
    def enterOperador(self, ctx:ExprParser.OperadorContext):
        pass

    # Exit a parse tree produced by ExprParser#operador.
    def exitOperador(self, ctx:ExprParser.OperadorContext):
        pass


    # Enter a parse tree produced by ExprParser#valor.
    def enterValor(self, ctx:ExprParser.ValorContext):
        pass

    # Exit a parse tree produced by ExprParser#valor.
    def exitValor(self, ctx:ExprParser.ValorContext):
        pass


    # Enter a parse tree produced by ExprParser#expresion.
    def enterExpresion(self, ctx:ExprParser.ExpresionContext):
        pass

    # Exit a parse tree produced by ExprParser#expresion.
    def exitExpresion(self, ctx:ExprParser.ExpresionContext):
        pass


    # Enter a parse tree produced by ExprParser#referencia.
    def enterReferencia(self, ctx:ExprParser.ReferenciaContext):
        pass

    # Exit a parse tree produced by ExprParser#referencia.
    def exitReferencia(self, ctx:ExprParser.ReferenciaContext):
        pass


    # Enter a parse tree produced by ExprParser#literal.
    def enterLiteral(self, ctx:ExprParser.LiteralContext):
        pass

    # Exit a parse tree produced by ExprParser#literal.
    def exitLiteral(self, ctx:ExprParser.LiteralContext):
        pass


    # Enter a parse tree produced by ExprParser#expresionAritmetica.
    def enterExpresionAritmetica(self, ctx:ExprParser.ExpresionAritmeticaContext):
        pass

    # Exit a parse tree produced by ExprParser#expresionAritmetica.
    def exitExpresionAritmetica(self, ctx:ExprParser.ExpresionAritmeticaContext):
        pass


    # Enter a parse tree produced by ExprParser#termino.
    def enterTermino(self, ctx:ExprParser.TerminoContext):
        pass

    # Exit a parse tree produced by ExprParser#termino.
    def exitTermino(self, ctx:ExprParser.TerminoContext):
        pass


    # Enter a parse tree produced by ExprParser#factor.
    def enterFactor(self, ctx:ExprParser.FactorContext):
        pass

    # Exit a parse tree produced by ExprParser#factor.
    def exitFactor(self, ctx:ExprParser.FactorContext):
        pass


    # Enter a parse tree produced by ExprParser#funcionSQL.
    def enterFuncionSQL(self, ctx:ExprParser.FuncionSQLContext):
        pass

    # Exit a parse tree produced by ExprParser#funcionSQL.
    def exitFuncionSQL(self, ctx:ExprParser.FuncionSQLContext):
        pass


    # Enter a parse tree produced by ExprParser#listaExpresiones.
    def enterListaExpresiones(self, ctx:ExprParser.ListaExpresionesContext):
        pass

    # Exit a parse tree produced by ExprParser#listaExpresiones.
    def exitListaExpresiones(self, ctx:ExprParser.ListaExpresionesContext):
        pass


    # Enter a parse tree produced by ExprParser#trigger.
    def enterTrigger(self, ctx:ExprParser.TriggerContext):
        pass

    # Exit a parse tree produced by ExprParser#trigger.
    def exitTrigger(self, ctx:ExprParser.TriggerContext):
        pass


    # Enter a parse tree produced by ExprParser#tiempoTrigger.
    def enterTiempoTrigger(self, ctx:ExprParser.TiempoTriggerContext):
        pass

    # Exit a parse tree produced by ExprParser#tiempoTrigger.
    def exitTiempoTrigger(self, ctx:ExprParser.TiempoTriggerContext):
        pass


    # Enter a parse tree produced by ExprParser#eventoTrigger.
    def enterEventoTrigger(self, ctx:ExprParser.EventoTriggerContext):
        pass

    # Exit a parse tree produced by ExprParser#eventoTrigger.
    def exitEventoTrigger(self, ctx:ExprParser.EventoTriggerContext):
        pass


    # Enter a parse tree produced by ExprParser#accionTrigger.
    def enterAccionTrigger(self, ctx:ExprParser.AccionTriggerContext):
        pass

    # Exit a parse tree produced by ExprParser#accionTrigger.
    def exitAccionTrigger(self, ctx:ExprParser.AccionTriggerContext):
        pass


    # Enter a parse tree produced by ExprParser#asignacionTrigger.
    def enterAsignacionTrigger(self, ctx:ExprParser.AsignacionTriggerContext):
        pass

    # Exit a parse tree produced by ExprParser#asignacionTrigger.
    def exitAsignacionTrigger(self, ctx:ExprParser.AsignacionTriggerContext):
        pass


    # Enter a parse tree produced by ExprParser#referenciaTrigger.
    def enterReferenciaTrigger(self, ctx:ExprParser.ReferenciaTriggerContext):
        pass

    # Exit a parse tree produced by ExprParser#referenciaTrigger.
    def exitReferenciaTrigger(self, ctx:ExprParser.ReferenciaTriggerContext):
        pass


    # Enter a parse tree produced by ExprParser#transaccion.
    def enterTransaccion(self, ctx:ExprParser.TransaccionContext):
        pass

    # Exit a parse tree produced by ExprParser#transaccion.
    def exitTransaccion(self, ctx:ExprParser.TransaccionContext):
        pass


    # Enter a parse tree produced by ExprParser#commitStmt.
    def enterCommitStmt(self, ctx:ExprParser.CommitStmtContext):
        pass

    # Exit a parse tree produced by ExprParser#commitStmt.
    def exitCommitStmt(self, ctx:ExprParser.CommitStmtContext):
        pass


    # Enter a parse tree produced by ExprParser#rollbackStmt.
    def enterRollbackStmt(self, ctx:ExprParser.RollbackStmtContext):
        pass

    # Exit a parse tree produced by ExprParser#rollbackStmt.
    def exitRollbackStmt(self, ctx:ExprParser.RollbackStmtContext):
        pass



del ExprParser