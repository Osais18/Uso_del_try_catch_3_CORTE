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
public class J_vinicultores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        System.out.println("\n________________10_________________\n");
        int kilos;
        double precioInicial;
        String tipo;
        int tamano;
        System.out.println("Este programa calcula la ganancia según el tipo de vino, tamaño y cantidad vendida:");
        System.out.println("Introduce los Kg. de uva entregada: ");
        kilos = leer.nextInt();
        System.out.println("Digite el precio por kg : ");
        precioInicial = leer.nextDouble();
        System.out.println("Uva de valor \"A\" ó \"B\": ");
        tipo = leer.next();
        leer.nextLine();
        System.out.println("Tipo de uva \"1\" ó \"2\": ");
        tamano = leer.nextInt();
        if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) && (tamano == 1 || tamano == 2))) {
            System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
        } else {
            if (tipo.toUpperCase().equals("A") && tamano == 1) {
                System.out.println("La ganancia final es de: " + ((kilos * precioInicial) + (kilos * 0.20)));
            } else if (tipo.toUpperCase().equals("A") && tamano == 2) {
                System.out.println("La ganancia final es de: " + ((kilos * precioInicial) + (kilos * 0.30)));
            } else if (tipo.toUpperCase().equals("B") && tamano == 1) {
                System.out.println("La ganancia final es de: " + ((kilos * precioInicial) - (kilos * 0.30)));
            } else if (tipo.toUpperCase().equals("B") && tamano == 2) {
                System.out.println("La ganancia final es de: " + ((kilos * precioInicial) - (kilos * 0.50)));
            }
        }
    }catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }

}
