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
public class Curso {
    
    private String nombre, fecha, titulo, institucion;
    private double horas;
    
    public Curso (String nombre, String fecha, String titulo, String institucion, double horas){
        this.nombre = nombre;
        this.fecha = fecha;
        this.titulo = titulo;
        this.institucion = institucion;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public double getHoras() {
        return horas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
}
