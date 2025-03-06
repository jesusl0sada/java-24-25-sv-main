package PERSONAJES;

import ARMAS.ArmaAtaque;
import ARMAS.ArmaDefensa;
import INTERFACES.ICombate;

public class Martillador extends Enano implements ICombate {



    //ATRIBUTOS -> YA ESTÁN




    //CONSTRUCTOR
    public Martillador(String nombre, int riqueza) {
        super(nombre, riqueza);
    }


    //MÉTODOS HEREDADOS -> PADRE E INTERFACE

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


    // MÉTODOS PROPIOS -> TO STRING

    @Override
    public String toString() {
        return "Martillador{" +
                "riqueza=" + riqueza +
                ", nivel=" + nivel +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
