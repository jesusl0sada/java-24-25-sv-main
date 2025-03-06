package PERSONAJES;

import ARMAS.ArmaAtaque;
import ARMAS.ArmaDefensa;

import java.util.Stack;

public abstract class PielVerde extends WarhammerPersonaje {

    // ATRIBUTOS
    protected String puebloNacimiento;
    private String nombrePielVerde;
    private int nivel;
    private static int contPielesVerdes = 0;

    // CONSTRUCTOR
    public PielVerde(String nombre, String puebloNacimiento) {
        super(nombre);
        this.puebloNacimiento = puebloNacimiento;
    }


    // MÉTODOS HEREDADOS

    public PielVerde(String nombre) {
        super(nombre);
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
        return "PielVerde{" +
                "puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nombrePielVerde='" + nombrePielVerde + '\'' +
                ", nivel=" + nivel +
                '}';
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void defender(ArmaAtaque arma) {

    }

    // MÉTODOS PROPIOS

    public void addArmaAtaque(ArmaAtaque arma){
        // SERÁ METER ARMAS EN EL HASHMAP DE ARMAS
    }

    public void addArmaDefensa(ArmaDefensa arma){
        // SERÁ METER ARMAS EN EL HASHMAP DE ARMAS
    }

    public static int getContPielesVerdes() {
        return contPielesVerdes;
    }
}
