package PERSONAJES;

import ARMAS.ArmaAtaque;
import ARMAS.ArmaDefensa;

import java.util.ArrayList;

public class Orco extends PielVerde{

    // ATRIBUTOS

    // arraylist
    protected ArrayList<Goblin> listaGoblin = new ArrayList<>(); // INICIALIZADO Y DECLARADO.


    // CONSTRUCTOR
    public Orco(String nombre, String puebloNacimiento) {
        super(nombre, puebloNacimiento);
    }


    // MÉTODOS HEREDADOS

    @Override
    public void sumarEnergia() {
        super.sumarEnergia();
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);
    }

    @Override
    public void defender(ArmaAtaque arma) {
        super.defender(arma);
    }

    @Override
    public void addArmaAtaque(ArmaAtaque arma) {
        super.addArmaAtaque(arma);
    }

    @Override
    public void addArmaDefensa(ArmaDefensa arma) {
        super.addArmaDefensa(arma);
    }


    // MÉTODOS PROPIOS


    @Override
    public String toString() {
        return "Orco{" +
                "puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", energia=" + energia +
                '}';
    }

    public void addGoblin(Goblin goblin){
        listaGoblin.add(goblin); // PARA EL ARRAYLIST SOLO METERLE () , en el método si que ponemos objeto y instancia.
    }
}
