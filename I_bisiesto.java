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
public class I_bisiesto {

    // CONDICIONES PARA QUE SEA BISIESTOUN AÑO:
    
    // 1  El año es divisible por 4 y elresto debe dar 0
    // 2 no debe ser divisible por 100
    // 3 El año es divisible por 400 y elresto debe dar 0
    
    public static void main(String[] args) {
        
        try{Scanner leer = new Scanner(System.in);
        int year,div,div2,div3;
        System.out.println("\n________________9_________________\n");
        System.out.println("Digite el año que deseas saber si es bisiesto :"); 
        year =leer.nextInt();
        int cap = year;
        div = year%4;
        div2 = year%100;
        div3= year%400;
        
        if ( div == 0 && div2 != 0) {
            System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año "+year+" es bisesto ");
        }
            
        if (div == 0 && div ==0) {
            System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año "+year+" es bisesto ");
        } else{
            System.out.println(" las condiciones son inciertas, por ende "+year+" no es un año bisiesto");
        }}catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
        // en dado caso, comprobar https://www.calculadoras.uno/ano-bisiesto/
    }
}
