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
public class CineEmpleado {
    Scanner leer =new Scanner(System.in);
   private String nombre;
    private String tipoEmpleado;
    private String cedula;
    private double sueldo;

    public CineEmpleado() {
    }

    public CineEmpleado(String nombre, String tipoEmpleado, String cedula, double sueldo) {
        this.nombre = nombre;
        this.tipoEmpleado = tipoEmpleado;
        this.cedula = cedula;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    } 

    @Override
    public String toString() {
        return "Empleado : " + "Nombre" + nombre + ", Cargo de empleado " + tipoEmpleado + ", Cedula " + cedula + ", sueldo " + sueldo + '.';
    }

}
