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
public class O_dias_del_mes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        int mes;
        
        System.out.println("\n________________15_________________\n");
        System.out.println("Digite un numero de 1 al 12 : ");
        mes = leer.nextInt();
        if (mes ==0 || mes >12) {
            System.out.println("Error, el limete es hasta el 12, por favor volverlo a intentar.");
        }
        if (mes==1) {
           System.out.println(" el # "+mes+" es el mes de Enero que tiene 31 días");
        }
        if (mes==2) {
           System.out.println(" el # "+mes+" es el mes de febrero que tiene 29 días");
        }
        if (mes==3) {
           System.out.println(" el # "+mes+" es el mes de marzo que tiene 31 dias");
        }
        if (mes==4) {
           System.out.println(" el # "+mes+" es el mes de abril que tene 30 dias");
        }
        if (mes==5) {
           System.out.println(" el # "+mes+" es el mes de mayo que tiene 31 dias");
        }
        if (mes==6) {
           System.out.println(" el # "+mes+" es el mes de junio que tiene 30 dias");
        }
        if (mes==7) {
           System.out.println(" el # "+mes+" es el mes de julio que tiene 31 dias ");
        }
        if (mes==8) {
           System.out.println(" el # "+mes+" es el mes de agosto que tiene 31 dias ");
        }
        if (mes==9) {
           System.out.println(" el # "+mes+" es el mes de  septiembre que tiene 30 dias");
        }
        if (mes==10) {
           System.out.println(" el # "+mes+" es el mes de octubre que tiene 31 dias");
        }
        if (mes==11) {
           System.out.println(" el # "+mes+" es el mes de noviembre que tiene 30 dias");
        }
        if (mes==12) {
           System.out.println(" el # "+mes+" es el mes de diciembre que tiene 31 días");
        }
        }catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
    
}
