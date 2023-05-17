/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte.Taller_2;

import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class PalabraInvertida_COMPLETO {

    Scanner leer = new Scanner(System.in);
    String palabra;
    void ver() {
        System.out.print("\n Digite la palabra que se mostrara invertida  :\n ");
        palabra = leer.nextLine();
        char[] invertir = palabra.toCharArray();
        System.out.println("\n ____________ Usando for ____________\n");
        
        for (int cont = palabra.length() - 1; cont >= 0; cont--) {    //ok
            System.out.print(" "+invertir[cont]);
        }
        System.out.println("\n ____________ Usando while ____________\n");
        int cont2=palabra.length() - 1;
        while(cont2 >=0){
            System.out.print(" "+invertir[cont2]);     //ok
            cont2--;
        }
        System.out.println("\n ____________ Usando do while ____________\n");
        int cont3 =palabra.length() - 1;
        do {
            System.out.print(" "+invertir[cont3]);     //ok
            cont3--;
        } while (cont3 >=0);
        
    }
}
