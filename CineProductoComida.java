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
public class CineProductoComida {
    Scanner leer =new Scanner(System.in);

    private String nombre;
    private String tamaño;
    private double precio;

    public CineProductoComida() {
    }

    public CineProductoComida(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto : " + " Nombre" + nombre + ", Tamaño " + tamaño + ", Precio " + precio + '.';
    }

   
    
}
