/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte.Taller_estudiantes;

import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class Punto_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
      
        int  dias = 0, val = 0, horas = 0,restoSegundos = 0,segundos;
        System.out.println("\n Ingrese los segundos :\n");
        segundos = (int) leer.nextDouble();
        //86400 equivale a 1 dia en segundos
        if (segundos >= 86400) {
            dias = segundos / 86400;
            System.out.println("tienes " + dias + " dias.");
        }
        restoSegundos = segundos% 60;
        val = segundos / 60;
        int capCociente=val,restoMinutos = 0;
        for (int i = 0; i < 10; i++) {
            if (val >= 60) {
                restoMinutos=capCociente %60;
                horas = val / 60;
                if (horas<60) {
                    break;
                }
            }
        }
        System.out.println("tienes " + horas + " horas, "+restoMinutos+" minutos con "+ restoSegundos+" segundos");
        } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }
    //formula para la conversion:
    // https://www.google.com/search?q=formula+para+pasar+de+segundos+a+horas&rlz=1C1ALOY_esCO1047CO1047&ei=GQUZZN7dHeGawbkP6c-qsAY&ved=0ahUKEwiezsCw7Ov9AhVhTTABHemnCmYQ4dUDCA8&uact=5&oq=formula+para+pasar+de+segundos+a+horas&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIFCAAQgAQyBQgAEIAEMgYIABAWEB4yBggAEBYQHjIGCAAQFhAeMgYIABAWEB46CggAEEcQ1gQQsANKBAhBGABQhgpYnxFghxNoAnABeACAAYABiAHhBJIBAzAuNZgBAKABAcgBCMABAQ&sclient=gws-wiz-serp#kpvalbx=_zwYZZOrYB6exqtsPjsSJmAw_40
}
