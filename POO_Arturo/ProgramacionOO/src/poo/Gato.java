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
public class Gato {
    private String nombre;
    private String raza;
    private String tamaño;
   
    //Métodos
    public Gato(){
        this.nombre = "";
        this.raza = "";
        this.tamaño = "";
    }
    
    public Gato(String nombre, String raza, String tamaño){
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getRaza(){
        return this.raza;
    }
    public String getTamaño(){
        return this.tamaño; 
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRaza(String raza){
         this.raza = raza;
    }
    public void setTamaño(String tamaño){
        this.tamaño = tamaño;        
    }
}
