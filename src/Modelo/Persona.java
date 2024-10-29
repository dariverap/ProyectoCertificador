/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Diego
 */
// Clase Persona
public class Persona {
    private int idPersona;
    private int idRol;
    private String nombre;
    private String apellido;
    private Date fechaRegistro;

    public Persona(int idPersona, int idRol, String nombre, String apellido, Date fechaRegistro) {
        this.idPersona = idPersona;
        this.idRol = idRol;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public int getIdPersona() { return idPersona; }
    public void setIdPersona(int idPersona) { this.idPersona = idPersona; }

    public int getIdRol() { return idRol; }
    public void setIdRol(int idRol) { this.idRol = idRol; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public Date getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(Date fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}

