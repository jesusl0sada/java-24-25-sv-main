package armas;

public abstract class Arma {

    // ATRIBUTOS
    protected String nombre;


    // CONSTRUCTOR

    public Arma(String nombre) {
        this.nombre = nombre;
    }


    // MÉTODOS


    // TO STRING


    @Override
    public String toString() {
        return "Arma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
