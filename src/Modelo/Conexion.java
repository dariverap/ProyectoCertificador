package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

   private static Connection conn;
    
    private static final String URL = "jdbc:mysql://localhost:3306/ParticipacionActiva?serverTimezone=America/Lima";

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, "root", "admin");
                System.out.println("Conexión exitosa a la base de datos");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error al conectarse a la base de datos: " + e.getMessage());
            }
        }
        return conn;
    }

}

