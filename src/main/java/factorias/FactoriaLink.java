package factorias;

import objetos.ArchivoBase;
import objetos.Link;

public class FactoriaLink extends FactoriaBase{

    @Override
    public ArchivoBase crearArchivo(String nombre, int tamano, ArchivoBase base) {
        return new Link(nombre,base);
    }
}