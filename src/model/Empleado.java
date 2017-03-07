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
public class Empleado {
    
    private int id, tel;
    private String nombre, cargo, nivelPro, area;
    private double salario;
    
    public Empleado(int id, int tel, String nombre, String cargo, String nivelPro, String area, double salario){
        this.id = id;
        this.tel = tel;
        this.nombre = nombre;  
        this.cargo = cargo;
        this.nivelPro = nivelPro;
        this.salario = salario;
        this.area = area;
    }

    public Empleado(int experiencia, int id, int tel, String nombre, String cargo, String nivelPro, String area, double salario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public int getTel() {
        return tel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNivelPro() {
        return nivelPro;
    }

    public double getSalario() {
        return salario;
    }
    
    public String getArea() {
        return area;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNivelPro(String nivelPro) {
        this.nivelPro = nivelPro;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    
         @Override
    public int hashCode() {
        return id; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Empleado empleado=(Empleado)obj;      
        if(empleado.id==this.id){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
}
