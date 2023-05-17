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
public class R_numeros_introducir_cantidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        int cantidad,mayA0=0,menA0=0,iguA0=0;
        double num=0;
        System.out.println("\n________________18_________________\n");
        System.out.println("Digite la cantidad de numeros que deseas introducir ");
        cantidad = leer.nextInt();
        for (int i = 1; i <= cantidad ; i+=1) {
            
            System.out.println("\nDigite el valor # " +i+" :\n");
            num=leer.nextDouble();
            if (num>0) {
                mayA0++;
            }
            if (num<0) {
                menA0++;
            }
            if (num==0) {
                iguA0++;
            }
            
        }
        System.out.println("Existen "+mayA0+" numeros mayores que 0");
        System.out.println("Existen "+menA0+" numeros menores que 0");
        System.out.println("Existen "+iguA0+" numeros iguales que 0");
        }catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
}
