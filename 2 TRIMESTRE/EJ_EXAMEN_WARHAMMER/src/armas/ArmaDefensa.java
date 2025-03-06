package armas;

import interfaces.IArmamentoDefensa;
import personajes.WarhammerPersonaje;

public class ArmaDefensa extends Arma implements IArmamentoDefensa {

    // MÉTODOS DE LA CLASE ABSTRACT


    public ArmaDefensa(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // MÉTODOS DE LA INTERFACE
    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {

    }
}
