package interfaces;

import personajes.WarhammerPersonaje;

public interface ArmamentoAtaque {
    void atacar(WarhammerPersonaje victima);
    void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador);

}
