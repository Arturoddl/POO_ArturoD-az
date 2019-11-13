/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Alumno
 */
public class Caja {

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    //Método equals()
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caja other = (Caja) obj;
        if (Double.doubleToLongBits(this.Ancho) != Double.doubleToLongBits(other.Ancho)) {
            return false;
        }
        if (Double.doubleToLongBits(this.Alto) != Double.doubleToLongBits(other.Alto)) {
            return false;
        }
        if (Double.doubleToLongBits(this.Profundidad) != Double.doubleToLongBits(other.Profundidad)) {
            return false;
        }
        return Double.doubleToLongBits(this.Volumen) == Double.doubleToLongBits(other.Volumen);
    }

    
    //Atributos.
    private double Ancho;        //Aquí se definen los atributos como privados
    private double Alto;         // para así solo tener acceso a ellos dentro de
    private double Profundidad;  // la misma clase.
    private double Volumen;
    
    
    //Métodos.
    public Caja(){
        this.Ancho=0;
        this.Alto=0;
        this.Profundidad=0;
      
    }
    
    Caja(double _ancho, double _alto, double _profundidad){
        this.Ancho = _ancho;
        this.Alto = _alto;
        this.Profundidad = _profundidad;
    }
    
    //Método Volúmen que retorna el volúmen de la caja.
    public double Volumen(double _volumen, double _ancho, double _alto, double _profundidad){
        _volumen = _ancho * _alto * _profundidad;
        return _volumen;
    }

    
    //Método toString();
    @Override
    public String toString() {
        return "Caja{" + "Volumen=" + Volumen + "Ancho=" + Ancho + ", Alto=" + Alto + ", Profundidad=" + Profundidad + '}';
    }
    
    //Se realiza el encapsulamiento de todos los métodos(Getter y Setter).
    public double getAncho() {
        return Ancho;
    }
    
    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public double getAlto() {
        return Alto;
    }

    public void setAlto(double Alto) {
        this.Alto = Alto;
    }

    public double getProfundidad() {
        return Profundidad;
    }

    public void setProfundidad(double Profundidad) {
        this.Profundidad = Profundidad;
    }
    
}
