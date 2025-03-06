package PERSONAJES;

import ARMAS.Arma;
import INTERFACES.ICombate;

import java.util.HashMap;

public abstract class WarhammerPersonaje implements ICombate { // VA A SER CLASE ABSTRACTA PUES VA A SER PADRE, VAN A HEREDAR DE ESTA.

    // ATRIBUTOS
protected String nombre;
public int energia;
protected static int contPersonajes = 0;
protected final int ENERGIA_MAX = 100;

// HASHMAP + INICIALIZAR
    protected HashMap<String, Arma>lista_armas = new HashMap<>(); // CREAMOS UN HASMAP EN EL QUE GUARDAREMOS LAS ARMAS

    // CONSTRUCTOR

    public WarhammerPersonaje(String nombre) {
        this.nombre = nombre;
    }

    // MÉTODOS

    public void sumarEnergia(){
    int energia_total = 0;
    int energia_inicial = 0;
    energia_total = ENERGIA_MAX + energia_inicial;
    }

    public static int toNumPersonajes(){
     return contPersonajes;
    }

    public String imprimirArmas(){ // RECORRER EL HASHMAP DE ARMAS -> AÑADES ARMAS DESDE EL MÉTODO ARMAS AL HASHMAP, RECORRES EL HASHMAP, E IMPRIMES CON TO STRING DE LA CLASE ARMA.
        return"";
    }

    // TO STRING
    @Override
    public String toString() {
        return "WarhammerPersonaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", ENERGIA_MAX=" + ENERGIA_MAX +
                ", lista_armas=" + lista_armas +
                '}';
    }

}
