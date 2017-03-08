/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import model.*;

/**
 *
 * @author juan
 */
public class Controladora {
        Administrativo admin;
        Produccion prod;
        Lote lot;
        Galpon galpon;
        Granja granja;
        Veterinario veterinario;
       

    public Controladora() {
        admin = new Administrativo();
        prod = new Produccion();
        galpon = null;
        granja = null;
        lot = null;
        veterinario = null;      
    }
    
    
    public boolean adicionarEmpleadoA(int id, int tel, String nombre, String cargo, String nivelPro, String area, double salario){
        Empleado empA=new Empleado(id, tel, nombre, cargo, nivelPro, area, salario);
        return admin.adicionarEmpleadoA(empA);
    }
    
    public boolean adicionarEmpleadoP(int id, int tel, String nombre, String cargo, String nivelPro, String area, double salario){
        Empleado empP=new Empleado(id, tel, nombre, cargo, nivelPro, area, salario);
        return prod.adicionarEmpleadoP(empP);
    }
    
    public boolean adicionarVeterinario(int experiencia, int id, int tel, String nombre, String cargo, String nivelPro, String area, double salario){
        Veterinario vet=new Veterinario(experiencia, id, tel, nombre, cargo, nivelPro, area, salario);
        return prod.adicionarVeterinario(vet);
    }
    
    public boolean adicionarGranja(double cantGallinas, int idGranja){
        Granja granja=new Granja(cantGallinas, idGranja);
        return prod.adicionarGranja(granja);
    }
    
    public boolean adicionarGalponero(int id, int tel, String nombre, String cargo, String nivelPro, String area, double salario){
        Empleado galponero=new Empleado(id, tel, nombre, cargo, nivelPro, area, salario);
        return galpon.adicionarGalponero(galponero);
    }
    
    public boolean adicionarGallina(int edad, String raza, String novedad, String proceso, int idGallina, int lote){
        Gallina gallina=new Gallina(edad, raza, novedad, proceso, idGallina, lote);
        return lot.adicionarGallina(gallina);
    }
    
    public boolean adicionarGalpon(int idGalpon, String eventos, int capacidad){
        Galpon galpon=new Galpon(idGalpon, eventos, capacidad);
        return granja.adicionarGalpon(galpon);
    }
    
    public boolean adicionarGranjeros(int id, int tel, String nombre, String cargo, String nivelPro, String area, double salario){
        Empleado granjero=new Empleado(id, tel, nombre, cargo, nivelPro, area, salario);
        return granja.adicionarGranjeros(granjero);
    }
    
    public boolean adicionarCursos(String nombre, String fecha, String titulo, String institucion, double horas){
        Curso curso=new Curso(nombre, fecha, titulo, institucion, horas);
        return veterinario.adicionarCurso(curso);
    }
    
    public String consultarEmpleadoA(int id){
        String empleadoA;
        Empleado empA=admin.consultarEmpleadoA(id);
        if(empA != null){
            empleadoA = "Id: "+ empA.getId() +
                    "\n" + "Telefono: " + empA.getTel() +
                    "\n" + "Nombre: " + empA.getNombre() +
                    "\n" + "Cargo: " + empA.getCargo() +
                    "\n" + "Nivel profecional: " + empA.getNivelPro() +
                    "\n" + "Salario: " + empA.getSalario() +
                    "\n" + "Area: " + empA.getArea();
        }else{
            empleadoA = "No se encontró al empleado";
        }
        return empleadoA;       
    }
    
    public String consultarGalponero(int idGalponero){
        String galponero;
        Empleado galp=galpon.consultarGalponero(idGalponero);
        if(galp != null){
            galponero = "Id: "+ galp.getId() +
                    "\n" + "Telefono: " + galp.getTel() +
                    "\n" + "Nombre: " + galp.getNombre() +
                    "\n" + "Cargo: " + galp.getCargo() +
                    "\n" + "Nivel profecional: " + galp.getNivelPro() +
                    "\n" + "Salario: " + galp.getSalario() +
                    "\n" + "Area: " + galp.getArea();
        }else{
            galponero = "No se encontró al galponero";
        }
        return galponero;       
    }
    
