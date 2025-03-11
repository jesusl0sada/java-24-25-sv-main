package org.example;

public class Main {
    public static void main(String[] args) {
        // 1️⃣ Conectar a la base de datos
        Singleton.getInstance();

        // 2️⃣ Crear instancias de DAO para películas y géneros
        PeliculaDAO peliculaDAO = new PeliculaDAO();
        GeneroDAO generoDAO = new GeneroDAO();

        // ------------------------ CASOS DE USO ------------------------ //

        // 1️⃣ Insertar nuevos géneros
        //Genero fantasia = new Genero(7, "Fantasia");
        Genero drama = new Genero(3, "Drama");

        //generoDAO.add(fantasia);
        generoDAO.add(drama);


        // 2️⃣ Listar todos los géneros
        generoDAO.findAll();

        // 3️⃣ Insertar nuevas películas
        Pelicula pelicula1 = new Pelicula(6, "Los mundos de Yupi", "Alberto Akkari", 2008, drama);
        Pelicula pelicula2 = new Pelicula(7, "Se7en", "Daniel Lalanza", 2004, drama);
        peliculaDAO.add(pelicula1);
        peliculaDAO.add(pelicula2);

        // 4️⃣ Listar todas las películas
        peliculaDAO.findAll();

        // 5️⃣ Buscar una película por ID
        peliculaDAO.find(1);

        // 6️⃣ Actualizar una película
        //Pelicula peliculaActualizada = new Pelicula(1, "Gladiator (Remastered)", "Ridley Scott", 2000, fantasia);
        //peliculaDAO.update(peliculaActualizada);

        // 7️⃣ Eliminar una película por ID
        //peliculaDAO.delete();

        // 8️⃣ Listar las películas después de los cambios
        peliculaDAO.findAll();

        // QUÉ PELICULAS SON DE TIPO FANTASÍA .
    }
}
