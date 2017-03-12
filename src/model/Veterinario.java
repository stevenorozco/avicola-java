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
public class Veterinario extends Empleado {
    
    private int experiencia;
    private HashSet curso;

    public Veterinario(int experiencia, int id, int tel, String nombre, String cargo, String nivelPro, String area, double salario) {
        super(id, tel, nombre, cargo, nivelPro, area, salario);
        this.experiencia = experiencia;
        this.curso = new HashSet();
    }

    public int getExperiencia() {
        return experiencia;
    }

    public HashSet getCurso() {
        return curso;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setCurso(HashSet curso) {
        this.curso = curso;
    }
    
    public boolean adicionarCurso(Curso c){
        return curso.add(c);
    }
}
