package Pokemon;

import java.util.ArrayList;
import java.util.Objects;

public class Entrenador {

    private String nombre;
    private ArrayList equipo;
    private ArrayList mochila;

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    public void añadirPokemon(Pokemon p){
        equipo.add(p);
    }

    public void añadirObjeto(Objeto obj){
        mochila.add(obj);
    }

    public void usar0bjeto(Objeto obj, Pokemon p){
        obj.usar(p);
    }


}
