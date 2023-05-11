package objetos;

public class Fichero extends ArchivoBase{
    private int tamaño;

    public Fichero(String nombre,int tamaño) {
        super(nombre);
        this.tamaño = tamaño;
    }

    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }

    @Override
    public int getTamaño() {
        return this.tamaño;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Fichero con nombre: "+ this.nombre+"         Tamaño: "+this.tamaño);
    }
}
