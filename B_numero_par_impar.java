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
public class B_numero_par_impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        int n1;
        System.out.println("\n________________2_________________\n");
        System.out.println("Digite el numero que tu desees contultar si es par o impar :");
        n1 = leer.nextInt();
        int resul = Math.abs(n1 % 2);
        if (resul == 1) {
            System.out.println(" el numero " + n1 + " es impar :" + resul);
        } else {

            System.out.println("el numero " + n1 + " es par :" + resul);

        }
    }catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
}
