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
public class L_calculadora_llamada_por_persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("\n________________12_________________\n");
            Scanner leer = new Scanner(System.in);
            int duracion;
            String dia, horario;
            double precio, impuesto;
            // Solicitud de datos al usuario
            System.out.println("Calculamos el precio base de la llamada y el impuesto a pagar:");
            System.out.print("Duración de la llamada en minutos: ");
            duracion = leer.nextInt();
            System.out.println("Día de la semana: ");
            dia = leer.next();
            leer.nextLine();

            // Calculamos el precio base a pagar:
            if (duracion > 10) {
                precio = 3;
            } else if (duracion > 8) {
                precio = 2.5;
            } else if (duracion > 5) {
                precio = 1.80;
            } else {
                precio = 1;
            }

            // Preguntamos día y calculamos impuesto correspondiente.
            if (!dia.toUpperCase().equals("DOMINGO")) {
                System.out.println("¿La llamada se realizó en horario de mañana o tarde? ");
                horario = leer.nextLine();
                if (horario.toUpperCase().equals("MAÑANA")) {
                    impuesto = precio * 0.15;
                } else if (horario.toUpperCase().equals("TARDE")) {
                    impuesto = precio * 0.10;
                    // Si el horario es incorrecto se dará valor 0 al impuesto y el programa 
                    // presentará error.
                } else {
                    impuesto = 0;
                }
            } else {
                impuesto = precio * 0.03;
            }

            // Mostramos resultado en pantalla, si horario incorrecto, mostrará error.
            if (impuesto == 0) {
                System.out.println("El horario introducido es incorrecto, reinicia el programa "
                        + "e introduce los valores correctos.");
            } else {
                System.out.println("El precio total de la llamada es de " + (precio + impuesto)
                        + " siendo el precio base de " + precio + " y el impuesto a pagar " + impuesto);
            }
        } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
}
