package pojo;

public class Producto {
    //ATRIBUTOS
    private String nombre;   //datos de inicializacion , convertir las variables de temporales a permanentes con THIS
    private double precio;
    private int stock;
    //CONSTRUCTOR
    public Producto(String nombre, double precio, int cantidad) {

        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + this.nombre + '\'' +
                ", precio=" + this.precio +
                ", stock=" + this.stock +
                '}';
    }

    //METODOS GETTER/SETTER  (metodos que me permiten leer desde fuera)
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
        this.stock = stock; //unica manera de hacer un avalor permanente
    }
}
