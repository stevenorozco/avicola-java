/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author CapitalKings
 */
public class Lote {
    int id; 
    int cantidadGallinas; 
    private HashSet gallinas;
    String razaGallinas;

    public Lote(int id, int cantidadGallinas, HashSet gallinas) {
        this.id = id;
        this.cantidadGallinas = cantidadGallinas;
        this.gallinas = gallinas;
        this.razaGallinas = razaGallinas; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadGallinas() {
        return cantidadGallinas;
    }

    public void setCantidadGallinas(int cantidadGallinas) {
        this.cantidadGallinas = cantidadGallinas;
    }

    public String getRazaGallinas() {
        return razaGallinas;
    }

    public void setRazaGallinas(String razaGallinas) {
        this.razaGallinas = razaGallinas;
    }
    
    public boolean adicionarGallina(Gallina g){
        return gallinas.add(g);
    }
    
     public Gallina consultarGallina(int idGallina){
        Gallina gallina = null;
        Iterator i = gallinas.iterator();
        while(i.hasNext()){
            Gallina gallinaI = (Gallina)i.next();
            if(gallinaI.getIdGallina() == idGallina){
                gallina = gallinaI;
            }
        }
        return gallina;
     }
}
