package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GeneroDAO {

    public void add(Genero genero) {
        String query = "INSERT INTO generos (nombre) VALUES (?)";
        Connection conn = Singleton.getInstance().getConnection(); // Mantiene la conexión abierta
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, genero.getNombre());
            ps.executeUpdate();
            System.out.println("Género agregado: " + genero.getNombre());
        } catch (SQLException e) {
            System.out.println("Error al agregar el género: " + e.getMessage());
        }
    }

    public void findAll() {
        String query = "SELECT * FROM generos";
        Connection conn = Singleton.getInstance().getConnection(); // Mantiene la conexión abierta
        try (PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("Lista de Géneros:");
            while (rs.next()) {
                System.out.println(" ID: " + rs.getInt("id") + " | Nombre: " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error al listar los géneros: " + e.getMessage());
        }
    }
}
