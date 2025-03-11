package interfaces;

import armas.ArmaAtaque;
import naves.Nave;

public interface IAtaque {
    void atacar(Nave objetivo);

    void defender(ArmaAtaque arma, int danioRecibido);
}
