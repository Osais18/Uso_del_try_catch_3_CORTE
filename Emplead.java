/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte.PrimerTaller3_semestre;

/**
 *
 * @author OSAIS
 */
public class Emplead {
    private String nombre;
    private double salario;

    public Emplead(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "-> Empleado";
    }
    
    public void incrementarsalario(){
    
        salario =salario + salario * 0.60;
    }
}
