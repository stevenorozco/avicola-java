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
        this.granja = new HashSet();
        this.veterinario = new HashSet();
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
    
    public boolean eliminarEmpleadoP(int id){
        boolean eliminado=false;
        Iterator i = empleadosP.iterator();
        while(i.hasNext()){
            Empleado empleadoP= (Empleado)i.next();
            if(empleadoP.getId() == id){
                eliminado = empleadosP.remove(empleadoP);
            }
        }
        return eliminado;
    }
    
    public boolean modificarEmpleadoP(Empleado e){
        boolean modificado=false;
        int id = e.getId();
        Iterator i = empleadosP.iterator();
        while(i.hasNext()){
            Empleado empleadoP = (Empleado)i.next();
            if(empleadoP.getId() == id){
                
                empleadoP.setTel(e.getTel());
                empleadoP.setNombre(e.getNombre());
                empleadoP.setCargo(e.getCargo());
                empleadoP.setNivelPro(e.getNivelPro());
                empleadoP.setArea(e.getArea());
                empleadoP.setSalario(e.getSalario());
                
                modificado = true;
                
            }else{
                modificado = false;
            }
        }
        return modificado;
    }
    
    public boolean modificarVeterinario(Veterinario v){
        boolean modificado=false;
        int id = v.getId();
        Iterator i = veterinario.iterator();
        while(i.hasNext()){
            Veterinario vet = (Veterinario)i.next();
            if(vet.getId() == id){
                
                vet.setExperiencia(v.getExperiencia());
                vet.setTel(v.getTel());
                vet.setNombre(v.getNombre());
                vet.setCargo(v.getCargo());
                vet.setNivelPro(v.getNivelPro());
                vet.setArea(v.getArea());
                vet.setSalario(v.getSalario());
                
                modificado = true;
                
            }else{
                modificado = false;
            }
        }
        return modificado;
    }
    
    public boolean eliminarVeterinario(int id){
        boolean eliminado=false;
        Iterator i = veterinario.iterator();
        while(i.hasNext()){
            Veterinario vet= (Veterinario)i.next();
            if(vet.getId() == id){
                eliminado = veterinario.remove(vet);
            }
        }
        return eliminado;
    }
 }
