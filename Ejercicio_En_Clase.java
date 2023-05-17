/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.udes.tercer_corte.PrimerTaller3_semestre;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Ejercicio_En_Clase {

    public static void main(String[] args) {
        
        try{
        
        Gerent D1 = new Gerent ("juan",2000);
        System.out.println(D1);
        D1.incrementarsalario();
        Gerent k = new Gerent ("a",3);
        incrementarsalario2(k);
        
        
        Tecnic D2 = new Tecnic("jose",3000);
        System.out.println(D2);
        D2.incrementarsalario();
         
//        Secretari D3 = new Secretari("luis",4000);
//        System.out.println(D3);
//        D3.incrementarsalario();
        
        Supervi D4 = new Supervi("carlos",5000);
        System.out.println(D4);
        D4.incrementarsalario();
        
        } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");
        }
        
        
    }
    
    public static void incrementarsalario2(Gerent g){
    
        g.setSalario(g.getSalario() + g.getSalario() * 0.20);
        
        System.out.println("se incremento el salario de " + g.getNombre());
        
    }
}
