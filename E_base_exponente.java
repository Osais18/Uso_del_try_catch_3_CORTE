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
public class E_base_exponente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("\n________________5_________________\n");

            double base, exponente, resultado = 0;
            System.out.println("inserete la base: ");
            base = leer.nextInt();
            System.out.println("inserte el exponente: ");
            exponente = leer.nextInt();

            if (exponente >= 0) {
                resultado = Math.pow(base, exponente);
                System.out.println("");
                System.out.println("el resultado de " + base + "^" + exponente + " es " + (int) resultado);
            } else {
                exponente = exponente * (-1);
                resultado = Math.pow(base, exponente);
                System.out.println("el resultado de " + base + "^" + exponente + " es 1/" + (int) resultado);
            }
        } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }

    }

}
