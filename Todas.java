/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte.Taller_primer_corte;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class Todas {

    Scanner leer = new Scanner(System.in);

    void iniciar_1() {

        int OP = 0;

        System.out.println("\n Digita la opcion 1 para ver el  ejercicio 1\n");

        System.out.println("\n Digita la opcion 2 para ver el  ejercicio 2\n");

        System.out.println("\n Digita la opcion 3 para ver el  ejercicio 3\n");

        System.out.println("\n Digita la opcion 4 para ver el  ejercicio 4\n");

        System.out.println("\n Digita la opcion 5 para ver el  ejercicio 5\n");

        System.out.println("\n Digita la opcion 6 para ver el  ejercicio 6\n");

        System.out.println("\n Digita la opcion 7 para ver el  ejercicio 7\n");

        System.out.println("\n Digita la opcion 8 para ver el  ejercicio 8\n");

        System.out.println("\n Digita la opcion 9 para ver el  ejercicio 9\n");

        System.out.println("\n Digita la opcion 10 para ver el  ejercicio 10\n");

        System.out.println("\n Digita la opcion 11 para ver el  ejercicio 11\n");

        System.out.println("\n Digita la opcion 12 para ver el  ejercicio 12\n");

        System.out.println("\n Digita la opcion 13 para ver el  ejercicio 13\n");

        System.out.println("\n Digita la opcion 14 para ver el  ejercicio 14\n");

        System.out.println("\n Digita la opcion 15 para ver el  ejercicio 15\n");

        System.out.println("\n Digita la opcion 16 para ver el  ejercicio 16\n");

        System.out.println("\n Digita la opcion 17 para ver el  ejercicio 17\n");

        System.out.println("\n Digita la opcion 18 para ver el  ejercicio 18\n");

        System.out.println("\n Digita la opcion 19 para ver el  ejercicio 19\n");

    

        OP = leer.nextInt();
        switch (OP) {

            case 1:try {
                String nom;
                System.out.println("\n\n____________________1_____________________\n\n");
                System.out.println("\nIngrese su nombre\n");
                nom = leer.nextLine();
                System.out.println(" Hola " + nom + " !, Bienvenenid@ a la programacion.");
            } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
            break;
            case 2:
try {
                System.out.println("\n\n____________________2_____________________\n\n");
                double base = 0,
                 altura = 0,
                 perimetro = 0,
                 area = 0;
                System.out.println("\nIngrese la base\n");
                base = leer.nextDouble();
                System.out.println("\nIngrese la altura\n");
                altura = leer.nextDouble();
                area = base * altura;
                System.out.println("\nEl area es : " + area + "\n");
                perimetro = base + altura;
                System.out.println("\nEl perimetro es : " + perimetro * 2 + "\n");
                } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
            case 3:
                try{
                System.out.println("\n\n____________________3_____________________\n\n");
                double c_o = 0,
                 c_a = 0,
                 cap1 = 0,
                 cap2 = 0;
                System.out.println("\nIngrese el cateto opuesto :\n");
                c_o = leer.nextDouble();
                System.out.println("\nIngrese el cateto ayacente :\n");
                c_a = leer.nextDouble();
                cap1 = c_o * c_o;
                cap2 = c_a * c_a;
                double suma = cap1 + cap2;
                System.out.println("\n La hipotenusa es  : " + Math.sqrt(suma) + "\n");
                } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
            case 4:
                try{
                System.out.println("\n\n____________________4_____________________\n\n");
                int num1 = 0,
                 numEstatico,
                 cant = 0,
                 cont = 0,
                 suma1 = 0,
                 numEstatico3 = 0,
                 numEstatico2 = 0,
                 numEstatico4 = 0;
                System.out.println(" Ingrese hasta que numero deseas ver la suma, resta, multiplicacion y divicion ");
                cant = leer.nextInt();
                int[] arreglo = new int[cant];
                System.out.println("\n Ingrese el  valor a operar :");
                num1 = leer.nextInt();
                numEstatico = num1;
                for (int i = 0; i <= cant - 1; i++) {
                    cont += 1;
                    suma1 = num1 + cont;
                    System.out.println(" La suma del valor ingresado " + numEstatico + " + " + cont + " es :" + suma1);
                }
                System.out.println("\n");
                int cant2 = 0,
                 cont2 = 0,
                 resta = 0;
                numEstatico2 = num1;
                for (int i = 0; i <= cant - 1; i++) {
                    cont2 += 1;
                    resta = num1 - cont2;
                    System.out.println(" La resta del valor ingresado " + numEstatico2 + " - " + cont2 + " es :" + resta);
                }
                System.out.println("\n");
                int cant3 = 0,
                 cont3 = 0,
                 multiplo = 0;
                numEstatico3 = num1;
                for (int i = 0; i <= cant - 1; i++) {
                    cont3 += 1;
                    multiplo = num1 * cont3;
                    System.out.println(" El multiplo del valor ingresado " + numEstatico3 + " * " + cont3 + " es :" + multiplo);
                }
                System.out.println("\n");
                int cant4 = 0,
                 cont4 = 0,
                 division = 0;
                numEstatico4 = num1;
                for (int i = 0; i <= cant - 1; i++) {
                    cont4 += 1;
                    division = num1 / cont4;
                    System.out.println(" La divion del valor ingresado " + numEstatico4 + " / " + cont4 + " es :" + division);
                }
                System.out.println("\n");
                } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
            case 5:
                try{
                System.out.println("\n\n____________________5_____________________\n\n");
                double T = 0,
                 rest = 0,
                 respuesta = 0,
                 divisi = 0;
                System.out.println("\nIngrese una temperatura en Fahrenheit (F)\n");
                T = leer.nextInt();
                rest = T - 32;
                divisi = rest * 5;
                respuesta = divisi / 9;
                System.out.println("\n La conversion de " + T + " F Fahrenheit a Celsius es = " + respuesta + " C");
                } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
            case 6:
                try{
                System.out.println("\n\n____________________6_____________________\n\n");
                double numero = 0,
                 AUX_A = 0;
                int cont_w = 0;
                double[] arreglo_1 = new double[3];

                for (int i = 0; i <= arreglo_1.length - 1; i++) {
                    cont_w++;
                    System.out.println("\n Digite en el #" + cont_w + " la cifra para sacarle la media :\n");
                    arreglo_1[i] = leer.nextDouble();

                }

                for (int j = 0; j < arreglo_1.length - 1; j++) {
                    if (arreglo_1[j] > arreglo_1[j + 1]) {                 //ordeno mi arreglo
                        AUX_A = arreglo_1[j];
                        arreglo_1[j] = arreglo_1[j + 1];
                        arreglo_1[j + 1] = AUX_A;
                    }
                }
                for (int i = 0; i < 1; i++) {
                    System.out.println(" el arreglo es " + Arrays.toString(arreglo_1));
                }
                double val = 0,
                 capsula = 0;
                for (int i = 0; i <= arreglo_1.length - 1; i++) {
                    val = arreglo_1[i] += val;
                }
                System.out.println("La media es " + val / 3);
} catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
            case 7:
try{
                System.out.println("\n\n____________________7_____________________\n\n");
                double minutos = 0,
                 horas = 0,
                 mult = 0,
                 mostrar;
                System.out.println("\n Ingrese los minutos para calcularlos en horas y minutos restantes :\n");
                minutos = leer.nextInt();
                mostrar = minutos;
                mult = minutos *= 60;
                horas = mult / 60;
                System.out.println("La conversion del datos ingresado : " + mostrar + " minutos,  es equivalente a = " + horas / 60 + "\n");
} catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
            case 8:
                try{
                System.out.println("\n\n____________________8_____________________\n\n");
//         
                double sueldo = 0,
                 comisionMulti = 0,
                 comision = 0,
                 constante = 0.1,
                 copia = 0,
                 vent1 = 0,
                 vent2 = 0,
                 vent3 = 0,
                 total = 0;
                System.out.println("\n Digite el valor del sueldo base : \n");
                sueldo = leer.nextFloat();
                System.out.println("\n Ingrese el valor de la venta 1 que se dio en el mes:\n");
                vent1 = leer.nextDouble();
                System.out.println("\n Ingrese el valor de la venta 2 que se dio en el mes:\n");
                vent2 = leer.nextDouble();
                System.out.println("\n Ingrese el valor de la venta 3 que se dio en el mes:\n");
                vent3 = leer.nextDouble();
                copia = sueldo;
                comision = (vent1 += vent2 += vent3);
                comisionMulti = comision * constante;
                total = sueldo += comisionMulti;
                System.out.println(" Su sueldo es de  " + copia + ", y su comision por las tres ventas es de " + comisionMulti + " con el 10% de comision. en conclucion recibiras un total de : " + total + "\n");

        } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
//       
                break;
            case 9:
                try{
                System.out.println("\n\n____________________9_____________________\n\n");

                double pedid = 0,
                 totalApag = 0,
                 constant = 0.15,
                 operacion = 0;
                System.out.println("\nIngrese el valor de su pedido :\n");
                pedid = leer.nextDouble();

                operacion = pedid * constant;
                totalApag = pedid -= operacion;
                System.out.println("\nEl descuento del valor igresado es del 15%, por lo tanto deberas pagar : " + totalApag);
} catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
//         
                break;
            case 10:
                try{
                System.out.println("\n\n____________________10_____________________\n\n");
                double examenF = 0,
                 tallerF = 0;
                int conta = 0;
                System.out.println("\n Ingrese sus 3 calificaciones de parciales \n");
                double arreglo_C[] = new double[3];
                for (int i = 0; i <= arreglo_C.length - 1; i++) {
                    conta++;
                    System.out.println("Ingrese la calificacion# " + conta + " :");
                    arreglo_C[i] = leer.nextDouble();
                    if (arreglo_C[i] > 5) {
                        System.out.println("\n VALOR INGRESADO ES INVALIDO, el limite de calificaciones es de 5 \n");
                        break;
                    }
                }
                double sum = 0;
                for (int i = 0; i <= arreglo_C.length - 1; i++) {
                    sum = sum += arreglo_C[i];
                }
                double promedio = sum / 3;
                double multi = 0,
                 multi2 = 0,
                 multi3 = 0,
                 notaF = 0;
                DecimalFormat dec = new DecimalFormat("#.0"); //sacar provecho de la clase DecimalFormat pra limitar los decimales, ya que esto me presenta alteraciones
                System.out.println("\nEl promedio de las 3 calificaciones parciales  es de : " + dec.format(promedio) + " que cuenta con un valor de 55% en la materia");
                System.out.println("\n ingrese su calificacion del examen final \n");
                examenF = leer.nextDouble();
                System.out.println("\n ingrese su calificacion del taller final \n");
                tallerF = leer.nextDouble();
                multi = promedio * .55;
                multi2 = examenF * .3;
                multi3 = tallerF * .15;
                notaF = multi += multi2 += multi3;
                System.out.println("\n Calificacion final del curso de atgoritmo es de : " + dec.format(notaF));

                //compruebe https://www.rapidtables.org/calc/grade/grade-calculator.html
                } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
            case 11:
                try{
                System.out.println("\n\n____________________11_____________________\n\n");
                int n1,
                 n2;
                int distancia;
                System.out.println("Introduce el primer número : ");
                n1 = leer.nextInt();
                System.out.println("Introduce el segundo número para ver la distancia entre este y el primer numero ingresado: ");
                n2 = leer.nextInt();
                distancia = Math.abs(n1 - n2);
                System.out.println("La distancia entre ambos números " + n1 + " y " + n2 + " es de : " + distancia);
               } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
            case 12:
                try{
                System.out.println("\n\n____________________12_____________________\n\n");

                System.out.println(" ingresa las  coordenadas del plano cartesiano  ");
                System.out.println("digite x1: ");
                double x1 = leer.nextDouble();
                System.out.println("digite y1: ");
                double y1 = leer.nextDouble();
                System.out.println("digite x2: ");
                double x2 = leer.nextDouble();
                System.out.println("digite y2: ");
                double y2 = leer.nextDouble();

                double dist = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));

                System.out.println("la distancia es: " + dist);
                } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
            case 13:
                try{
                System.out.println("\n\n____________________13_____________________\n\n");
                System.out.println("\n Digite el numero para hallarle raiz cubic y cuadrada :\n");
                double num__ = leer.nextDouble();
                double raiz1 = Math.sqrt(num__),
                 raiz2 = Math.cbrt(num__);
                System.out.println("\n La raiz cuadrada es " + raiz1 + " y " + raiz2 + " la cubica");
                } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;

            case 14:
                try{
                System.out.println("\n\n____________________14_____________________\n\n");

                System.out.println("escribe numero de dos cifras: ");
                String num = leer.next();

                System.out.println("el numero invertido es: " + num.charAt(1) + num.charAt(0));
                } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;

            case 15:
                try{
                System.out.println("\n\n____________________15_____________________\n\n");

                System.out.println("digite numero 1:");
                int num_q = leer.nextInt();
                System.out.println("digite numero 2:");
                int num_2 = leer.nextInt();

                int res = num_q;
                num_q = num_2;
                num_2 = res;

                System.out.println("las variables invertidas son: " + num_q + " y " + num_2);
                } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;

            case 16:
                try{
                System.out.println("\n\n____________________16_____________________\n\n");

                double v1;
                double v2;
                double dis;
                double diferenciaVelocidad;
                double tiempo;
                System.out.println("Este programa calcula el tiempo que tardan en encontrarse dos vehículos que circulan a distinta velocidad y parten desde una distancia inicial.");
                System.out.println("Introduce la distancia a la que se encuentran situados ambos vehículos: ");
                dis = leer.nextDouble();
                System.out.println("Velocidad en Km/h del vehículo 1 (más lento): ");
                v1 = leer.nextDouble();
                System.out.println("Velocidad en Km/h del vehículo 2 (más rápido): ");
                v2 = leer.nextInt();

                diferenciaVelocidad = v2 - v1;
                tiempo = dis / (diferenciaVelocidad);

                tiempo = tiempo * 60;

                System.out.println("Ambos vehículos coincidirán una vez transcurridos " + (int) tiempo + " minutos.");
} catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
            case 17:
                try{
                System.out.println("\n\n____________________17_____________________\n\n");

                int hora = 51330;
                System.out.println("un ciclista parte de una ubicacion a las 14 horas 15 minutos y 30 segundos del dia para otro destino:");
                System.out.println("Digite segundos que tardo en recorrer la distancia:");
                int segDist = leer.nextInt();

                int horaLleg = (segDist + hora);

                int horaLLegadaH = horaLleg / 3600;

                System.out.println("el ciclista llega a las " + horaLLegadaH + " horas");
                } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
            case 18:
                try{
                System.out.println("\n\n____________________18_____________________\n\n");

                System.out.println("ingrese nombre: ");
                String nombre = leer.next();
                System.out.println("ingrese apellido1: ");
                String A1 = leer.next();
                System.out.println("ingrese apellido2: ");
                String A2 = leer.next();

                System.out.println("sus iniciales son: " + nombre.charAt(0) + A1.charAt(0) + A2.charAt(0));
                } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
            case 19:
                try{
                System.out.println("\n\n____________________19_____________________\n\n");

                System.out.println("cada pregunta vale 0.5, son 10 preguntas para un total de 5.0:");
                System.out.println("ingrese numero de preguntas acertadas");
                double preA = leer.nextDouble();
                System.out.println("ingrese numero de preguntas erradas: ");
                double preE = leer.nextDouble();
                System.out.println("ingrese numero de preguntas sin responder: ");

                double def = preA * 0.5 + preE * 1.0;

                System.out.println("la definitiva es:" + def);
                } catch (Exception e) {
                System.err.print("ERROR EN EL BLOQUE  DE EXCEPTION :  " + e);
            } finally {
                System.out.println("SE HAN REVISADO LOS OBJECTOS DE LA CLASE EXCEPTION");

            }
                break;
           

            default:
                System.out.println("Valor desconocido");
                break;

        }

    }
}
