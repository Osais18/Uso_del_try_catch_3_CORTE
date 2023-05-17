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
public class A_mayor_o_igual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner leer = new Scanner(System.in);
            int n1, n2;
            System.out.println("\n________________1_________________\n");
            System.out.println("Digite el numero 1");
            n1 = leer.nextInt();
            System.out.println("Digite el numero 2");
            n2 = leer.nextInt();

            if (n1 == n2) {
                System.out.println(" los valores " + n1 + " y " + n2 + " son iguales ");
            }
            if (n1 != n2) {
                if (n1 > n2) {
                    System.out.println(" el valor  " + n1 + "  es mayor que " + n2 + "  ");
                } else {
                    System.out.println(" el valor  " + n1 + "  es menor que " + n2 + "  ");
                }
            }
        } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }

    }

}
