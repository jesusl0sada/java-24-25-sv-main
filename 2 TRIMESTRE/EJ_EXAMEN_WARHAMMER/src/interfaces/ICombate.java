package interfaces;

import armas.ArmaAtaque;
import personajes.WarhammerPersonaje;

public interface ICombate {
    abstract void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador);

    void atacar(WarhammerPersonaje victima);

    abstract void defender(ArmaAtaque arma);
}
