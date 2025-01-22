package pojo;

public class Pelicula {
    // ATRIBUTOS
    private String titulo;
    private String director;
    private int añoLanzamiento;
    private Pelicula siguiente; // Puntero a la siguiente película

    // CONSTRUCTOR
    public Pelicula(String titulo, String director, int añoLanzamiento) {
        this.titulo = titulo;
        this.director = director;
        this.añoLanzamiento = añoLanzamiento;
        this.siguiente = null; // Por defecto, apunta a null
    }

    // GETTERS Y SETTERS
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }
    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }
    public Pelicula getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Pelicula siguiente) {
        this.siguiente = siguiente;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", añoLanzamiento=" + añoLanzamiento +
                '}';
    }
}

