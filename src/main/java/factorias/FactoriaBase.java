package factorias;

import objetos.ArchivoBase;

public abstract class FactoriaBase {
    public abstract ArchivoBase crearArchivo(String nombre, int tamano, ArchivoBase base);

}
