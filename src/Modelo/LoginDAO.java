
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
public login log(String correo, String contrasena) {
    login l = new login();
    String sql = "SELECT * FROM Usuario WHERE Correo = ? AND Contrasena = ?";
    try {
        con = cn.getConnection(); // Conexión abierta aquí
        ps = con.prepareStatement(sql);
        ps.setString(1, correo);
        ps.setString(2, contrasena);
        rs = ps.executeQuery();
        if (rs.next()) {
            l.setIdUsuario(rs.getInt("ID_Usuario"));
            l.setCorreo(rs.getString("Correo"));
            l.setContrasena(rs.getString("Contrasena"));
            l.setNombre(obtenerNombrePorIdUsuario(l.getIdUsuario(), con)); // Pasar conexión
            l.setRol(obtenerNombreRolPorIdUsuario(l.getIdUsuario(), con)); // Pasar conexión
        }
    } catch (SQLException e) {
        System.out.println("Error al conectarse a la base de datos: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close(); // Cerrar conexión aquí
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    return l;
}


 public String obtenerNombrePorIdUsuario(int idUsuario, Connection con) {
    String nombre = null;
    String sql = "SELECT p.Nombre FROM Usuario u JOIN Persona p ON u.ID_Persona = p.ID_Persona WHERE u.ID_Usuario = ?";
    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, idUsuario);
        rs = ps.executeQuery();
        if (rs.next()) {
            nombre = rs.getString("Nombre");
        }
    } catch (SQLException e) {
        System.out.println(e.toString());
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            // No cerrar la conexión aquí
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    return nombre;
}

public String obtenerNombreRolPorIdUsuario(int idUsuario, Connection con) {
    String nombreRol = null;
    String sql = "SELECT r.Nombre_Rol FROM Usuario u JOIN Persona p ON u.ID_Persona = p.ID_Persona JOIN Rol r ON p.ID_Rol = r.ID_Rol WHERE u.ID_Usuario = ?";
    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, idUsuario);
        rs = ps.executeQuery();
        if (rs.next()) {
            nombreRol = rs.getString("Nombre_Rol");
        }
    } catch (SQLException e) {
        System.out.println(e.toString());
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            // No cerrar la conexión aquí
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    return nombreRol;
}


    
    public boolean Registrar(login reg) {
        String sql = "INSERT INTO Usuario (correo, contrasena, ID_Rol) VALUES (?, ?, ?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getCorreo());
            ps.setString(2, reg.getContrasena());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    


    
    
    public List<login> ListarUsuarios() {
        List<login> Lista = new ArrayList<>();
        String sql = "SELECT * FROM Usuario";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                login lg = new login();
                lg.setIdUsuario(rs.getInt("ID_Usuario"));
                lg.setCorreo(rs.getString("correo"));
                lg.setContrasena(rs.getString("contrasena"));
                lg.setIdRol(rs.getInt("ID_Rol"));
                Lista.add(lg);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Lista;
    }
}
