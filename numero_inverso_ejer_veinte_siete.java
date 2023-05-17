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
public class numero_inverso_ejer_veinte_siete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("\n________________27_________________\n");
            int[] num = new int[10];
            int cont = 0;
            System.out.println("\nIngrese de uno en uno, los 10 numeros :\n");

            for (int i = 0; i < 10; i++) {
                cont++;
                System.out.println("\n# " + cont + " es : \n");
                num[i] = leer.nextInt();
            }
            System.out.println("\nLos datos digitados se mostraran al inverso : \n");
            for (int i = 9; i >= 0; i--) {
                System.out.print("Numero " + (i + 1) + " ahora es = " + num[i] + " ; ");
            }
        } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
}
