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
public class N_dias_de_la_semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        int dia;
        System.out.println("\n________________14_________________\n");
        System.out.println("\n Digite el numero de uno de los dias de la semana, recordemos que son 7 : \n");
        dia = leer.nextInt();
        
        if (dia>7 || dia ==0) {
            System.out.println(" Error, solo son 7 dias los que contiene un semana, por favor, intente nuevamente.");
        }
        if (dia==1) {
            System.out.println(" el # "+dia+" es el dia lunes");
        }
        if (dia==2) {
            System.out.println(" el # "+dia+" es el dia martes");
        }if (dia==3) {
            System.out.println(" el # "+dia+" es el dia miercoles");
        }
        if (dia==4) {
            System.out.println(" el # "+dia+" es el dia jueves");
        }
        if (dia==5) {
            System.out.println(" el # "+dia+" es el dia viernes");
        }
        if (dia==6) {
            System.out.println(" el # "+dia+" es el dia sabado");
        }
        if (dia==7) {
            System.out.println(" el # "+dia+" es el dia domingo");
        }
        }catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
    
}
