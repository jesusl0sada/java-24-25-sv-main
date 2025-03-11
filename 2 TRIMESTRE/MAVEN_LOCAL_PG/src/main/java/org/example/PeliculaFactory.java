package org.example;

public class PeliculaFactory {

    // Método estático para crear una película a partir de parámetros
    public static Pelicula crearPelicula(int id, String titulo, String director, int anio, Genero genero) {
        return new Pelicula(id, titulo, director, anio, genero);
    }
}
