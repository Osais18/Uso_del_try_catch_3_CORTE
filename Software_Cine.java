/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte;

import co.edu.udes.tercer_corte.SubmenuOpcion_OrdenGrafico_Cine;
import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class Software_Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner leer = new Scanner(System.in);

            System.out.println("\n______Bienvenido a nuestro nuevo software, selecciona la opcion deseada del cine :______\n");
            System.out.println("\n Opcion 1, mostrar submenu para los clientes    \n");
            System.out.println("\n Opcion 2, mostrar submenu para los empleados  \n");
            System.out.println("\n Opcion 3, mostrar submenu para los productos comestibles  \n");
            System.out.println("\n Opcion 4, mostrar submenu para las salas  \n");
            System.out.println("\n Opcion 5, mostrar submenu para los tickets  \n");
            System.out.println("\n Opcion 6, salir del software \n");
            int op = leer.nextInt();

            if (op == 6) {
            } else {
                switch (op) {
                    case 1: // SuperCliente
                        String nombre_A,
                         cedula_A,
                         arl_A,
                         edad_A;
                        int op2_A,
                         op3_A,
                         ticketsComprados;

                        boolean validador_A = false,
                         validador2_A = false;
                        SubmenuOpcion_OrdenGrafico_Cine verSubMenu_A = new SubmenuOpcion_OrdenGrafico_Cine();

                        while (validador_A == false) {
                            int iterar_1_A = 0, iterar2_A = 0;
                            verSubMenu_A.verMenu();
                            op2_A = leer.nextInt();

                            if (op2_A == 3) {
                                validador_A = true;
                            }

                            if (op2_A == 1) {
                                System.out.println("\n Ingresa la cantidad a crear :\n");
                                int cantidad_A = leer.nextInt();     // CANTIDAD
                                CineCliente arreglo_A[] = new CineCliente[cantidad_A];

                                for (int i = 0; i < cantidad_A; i++) {
                                    iterar_1_A++;
                                    System.out.print("\n__________Item " + iterar_1_A + "__________\n");
                                    nombre_A = leer.nextLine();
                                    System.out.println("\n Digite el nombre del cliente en la taquilla del cine:\n");
                                    nombre_A = leer.nextLine();
                                    System.out.print("\n Digite la cedula del cliente en  taquilla del cine :\n");
                                    cedula_A = leer.next();
                                    System.out.print("\n Digite la edad del cliente en taquilla del cine:\n");
                                    edad_A = leer.next();
                                    System.out.print("\n Digite la cantidad de tickest a comprar por parte del cliente :\n");
                                    ticketsComprados = leer.nextInt();

                                    System.out.print(" ");
                                    arreglo_A[i] = new CineCliente(nombre_A, cedula_A, edad_A, ticketsComprados);
                                }
                                verSubMenu_A.verMenu2();
                                op3_A = leer.nextInt();
                                if (op3_A == 2) {

                                    for (int i = 0; i < cantidad_A; i++) {
                                        iterar2_A += 1;
                                        System.out.print("\n__________Item " + iterar2_A + "__________\n");
                                        System.out.println("\n" + arreglo_A[i].toString() + "\n");
                                    }
                                }
                                if (op3_A == 3) {
                                    System.out.println("\n_______Saliendo del menu_______\n");
                                }
                                if (op3_A == 1 || op3_A == 4) {
                                    System.out.println("\n_______La opcion ingresada no es existente_______\n");
                                }
                            }
                            if (op2_A == 2) {
                                System.out.println("\nLos atributos de los valores no tienen valor asignado, por ende estan null\n");
                            }
                        }
                        break;

                    case 2:
                        String nombre_B,
                         tipoEmpleado_B,
                         cedula_B;

                        double sueldo_B;

                        int op2_B,
                         op3_B;

                        boolean validador_B = false,
                         validador2_B = false;
                        SubmenuOpcion_OrdenGrafico_Cine verSubMenu_B = new SubmenuOpcion_OrdenGrafico_Cine();

                        while (validador_B == false) {
                            int iterar_1_B = 0, iterar2_B = 0;
                            verSubMenu_B.verMenu();
                            op2_B = leer.nextInt();

                            if (op2_B == 3) {
                                validador_B = true;
                            }

                            if (op2_B == 1) {
                                System.out.println("\n Ingresa la cantidad a crear :\n");
                                int cantidad_B = leer.nextInt();     // CANTIDAD
                                CineEmpleado arreglo_B[] = new CineEmpleado[cantidad_B];

                                for (int i = 0; i < cantidad_B; i++) {
                                    iterar_1_B++;
                                    System.out.print("\n__________Item " + iterar_1_B + "__________\n");
                                    nombre_B = leer.nextLine();
                                    System.out.println("\n Digite el nombre del empleado del cine:\n");
                                    nombre_B = leer.nextLine();
                                    System.out.print("\n Digite el tipo de cargo del empleado en el  cine:\n");
                                    tipoEmpleado_B = leer.next();
                                    System.out.print("\n Digite la cedula del empleado del cine :\n");
                                    cedula_B = leer.next();
                                    System.out.print("\n Digite el sueldo del empleado del cine :\n");
                                    sueldo_B = leer.nextDouble();

                                    System.out.print(" ");
                                    arreglo_B[i] = new CineEmpleado(nombre_B, tipoEmpleado_B, cedula_B, sueldo_B);
                                }
                                verSubMenu_B.verMenu2();
                                op3_B = leer.nextInt();
                                if (op3_B == 2) {

                                    for (int i = 0; i < cantidad_B; i++) {
                                        iterar2_B += 1;
                                        System.out.print("\n__________Item " + iterar2_B + "__________\n");
                                        System.out.println("\n" + arreglo_B[i].toString() + "\n");
                                    }
                                }
                                if (op3_B == 3) {
                                    System.out.println("\n_______Saliendo del menu_______\n");
                                }
                                if (op3_B == 1 || op3_B == 4) {
                                    System.out.println("\n_______La opcion ingresada no es existente_______\n");
                                }
                            }
                            if (op2_B == 2) {
                                System.out.println("\nLos atributos de los valores no tienen valor asignado, por ende estan null\n");
                            }
                        }

                        break;
                    case 3:
                        String nombre_C,
                         tamaño_C;
                        double precio_C;

                        int op2_c,
                         op3_c;

                        boolean validador_C = false,
                         validador2_C = false;
                        SubmenuOpcion_OrdenGrafico_Cine verSubMenu_A_C = new SubmenuOpcion_OrdenGrafico_Cine();

                        while (validador_C == false) {
                            int iterar_1_C = 0, iterar2_C = 0;
                            verSubMenu_A_C.verMenu();
                            op2_c = leer.nextInt();

                            if (op2_c == 3) {
                                validador_C = true;
                            }

                            if (op2_c == 1) {
                                System.out.println("\n Ingresa la cantidad a crear :\n");
                                int cantidad_C = leer.nextInt();     // CANTIDAD
                                CineProductoComida arreglo_C[] = new CineProductoComida[cantidad_C];

                                for (int i = 0; i < cantidad_C; i++) {
                                    iterar_1_C++;
                                    System.out.print("\n__________Item " + iterar_1_C + "__________\n");
                                    nombre_C = leer.nextLine();
                                    System.out.println("\n Digite el nombre del producto comestible a cancelar del cine:\n");
                                    nombre_C = leer.nextLine();
                                    System.out.print("\n Digite el tamaño del  producto comestible a cancelar del  cine:\n");
                                    tamaño_C = leer.next();
                                    System.out.print("\n Digite el tamaño del  producto comestible a cancelar del  cine:\n");
                                    precio_C = leer.nextDouble();

                                    System.out.print(" ");
                                    arreglo_C[i] = new CineProductoComida(nombre_C, tamaño_C, precio_C);
                                }
                                verSubMenu_A_C.verMenu2();
                                op3_c = leer.nextInt();
                                if (op3_c == 2) {

                                    for (int i = 0; i < cantidad_C; i++) {
                                        iterar2_C += 1;
                                        System.out.print("\n__________Item " + iterar2_C + "__________\n");
                                        System.out.println("\n" + arreglo_C[i].toString() + "\n");
                                    }
                                }
                                if (op3_c == 3) {
                                    System.out.println("\n_______Saliendo del menu_______\n");
                                }
                                if (op3_c == 1 || op3_c == 4) {
                                    System.out.println("\n_______La opcion ingresada no es existente_______\n");
                                }
                            }
                            if (op2_c == 2) {
                                System.out.println("\nLos atributos de los valores no tienen valor asignado, por ende estan null\n");
                            }
                        }
                        break;
                    case 4:
                        String nombre_D,
                         areaDeSala_D;
                        int cantidad_puestos_D;

                        int op2_D,
                         op3_D;

                        boolean validador_D = false,
                         validador2_D = false;
                        SubmenuOpcion_OrdenGrafico_Cine verSubMenu_D = new SubmenuOpcion_OrdenGrafico_Cine();

                        while (validador_D == false) {
                            int iterar_1_D = 0, iterar2_D = 0;
                            verSubMenu_D.verMenu();
                            op2_D = leer.nextInt();

                            if (op2_D == 3) {
                                validador_D = true;
                            }

                            if (op2_D == 1) {
                                System.out.println("\n Ingresa la cantidad a crear :\n");
                                int cantidad_D = leer.nextInt();     // CANTIDAD
                                CineSala arreglo_D[] = new CineSala[cantidad_D];

                                for (int i = 0; i < cantidad_D; i++) {
                                    iterar_1_D++;
                                    System.out.print("\n__________Item " + iterar_1_D + "__________\n");
                                    nombre_D = leer.nextLine();
                                    System.out.println("\n Digite el nombre de la sala de cine:\n");
                                    nombre_D = leer.nextLine();
                                    System.out.print("\n Digite el area del puesto en el que se enontrara dentro de la sala del cine:\n");
                                    areaDeSala_D = leer.next();
                                    System.out.print("\n Digite la cantidad de puestos de la sala del cine:\n");
                                    cantidad_puestos_D = leer.nextInt();

                                    System.out.print(" ");
                                    arreglo_D[i] = new CineSala(nombre_D, cantidad_puestos_D, areaDeSala_D);
                                }
                                verSubMenu_D.verMenu2();
                                op3_D = leer.nextInt();
                                if (op3_D == 2) {

                                    for (int i = 0; i < cantidad_D; i++) {
                                        iterar2_D += 1;
                                        System.out.print("\n__________Item " + iterar2_D + "__________\n");
                                        System.out.println("\n" + arreglo_D[i].toString() + "\n");
                                    }
                                }
                                if (op3_D == 3) {
                                    System.out.println("\n_______Saliendo del menu_______\n");
                                }
                                if (op3_D == 1 || op3_D == 4) {
                                    System.out.println("\n_______La opcion ingresada no es existente_______\n");
                                }
                            }
                            if (op2_D == 2) {
                                System.out.println("\nLos atributos de los valores no tienen valor asignado, por ende estan null\n");
                            }
                        }
                        break;
                    case 5:
                        String NombrePelicula,
                         tipoPelicula,
                         bidimencion;

                        int op2_E,
                         op3_E;

                        boolean validador_E = false,
                         validador2_E = false;
                        SubmenuOpcion_OrdenGrafico_Cine verSubMenu_E = new SubmenuOpcion_OrdenGrafico_Cine();

                        while (validador_E == false) {
                            int iterar_1_E = 0, iterar2_E = 0;
                            verSubMenu_E.verMenu();
                            op2_E = leer.nextInt();

                            if (op2_E == 3) {
                                validador_E = true;
                            }

                            if (op2_E == 1) {
                                System.out.println("\n Ingresa la cantidad a crear :\n");
                                int cantidad_E = leer.nextInt();     // CANTIDAD
                                CineTicket arreglo_E[] = new CineTicket[cantidad_E];

                                for (int i = 0; i < cantidad_E; i++) {
                                    iterar_1_E++;
                                    System.out.print("\n__________Item " + iterar_1_E + "__________\n");
                                    NombrePelicula = leer.nextLine();
                                    System.out.println("\n Digite el nombre de la pelicula :\n");
                                    NombrePelicula = leer.nextLine();
                                    System.out.println("\n Digite el tipo/categoria de la pelicula :\n");
                                    tipoPelicula = leer.nextLine();
                                    System.out.print("\n Digite la opcion bidimencional, ya sea HD o 3D en la que desea ver la pelicula:\n");
                                    bidimencion = leer.next();

                                    System.out.print(" ");
                                    arreglo_E[i] = new CineTicket(NombrePelicula, tipoPelicula, bidimencion);
                                }
                                verSubMenu_E.verMenu2();
                                op3_E = leer.nextInt();
                                if (op3_E == 2) {

                                    for (int i = 0; i < cantidad_E; i++) {
                                        iterar2_E += 1;
                                        System.out.print("\n__________Item " + iterar2_E + "__________\n");
                                        System.out.println("\n" + arreglo_E[i].toString() + "\n");
                                    }
                                }
                                if (op3_E == 3) {
                                    System.out.println("\n_______Saliendo del menu_______\n");
                                }
                                if (op3_E == 1 || op3_E == 4) {
                                    System.out.println("\n_______La opcion ingresada no es existente_______\n");
                                }
                            }
                            if (op2_E == 2) {
                                System.out.println("\nLos atributos de los valores no tienen valor asignado, por ende estan null\n");
                            }
                        }
                        break;

                    default:
                        System.out.println("\nLa opcion ingresada no es existente, verifique  el valor ingresado e intente nuevamente.\n");
                }
            }
        } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");
        }

    }

}
