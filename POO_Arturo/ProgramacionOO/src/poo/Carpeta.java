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
public class Carpeta {
    private
        String color;
        String forma;
        double peso;
    
    public Carpeta(){
        this.color = "";
        this.forma = "";
        this.peso = 0.0;
    }
    
    public Carpeta(String color, String forma, double peso){
        this.color = color;
        this.forma = forma;
        this.peso = peso;
    }
    
    public String getColor(){
        return this.color;
    }
    public String getForma(){
        return this.forma;
    }
    public double getPeso(){
        return this.peso; 
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public void setForma(String forma){
         this.forma = forma;
    }
    public void setPeso(double peso){
        this.peso = peso;        
    }
}
