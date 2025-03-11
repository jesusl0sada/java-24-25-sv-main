package org.example;

public class Pelicula {
    protected int id;
    protected String titulo;
    protected String director;
    protected int anio;
    protected Genero genero;  // Objeto Genero

    public Pelicula(int id, String titulo, String director, int anio, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getAnio() {
        return anio;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "🎬 ID: " + id +
                " | Título: " + titulo +
                " | Director: " + director +
                " | Año: " + anio +
                " | Género: " + (genero != null ? genero.getNombre() : "(Sin género)");
    }
}
