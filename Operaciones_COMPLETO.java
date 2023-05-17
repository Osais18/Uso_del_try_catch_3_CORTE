/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte.Taller_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class Operaciones_COMPLETO {

    Scanner leer = new Scanner(System.in);
    Random obj = new Random();
    int t = obj.nextInt(9);
    double[] arreglo = new double[t];
    double[] arreglo2 = new double[t];
    double[] arreglo3 = new double[t];
    double[] arreglo4 = new double[t];
    double[] arreglo5 = new double[t];
    double[] arreglo_Burbuja = new double[t];
    double[] arreglo_Burbuja2 = new double[t];
    double[] arreglo_Burbuja3 = new double[t];
    double[] arreglo_Burbuja4 = new double[t];
    double[] arreglo_Burbuja5 = new double[t];
    double[] arreglo_Burbuja6 = new double[t];

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
            arreglo_Burbuja[i] = arreglo[i];
            arreglo_Burbuja2[i] = arreglo[i];
            arreglo_Burbuja3[i] = arreglo[i];
            arreglo_Burbuja4[i] = arreglo[i];
            arreglo_Burbuja5[i] = arreglo[i];
            arreglo_Burbuja6[i] = arreglo[i];
        }
    }

    void operar() {
        if (t >= 1) {
            //MEDIA
            System.out.println("\n_________PROMEDIO__________\n");
            //BUCLE CON FOR
            for (int i = 0; i <= arreglo.length - 1; i++) {
                A = arreglo[i] + A;
            }
            System.out.println(" El promedio con for es = " + A / t + " ok ");
            //BUCLE CON WHILE
            int cont = 0;
            while (cont <= arreglo.length - 1) {

                P = arreglo[cont] += P;
                cont = cont += 1;
            }
            System.out.println(" El promedio con  while es = " + P / t + " ok ");
            // BUCLE CON  DO WHILE
            int cont3 = 0;
            double variable3 = 0;
            do {
                variable3 = variable3 += arreglo2[cont3];
                cont3++;
            } while (cont3 <= arreglo2.length - 1);
            System.out.println(" El promedio con do while es " + variable3 / t + " ok");
            //MEDIA
            //for
            System.out.println("\n______________MEDIA______________\n");
            double AUX_1;
            for (int i = 0; i < arreglo_Burbuja.length - 1; i++) {
                for (int j = 0; j < arreglo_Burbuja.length - 1; j++) {
                    if (arreglo_Burbuja[j] > arreglo_Burbuja[j + 1]) {     //ordeno los numeros
                        AUX_1 = arreglo_Burbuja[j];
                        arreglo_Burbuja[j] = arreglo_Burbuja[j + 1];
                        arreglo_Burbuja[j + 1] = AUX_1;
                    }
                }
            }
            System.out.printf("\n El arreglo con for es: %s\n", Arrays.toString(arreglo_Burbuja) + ", Donde la media se encuentra en el medio.\n");

            //while
            int d = 0;
            while (d < arreglo_Burbuja2.length - 1) {
                d++;
                for (int j = 0; j < arreglo_Burbuja2.length - 1; j++) {
                    if (arreglo_Burbuja2[j] > arreglo_Burbuja2[j + 1]) {
                        AUX_1 = arreglo_Burbuja2[j];
                        arreglo_Burbuja2[j] = arreglo_Burbuja2[j + 1];
                        arreglo_Burbuja2[j + 1] = AUX_1;
                    }
                }
            }
            System.out.printf("\n El arreglo con while es: %s\n", Arrays.toString(arreglo_Burbuja2) + ", Donde la media se encuentra en el medio.\n");

            //do while
            int e = 0;
            do {
                e++;
                for (int j = 0; j < arreglo_Burbuja4.length - 1; j++) {
                    if (arreglo_Burbuja4[j] > arreglo_Burbuja4[j + 1]) {
                        AUX_1 = arreglo_Burbuja4[j];
                        arreglo_Burbuja4[j] = arreglo_Burbuja4[j + 1];
                        arreglo_Burbuja4[j + 1] = AUX_1;
                    }
                }
            } while (e < arreglo_Burbuja4.length - 1);
            System.out.printf("\n El arreglo con Do while es: %s\n", Arrays.toString(arreglo_Burbuja4) + ", Donde la media se encuentra en el medio.\n");
            System.out.println("\n______________MODA______________\n");
            //MODA
            //for
            double AUX_2;

            for (int i = 0; i < arreglo_Burbuja3.length - 1; i++) {
                for (int j = 0; j < arreglo_Burbuja3.length - 1; j++) {
                    if (arreglo_Burbuja3[j] > arreglo_Burbuja3[j + 1]) {
                        AUX_2 = arreglo_Burbuja3[j];
                        arreglo_Burbuja3[j] = arreglo_Burbuja3[j + 1];
                        arreglo_Burbuja3[j + 1] = AUX_2;
                    }
                }
            }
            System.out.printf("El arreglo con for es: %s\n", Arrays.toString(arreglo_Burbuja3));
            HashMap<Integer, Integer> mapa = new HashMap<>();
            for (int x = 0; x < arreglo_Burbuja3.length; x++) {
                int numero = (int) arreglo_Burbuja3[x];
                if (mapa.containsKey(numero)) {
                    mapa.put(numero, mapa.get(numero) + 1);
                } else {
                    mapa.put(numero, 1);
                }
            }
            int moda = 0, mayor = 0;
            for (HashMap.Entry<Integer, Integer> entry : mapa.entrySet()) {
                if (entry.getValue() > mayor) {
                    mayor = entry.getValue();
                    moda = entry.getKey();
                }
            }
            System.out.printf("\nLa moda con for es %d porque se repite %d veces\n", moda, mayor);
            //con while
            double AUX_4;
            int f = 0;
            while (f < arreglo_Burbuja6.length - 1) {
                f++;
                for (int j = 0; j < arreglo_Burbuja6.length - 1; j++) {
                    if (arreglo_Burbuja6[j] > arreglo_Burbuja6[j + 1]) {
                        AUX_4 = arreglo_Burbuja6[j];
                        arreglo_Burbuja6[j] = arreglo_Burbuja6[j + 1];
                        arreglo_Burbuja6[j + 1] = AUX_4;
                    }
                }
            }
            System.out.printf("\nEl arreglo con while es: %s\n", Arrays.toString(arreglo_Burbuja6));
            HashMap<Integer, Integer> mapa3 = new HashMap<>();
            for (int x = 0; x < arreglo_Burbuja6.length; x++) {
                int numero3 = (int) arreglo_Burbuja6[x];
                if (mapa3.containsKey(numero3)) {
                    mapa3.put(numero3, mapa3.get(numero3) + 1);
                } else {
                    mapa3.put(numero3, 1);
                }
            }
            int moda3 = 0, mayor3 = 0;
            for (HashMap.Entry<Integer, Integer> entry : mapa3.entrySet()) {
                if (entry.getValue() > mayor3) {
                    mayor3 = entry.getValue();
                    moda3 = entry.getKey();
                }
            }
            System.out.printf("\nLa moda con while es %d porque se repite %d veces\n", moda3, mayor3);

            //con do  while
            int g = 0;
            double AUX_3;
            do {
                g++;
                for (int j = 0; j < arreglo_Burbuja5.length - 1; j++) {
                    if (arreglo_Burbuja5[j] > arreglo_Burbuja5[j + 1]) {
                        AUX_3 = arreglo_Burbuja5[j];
                        arreglo_Burbuja5[j] = arreglo_Burbuja5[j + 1];
                        arreglo_Burbuja5[j + 1] = AUX_3;
                    }
                }
            } while (g < arreglo_Burbuja5.length - 1);
            System.out.printf("\nEl arreglo do while es: %s\n", Arrays.toString(arreglo_Burbuja5));
            HashMap<Integer, Integer> mapa2 = new HashMap<>();
            for (int x = 0; x < arreglo_Burbuja5.length; x++) {
                int numero2 = (int) arreglo_Burbuja5[x];
                if (mapa2.containsKey(numero2)) {
                    mapa2.put(numero2, mapa2.get(numero2) + 1);
                } else {
                    mapa2.put(numero2, 1);
                }
            }
            int moda2 = 0, mayor2 = 0;
            for (HashMap.Entry<Integer, Integer> entry : mapa2.entrySet()) {
                if (entry.getValue() > mayor2) {
                    mayor2 = entry.getValue();
                    moda2 = entry.getKey();
                }
            }
            System.out.printf("\nLa moda con Do while es %d porque se repite %d veces\n", moda2, mayor2);

        } else {
            System.out.println(" el valor aleatorio es -> " + 0 + " <- por lo tanto no se puede recorrer arreglos");
        }
    }
}
