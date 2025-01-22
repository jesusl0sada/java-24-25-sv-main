package pojo;

import java.sql.SQLOutput;

public class Biblioteca {
    private static final int CAPACIDAD = 10;
    private static Libro[] Libros = new Libro[CAPACIDAD];
    private static int contadorLibros = 0;

    public Biblioteca() {

    }

    public static void agregarLibro(Libro libro) {
        if (contadorLibros < CAPACIDAD) {
            Libros[contadorLibros] = libro;
            contadorLibros++;
            System.out.println("CON ESPACIO");
        } else {
            System.out.println("SIN ESPACIO");
        }
    }

    public static void listarLibro() {
        // For normal
        // Foreach para Objetos
        for (Libro libro : Libros
        ) {
            System.out.println(libro.toString());
        }
    }

    public static Libro buscarLibro(String titulo) {
        for (Libro libro : Libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public static void prestarLibro(String titulo) {
        Libro milibro = buscarLibro(titulo);
        if (milibro.isDisponible() == true) {
            System.out.println("El libro será prestado");
        } else {
            System.out.println("El libro no está disponible pues ha sido prestado");
        }
    }

    public static void devolverLibro(String titulo) {
        Libro milibro = buscarLibro(titulo);
        if (milibro.isDisponible() == false)
            System.out.println("La devolución se llevará a cabo pues el libro pertenecía a otro dueño");
        else {
            System.out.println("El libro vuelve a estar disponible de nuevo");
        }
    }
}


