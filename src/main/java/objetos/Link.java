package objetos;

public class Link extends ArchivoBase{
    private ArchivoBase archivoConectado;

    public Link(String nombre,ArchivoBase archivoConectado) {
        super(nombre);
        this.archivoConectado = archivoConectado;
    }

    @Override
    public int getTamaño() {
        return archivoConectado.getTamaño();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Link con nombre "+this.nombre+
                ", Nombre de archivo conectado "+this.archivoConectado.getNombre()+
                "        Tamaño: "+this.getTamaño());
    }
}
