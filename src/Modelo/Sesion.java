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
// Clase Sesion
public class Sesion {
    private int idSesion;
    private int idSeccion;
    private Date fechaSesion;

    public Sesion(int idSesion, int idSeccion, Date fechaSesion) {
        this.idSesion = idSesion;
        this.idSeccion = idSeccion;
        this.fechaSesion = fechaSesion;
    }

    // Getters y Setters
    public int getIdSesion() { return idSesion; }
    public void setIdSesion(int idSesion) { this.idSesion = idSesion; }

    public int getIdSeccion() { return idSeccion; }
    public void setIdSeccion(int idSeccion) { this.idSeccion = idSeccion; }

    public Date getFechaSesion() { return fechaSesion; }
    public void setFechaSesion(Date fechaSesion) { this.fechaSesion = fechaSesion; }
}

