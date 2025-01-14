package pojo;

public class Producto {

    // ATRIBUTOS
    private String nombre;
    private double precio;
    private int stock;

    // CONSTRUCTOR
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock =stock;
    }

    // MÉTODOS

    // TO STRING -> TE DA LA INFORMACIÓN DE TODOS LOS ATRIBUTOS

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + this.nombre + '\'' +
                ", precio=" + this.precio +
                ", stock=" + this.stock +
                '}';
        // USAR SIEMPRE EL THIS

    }

    // ( GETTER Y SETTER) -> EL GETTER Y SETTER SON MÉTODOS QUE TE
    // PERMITEN LEER TODA LA INFORMACIÓN DE LA CLASE DESDE FUERA, VALUES Y TODO.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
