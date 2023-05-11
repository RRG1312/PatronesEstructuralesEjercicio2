package factorias;

import objetos.ArchivoBase;
import objetos.Fichero;

public class FactoriaFichero extends FactoriaBase{
    @Override
    public ArchivoBase crearArchivo(String nombre, int tamano, ArchivoBase base) {
        return new Fichero(nombre,tamano);
    }
}