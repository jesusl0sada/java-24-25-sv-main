package Pokemon;

public class MovimientoAtaque {

    private String nombre;
    private int potencia;

    public MovimientoAtaque(String nombre, int potencia) {
        this.nombre = nombre;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "MovimientoAtaque{" +
                "nombre='" + nombre + '\'' +
                ", potencia=" + potencia +
                '}';
    }

    public int getPotencia() {
        return potencia;
    }
}
