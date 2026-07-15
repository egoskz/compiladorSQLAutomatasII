import os


class Archivo:

    def __init__(self, ruta):
        self.ruta = ruta

    def existe(self):
        return os.path.exists(self.ruta)

    def es_el_tipo_correcto(self):
        extension = os.path.splitext(self.ruta)[1]

        return extension.lower() == ".sql"

    def leer(self):

        try:
            with open(self.ruta, "r", encoding="utf-8") as archivo:
                return archivo.read()

        except Exception as e:
            print("Error al leer el archivo:", e)
            return ""

    def imprimir_info(self):

        nombre = os.path.basename(self.ruta)
        tamaño = os.path.getsize(self.ruta)

        print("\nINFORMACIÓN DEL ARCHIVO")
        print("-" * 40)
        print("Nombre:", nombre)
        print("Ruta:", self.ruta)