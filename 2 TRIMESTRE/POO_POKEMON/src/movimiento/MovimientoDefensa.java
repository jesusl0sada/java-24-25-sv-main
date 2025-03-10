package movimiento;

import pokemon.Pokemon;

public class MovimientoDefensa extends Movimiento {

    protected int valorDefensa;

    public MovimientoDefensa(String nombreMovimiento, int valorDefensa) {
        super(nombreMovimiento, valorDefensa);
        this.valorDefensa = valorDefensa;
    }

    public int getValorDefensa() {
        return valorDefensa;
    }

    // Podrías tener un método defender(...) pero aquí
    // lo simplificamos y lo usamos desde Pokemon.
}
