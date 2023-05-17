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
public class CineSala {
    Scanner leer =new Scanner(System.in);

    private String nombre;
    private int cantPuestos;
    private String areaDeSala;
    
    public CineSala() {
    }
    public CineSala(String nombre, int cantPuestos, String areaDeSala) {
        this.nombre = nombre;
        this.cantPuestos = cantPuestos;
        this.areaDeSala = areaDeSala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPuestos() {
        return cantPuestos;
    }

    public void setCantPuestos(int cantPuestos) {
        this.cantPuestos = cantPuestos;
    }

    public String getAreaDeSala() {
        return areaDeSala;
    }

    public void setAreaDeSala(String areaDeSala) {
        this.areaDeSala = areaDeSala;
    }

    @Override
    public String toString() {
        return "Sala :" + " Nombre " + nombre + ", Cantidad de puestos " + cantPuestos + ", Area de la sala " + areaDeSala + '.';
    }

    
    
}
