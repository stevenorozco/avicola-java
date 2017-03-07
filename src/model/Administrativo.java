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
public class Administrativo {
    
    
    private HashSet empleadosA;
    
    public Administrativo(){
         
        this.empleadosA = new HashSet();       
    }

    public HashSet getEmpleadosA() {
        return empleadosA;
    }

    public void setEmpleadosA(HashSet empleadosA) {
        this.empleadosA = empleadosA;
    }
    
    public boolean adicionarEmpleadoA(Empleado e){
        return empleadosA.add(e);
    }
    
    public Empleado consultarEmpleadoA(int id){
        Empleado empleado=null;
        Iterator i = empleadosA.iterator();
        while(i.hasNext()){
            Empleado empleadoA = (Empleado)i.next();
            if(empleadoA.getId() == id){
                empleado = empleadoA;
            }
        }
        return empleado;
    }
}
