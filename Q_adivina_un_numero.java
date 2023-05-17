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
public class Q_adivina_un_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        System.out.println("\n________________17_________________\n");
        int aleatorio = 0, numElegido = 0, fallos = 0;
        aleatorio = (int) (Math.random() * 100);
        System.out.println(" randon es "+aleatorio);
        for (int i = 0; i < 10; i++) {
            System.out.println("\n_________Adivina el nuemro oculto entre 1 y 100. ¿ Cual crees que es el numero oculto? : _________\n");
            numElegido = leer.nextInt();
            
            if (numElegido != 0) {
                if (numElegido == aleatorio) {
                    fallos++;
                    System.out.println(" Feicidades!, acertastes, el numero ingresado es " + numElegido + " y el numero oculto era " + aleatorio + " y acertastes en tan solo el intento " + fallos);
                    break;
                } else {
                    
                    if (fallos <= 11) {
                        if (numElegido < aleatorio) {
                            System.out.println("\nNo es el numero oculto pero el dato que ingresastes es < que el numero oculto\n");
                        } else {
                            System.out.println("\nNo es el numero oculto pero el dato que ingresastes es > que el numero oculto\n");
                        }
                        if (numElegido == aleatorio) {
                            System.out.println("\nFeicidades!, acertastes, el numero ingresado es " + numElegido + " , el numero oculto era " + aleatorio + " y  tan solo perdistes : " + fallos+"\n");
                            break;
                        }
                        fallos++;
                    } else {
                        System.out.println(" Has fallado 10 intentos, por ende, has perdido, ya qe el numero oculto era" + aleatorio + " y no acertastes");
                    }
                }
            } else {
                System.out.println(" El valor ingresado es 0, y el numero oculto solo esta entre 1 y 100");
            }

        }
        }catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
}
