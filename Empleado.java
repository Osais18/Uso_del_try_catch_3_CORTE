/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte.Taller_3;

/**
 *
 * @author Osais
 */
public class Empleado {
    private String nombre;
    private double salario;

    

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

   void incremento(){
       double incremento=salario+salario*0.20;
   }
    
    
    //encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + '}';
    }

    
}
