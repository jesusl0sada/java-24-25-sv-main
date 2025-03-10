package movimiento;

import pokemon.Pokemon;

public class MovimientoAtaque extends Movimiento {
    protected int danio;

    public MovimientoAtaque(String nombreMovimiento, int danio) {
        super(nombreMovimiento, danio);
        this.danio = danio;
    }

    public int getDanio() {
        return danio;
    }

    // Si quisieras, podrías tener un método atacar(Pokemon objetivo) extra,
    // pero en este diseño no es obligatorio
}
