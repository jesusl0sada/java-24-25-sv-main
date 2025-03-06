package ARMAS;

import INTERFACES.IArmamentoDefensa;
import PERSONAJES.WarhammerPersonaje;

public abstract class ArmaDefensa extends Arma implements IArmamentoDefensa {


    // ATRIBUTOS



    // CONSTRUCTOR
    public ArmaDefensa(String nombre) {
        super(nombre);
    }


    // MÉTODOS HEREDADOS -> INTERFACE, CLASE PADRE (NO TIENE)

    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {

    }

    // MÉTODOS PROPIOS -> TO STRING SI ESO


    @Override
    public String toString() {
        return "ArmaDefensa{}";
    }
}
