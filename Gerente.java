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
public class Gerente extends Directivo{

   

    public Gerente(String nombre,double salario) {
        super(nombre, salario);
    }

    @Override
    public String toString() {
        return this.getNombre()+" Gerente -> "+super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
