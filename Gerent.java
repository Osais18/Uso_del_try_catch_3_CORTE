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
public class Gerent extends Emplead{

    public Gerent(String nombre, double salario) {
        super(nombre, salario);
    }
    
    
   
    @Override
    public String toString() {
        return this.getNombre() + "-> Gerente" + super.toString();
    }
   
    @Override
    public void incrementarsalario(){
    
        this.setSalario(this.getSalario() + this.getSalario() * 0.20);
    }
}
