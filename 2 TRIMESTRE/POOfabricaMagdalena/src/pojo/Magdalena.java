package pojo;


public class Magdalena {

    //  ------ATRIBUTOS------

    private String sabor;
    private String color;
    private int precio;

    //  ------CONSTRUCTOR------

    // CON THIS Podemos hablar con todo lo que tenemos en la clase magdalena , el this irá en el constructor, lo hace permanente.
    // Es decir la clase magdalena tiene que tener si o si los atributos sabor y color, el contenido es temporal
    // Su objetivo es que pase de ser un contenido temporal a ser permanente.


    public Magdalena(String sabor, String color, int precio) {

        // ESTO ES LO QUE LUEGO EN EL MAIN AL CONSTRUIR LOS OBJETOS SON LAS FORMAS QUE TIENEN QUE SEGUIR.
        this.sabor = sabor; // HAY QUE PONER THIS en el constructor para convertir permanente un valor temporal.
        this.color = color; // HAY QUE PONER THIS en el constructor para convertir permanente un valor temporal.
        this.precio = precio; // HAY QUE PONER THIS en el constructor para convertir permanente un valor temporal.

    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}


    //  ------MÉTODO------






