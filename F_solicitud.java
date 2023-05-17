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
public class F_solicitud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner leer = new Scanner(System.in);
            double nota;
            int edad;

            String sexo;
            System.out.println("\n________________6_________________\n");
            System.out.println("\nDigite los valores para validadar la autorizacion de su solicitud\n");
            System.out.println("Digite la nota :");
            nota = leer.nextDouble();
            System.out.println("Digite la edad :");
            edad = leer.nextInt();
            System.out.println("Digite el sexo de la forma M para masculino o F para femenino :");
            sexo = leer.next();
            if (nota == 5 && edad == 18 && sexo.equals("M") || nota == 5 && edad == 18 && sexo.equals("m")) {

                System.out.println("POSIBLE");
            }
            // o de la forma :
            if (nota == 5 && edad == 18 && sexo.toUpperCase().equals("F")) {
                // si es f minuscula pasar a ser F mayuscula mediante el toUpperCase()
                System.out.println("ACEPTABLE");
            }
            if (nota == 5 && edad == 18 && sexo.equals("M") || nota == 5 && edad == 18 && sexo.equals("m") || nota == 5 && edad == 18 && sexo.equals("F") || nota == 5 && edad == 18 && sexo.equals("f")) {

            } else {
                System.out.println("NO ACEPTADA");
            }
        } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
}
