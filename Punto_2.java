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
public class Punto_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        int dia, mes, years,div,div2,div3;
        System.out.println("\nValidador de fechas correspondientes. \n");
        System.out.println("\nIngrese el dia :\n");
        dia = leer.nextInt();
        System.out.println("\nIngrese el mes :\n");
        mes = leer.nextInt();
        System.out.println("\nIngrese el año :\n");
        years = leer.nextInt();

        //para los meses de 31
        if (dia != 0 && mes != 0 && years != 0) {

            if (mes == 1) {
                if (dia <= 31) {
                    System.out.println("\nCorecto, la fecha " + dia + "/" + mes + "/" + years + " es validad\n");
                    int cap = years;
                    div = years % 4;
                    div2 = years % 100;
                    div3 = years % 400;

                    if (div == 0 && div2 != 0) {
                        System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año " + years + " es bisesto ");
                    }

                    if (div == 0 && div == 0) {
                        System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año " + years + " es bisesto ");
                    } else {
                        System.out.println(" las condiciones son inciertas, por ende " + years + " no es un año bisiesto");
                    }
                } else {
                    System.out.println("\nLa fecha " + dia + "/" + mes + "/" + years + " es incorrecta\n");
                }
            }
            if (mes == 2) {
                if (dia <= 29) {
                    System.out.println("\nCorecto, la fecha " + dia + "/" + mes + "/" + years + " es validad\n");
                    int cap = years;
                    div = years % 4;
                    div2 = years % 100;
                    div3 = years % 400;

                    if (div == 0 && div2 != 0) {
                        System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año " + years + " es bisesto ");
                    }

                    if (div == 0 && div == 0) {
                        System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año " + years + " es bisesto ");
                    } else {
                        System.out.println(" las condiciones son inciertas, por ende " + years + " no es un año bisiesto");
                    }
                } else {
                    System.out.println("\nLa fecha " + dia + "/" + mes + "/" + years + " es incorrecta\n");
                }

            }
            if (mes == 3) {
                if (dia <= 31) {
                    System.out.println("\nCorecto, la fecha " + dia + "/" + mes + "/" + years + " es validad\n");
                    int cap = years;
                    div = years % 4;
                    div2 = years % 100;
                    div3 = years % 400;

                    if (div == 0 && div2 != 0) {
                        System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año " + years + " es bisesto ");
                    }

                    if (div == 0 && div == 0) {
                        System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año " + years + " es bisesto ");
                    } else {
                        System.out.println(" las condiciones son inciertas, por ende " + years + " no es un año bisiesto");
                    }
                } else {
                    System.out.println("\nLa fecha " + dia + "/" + mes + "/" + years + " es incorrecta\n");
                }

            }
            if (mes == 4) {
                if (dia <= 30) {
                    System.out.println("\nCorecto, la fecha " + dia + "/" + mes + "/" + years + " es validad\n");
                    int cap = years;
                    div = years % 4;
                    div2 = years % 100;
                    div3 = years % 400;

                    if (div == 0 && div2 != 0) {
                        System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año " + years + " es bisesto ");
                    }

                    if (div == 0 && div == 0) {
                        System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año " + years + " es bisesto ");
                    } else {
                        System.out.println(" las condiciones son inciertas, por ende " + years + " no es un año bisiesto");
                    }
                } else {
                    System.out.println("\nLa fecha " + dia + "/" + mes + "/" + years + " es incorrecta\n");
                }

            }
            if (mes == 5) {
                if (dia <= 31) {
                    System.out.println("\nCorecto, la fecha " + dia + "/" + mes + "/" + years + " es validad\n");
                    int cap = years;
                    div = years % 4;
                    div2 = years % 100;
                    div3 = years % 400;

                    if (div == 0 && div2 != 0) {
                        System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año " + years + " es bisesto ");
                    }

                    if (div == 0 && div == 0) {
                        System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año " + years + " es bisesto ");
                    } else {
                        System.out.println(" las condiciones son inciertas, por ende " + years + " no es un año bisiesto");
                    }
                } else {
                    System.out.println("\nLa fecha " + dia + "/" + mes + "/" + years + " es incorrecta\n");
                }

            }
            if (mes == 6) {
                if (dia <= 30) {
                    System.out.println("\nCorecto, la fecha " + dia + "/" + mes + "/" + years + " es validad\n");
                    int cap = years;
                    div = years % 4;
                    div2 = years % 100;
                    div3 = years % 400;

                    if (div == 0 && div2 != 0) {
                        System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año " + years + " es bisesto ");
                    }

                    if (div == 0 && div == 0) {
                        System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año " + years + " es bisesto ");
                    } else {
                        System.out.println(" las condiciones son inciertas, por ende " + years + " no es un año bisiesto");
                    }
                } else {
                    System.out.println("\nLa fecha " + dia + "/" + mes + "/" + years + " es incorrecta\n");
                }

            }
            if (mes == 7) {
                if (dia <= 31) {
                    System.out.println("\nCorecto, la fecha " + dia + "/" + mes + "/" + years + " es validad\n");
                    int cap = years;
                    div = years % 4;
                    div2 = years % 100;
                    div3 = years % 400;

                    if (div == 0 && div2 != 0) {
                        System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año " + years + " es bisesto ");
                    }

                    if (div == 0 && div == 0) {
                        System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año " + years + " es bisesto ");
                    } else {
                        System.out.println(" las condiciones son inciertas, por ende " + years + " no es un año bisiesto");
                    }
                } else {
                    System.out.println("\nLa fecha " + dia + "/" + mes + "/" + years + " es incorrecta\n");
                }

            }
            if (mes == 8) {
                if (dia <= 31) {
                    System.out.println("\nCorecto, la fecha " + dia + "/" + mes + "/" + years + " es validad\n");
                    int cap = years;
                    div = years % 4;
                    div2 = years % 100;
                    div3 = years % 400;

                    if (div == 0 && div2 != 0) {
                        System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año " + years + " es bisesto ");
                    }

                    if (div == 0 && div == 0) {
                        System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año " + years + " es bisesto ");
                    } else {
                        System.out.println(" las condiciones son inciertas, por ende " + years + " no es un año bisiesto");
                    }
                } else {
                    System.out.println("\nLa fecha " + dia + "/" + mes + "/" + years + " es incorrecta\n");
                }

            }
            if (mes == 9) {
                if (dia <= 30) {
                    System.out.println("\nCorecto, la fecha " + dia + "/" + mes + "/" + years + " es validad\n");
                    int cap = years;
                    div = years % 4;
                    div2 = years % 100;
                    div3 = years % 400;

                    if (div == 0 && div2 != 0) {
                        System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año " + years + " es bisesto ");
                    }

                    if (div == 0 && div == 0) {
                        System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año " + years + " es bisesto ");
                    } else {
                        System.out.println(" las condiciones son inciertas, por ende " + years + " no es un año bisiesto");
                    }
                } else {
                    System.out.println("\nLa fecha " + dia + "/" + mes + "/" + years + " es incorrecta\n");
                }

            }
            if (mes == 10) {
                if (dia <= 31) {
                    System.out.println("\nCorecto, la fecha " + dia + "/" + mes + "/" + years + " es validad\n");
                    int cap = years;
                    div = years % 4;
                    div2 = years % 100;
                    div3 = years % 400;

                    if (div == 0 && div2 != 0) {
                        System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año " + years + " es bisesto ");
                    }

                    if (div == 0 && div == 0) {
                        System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año " + years + " es bisesto ");
                    } else {
                        System.out.println(" las condiciones son inciertas, por ende " + years + " no es un año bisiesto");
                    }
                } else {
                    System.out.println("\nLa fecha " + dia + "/" + mes + "/" + years + " es incorrecta\n");
                }

            }
            if (mes == 11) {
                if (dia <= 30) {
                    System.out.println("\nCorecto, la fecha " + dia + "/" + mes + "/" + years + " es validad\n");
                    int cap = years;
                    div = years % 4;
                    div2 = years % 100;
                    div3 = years % 400;

                    if (div == 0 && div2 != 0) {
                        System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año " + years + " es bisesto ");
                    }

                    if (div == 0 && div == 0) {
                        System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año " + years + " es bisesto ");
                    } else {
                        System.out.println(" las condiciones son inciertas, por ende " + years + " no es un año bisiesto");
                    }
                } else {
                    System.out.println("\nLa fecha " + dia + "/" + mes + "/" + years + " es incorrecta\n");
                }

            }
            if (mes == 12) {
                if (dia <= 31) {
                    System.out.println("\nCorecto, la fecha " + dia + "/" + mes + "/" + years + " es validad\n");
                    int cap = years;
                    div = years % 4;
                    div2 = years % 100;
                    div3 = years % 400;

                    if (div == 0 && div2 != 0) {
                        System.out.println(" se cumple la 1 y 2 condicion, por lo tanto el año " + years + " es bisesto ");
                    }

                    if (div == 0 && div == 0) {
                        System.out.println(" se cumple la 1 y 3 condicion, por lo tanto el año " + years + " es bisesto ");
                    } else {
                        System.out.println(" las condiciones son inciertas, por ende " + years + " no es un año bisiesto");
                    }
                } else {
                    System.out.println("\nLa fecha " + dia + "/" + mes + "/" + years + " es incorrecta\n");
                }

            }

        } else {
            System.out.println("Error, no exites tal valor numerico de 0 en las fechas");
        }
         } catch (Exception e) {
            System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
        } finally {
            System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

        }
    }

}
