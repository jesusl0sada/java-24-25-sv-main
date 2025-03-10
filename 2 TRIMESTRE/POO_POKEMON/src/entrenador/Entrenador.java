package entrenador;

import objeto.Objeto;
import pokemon.Pokemon;

import java.util.ArrayList;

public class Entrenador {

    private String nombre;
    protected ArrayList<Pokemon> equipo = new ArrayList<>();
    protected ArrayList<Objeto> mochila = new ArrayList<>();

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    public void aniadirPokemon(Pokemon p) {
        equipo.add(p);
    }

    public void aniadirObjeto(Objeto obj) {
        mochila.add(obj);
    }

    public void usarObjeto(Objeto obj, Pokemon p) {
        // Simplemente llamamos a obj.usar(p)
        if (mochila.contains(obj)) {
            obj.usar(p);
        } else {
            System.out.println(nombre + " no tiene ese objeto en la mochila.");
        }
    }

    @Override
    public String toString() {
        return "Entrenador: " + nombre
                + "\nEquipo: " + equipo
                + "\nMochila: " + mochila;
    }
}
