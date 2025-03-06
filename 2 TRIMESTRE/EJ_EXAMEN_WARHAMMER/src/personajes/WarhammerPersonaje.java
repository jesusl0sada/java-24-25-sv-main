package personajes;

import armas.ArmaAtaque;
import interfaces.ICombate;

public abstract class WarhammerPersonaje implements ICombate {
    // ATRIBUTOS
    protected String nombre;
    protected int energia;
    //protected HashMap<String, Arma>armas; // DA ERROR PORQUE FALTA LA CLASE ARMA.
    protected static int contPersonajes;
    protected static final int ENERGIA_MAX = 200; // -> si es final tiene que tener un valor cargado por defecto.

    // CONSTRUCTOR

    // 1) Constructor con nombre

    public WarhammerPersonaje(String nombre) {
        this.nombre = nombre;
    }


    // MÉTODOS

    public void SumarEnergia(){

    }

    public static void toNumPersonajes(){ // Tiene que ser estática, existirá aunque no haya ningun main, lo llamaremos con el nombre de la clase directamente, no depende del New.
        System.out.println();
        // SOUT O Return int??
    }

    public String imprimirArmas(){
        return ""; // LE PONDREMOS LUEGO QUE NOS DEVUELVA LAS ARMAS CUANDO LO TENGAMOS PROGRAMADO
    }

    // MÉTODOS DE LA INTERFACE


    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador) {

    }

    @Override
    public void defender(ArmaAtaque arma) {

    }

    // TO STRING
    @Override
    public String toString() {
        return "WarhammerPersonaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                '}';
    }
}
