package factorias;

import objetos.ArchivoBase;
import objetos.Fichero;

public abstract class FactoriaBase implements InterfazFactoria{
    String nombre;
    int tamano;
    ArchivoBase base;
}
