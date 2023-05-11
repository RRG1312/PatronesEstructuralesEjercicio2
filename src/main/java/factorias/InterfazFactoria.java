package factorias;

import objetos.ArchivoBase;

public interface InterfazFactoria{
    ArchivoBase crearArchivo(String nombre, int tamano, ArchivoBase base);
}
