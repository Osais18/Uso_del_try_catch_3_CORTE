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
public class G_puntos_centrales_circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("\n________________7_________________\n");
            double x1, y1, r1, x2, y2, r2, Distanc;
            System.out.println("introdusca los puntos centrales de la primera circunferencia:");
            System.out.print("x1= ");
            x1 = leer.nextDouble();
            System.out.println("y1= ");
            y1 = leer.nextDouble();
            System.out.println("introdusca el radio de la primera circunferencia:");
            r1 = leer.nextDouble();

            System.out.println("introdusca los puntos centrales de la segunda circunferencia:");
            System.out.println("x2=");
            x2 = leer.nextDouble();
            System.out.println("y2= ");
            y2 = leer.nextDouble();
            System.out.println("introdusca el radio de la segunda circunferencia:");
            r2 = leer.nextDouble();

            Distanc = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (Distanc > r1 + r2) {
                System.out.println("Las circunferencias son exteriores");
            } else if (Distanc == r1 + r2) {
                System.out.println("Las circunferencias son tangentes exteriores");
            } else if (Distanc > Math.abs(r1 - r2) && Distanc < r1 + r2) {
                System.out.println("Las circunferencias son secantes");
            } else if (Distanc == Math.abs(r1 - r2)) {
                System.out.println("Las circunferencias son tangentes interiores");
            } else if (Distanc < Math.abs(r1 - r2)) {
                System.out.println("Las circunferencias son interiores");
            } else if (Distanc == 0 && r1 == r2) {
                System.out.println("Las circunferencias son concéntricas");
            } else {
                System.out.println("Las circunferencias no se pueden clasificar");
            }
        } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
}
