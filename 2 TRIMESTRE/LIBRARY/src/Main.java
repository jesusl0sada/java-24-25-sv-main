import pojo.Libro;
import pojo.Biblioteca;

public class Main {
    public static void main(String[] args) {

        // Crear algunos libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605, true);
        Libro libro2 = new Libro("1984", "George Orwell", 1949, true);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943, true);
        Libro libroprueba = new Libro("Aventuras", "Arturo López", 1978, false);

        // Agregar libros a la biblioteca
        Biblioteca.agregarLibro(libroprueba);
        Biblioteca.agregarLibro(libro1);
        Biblioteca.agregarLibro(libro2);

        // Listar libros
        Biblioteca.listarLibro();

        // Buscar y prestar un libro
        Biblioteca.prestarLibro("Aventuras");
        Biblioteca.listarLibro();

        // Intentar prestar el mismo libro
        Biblioteca.prestarLibro("El principito");

        // Devolver el libro
        Biblioteca.devolverLibro("El Quijote");
        Biblioteca.listarLibro();
    }
}
