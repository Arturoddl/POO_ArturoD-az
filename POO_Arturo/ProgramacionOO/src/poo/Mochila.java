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
public class Mochila {
    private String color;
    private double tamaño;
    private double peso;
    
    public Mochila(){
        this.color = "";
        this.tamaño = 0.0;
        this.peso = 0.0;
    }
    
    public Mochila(String color, double tamaño, double peso){
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
    }
    
  public String getColor(){
        return this.color;
    }
    public double getTamaño(){
        return this.tamaño;
    }
    public double getPeso(){
        return this.peso; 
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public void setTamaño(double tamaño){
         this.tamaño = tamaño;
    }
    public void setPeso(double peso){
        this.peso = peso;        
    }
    
}
