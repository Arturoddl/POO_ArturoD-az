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
public class Casa {
    private int cuartos;
    private int pisos;
    private double tamaño;
    
    public Casa(){
        this.cuartos = 0;
        this.pisos = 0;
        this.tamaño = 0.0;
    }
    
    public Casa(int cuartos, int pisos, double tamaño){
        this.cuartos = cuartos;
        this.pisos = pisos;
        this.tamaño = tamaño;
    }
    
    public int getCuartos(){
        return this.cuartos;
    }
    public int getPisos(){
        return this.pisos;
    }
    public double getTamaño(){
        return this.tamaño; 
    }
    
    public void setCuartos(int cuartos){
        this.cuartos = cuartos;
    }
    public void setPisos(int pisos){
         this.pisos = pisos;
    }
    public void setTamaño(double tamaño){
        this.tamaño = tamaño;        
    }
}
