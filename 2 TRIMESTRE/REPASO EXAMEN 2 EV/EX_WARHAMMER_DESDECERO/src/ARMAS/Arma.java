package ARMAS;

public abstract class Arma { // -> No lo instanciaremos porque es abstract.

    // ATRIBUTOS

    private String nombre;


    // CONSTRUCTOR

    public Arma(String nombre) {
        this.nombre = nombre;
    }


    // MÉTODOS -> toString

    @Override
    public String toString() {
        return "Arma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
