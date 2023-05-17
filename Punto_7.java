/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte.Taller_estudiantes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class Punto_7 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        int a = 0, b = 0, indice = 0;
        System.out.print("\n____Ingrese el tamaño de los vectores : ____\n ");
        int cantidad = leer.nextInt();

        int[] vec_1 = new int[cantidad];
        int[] vec_2 = new int[cantidad];
        int cant_por_dos = (int) Math.pow(cantidad, 2);
        int[] resultadoVec1_2 = new int[cant_por_dos];
        for (int j = 0; j < cantidad; j++) {
            System.out.println("\nIngrese el  dato del primer vector : \n");
            vec_1[j] = leer.nextInt();
            System.out.println("Ingrese los elementos del segundo vector:");
            vec_2[j] = leer.nextInt();
        }
        while (a < cantidad && b < cantidad) {
            if (vec_1[a] < vec_2[b]) {
                resultadoVec1_2[indice++] = vec_1[a++];
            } else {
                resultadoVec1_2[indice++] = vec_2[b++];
            }
        }

        while (a < cantidad) {
            resultadoVec1_2[indice++] = vec_1[a++];
        }

        while (b < cantidad) {
            resultadoVec1_2[indice++] = vec_2[b++];
        }
        System.out.println("\nLa funcion de los dos vectores es :\n");
        for (int l = 0; l < cant_por_dos; l++) {
            Arrays.sort(resultadoVec1_2);
            System.out.print(resultadoVec1_2[l] + " ");
        }
         } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
}
