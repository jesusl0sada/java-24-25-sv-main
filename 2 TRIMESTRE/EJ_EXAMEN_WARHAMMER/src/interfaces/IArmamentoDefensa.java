package interfaces;

import armas.ArmaAtaque;
import personajes.WarhammerPersonaje;

public interface IArmamentoDefensa {
    void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante);
}
