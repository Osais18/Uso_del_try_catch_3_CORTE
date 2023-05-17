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
public class SuperProveedor {
    Scanner leer =new Scanner(System.in);
    private String nombrePro;
    private String telefono;
    private String producto;
    private String nit;

    public SuperProveedor(String nombrePro, String telefono, String producto, String nit) {
        this.nombrePro = nombrePro;
        this.telefono = telefono;
        this.producto = producto;
        this.nit = nit;
    }

    public SuperProveedor() {
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Proveedor : " + "Nombre del Producto " + nombrePro + ", Telefono " + telefono + ", Producto " + producto + ", Nit " + nit + '.';
    }

   
    
}
