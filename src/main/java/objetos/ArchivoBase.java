package objetos;

public abstract  class ArchivoBase implements InterfazBase{
    String nombre;

    public ArchivoBase(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    public abstract int getTamaño();
    public abstract void mostrarInformacion();

}
