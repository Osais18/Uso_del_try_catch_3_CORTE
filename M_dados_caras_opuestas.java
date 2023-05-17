/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte.Taller_4;

import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class M_dados_caras_opuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        System.out.println("\n________________13_________________\n");
        int cara;
        String dado1 ="6",dado2="5",dado3="4",opuesto1="1",opuesto2="2",opuesto3="3";
        System.out.println(" Digite que numeros calleron segun el dado lanzado");
        cara = leer.nextInt();
        if (1>cara  || 6<cara ) {
            System.out.println(" ERROR: numero incorrecto");
        }
        int cap=cara;
        
        
        
        
        
        if ( cara == 6) {
            System.out.println(" El numero opuesto del dado "+cap+" es "+opuesto1);
        }
        if ( cara == 5) {
            System.out.println(" El numero opuesto del dado "+cap+" es "+opuesto2);
        }
        if ( cara == 4) {
            System.out.println(" El numero opuesto del dado "+cap+" es "+opuesto3);
        }
        
        
        
        if (cara == 1) {
            cara  = Integer.parseInt(dado1);
            System.out.println(" El numero opuesto del dado "+cap+" es "+cara);
        } 
        if (cara == 2) {
            cara  = Integer.parseInt(dado2);
            System.out.println(" El numero opuesto del dado  "+cap+" es "+cara);
        }
        if (cara == 3) {
            cara  = Integer.parseInt(dado3);
            System.out.println(" El numero opuesto del dado "+cap+" es "+cara);
        }
        
        }catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
}
