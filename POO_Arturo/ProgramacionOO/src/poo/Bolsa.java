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
public class Bolsa {
    private String tamaño;
    private String forma;
    private String color;
    
    public Bolsa(){
        this.tamaño = "";
        this.forma = "";
        this.color = "";
    }
    
    public Bolsa(String tamaño, String forma, String color){
        this.tamaño = tamaño;
        this.forma = forma;
        this.color = color;
    }
    
    public String getTamaño(){
        return this.tamaño;
    }
    public String getForma(){
        return this.forma;
    }
    public String getColor(){
        return this.color;
        
    }
    
    public void setTamaño(String tamaño)
    {
        this.tamaño = tamaño;
    }
    public void setForma(String forma){
         this.forma = forma;
    }
    public void setColor(String color){
        this.color = color;        
    }
}

