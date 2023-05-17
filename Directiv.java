
import co.edu.udes.tercer_corte.PrimerTaller3_semestre.Emplead;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OSAIS
 */
public class Directiv extends Emplead {

    public Directiv(String nombre, double salario) {
        super(nombre, salario);
    }

    

    

    @Override
    public String toString() {
        return "-> Directivo" + super.toString();
    }
    
    
    
    @Override
    public void incrementarsalario(){
    
        this.setSalario(this.getSalario() + this.getSalario() * 0.40);
    }
}
