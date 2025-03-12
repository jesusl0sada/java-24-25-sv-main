package Pokemon;

public class Objeto {

    private String nombre;

    public Objeto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void usar(Pokemon pokemon) {

    }
}
