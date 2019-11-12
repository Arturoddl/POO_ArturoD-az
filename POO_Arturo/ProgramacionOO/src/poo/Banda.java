/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author usuario
 */
public class Banda {
    private int miembros;
    private String canciones;
    private String nombre;
    
    public Banda(){
        this.miembros = 0;
        this.canciones = "";
        this.nombre = "";
    }
    
    public Banda(int miembros, String canciones, String nombre){
        this.miembros = miembros;
        this.canciones = canciones;
        this.nombre = nombre;
    }
    
    public int getMiembros(){
        return this.miembros;
    }
    public String getCanciones(){
        return this.canciones;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setMiembros(int miembros){
        this.miembros = miembros;
    }
    public void setCanciones(String canciones){
        this.canciones = canciones;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
