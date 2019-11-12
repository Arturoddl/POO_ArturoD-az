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
public class Libro {
    private int paginas;
    private double peso;
    private String genero;
    
    public Libro(){
        this.paginas = 0;
        this.peso = 0.0;
        this.genero = "";
    }
    
    public Libro(int paginas, double peso, String genero){
        this.paginas = paginas;
        this.peso = peso;
        this.genero = genero;
    }
    
    public int getPaginas(){
        return this.paginas;
    }
    public double getPeso(){
        return this.peso;
    }
    public String getGenero(){
        return this.genero; 
    }
    
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    public void setPeso(double peso){
         this.peso = peso;
    }
    public void setGenero(String genero){
        this.genero = genero;        
    }
}
