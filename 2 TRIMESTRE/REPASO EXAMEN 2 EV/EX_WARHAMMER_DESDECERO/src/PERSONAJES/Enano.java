package PERSONAJES;

import ARMAS.ArmaAtaque;
import ARMAS.ArmaDefensa;

public abstract class Enano extends WarhammerPersonaje{


    // ATRIBUTOS
    protected String nombreEnano;
    protected int riqueza;
    protected int nivel;
    private static int contEnanos = 0;

    // CONSTRUCTOR
    public Enano(String nombre, int riqueza) {
        super(nombre);
        this.riqueza = riqueza;
    }

    //MÉTODOS HEREDADOS

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void defender(ArmaAtaque arma) {

    }

    @Override
    public void sumarEnergia() {
        super.sumarEnergia();
    }

    @Override
    public String imprimirArmas() {
        return super.imprimirArmas();
    }

    @Override
    public String toString() {
        return "Enano{" +
                "nombreEnano='" + nombreEnano + '\'' +
                ", riqueza=" + riqueza +
                ", nivel=" + nivel +
                '}';
    }

    // MÉTODOS PROPIOS

    public static int getContEnanos() {
        return contEnanos;
    }

    public void addArmaAtaque(ArmaAtaque arma){

    }

    public void addArmaDefensa(ArmaDefensa arma){

    }
}
