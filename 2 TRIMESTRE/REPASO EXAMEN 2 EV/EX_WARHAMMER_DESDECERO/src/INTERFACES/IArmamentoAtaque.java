package INTERFACES;

import PERSONAJES.WarhammerPersonaje;

public interface IArmamentoAtaque {
    void atacar(WarhammerPersonaje victima);
    void atacar(WarhammerPersonaje victima, boolean esAtaqueTanque);
}
