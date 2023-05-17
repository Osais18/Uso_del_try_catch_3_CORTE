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
public class k_pago_compañia_autobuses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);

            System.out.println("\n________________11_________________\n");
            double costo_por_alumno, numero_de_alumnos, pago_por_el_servicio;
            System.out.print("Digita la cantidad de alumnos: ");
            numero_de_alumnos = leer.nextDouble();
            leer.nextLine();
            costo_por_alumno = 0;
            pago_por_el_servicio = 0;
            if (numero_de_alumnos >= 100) {
                costo_por_alumno = 65;
                pago_por_el_servicio = costo_por_alumno * numero_de_alumnos;
            }
            if (numero_de_alumnos >= 50 && numero_de_alumnos < 100) {
                costo_por_alumno = 70;
                pago_por_el_servicio = costo_por_alumno * numero_de_alumnos;
            }
            if (numero_de_alumnos >= 30 && numero_de_alumnos < 50) {
                costo_por_alumno = 95;
                pago_por_el_servicio = costo_por_alumno * numero_de_alumnos;
            }
            if (numero_de_alumnos >= 30 && numero_de_alumnos < 50) {
                pago_por_el_servicio = 4000;
                costo_por_alumno = pago_por_el_servicio / numero_de_alumnos;
            }
            System.out.println("Valor de costo por alumno: " + costo_por_alumno);
            System.out.println("Valor de pago por el servicio: " + pago_por_el_servicio);
        } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }

}
