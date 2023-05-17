/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte.Taller_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class Operaciones {

    Scanner leer = new Scanner(System.in);
    Random obj = new Random();
    int t = obj.nextInt(10);
    double[] arreglo = new double[t];
    double[] arreglo2 = new double[t];
    double[] arreglo3 = new double[t];
    double[] arreglo4 = new double[t];
    double[] arreglo5 = new double[t];
    double A = 0, P = 0, B = 0, C = 0;
    //para promedio
    void ingresaDouble() {
        System.out.println("numero aleatorio es  = " + t);

        int cont = 0;
        for (int i = 0; i <= arreglo.length - 1; i++) {
            cont++;
            System.out.println("Ingresa tu double # " + cont + " :");
            arreglo[i] = leer.nextDouble();
            arreglo2[i] = arreglo[i];
            arreglo3[i] = arreglo[i];
            arreglo4[i] = arreglo[i];
            arreglo5[i] = arreglo[i];
        }
    }

    void operar() {
        if (t >= 1) {
            //MEDIA
            System.out.println("\n_________MEDIA__________\n");
            //BUCLE CON FOR
            for (int i = 0; i <= arreglo.length - 1; i++) {
                A = arreglo[i] + A;
            }
            System.out.println(" lA MEDIA con for es = " + A + " ok ");
            //BUCLE CON WHILE
            int cont = 0;
            while (cont <= arreglo.length - 1) {

                P = arreglo[cont] += P;
                cont = cont += 1;
            }
            System.out.println("LA MEDIA  con while es = " + P + " ok ");
            // BUCLE CON  DO WHILE
            int cont3=0;
            double variable3=0;
            do {
                variable3=variable3+=arreglo4[cont3];
                cont3=cont3 +=1;
            } while (cont3<=arreglo4.length-1);
            System.out.println(" La MEDIA con do while es "+variable3+" ok ");

            
            //PROMEDIO
            System.out.println("\n_______PROMEDIO_________\n");
            for (int i = 0; i <= arreglo2.length - 1; i++) {
                C = arreglo2[i] + C;
            }
            System.out.println("For la suma es  : " + C + ", promedio es " + C / t + " ok ");
//            //while
//            int cont_1=0,variableB=0;
//            while (cont_1 <= arreglo3.length - 1) {
//                arreglo3[cont_1]++;                                                   //incompleta
//                variableB = variableB += arreglo3[cont_1];
//                cont_1 = cont_1 += 1;
//            }
//            System.out.println("El promedio con whille es = " + variableB / t + " que es  la suma total " + variableB + " dividido por el total " + t);

            System.out.println("\n______________MODA______________\n");
            //MODA

        } else {
            System.out.println(" el valor aleatorio es -> " + t + " <- por lo tanto no se puede recorrer arreglos");
        }
    }
}