    public String consultarGallina(int idGallina){
        String gallina;
        Gallina gall=lot.consultarGallina(idGallina);
        if(gall != null){
            gallina = "Edad: "+ gall.getEdad() +
                    "\n" + "Raza: " + gall.getRaza() +
                    "\n" + "Novedad: " + gall.getNovedad() +
                    "\n" + "Proceso: " + gall.getProceso() +
                    "\n" + "Vacuna: " + gall.getVacuna() +
                    "\n" + "Id: " + gall.getIdGallina() +
                    "\n" + "Lote: " + gall.getLote();
        }else{
            gallina = "No se encontró la gallina";
        }
        return gallina;       
    }    

    public String consultarGalpon(int idGalpon){
        String galpon;
        Galpon gal= granja.consultarGalpon(idGalpon);
        if(gal != null){
            galpon = "Id: "+ gal.getIdGalpon() +
                    "\n" + "Eventos: " + gal.getEventos() +
                    "\n" + "Capacidad: " + gal.getCapacidad();
        }else{
            galpon = "No se encontró el galpon";
        }
        return galpon;       
    }

    public String consultarGranjero(int idGranjero){
        String granjero;
        Empleado gran= granja.consultarGranjero(idGranjero);
        if(gran != null){
            granjero = "Id: "+ gran.getId() +
                    "\n" + "Telefono: " + gran.getTel() +
                    "\n" + "Nombre: " + gran.getNombre() +
                    "\n" + "Cargo: " + gran.getCargo() +
                    "\n" + "Nivel profecional: " + gran.getNivelPro() +
                    "\n" + "Salario: " + gran.getSalario() +
                    "\n" + "Area: " + gran.getArea();
        }else{
            granjero = "No se encontró al granjero";
        }
        return granjero;       
    }

    public String consultarEmpleadoP(int id){
        String empleadoP;
        Empleado empP=prod.consultarEmpleadoP(id);
        if(empP != null){
            empleadoP = "Id: "+ empP.getId() +
                    "\n" + "Telefono: " + empP.getTel() +
                    "\n" + "Nombre: " + empP.getNombre() +
                    "\n" + "Cargo: " + empP.getCargo() +
                    "\n" + "Nivel profecional: " + empP.getNivelPro() +
                    "\n" + "Salario: " + empP.getSalario() +
                    "\n" + "Area: " + empP.getArea();
        }else{
            empleadoP = "No se encontró al empleado";
        }
        return empleadoP;       
    }

    public String consultarGranja(int idGranja){
        String granja;
        Granja gran= prod.consultarGranja(idGranja);
        if(gran != null){
            granja = "Cantidad Gallinas: "+ gran.getCantGallinas() +
                    "\n" + "Id: " + gran.getIdGranja();
        }else{
            granja = "No se encontró la granja";
        }
        return granja;       
    }

    public String consultarVeterinario(int id){
        String veterinario;
        Veterinario vet=prod.consultarVeterinario(id);
        if(vet != null){
            veterinario = "Id: "+ vet.getId() +
                    "\n" + "Telefono: " + vet.getTel() +
                    "\n" + "Nombre: " + vet.getNombre() +
                    "\n" + "Cargo: " + vet.getCargo() +
                    "\n" + "Nivel profecional: " + vet.getNivelPro() +
                    "\n" + "Salario: " + vet.getSalario() +
                    "\n" + "Area: " + vet.getArea() +
                    "\n" + "Experiencia laboral: " + vet.getExperiencia() +
                    "\n" + "Cursos: " + vet.getCurso();
        }else{
            veterinario = "No se encontró al veterinario";
        }
        return veterinario;       
    }
    
    public boolean eliminarEmpleadoP(int id){
        return prod.eliminarEmpleadoP(id);
    }
    
    public boolean modificarEmpleadoP(int id, int tel, String nombre, String cargo, String nivelPro, String area, double salario){
        Empleado e=new Empleado(id, tel, nombre, cargo, nivelPro, area, salario);
        return prod.modificarEmpleadoP(e);
    }
    
    
}
