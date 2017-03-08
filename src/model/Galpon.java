/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
/**
 *
 * @author Walter
 */
public class Galpon {
    
    
    private String eventos;
    private double capacidad;
    private HashSet galponeros;
    private int idGalpon;
    
    
    public Galpon(int idGalpon, String eventos, int capacidad){
        this.idGalpon= idGalpon;
        this.eventos = eventos;
        this.capacidad = capacidad;
        this.galponeros = new HashSet();
      
    }

    public String getEventos() {
        return eventos;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public HashSet getGalponeros() {
        return galponeros;
    }

    public int getIdGalpon() {
        return idGalpon;
    }

    public void setEventos(String eventos) {
        this.eventos = eventos;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void setGalponeros(HashSet galponeros) {
        this.galponeros = galponeros;
    }

    public void setIdGalpon(int idGalpon) {
        this.idGalpon = idGalpon;
    }   

 
    
    
    
    @Override
    public int hashCode() {
        return idGalpon; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Galpon galpon=(Galpon)obj;      
        if(galpon.idGalpon==this.idGalpon){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
    
    public boolean adicionarGalponero(Empleado e){
        return galponeros.add(e);
    }
    
    
    
    public Empleado consultarGalponero(int id){
        Empleado galponero=null;
        Iterator i = galponeros.iterator();
        while(i.hasNext()){
            Empleado galponeroI = (Empleado)i.next();
            if(galponeroI.getId() == id){
                galponero = galponeroI;
            }
        }
        return galponero;
    }
    
   
}
