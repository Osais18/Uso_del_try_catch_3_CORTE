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
public class maximo_minimo_ejer_veinti_ocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numero = new int[10];
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE, contDeFor,cont=0;
       
        System.out.println("\n________________28_________________\n");
        System.out.println("\nDigite los 10numero para calcular cual es el mayo y cual el menor.\n");
        for (contDeFor = 0; contDeFor < 10; contDeFor++) {
            cont++;
            System.out.println("\nIntroduce el número " + cont + ": \n");
            numero[contDeFor] = leer.nextInt();
            if (numero[contDeFor] < min) {
                min = numero[contDeFor];
            }
            if (numero[contDeFor] > max) {
                max = numero[contDeFor];
            }
        }
            System.out.println("\n__Ahora realizamos los calculos__\n");
        for (contDeFor = 0; contDeFor < 10; contDeFor++) {
            if (numero[contDeFor] == max) {
                System.out.println("\nnumero " + (contDeFor + 1) + " = " + numero[contDeFor] + " maximo.\n");
            }
            if (numero[contDeFor] == min) {
                System.out.println("\nnumero " + (contDeFor + 1) + " = " + numero[contDeFor] + " minimo.\n");
            }
            if (numero[contDeFor] == max || numero[contDeFor] == min) {
            } else {
                System.out.println("\nnumero " + (contDeFor + 1) + " = " + numero[contDeFor]+"\n");
            }
        }

    }

}
