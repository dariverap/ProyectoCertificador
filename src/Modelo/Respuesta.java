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
// Clase Respuesta
public class Respuesta {
    private int idRespuesta;
    private int idPregunta;
    private int idPersona;
    private String contenido;
    private Timestamp fechaRespuesta;

    public Respuesta(int idRespuesta, int idPregunta, int idPersona, String contenido, Timestamp fechaRespuesta) {
        this.idRespuesta = idRespuesta;
        this.idPregunta = idPregunta;
        this.idPersona = idPersona;
        this.contenido = contenido;
        this.fechaRespuesta = fechaRespuesta;
    }

    // Getters y Setters
    public int getIdRespuesta() { return idRespuesta; }
    public void setIdRespuesta(int idRespuesta) { this.idRespuesta = idRespuesta; }

    public int getIdPregunta() { return idPregunta; }
    public void setIdPregunta(int idPregunta) { this.idPregunta = idPregunta; }

    public int getIdPersona() { return idPersona; }
    public void setIdPersona(int idPersona) { this.idPersona = idPersona; }

    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    public Timestamp getFechaRespuesta() { return fechaRespuesta; }
    public void setFechaRespuesta(Timestamp fechaRespuesta) { this.fechaRespuesta = fechaRespuesta; }
}

