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
public class Peluche {
    //atributos
    private String relleno;
    private String nombre;
    private double precio;
    
    //métodos
    public Peluche(){
        this.relleno = "";
        this.nombre = "";
        this.precio = 0.0;
    }
    
    public Peluche(String relleno, String nombre, double precio){
        this.relleno = relleno;
        this.nombre = nombre;
        this.precio = precio;
        
    }
    
     public String getRelleno(){
        return this.relleno;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio; 
    }
    
    public void setRelleno(String relleno){
        this.relleno = relleno;
    }
    public void setNombre(String nombre){
         this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;        
    }
}
