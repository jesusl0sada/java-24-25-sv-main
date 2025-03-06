package INTERFACES;

import ARMAS.ArmaAtaque;
import PERSONAJES.WarhammerPersonaje;

public interface ICombate {
    void atacar(WarhammerPersonaje victima);
    void defender(ArmaAtaque arma);
}
