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
public class Chancla {
    private String forma;
    private String color;
    private double peso;
    
    public Chancla(){
        this.forma = "";
        this.color = "";
        this.peso = 0.0;
    }
    
    public Chancla(String forma, String color, double peso){
        this.forma = forma;
        this.color = color;
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
