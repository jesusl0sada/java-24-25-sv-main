package movimiento;

public abstract class Movimiento {
    protected String nombreMovimiento;
    // Potencia o algo similar, si quisieras usarlo
    protected int potencia;

    public Movimiento(String nombreMovimiento, int potencia) {
        this.nombreMovimiento = nombreMovimiento;
        this.potencia = potencia;
    }

    public String getNombreMovimiento() {
        return nombreMovimiento;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "nombreMovimiento='" + nombreMovimiento + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
