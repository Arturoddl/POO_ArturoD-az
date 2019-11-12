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
public class Lapicera {
    private String color;
    private String tamaño;
    private String marca;
    
    public Lapicera(){
        this.color = "";
        this.tamaño = "";
        this.marca = "";
    }
    
    public Lapicera(String color, String tamaño, String marca){
        this.color = color;
        this.tamaño = tamaño;
        this.marca = marca;
    }
    
     public String getColor(){
        return this.color;
    }
    public String getTamaño(){
        return this.tamaño;
    }
    public String getMarca(){
        return this.marca; 
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public void setTamaño(String tamaño){
         this.tamaño = tamaño;
    }
    public void setMarca(String marca){
        this.marca = marca;        
    }
}

