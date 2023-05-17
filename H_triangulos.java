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
public class H_triangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner leer = new Scanner(System.in);
            int l1, l2, l3, cont = 0;
            System.out.println("\n________________8_________________\n");
            System.out.println("\nclasificacion de los triangulos\n");
            System.out.println(" Digite el tamaño del lado 1 :");
            l1 = leer.nextInt();
            System.out.println(" Digite el tamaño del lado 2 :");
            l2 = leer.nextInt();
            System.out.println(" Digite el tamaño del lado 3 :");
            l3 = leer.nextInt();

            if (l1 == l2 && l2 == l3 && l1 == l3) {
                System.out.println(" Es triangulo equilatero");
                cont++;
            }
            if (l1 > l2 && l1 > l3) {
                double val1 = Math.pow(l2, 2);
                double val2 = Math.pow(l3, 2);
                double val3 = val1 + val2;
                double val4 = Math.pow(l1, 2);
                if (val3 == val4) {
                    System.out.println(" es un triangulo rectangulo, su hipotenusa es : " + val4);
                }
            }
            if (l2 > l1 && l2 > l3) {
                double val1 = Math.pow(l1, 2);
                double val2 = Math.pow(l3, 2);
                double val3 = val1 + val2;
                double val4 = Math.pow(l2, 2);
                if (val3 == val4) {
                    System.out.println(" es un triangulo rectangulo, su hipotenusa es : " + val4);
                }
            }
            if (l3 > l2 && l3 > l1) {
                double val1 = Math.pow(l2, 2);
                double val2 = Math.pow(l1, 2);
                double val3 = val1 + val2;
                double val4 = Math.pow(l3, 2);
                if (val3 == val4) {
                    System.out.println(" es un triangulo rectangulo, su hipotenusa es : " + val4);
                }
            }
            if (l1 != l2 && l2 != l3 && l1 != l3) {
                System.out.println(" Es triangulo escaleno");
            }
            if (cont != 1) {
                if (l1 == l2 || l1 == l3 || l2 == l3 || l2 == l1 || l3 == 12 || 13 == l1) {
                    System.out.println(" Es triangulo isosceles");
                }
            }
        } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
}
