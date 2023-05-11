package cliente;

import factorias.FactoriaBase;
import factorias.FactoriaDirectorio;
import factorias.FactoriaFichero;
import factorias.FactoriaLink;
import objetos.ArchivoBase;
import objetos.Directorio;
import objetos.Fichero;
import objetos.Link;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private static FactoriaBase factoriaD;
    private static FactoriaBase factoriaL;
    private static FactoriaBase factoriaF;


    private static List<ArchivoBase> lista;
    public static void menu(){
        configurar();

        rellenarLista();

        mostrarElementos();
    }

    public static void configurar(){
        factoriaD = new FactoriaDirectorio();
        factoriaL = new FactoriaLink();
        factoriaF = new FactoriaFichero();

        lista = new ArrayList<>();
    }

    public static void rellenarLista(){
        Fichero f1 = (Fichero)factoriaF.crearArchivo("fichero1",420,null);
        lista.add(f1);
        Fichero f2 = (Fichero) factoriaF.crearArchivo("fichero 2",840,null);
        lista.add(f2);
        lista.add(factoriaF.crearArchivo("fichero 3",510,null));
        lista.add(factoriaF.crearArchivo("fichero 4",1200,null));

        Link l1 = (Link) factoriaL.crearArchivo("Link 1",0,f1);
        lista.add(l1);
        lista.add(factoriaL.crearArchivo("Link 2",0,f2));

        Directorio d1 = (Directorio) factoriaD.crearArchivo("Directorio 1",0,null);
        d1.añadirArchivo(f1);
        d1.añadirArchivo(f2);
        d1.añadirArchivo(l1);
        lista.add(d1);

        Directorio d2 = (Directorio) factoriaD.crearArchivo("Directorio 2",0,null);
        d2.añadirArchivo(d1);
        d2.añadirArchivo(factoriaF.crearArchivo("fichero5",450,null));
        lista.add(d2);
    }


    public static void mostrarElementos(){
        for (ArchivoBase b:lista) {
            b.mostrarInformacion();
        }
    }


}
