package armas;

import interfaces.ArmamentoAtaque;
import personajes.WarhammerPersonaje;

public class ArmaAtaque extends Arma implements ArmamentoAtaque {

    // CONSTRUCTOR
    public ArmaAtaque(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador) {

    }
}
