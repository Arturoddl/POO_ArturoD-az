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
public class Computadora {

    @Override
    public String toString() {
        return "Computadora{" + "precio=" + precio + ", num_componentes=" + num_componentes + ", num_puertos=" + num_puertos + '}';
    }
    private double precio;
    private int num_componentes;
    private int num_puertos;
    
    public Computadora(){
        this.precio = 0.0;
        this.num_componentes = 0;
        this.num_puertos = 0;
    }
    
    public Computadora(double precio, int componentes, int puertos){
        this.precio = precio;
        this.num_componentes = componentes;
        this.num_puertos = puertos;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    public int getNum_componentes(){
        return this.num_componentes;
    }
    public int getNum_puertos(){
        return this.num_puertos; 
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setNum_Componentes(int num_componentes){
         this.num_componentes = num_componentes;
    }
    public void setNum_puertos(int num_puertos){
        this.num_puertos = num_puertos;        
    }
}
