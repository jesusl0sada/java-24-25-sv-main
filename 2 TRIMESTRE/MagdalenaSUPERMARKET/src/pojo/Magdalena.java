package pojo;

public class Magdalena {

    // ATRIBUTOS MAGDALENA
    private double precio;
    private String color;
    private String nombre;


    // CONSTRUCTOR MAGDALENA
    public Magdalena(String nombre, String color, double precio) {
        this.color = color;
        this.precio = precio;
        this.nombre = nombre;
    }


    // MÉTODOS MAGDALENA
    // SIEMPRE OBTENER GETTER Y SETTER DE CADA ATRIBUTO (VARIABLE)


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
