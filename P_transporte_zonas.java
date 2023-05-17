package co.edu.udes.tercer_corte.Taller_4;

import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class P_transporte_zonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            double peso, costo = 0;
            int zona;
            String leyendo = "";

            System.out.println("\n________________16_________________\n");
            System.out.println("Segun la empresa, ingrese el peso en Kg de lo que se desee transportar,la maxima capcidad es de 5kg : ");
            peso = leer.nextDouble();
            if (peso > 0 && peso <= 5) {
                System.out.println("\nElija la opcion en la cual indique a donde sera enviado el encargo\n");
                System.out.println("\nOp #1, para america del norte\n");
                System.out.println("\nOp #2, para america central\n");
                System.out.println("\nOp #3, para america del sur\n");
                System.out.println("\nOp #4, para europa\n");
                System.out.println("\nOp #5, para asia\n");
                zona = leer.nextInt();
                if (zona == 1 || zona == 2 || zona == 3 || zona == 4 || zona == 5) {
                    if (zona == 1) {
                        double costo1 = 0;
                        costo1 = Math.abs(peso * 1000) * 24;
                        System.out.println("El costo de transporte hasta este destino es de $ " + costo1);
                        System.out.println(" deseas continuar, si o no ? :");
                        leyendo = leer.next();
                        if (leyendo.toUpperCase().equals("SI")) {
                            System.out.println("Se ha realizado el tramite del envio exitosamente.");
                        } else {
                            System.out.println("No aceptastes realizar el envio, por ende se cancela.");
                        }

                    }
                    if (zona == 2) {
                        double costo2 = 0;
                        costo2 = Math.abs(peso * 1000) * 20;
                        System.out.println("El costo de transporte hasta este destino es de $ " + costo2);
                        System.out.println(" deseas continuar, si o no ? :");
                        leyendo = leer.next();
                        if (leyendo.toUpperCase().equals("SI")) {
                            System.out.println("Se ha realizado el tramite del envio exitosamente.");
                        } else {
                            System.out.println("No aceptastes realizar el envio, por ende se cancela.");
                        }

                    }
                    if (zona == 3) {
                        double costo3 = 0;
                        costo3 = Math.abs(peso * 1000) * 21;
                        System.out.println("El costo de transporte hasta este destino es de $ " + costo3);
                        System.out.println(" deseas continuar, si o no ? :");
                        leyendo = leer.next();
                        if (leyendo.toUpperCase().equals("SI")) {
                            System.out.println("Se ha realizado el tramite del envio exitosamente.");
                        } else {
                            System.out.println("No aceptastes realizar el envio, por ende se cancela.");
                        }
                    }
                    if (zona == 4) {
                        double costo4 = 0;
                        costo4 = Math.abs(peso * 1000) * 10;
                        System.out.println("El costo de transporte hasta este destino es de $ " + costo4);
                        System.out.println(" deseas continuar, si o no ? :");
                        leyendo = leer.next();
                        if (leyendo.toUpperCase().equals("SI")) {
                            System.out.println("Se ha realizado el tramite del envio exitosamente.");
                        } else {
                            System.out.println("No aceptastes realizar el envio, por ende se cancela.");
                        }
                    }
                    if (zona == 5) {
                        double costo5 = 0;
                        costo5 = Math.abs(peso * 1000) * 18;
                        System.out.println("El costo de transporte hasta este destino es de $ " + costo5);
                        System.out.println(" deseas continuar, si o no ? :");
                        leyendo = leer.next();
                        if (leyendo.toUpperCase().equals("SI")) {
                            System.out.println("Se ha realizado el tramite del envio exitosamente.");
                        } else {
                            System.out.println("No aceptastes realizar el envio, por ende se cancela.");
                        }
                    }

                } else {
                    System.out.println(" Error, solo existe un rango de ops, que van del 1 al 5, tu has ingresado " + zona);
                }

            } else {
                System.out.println(" ERROR, no se podra transportar mientras no este en el rango de capacidad  de 1 a 5 kg");
            }
        } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }

}
