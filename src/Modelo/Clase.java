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
// Clase Clase
public class Clase {
    private int idClase;
    private String nombre;
    private String descripcion;
    private Date fecha;

    public Clase(int idClase, String nombre, String descripcion, Date fecha) {
        this.idClase = idClase;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    // Getters y Setters
    public int getIdClase() { return idClase; }
    public void setIdClase(int idClase) { this.idClase = idClase; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
}

