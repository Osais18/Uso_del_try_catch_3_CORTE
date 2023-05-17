/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte;

import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class SuperSeccion {
    Scanner leer =new Scanner(System.in);
    private String numeroDeSeccion;
    private String nombreDeSeccion;
    private String id;

    public SuperSeccion() {
    }

    public SuperSeccion(String numeroDeSeccion, String nombreDeSeccion, String id) {
        this.numeroDeSeccion = numeroDeSeccion;
        this.nombreDeSeccion = nombreDeSeccion;
        this.id = id;
    }

    public String getNumeroDeSeccion() {
        return numeroDeSeccion;
    }

    public void setNumeroDeSeccion(String numeroDeSeccion) {
        this.numeroDeSeccion = numeroDeSeccion;
    }

    public String getNombreDeSeccion() {
        return nombreDeSeccion;
    }

    public void setNombreDeSeccion(String nombreDeSeccion) {
        this.nombreDeSeccion = nombreDeSeccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Seccion : " + " Numero de seccion " + numeroDeSeccion + ", Nombre de seccion " + nombreDeSeccion + ", Ide " + id + '.';
    }

   
    
}
