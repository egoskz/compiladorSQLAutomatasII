import streamlit as st

from analizador_lexico import AnalizadorLexico

st.set_page_config(page_title="Compilador SQL")

st.title("Compilador SQL")
st.write("Analizador Léxico con ANTLR")

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

    errores = analizador.obtener_errores()

    if len(errores) == 0:
        st.success("No hay errores léxicos")

    else:

        st.table([
            {
                "Línea": e[0],
                "Columna": e[1],
                "Mensaje": e[2]
            }
            for e in errores
        ])