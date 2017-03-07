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
public class Granja {
    
    private HashSet galpon;
    private int idGranja;
    private double cantGallinas;  
    private HashSet granjeros;
    
    public Granja(double cantGallinas, int idGranja){
        this.galpon = new HashSet();
        this.granjeros = new HashSet();
        this.idGranja = idGranja;
        this.cantGallinas = cantGallinas;
    }

    public HashSet getGalpon() {
        return galpon;
    }

    public double getCantGallinas() {
        return cantGallinas;
    }

    public HashSet getGranjeros() {
        return granjeros;
    }

    public void setGalpon(HashSet galpon) {
        this.galpon = galpon;
    }

    public void setCantGallinas(double cantGallinas) {
        this.cantGallinas = cantGallinas;
    }

    public void setGranjeros(HashSet granjeros) {
        this.granjeros = granjeros;
    }

    public int getIdGranja() {
        return idGranja;
    }

    public void setIdGranja(int idGranja) {
        this.idGranja = idGranja;
    }
    
    @Override
    public int hashCode() {
        return idGranja; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Granja granja=(Granja)obj;      
        if(granja.idGranja==this.idGranja){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }

    public boolean adicionarGalpon(Galpon g){
        return galpon.add(g);
    }
    
    public boolean adicionarGranjeros(Empleado e){
        return granjeros.add(e);
    }
    
    public Galpon consultarGalpon(int idGalpon){
        Galpon galpones=null;
        Iterator i = galpon.iterator();
        while(i.hasNext()){
            Galpon galponI = (Galpon)i.next();
            if(galponI.getIdGalpon() == idGalpon){
                galpones = galponI;
            }
        }
        return galpones;
    }

    public Empleado consultarGranjero(int id){
        Empleado granjero=null;
        Iterator i = granjeros.iterator();
        while(i.hasNext()){
            Empleado granjeroI = (Empleado)i.next();
            if(granjeroI.getId() == id){
                granjero = granjeroI;
            }
        }
        return granjero;
    }    
}
