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
public class Gallina {
    
    private int edad; 
    private String raza, novedad, proceso; 
    private HashSet vacuna;
    private int idGallina;
    private int lote;
    
    public Gallina(int edad, String raza, String novedad, String proceso, int idGallina, int lote){
        this.edad = edad;
        this.raza = raza;
        this.novedad = novedad;
        this.proceso = proceso;
        this.vacuna = new HashSet();
        this.idGallina = idGallina;
        this.lote = lote;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getNovedad() {
        return novedad;
    }

    public String getProceso() {
        return proceso;
    }

    public HashSet getVacuna() {
        return vacuna;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public int getLote() {
        return lote;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public void setVacuna(HashSet vacuna) {
        this.vacuna = vacuna;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    
    
     @Override
    public int hashCode() {
        return idGallina; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Gallina gallina=(Gallina)obj;      
        if(gallina.idGallina==this.idGallina){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
    
    public boolean adicionarVacuna(Vacuna v){
        return vacuna.add(v);
    }
}
