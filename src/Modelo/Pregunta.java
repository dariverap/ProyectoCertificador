/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Timestamp;

/**
 *
 * @author Diego
 */
// Clase Pregunta
public class Pregunta {
    private int idPregunta;
    private int idSesion;
    private int idPersona;
    private String contenido;
    private Timestamp fechaCreacion;

    public Pregunta(int idPregunta, int idSesion, int idPersona, String contenido, Timestamp fechaCreacion) {
        this.idPregunta = idPregunta;
        this.idSesion = idSesion;
        this.idPersona = idPersona;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
    }

    // Getters y Setters
    public int getIdPregunta() { return idPregunta; }
    public void setIdPregunta(int idPregunta) { this.idPregunta = idPregunta; }

    public int getIdSesion() { return idSesion; }
    public void setIdSesion(int idSesion) { this.idSesion = idSesion; }

    public int getIdPersona() { return idPersona; }
    public void setIdPersona(int idPersona) { this.idPersona = idPersona; }

    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    public Timestamp getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(Timestamp fechaCreacion) { this.fechaCreacion = fechaCreacion; }
}

