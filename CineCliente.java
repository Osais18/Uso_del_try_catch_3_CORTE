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
public class CineCliente {
    Scanner leer =new Scanner(System.in);
    private String nombre;
    private String cedula;
    private String edad;
    private int ticketsComprados;
    

    public CineCliente(String nombre, String cedula, String edad, int ticketsComprados) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.ticketsComprados = ticketsComprados;
        
    }

    public CineCliente() {
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    
    public int getTicketsComprados() {
        return ticketsComprados;
    }

    public void setTicketsComprados(int ticketsComprados) {
        this.ticketsComprados = ticketsComprados;
    }

   

    @Override
    public String toString() {
        return " Cliente :" + " Nombre " + nombre + ", Cedula " + cedula + ", Edad " + edad + ", Tickets Comprados " + ticketsComprados + '.';
    }

  
    
}
