package INTERFACES;

import ARMAS.ArmaAtaque;
import PERSONAJES.WarhammerPersonaje;

public interface IArmamentoDefensa {
    void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante);
}
