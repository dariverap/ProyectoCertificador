
package Modelo;
public class login {
    private int idUsuario;
    private String correo;
    private String contrasena;
    private int idRol;
    private String nombre;
    private String rol; 
    
    public login() {
    }

    public login(int idUsuario, String correo, String contrasena, int idRol) {
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.idRol = idRol;
    }
       public login(int id, String nombre, String correo, String pass, String rol) {
        this.idUsuario = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = pass;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
