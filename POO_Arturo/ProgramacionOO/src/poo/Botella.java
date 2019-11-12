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
public class Botella {
    private
        String color;
        double altura;
        double capacidad;
    
    public Botella(){
        this.color = "";
        this.altura = 0.0;
        this.capacidad = 0.0;
    }
    
    public Botella(String color, double altura, double capacidad){
        this.color = color;
        this.altura = altura;
        this.capacidad = capacidad;
    }
    
    public String getColor(){
        return this.color;
    }
    public double getAltura(){
        return this.altura;
    }
    public double getCapacidad(){
        return this.capacidad; 
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public void setAltura(double altura){
         this.altura = altura;
    }
    public void setCapacidad(double capacidad){
        this.capacidad = capacidad;        
    }
}
