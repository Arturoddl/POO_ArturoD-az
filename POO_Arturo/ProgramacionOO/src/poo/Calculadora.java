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
public class Calculadora {
    private
         double precio;
         double entrada;
         double salida;
    
    public Calculadora(){
        this.entrada = 0.0;
        this.precio = 0.0;
        this.salida = 0.0;
    }
    
    public Calculadora(double precio, double entradas, double salida){
        this.entrada = entradas;
        this.precio = precio;
        this.salida = salida;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    public double getEntrada(){
        return this.entrada;
    }
    public double getSalida(){
        return this.salida; 
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setEntrada(double entrada){
         this.entrada = entrada;
    }
    public void setSalida(double salida){
        this.salida = salida;        
    }
}
