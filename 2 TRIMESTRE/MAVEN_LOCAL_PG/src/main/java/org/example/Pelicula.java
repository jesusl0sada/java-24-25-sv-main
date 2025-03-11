package org.example;

public class Pelicula {

    private int id;
    private String titulo;
    private String director;
    private int anio;
    private Genero genero;  // Atributo para el género

    // Constructor
    public Pelicula(int id, String titulo, String director, int anio, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.genero = genero;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // Método toString() para mostrar la información de la película
    @Override
    public String toString() {
        return "Pelicula [ID: " + id + ", Título: " + titulo + ", Director: " + director +
                ", Año: " + anio + ", Género: " + genero.getNombre() + "]";
    }
}
