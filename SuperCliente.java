/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.tercer_corte;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class SuperCliente {
    Scanner leer =new Scanner(System.in);
    
    
    private String nombre;
    private String cedula;
    private String email;
    private Date fechadeNacimiento;
    private String telefono;

    public SuperCliente() {
    }

    public SuperCliente(String nombre, String cedula, String email, Date fechadeNacimiento, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.fechadeNacimiento = fechadeNacimiento;
        this.telefono = telefono;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(Date fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return " Cliente  : " + "Nombre " + nombre + ", Cedula " + cedula + ", Email  " + email + ", Fecha de nacimiento  " + fechadeNacimiento + ", Telefono  " + telefono + '.';
    }
    
}
