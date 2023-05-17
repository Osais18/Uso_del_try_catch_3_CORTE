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
public class SuperProducto {
    Scanner leer =new Scanner(System.in);
    private String nombre;
    private String pasillo;
    private String tipoProducto;
    private String zona;
    private double precio;

    public SuperProducto(String nombre, String pasillo, String tipoProducto, String zona, double precio) {
        this.nombre = nombre;
        this.pasillo = pasillo;
        this.tipoProducto = tipoProducto;
        this.zona = zona;
        this.precio = precio;
    }

    public SuperProducto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasillo() {
        return pasillo;
    }

    public void setPasillo(String pasillo) {
        this.pasillo = pasillo;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto : " + " Nombre " + nombre + ", Pasillo " + pasillo + ", tipo de producto " + tipoProducto + ", Zona " + zona + ", Precio " + precio + '.';
    }

    
    
}
