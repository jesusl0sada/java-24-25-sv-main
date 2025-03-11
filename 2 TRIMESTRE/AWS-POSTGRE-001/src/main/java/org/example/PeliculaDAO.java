package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PeliculaDAO implements DAO{


    @Override
    public void add(Pelicula pelicula) {
        ConextionPostgre conexion = Singleton.getInstance();
        Connection conn = conexion.getConnection();
        Statement st = conn.createStatement();
        ResultSet lstDatos = ((Statement) st).
                executeQuery("SELECT * FROM PELICULAS");

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Pelicula pelicula) {

    }

    @Override
    public void find(int id) {

    }

    @Override
    public void findall() {

    }
}
