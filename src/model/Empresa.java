/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author juan
 */
public class Empresa {
    
    private Produccion produccion;
    private Administrativo administrativo;
    
    public Empresa(Produccion produccion, Administrativo administrativo){
        
        this.administrativo = administrativo;
        this.produccion = produccion;
    }
    
    public Administrativo getAdminitrativo() {
        return administrativo;
    }
    
    public Produccion getProduccion(){
        return produccion;
    }


    public void setAdministrativo(Administrativo administrativo){
        this.administrativo = administrativo;
    }
    
    public void setProduccion(Produccion produccion){
        this.produccion = produccion;
    }
}
