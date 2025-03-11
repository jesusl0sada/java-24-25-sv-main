package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeliculaDAO implements DAO {

    @Override
    public void add(Pelicula pelicula) {
        String query = "INSERT INTO peliculas (titulo, director, anio, genero_id) VALUES (?, ?, ?, ?)";
        Connection conn = Singleton.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, pelicula.getTitulo());
            ps.setString(2, pelicula.getDirector());
            ps.setInt(3, pelicula.getAnio());
            ps.setInt(4, pelicula.getGenero().getId());

            ps.executeUpdate();
            System.out.println("Película agregada: " + pelicula.getTitulo());
        } catch (SQLException e) {
            System.out.println("Error al agregar la película: " + e.getMessage());
        }
    }

    @Override
    public void findAll() {
        String query = "SELECT p.id, p.titulo, p.director, p.anio, g.nombre AS genero " +
                "FROM peliculas p JOIN generos g ON p.genero_id = g.id";
        Connection conn = Singleton.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("Lista de todas las películas:");
            while (rs.next()) {
                System.out.println("   • " + rs.getInt("id") + " | "
                        + rs.getString("titulo") + " | "
                        + rs.getString("director") + " | "
                        + rs.getInt("anio") + " | "
                        + rs.getString("genero"));
            }
        } catch (SQLException e) {
            System.out.println("Error al listar las películas: " + e.getMessage());
        }
    }

    @Override
    public Pelicula find(int id) {
        Pelicula pelicula = null;
        String query = "SELECT p.id, p.titulo, p.director, p.anio, g.id AS genero_id, g.nombre AS genero " +
                "FROM peliculas p JOIN generos g ON p.genero_id = g.id WHERE p.id = ?";
        Connection conn = Singleton.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Genero genero = new Genero(rs.getInt("genero_id"), rs.getString("genero"));
                    pelicula = new Pelicula(rs.getInt("id"), rs.getString("titulo"), rs.getString("director"),
                            rs.getInt("anio"), genero);
                    System.out.println("Película encontrada: " + pelicula.getTitulo());
                } else {
                    System.out.println("No se encontró película con ID: " + id);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar la película: " + e.getMessage());
        }
        return pelicula;
    }

    @Override
    public void update(Pelicula pelicula) {
        String query = "UPDATE peliculas SET titulo = ?, director = ?, anio = ?, genero_id = ? WHERE id = ?";
        Connection conn = Singleton.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, pelicula.getTitulo());
            ps.setString(2, pelicula.getDirector());
            ps.setInt(3, pelicula.getAnio());
            ps.setInt(4, pelicula.getGenero().getId());
            ps.setInt(5, pelicula.getId());
            ps.executeUpdate();
            System.out.println("Película actualizada: " + pelicula.getTitulo());
        } catch (SQLException e) {
            System.out.println("Error al actualizar la película: " + e.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM peliculas WHERE id = ?";
        Connection conn = Singleton.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Película eliminada con ID: " + id);
        } catch (SQLException e) {
            System.out.println("Error al eliminar la película: " + e.getMessage());
        }
    }

    //  MÉTODO: Filtrar películas por género
    public void findByGenero(String generoNombre) {
        String query = "SELECT p.id, p.titulo, p.director, p.anio FROM peliculas p " +
                "JOIN generos g ON p.genero_id = g.id WHERE g.nombre = ?";
        Connection conn = Singleton.getInstance().getConnection();
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, generoNombre);
            try (ResultSet rs = ps.executeQuery()) {
                System.out.println("Películas del género: " + generoNombre);
                boolean encontrado = false;
                while (rs.next()) {
                    encontrado = true;
                    System.out.println("   • " + rs.getInt("id") + " | "
                            + rs.getString("titulo") + " | "
                            + rs.getString("director") + " | "
                            + rs.getInt("anio"));
                }
                if (!encontrado) {
                    System.out.println("No hay películas registradas en este género.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al filtrar películas por género: " + e.getMessage());
        }
    }
}
