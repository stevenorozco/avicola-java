/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Walter
 */
public class Vacuna {
    
    private String nombre, fecha, hora;
    private Empleado asistente;
    
    public Vacuna(String nombre, String fecha, String hora, Empleado asistente){
        this.nombre= nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.asistente = asistente;
    }   

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Empleado getAsistente() {
        return asistente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setAsistente(Empleado asistente) {
        this.asistente = asistente;
    }
    
}
