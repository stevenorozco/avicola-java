/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
/**
 *
 * @author juan
 */
public class Produccion {
    
    private HashSet empleadosP;
    private HashSet granja;
    private HashSet veterinario;
    
    public Produccion(){
        
        this.empleadosP = new HashSet();       
    }

    public HashSet getEmpleadosP() {
        return empleadosP;
    }

    public void setEmpleadosP(HashSet empleadosP) {
        this.empleadosP = empleadosP;
    }

    public HashSet getGranja() {
        return granja;
    }

    public void setGranja(HashSet granja) {
        this.granja = granja;
    }   
    
    public boolean adicionarEmpleadoP(Empleado e){
        return empleadosP.add(e);
    }
    
    public boolean adicionarGranja(Granja g){
        return granja.add(g);
    }
    
    public boolean adicionarVeterinario(Veterinario v){
        return veterinario.add(v);
    }
    
    public Empleado consultarEmpleadoP(int id){
        Empleado empleado=null;
        Iterator i = empleadosP.iterator();
        while(i.hasNext()){
            Empleado empleadoP = (Empleado)i.next();
            if(empleadoP.getId() == id){
                empleado = empleadoP;
            }
        }
        return empleado;
    }
    
    public Granja consultarGranja(int idGranja){
        Granja granjas=null;
        Iterator i = granja.iterator();
        while(i.hasNext()){
            Granja granjaI = (Granja)i.next();
            if(granjaI.getIdGranja() == idGranja){
                granjas = granjaI;
            }
        }
        return granjas;
    }
    
    public Veterinario consultarVeterinario(int id){
        Veterinario veterinarios=null;
        Iterator i = veterinario.iterator();
        while(i.hasNext()){
            Veterinario veterinarioI = (Veterinario)i.next();
            if(veterinarioI.getId() == id){
                veterinarios = veterinarioI;
            }
        }
        return veterinarios;
    }
    
    
}
