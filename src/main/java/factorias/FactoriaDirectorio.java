package factorias;

import objetos.ArchivoBase;
import objetos.Directorio;

public class FactoriaDirectorio extends FactoriaBase{
    @Override
    public ArchivoBase crearArchivo(String nombre, int tamano, ArchivoBase base) {
        return new Directorio(nombre);
    }
}
