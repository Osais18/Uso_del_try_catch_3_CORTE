package co.edu.udes.tercer_corte;

import co.edu.udes.tercer_corte.SubmenuOpcion_ordenGrafio_Super;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class Software_Supermercado {

    public static void main(String[] args) throws ParseException {

        try {
            Scanner leer = new Scanner(System.in);
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println("\n______Bienvenido a nuestro nuevo software, selecciona la opcion deseada del supermercado :______\n");
            System.out.println("\n Opcion 1, mostrar submenu para los clientes    \n");
            System.out.println("\n Opcion 2, mostrar submenu para los empleados   \n");
            System.out.println("\n Opcion 3, mostrar submenu para los productos    \n");
            System.out.println("\n Opcion 4, mostrar submenu para los proveedores    \n");
            System.out.println("\n Opcion 5, mostrar submenu para las secciones    \n");
            System.out.println("\n Opcion 6, salir del software \n");
            int op = leer.nextInt();

            if (op == 6) {
            } else {
                switch (op) {
                    case 1: // SuperCliente
                        String nombre,
                         cedula,
                         email,
                         telefono;
                        Date fechadeNacimiento;
                        int op2,
                         op3;
                        boolean validador = false,
                         validador2 = false;
                        SubmenuOpcion_ordenGrafio_Super verSubMenu = new SubmenuOpcion_ordenGrafio_Super();

                        while (validador == false) {
                            int iterar = 0, iterar2 = 0;
                            verSubMenu.verMenu();
                            op2 = leer.nextInt();

                            if (op2 == 3) {
                                validador = true;
                            }

                            if (op2 == 1) {
                                System.out.println("\n Ingresa la cantidad a crear :\n");
                                int cantidad = leer.nextInt();     // CANTIDAD
                                SuperCliente arreglo[] = new SuperCliente[cantidad];

                                for (int i = 0; i < cantidad; i++) {
                                    iterar++;
                                    System.out.print("\n__________Item " + iterar + "__________\n");
                                    nombre = leer.nextLine();
                                    System.out.println("\n Digite el nombre del  cliente del supermercado :\n");
                                    nombre = leer.nextLine();
                                    System.out.print("\n Digite la cedula  del  cliente del supermercado :\n");
                                    cedula = leer.next();
                                    System.out.print("\n Digite el email del cliente del supermercado :\n");
                                    email = leer.next();
                                    System.out.print("\n Digite la fecha de nacimiento del cliente del supermercado teniendo en cuenta año/mes/dia:\n");
                                    fechadeNacimiento = formato.parse(leer.next());
                                    System.out.print("\n Digite el telefono del cliente del supermercado :\n");
                                    telefono = leer.next();
                                    System.out.print(" ");
                                    arreglo[i] = new SuperCliente(nombre, cedula, email, fechadeNacimiento, telefono);
                                }
                                verSubMenu.verMenu2();
                                op3 = leer.nextInt();
                                if (op3 == 2) {

                                    for (int i = 0; i < cantidad; i++) {
                                        iterar2 += 1;
                                        System.out.print("\n__________Item " + iterar2 + "__________\n");
                                        System.out.println("\n" + arreglo[i].toString() + "\n");
                                    }
                                }
                                if (op3 == 3) {
                                    System.out.println("\n_______Saliendo del menu_______\n");
                                }
                                if (op3 == 1 || op3 == 4) {
                                    System.out.println("\n_______La opcion ingresada no es existente_______\n");
                                }
                            }
                            if (op2 == 2) {
                                System.out.println("\nLos atributos de los valores no tienen valor asignado, por ende estan null\n");
                            }
                        }
                        break;

                    case 2:
                        String tipoEmpleado,
                         Nombre,
                         Cedula;
                        double Sueldo;

                        int op_2,
                         op_3;
                        boolean validador_1_1 = false,
                         validador_2_2 = false;
                        SubmenuOpcion_ordenGrafio_Super verSubMenu_2 = new SubmenuOpcion_ordenGrafio_Super();

                        while (validador_1_1 == false) {
                            int iterar_1 = 0, iterar_2 = 0;
                            verSubMenu_2.verMenu();
                            op_2 = leer.nextInt();

                            if (op_2 == 3) {
                                validador_1_1 = true;
                            }

                            if (op_2 == 1) {
                                System.out.println("\n Ingresa la cantidad a crear :\n");
                                int cantidad_2 = leer.nextInt();     // CANTIDAD
                                SuperEmpleado arreglo_2[] = new SuperEmpleado[cantidad_2];

                                for (int i = 0; i < cantidad_2; i++) {
                                    iterar_1++;
                                    System.out.print("\n__________Item " + iterar_1 + "__________\n");
                                    Nombre = leer.nextLine();
                                    System.out.println("\n Digite el tipo de empleado del supermercado :\n");
                                    tipoEmpleado = leer.nextLine();
                                    System.out.println("\n Digite el nombre del empleado del supermercado :\n");
                                    Nombre = leer.nextLine();
                                    System.out.print("\n Digite la cedula  del  empleado del supermercado :\n");
                                    Cedula = leer.nextLine();
                                    System.out.print("\n Digite el sueldo del empleado del supermercado :\n");
                                    Sueldo = leer.nextDouble();

                                    System.out.print(" ");
                                    arreglo_2[i] = new SuperEmpleado(tipoEmpleado, Nombre, Cedula, Sueldo);
                                }
                                verSubMenu_2.verMenu2();
                                op_3 = leer.nextInt();
                                if (op_3 == 2) {

                                    for (int i = 0; i < cantidad_2; i++) {
                                        iterar_2 += 1;
                                        System.out.print("\n__________Item " + iterar_2 + "__________\n");
                                        System.out.println("\n" + arreglo_2[i].toString() + "\n");
                                    }
                                }
                                if (op_3 == 3) {
                                    System.out.println("\n_______Saliendo del menu_______\n");
                                }
                                if (op_3 == 1 || op_3 == 4) {
                                    System.out.println("\n_______La opcion ingresada no es existente_______\n");
                                }
                            }
                            if (op_2 == 2) {
                                System.out.println("\nLos atributos de los valores no tienen valor asignado, por ende estan null\n");
                            }
                        }
                    case 3:
                        String nombree,
                         pasillo,
                         tipoProducto,
                         zona;
                        double preciO;
                        int op_2_3,
                         op_3_3;
                        boolean validador_1_3 = false,
                         validador_2_3 = false;
                        SubmenuOpcion_ordenGrafio_Super verSubMenu_3 = new SubmenuOpcion_ordenGrafio_Super();

                        while (validador_1_3 == false) {
                            int iterar_1_3 = 0, iterar2_2_3 = 0;
                            verSubMenu_3.verMenu();
                            op_2_3 = leer.nextInt();

                            if (op_2_3 == 3) {
                                validador_1_3 = true;
                            }

                            if (op_2_3 == 1) {
                                System.out.println("\n Ingresa la cantidad a crear :\n");
                                int cantidad_3 = leer.nextInt();     // CANTIDAD
                                SuperProducto arreglo_3[] = new SuperProducto[cantidad_3];

                                for (int i = 0; i < cantidad_3; i++) {
                                    iterar_1_3++;
                                    System.out.print("\n__________Item " + iterar_1_3 + "__________\n");
                                    nombre = leer.nextLine();
                                    System.out.println("\n Digite el nombre del  Producto  :\n");
                                    nombree = leer.nextLine();
                                    System.out.print("\n Digite el numero de pasillo  donde se encuentra el  producto :\n");
                                    pasillo = leer.next();
                                    System.out.print("\n Digite el tipo de producto :\n");
                                    tipoProducto = leer.next();
                                    System.out.print("\n Digite la zona donde se encuentra el  producto  :\n");
                                    zona = leer.next();
                                    System.out.print("\n Digite el precio del Producto :\n");
                                    preciO = leer.nextDouble();
                                    System.out.print(" ");
                                    arreglo_3[i] = new SuperProducto(nombree, pasillo, tipoProducto, zona, preciO);
                                }
                                verSubMenu_3.verMenu2();
                                op_3_3 = leer.nextInt();
                                if (op_3_3 == 2) {

                                    for (int i = 0; i < cantidad_3; i++) {
                                        iterar2_2_3 += 1;
                                        System.out.print("\n__________Item " + iterar2_2_3 + "__________\n");
                                        System.out.println("\n" + arreglo_3[i].toString() + "\n");
                                    }
                                }
                                if (op_3_3 == 3) {
                                    System.out.println("\n_______Saliendo del menu_______\n");
                                }
                                if (op_3_3 == 1 || op_3_3 == 4) {
                                    System.out.println("\n_______La opcion ingresada no es existente_______\n");
                                }
                            }
                            if (op_2_3 == 2) {
                                System.out.println("\nLos atributos de los valores no tienen valor asignado, por ende estan null\n");
                            }
                        }
                        break;
                    case 4:
                        String nombrePro,
                         telefonO,
                         productO,
                         nit;
                        int op2_4,
                         op3_4;
                        boolean validador_1_4 = false,
                         validador2_4 = false;
                        SubmenuOpcion_ordenGrafio_Super verSubMenu_4 = new SubmenuOpcion_ordenGrafio_Super();

                        while (validador_1_4 == false) {
                            int iterar_1_4 = 0, iterar2_4 = 0;
                            verSubMenu_4.verMenu();
                            op2_4 = leer.nextInt();

                            if (op2_4 == 3) {
                                validador_1_4 = true;
                            }

                            if (op2_4 == 1) {
                                System.out.println("\n Ingresa la cantidad a crear :\n");
                                int cantidad_4 = leer.nextInt();     // CANTIDAD
                                SuperProveedor arreglo_4[] = new SuperProveedor[cantidad_4];

                                for (int i = 0; i < cantidad_4; i++) {
                                    iterar_1_4++;
                                    System.out.print("\n__________Item " + iterar_1_4 + "__________\n");
                                    nombrePro = leer.nextLine();
                                    System.out.println("\n Digite el nombre del  proveedor del supermercado :\n");
                                    nombrePro = leer.nextLine();
                                    System.out.print("\n Digite el telefono  del  proveedor del supermercado :\n");
                                    telefonO = leer.next();
                                    System.out.print("\n Digite el producto del proveedor del supermercado :\n");
                                    productO = leer.next();
                                    System.out.print("\n Digite el nit  del proveedor del supermercado :\n");
                                    nit = leer.next();
                                    System.out.print(" ");
                                    arreglo_4[i] = new SuperProveedor(nombrePro, telefonO, productO, nit);
                                }
                                verSubMenu_4.verMenu2();
                                op3_4 = leer.nextInt();
                                if (op3_4 == 2) {

                                    for (int i = 0; i < cantidad_4; i++) {
                                        iterar2_4 += 1;
                                        System.out.print("\n__________Item " + iterar2_4 + "__________\n");
                                        System.out.println("\n" + arreglo_4[i].toString() + "\n");
                                    }
                                }
                                if (op3_4 == 3) {
                                    System.out.println("\n_______Saliendo del menu_______\n");
                                }
                                if (op3_4 == 1 || op3_4 == 4) {
                                    System.out.println("\n_______La opcion ingresada no es existente_______\n");
                                }
                            }
                            if (op2_4 == 2) {
                                System.out.println("\nLos atributos de los valores no tienen valor asignado, por ende estan null\n");
                            }
                        }
                        break;
                    case 5:
                        String numeroDeSeccion,
                         nombreDeSeccion,
                         id;
                        int op2_5,
                         op3_5;
                        boolean validador_5 = false,
                         validador2_5 = false;
                        SubmenuOpcion_ordenGrafio_Super verSubMenu_5 = new SubmenuOpcion_ordenGrafio_Super();

                        while (validador_5 == false) {
                            int iterar_1_5 = 0, iterar2_5 = 0;
                            verSubMenu_5.verMenu();
                            op2_5 = leer.nextInt();

                            if (op2_5 == 3) {
                                validador_5 = true;
                            }

                            if (op2_5 == 1) {
                                System.out.println("\n Ingresa la cantidad a crear :\n");
                                int cantidad_5 = leer.nextInt();     // CANTIDAD
                                SuperSeccion arreglo_5[] = new SuperSeccion[cantidad_5];

                                for (int i = 0; i < cantidad_5; i++) {
                                    iterar_1_5++;
                                    System.out.print("\n__________Item " + iterar_1_5 + "__________\n");
                                    nombreDeSeccion = leer.nextLine();
                                    System.out.println("\n Digite el nombre de la seccion del supermercado :\n");
                                    nombreDeSeccion = leer.nextLine();
                                    System.out.print("\n Digite el numero de la seccion del supermercado :\n");
                                    numeroDeSeccion = leer.next();
                                    System.out.print("\n Digite el numero de id de la seccion del supermercado :\n");
                                    id = leer.next();
                                    System.out.print(" ");
                                    arreglo_5[i] = new SuperSeccion(nombreDeSeccion, numeroDeSeccion, id);
                                }
                                verSubMenu_5.verMenu2();
                                op3_5 = leer.nextInt();
                                if (op3_5 == 2) {

                                    for (int i = 0; i < cantidad_5; i++) {
                                        iterar2_5 += 1;
                                        System.out.print("\n__________Item " + iterar2_5 + "__________\n");
                                        System.out.println("\n" + arreglo_5[i].toString() + "\n");
                                    }
                                }
                                if (op3_5 == 3) {
                                    System.out.println("\n_______Saliendo del menu_______\n");
                                }
                                if (op3_5 == 1 || op3_5 == 4) {
                                    System.out.println("\n_______La opcion ingresada no es existente_______\n");
                                }
                            }
                            if (op2_5 == 2) {
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
