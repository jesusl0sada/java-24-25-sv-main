package PERSONAJES;

import ARMAS.ArmaAtaque;
import ARMAS.ArmaDefensa;

public class Goblin extends PielVerde{


    // ATRIBUTOS -> NO NECESITO, SOLO SON LOS DEL PADRE, NO AÑADE COSAS.




    // CONSTRUCTOR

    public Goblin(String nombre, String puebloNacimiento) {
        super(nombre, puebloNacimiento);
    }


    //MÉTODOS HEREDADOS

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

    @Override
    public String toString() {
        return "Goblin{" +
                "puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    //MÉTODOS PROPIOS




}
