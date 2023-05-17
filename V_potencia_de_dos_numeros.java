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
public class V_potencia_de_dos_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        System.out.println("\n________________22_________________\n");
        double base,uno=0;
        int exponente;
        System.out.println("\nPara calcular la potencia, digite el primer numero que sera la base:\n ");
        base = leer.nextDouble();
        System.out.println("\nLuego digite el segundo numero que sera el exponente\n");
        exponente = leer.nextInt();
        System.out.println("la base es "+base+" y su exponente es "+exponente);
        do {
            uno =base * base;
        } while (false);
        
        for (int i = 0; i <= exponente-3; i++) {
            uno=(uno *base);
           
        }
         System.out.println("Resultado es = "+uno);
         }catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
}
