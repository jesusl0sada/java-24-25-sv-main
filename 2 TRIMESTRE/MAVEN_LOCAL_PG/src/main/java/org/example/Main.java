package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1) Conectar a la base de datos
        Singleton.getInstance();

        // 2) Crear instancias de DAO para películas y géneros
        PeliculaDAO peliculaDAO = new PeliculaDAO();
        GeneroDAO generoDAO = new GeneroDAO();

        // ------------------------ CASOS DE USO ------------------------ //

        // 1) Insertar nuevos géneros (si la base de datos está vacía)
        System.out.println("Insertando géneros...");
        Genero accion = new Genero(1, "Acción");
        Genero comedia = new Genero(2, "Comedia");
        Genero drama = new Genero(3, "Drama");
        Genero fantasia = new Genero(4, "Fantasía");

        // Descomenta para insertar
        // generoDAO.add(accion);
        // generoDAO.add(comedia);
        // generoDAO.add(drama);
        // generoDAO.add(fantasia);

        // 2) Listar todos los géneros disponibles
        System.out.println("Lista de géneros disponibles:");
        generoDAO.findAll();

        // 3) Insertar nuevas películas de dos maneras

        // Opción 1: Crear películas con Factory
        System.out.println("Creando películas con Factory...");
        Pelicula peliculaFactory1 = PeliculaFactory.crearPelicula(0, "Duro de Matar", "John McTiernan", 1988, accion);
        Pelicula peliculaFactory2 = PeliculaFactory.crearPelicula(0, "Scary Movie", "Keenen Ivory Wayans", 2000, comedia);

        // Descomenta para insertar
        // peliculaDAO.add(peliculaFactory1);
        // peliculaDAO.add(peliculaFactory2);

        // Opción 2: Crear películas manualmente sin Factory
        System.out.println("Creando películas de forma manual...");
        Pelicula peliculaManual1 = new Pelicula(0, "Matrix", "Lana Wachowski", 1999, accion);
        Pelicula peliculaManual2 = new Pelicula(0, "Superbad", "Greg Mottola", 2007, comedia);

        // Descomenta para insertar
        // peliculaDAO.add(peliculaManual1);
        // peliculaDAO.add(peliculaManual2);

        // 4) Listar todas las películas
        System.out.println("Lista de todas las películas:");
        peliculaDAO.findAll();

        // 5) Buscar una película por ID
        System.out.println("Buscando película con ID = 1...");
        peliculaDAO.find(1);

        // 6) Actualizar una película (ejemplo: cambiar el título de ID 1)
        System.out.println("Actualizando película con ID = 1...");
        Pelicula peliculaActualizada = new Pelicula(1, "Duro de Matar (Remastered)", "John McTiernan", 1988, accion);

        // Descomenta para actualizar
        // peliculaDAO.update(peliculaActualizada);

        // 7) Eliminar una película (ejemplo: eliminar ID 2)
        System.out.println("Eliminando película con ID = 2...");

        // Descomenta para eliminar
        // peliculaDAO.delete(2);

        // 8) Volver a listar películas después de los cambios
        System.out.println("Lista de películas después de cambios:");
        peliculaDAO.findAll();

        // 9) Filtrar películas por género (entrada del usuario)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el género para buscar películas: ");
        String generoBuscado = scanner.nextLine();
        peliculaDAO.findByGenero(generoBuscado);

        // 10) Cerrar conexión al finalizar
        Singleton.getInstance().closeConnection();
    }
}
