/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte.Taller_4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class C_division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        int n1, n2;
        System.out.println("\n________________3_________________\n");
        System.out.println("Digite el dividendo :");
        n1 = leer.nextInt();
        System.out.println("Digite el divisor :");
        n2 = leer.nextInt();
        int cap = n2;

        if (cap == 0) {
            System.out.println("Error, el divisor equivale aun valor  " + cap+" se le recuerda que no se pude dividir por un valor igual a 0");
        } else {
            DecimalFormat de = new DecimalFormat("#.0");
            double cap2 = Math.abs(n1 / n2);
            System.out.println(" La divicion entre " + n1 + " y " + cap + " es " + de.format(cap2));
        }
        
    } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
}
