/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.tercer_corte.Taller_estudiantes;

import java.util.Scanner;

/**
 *
 * @author LabSispc05
 */
public class Punto_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        String num ;
        System.out.print("\n Digite la palabra que se mostrara invertida  :\n ");
        num = leer.nextLine();
        char[] val = num.toCharArray();
        int cont2=0;
         for (int cont = num.length() - 1; cont >= 0; cont--) {    //ok
            System.out.print(" "+val[cont]);
            cont2++;
        }
         System.out.println(" la frace ingresada esta conformada por  "+cont2+" letras");
          } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
    
}
