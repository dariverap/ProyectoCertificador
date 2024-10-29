package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
// Clase Seccion
public class Seccion {
    private int idSeccion;
    private int idClase;
    private String nombre;

    public Seccion(int idSeccion, int idClase, String nombre) {
        this.idSeccion = idSeccion;
        this.idClase = idClase;
        this.nombre = nombre;
    }

    // Getters y Setters
    public int getIdSeccion() { return idSeccion; }
    public void setIdSeccion(int idSeccion) { this.idSeccion = idSeccion; }

    public int getIdClase() { return idClase; }
    public void setIdClase(int idClase) { this.idClase = idClase; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}

