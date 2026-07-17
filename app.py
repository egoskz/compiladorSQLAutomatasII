import streamlit as st

from analizador_lexico import AnalizadorLexico
from helper_sintactico import HelperSintactico


st.set_page_config(page_title="Compilador SQL")

st.title("Compilador SQL")
st.write("Analizador Léxico y Sintáctico con ANTLR")


archivo = st.file_uploader(
    "Selecciona un archivo SQL",
    type=["sql"]
)


if archivo is not None:

    codigo = archivo.read().decode("utf-8")


    st.subheader("Código SQL")

    st.code(codigo, language="sql")


    analizador = AnalizadorLexico()

    analizador.analizar(codigo)


    st.subheader("Tokens")

    st.table(analizador.obtener_tokens())


    st.subheader("Errores Léxicos")


    errores_lexicos = analizador.obtener_errores()


    if len(errores_lexicos) == 0:

        st.success("No hay errores léxicos")


    else:

        st.table([
            {
                "Línea": e["Línea"],
                "Columna": e["Columna"],
                "Lexema": e["Lexema"],
                "Mensaje": e["Mensaje"]
            }
            for e in errores_lexicos
        ])


    st.subheader("Análisis Sintáctico")


    if len(errores_lexicos) > 0:

        st.error("No reconocible por errores léxicos")

        st.table([
            {
                "Mensaje":
                "No se realizó análisis sintáctico debido a errores léxicos"
            }
        ])


    else:

        helper = HelperSintactico()

        correcto, mensaje, errores_sintacticos = helper.analizar(codigo)


        if correcto:

            st.success(mensaje)

        else:

            st.error(mensaje)

            st.table(errores_sintacticos)