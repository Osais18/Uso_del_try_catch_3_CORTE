/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte.Taller_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class Inventario_COMPLETO {

    Scanner leer = new Scanner(System.in);
    Random obj = new Random();
    int cantidad = obj.nextInt(23);
    String[] nombre = new String[cantidad];
    double[] precio = new double[cantidad];
    int[] cantidades = new int[cantidad];
//    int cont = cantidad, cont2 = cantidad, cont3 = cantidad;

    void for1() {
        int cont_Aux1 = cantidad;
        System.out.println("\n_____________FOR__________\n");
        System.out.println(" Items elegido aleatorio del 0 al 23 : " + cantidad + "\n");
        System.out.println("Ingrese en el inventario el nombre del procduto \n");
        for (int r = 0; r <= nombre.length - 1; r++) {
            System.out.println(" Procduto # " + cont_Aux1 + " : ");
            cont_Aux1--;
            nombre[r] = leer.nextLine();
        }
    }

    void for2() {
        int cont_Aux2 = cantidad;
        System.out.println("Ingrese en el inventario el precio del procduto \n");
        for (int i = 0; i <= precio.length - 1; i++) {
            System.out.println(" Precio $ del " + cont_Aux2 + " : ");
            cont_Aux2--;
            precio[i] = leer.nextDouble();
        }
    }

    void for3() {
        int cont_Aux3 = cantidad;
        System.out.println("Ingrese en el inventario la cantidad del procduto \n");
        for (int i = 0; i <= cantidades.length - 1; i++) {
            System.out.println(" Cantidad del # " + cont_Aux3 + " : ");
            cont_Aux3--;
            cantidades[i] = leer.nextInt();
        }
    }

    void for4() {
        int cont = 0;
        System.out.println("_____________PRODUCTOS__________");
        for (int a = 0; a <= cantidades.length - 1; a++) {
            cont++;
            System.out.println("Producto  # " + cont + " : " + nombre[a] + " , COSTO DE  $ " + precio[a] + " , CANTIDAD TOTAL : " + cantidades[a]);

        }
        
    }

    void while1() {
        System.out.println("\n_____________WHILE__________\n");
        int i = 0, contA = cantidad;
        System.out.println(" Items elegido aleatorio del 0 al 23 : " + cantidad + "\n");
        System.out.println("Ingrese en el inventario el nombre del procduto \n");
        while (i <= nombre.length - 1) {
            System.out.println(" Procduto # " + contA + " : ");
            nombre[i] = leer.nextLine();
            contA--;
            i++;
        }
    }

    void while2() {
        System.out.println("Ingrese en el inventario el precio del procduto \n");
        int e = 0, contB = cantidad;
        while (e <= nombre.length - 1) {
            System.out.println(" Precio $ del " + contB + " : ");
            precio[e] = leer.nextDouble();
            contB--;
            e++;
        }
    }

    void while3() {
        System.out.println("Ingrese en el inventario la cantidad del procduto \n");
        int i = 0, contC = cantidad;
        while (i <= nombre.length - 1) {
            System.out.println(" Cantidad del # " + contC + " : ");
            cantidades[i] = leer.nextInt();
            contC--;
            i++;
        }
    }

    void while4() {
        int cont = 0;
        System.out.println("_____________PRODUCTOS__________");
        for (int a = 0; a <= cantidades.length - 1; a++) {
            cont++;
            System.out.println("Producto  # " + cont + " : " + nombre[a] + " , COSTO DE  $ " + precio[a] + " , CANTIDAD TOTAL : " + cantidades[a]);
        }
    }

    void dowhile1() {
        System.out.println("\n_____________ DO WHILE__________\n");
        System.out.println(" Items elegido aleatorio del 0 al 23 : " + cantidad + "\n");
        int A_ = 0, cont_1 = cantidad;
        do {
            System.out.println("Ingrese en el inventario el nombre del procduto \n");
            nombre[A_] = leer.nextLine();
            cont_1--;
            A_++;
        } while (A_ <= nombre.length - 1);
    }

    void dowhile2() {
        int B_ = 0, cont_2 = cantidad;
        do {
            System.out.println(" Precio $ del " + cont_2 + " : ");
            precio[B_] = leer.nextDouble();
            cont_2--;
            B_++;
        } while (B_ <= nombre.length - 1);
    }

    void dowhile3() {
        int C_ = 0, cont_3 = cantidad;
        do {
            System.out.println(" Cantidad del # " + cont_3 + " : ");
            cantidades[C_] = leer.nextInt();
            cont_3--;
            C_++;
        } while (C_ <= nombre.length - 1);
    }

    void dowhile4() {
        int D_ = 0, cont_AUX = cantidad;
        System.out.println("_____________PRODUCTOS__________");
        do {
            cont_AUX++;
            System.out.println("Producto  # " + cont_AUX + " : " + nombre[D_] + " , COSTO DE  $ " + precio[D_] + " , CANTIDAD TOTAL : " + cantidades[D_]);
            D_++;
        } while (D_ <= nombre.length - 1);
    }
}
