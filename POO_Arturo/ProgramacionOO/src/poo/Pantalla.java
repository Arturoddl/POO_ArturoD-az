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
public class Pantalla {
    private String color; 
    private double peso;
    private String tamaño;
    
    public Pantalla(){
        this.color = "";
        this.peso = 0.0;
        this.tamaño = "";
    }
    
    public Pantalla(String color, double peso, String tamaño){
        this.color = color;
        this.peso = peso;
        this.tamaño = tamaño;
    }
    
     public String getColor(){
        return this.color;
    }
    public String getTamaño(){
        return this.tamaño;
    }
    public double getPeso(){
        return this.peso; 
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public void setTamaño(String tamaño){
         this.tamaño = tamaño;
    }
    public void setPeso(double peso){
        this.peso = peso;        
    }
}
