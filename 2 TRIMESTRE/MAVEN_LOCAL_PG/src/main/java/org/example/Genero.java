package org.example;

public class Genero {

    private int id;
    private String nombre;

    // Constructor
    public Genero(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString() para mostrar el género
    @Override
    public String toString() {
        return "Genero [ID: " + id + ", Nombre: " + nombre + "]";
    }
}
