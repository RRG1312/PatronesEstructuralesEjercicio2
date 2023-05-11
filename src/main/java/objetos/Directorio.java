package objetos;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends ArchivoBase{
    private List<ArchivoBase> lista;

    public Directorio(String nombre) {
        super(nombre);
        lista = new ArrayList<>();
    }

    public void añadirArchivo(ArchivoBase b){
        this.lista.add(b);
    }

    @Override
    public int getTamaño() {
        int res=0;
        for (ArchivoBase base:this.lista) {
            res+=base.getTamaño();
        }
        return res;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nDirectorio con nombre "+this.nombre+" contiene:");
        for (ArchivoBase b:this.lista) {
            b.mostrarInformacion();
        }
        System.out.println("Tamaño total del directorio: "+this.getTamaño());
        System.out.println();
    }
}
