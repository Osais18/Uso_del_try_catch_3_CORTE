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
public class CineTicket {

    Scanner leer = new Scanner(System.in);
    private String NombrePelicula;
    private String tipoPelicula;
    private String BidimencionPeli;
    

    public CineTicket(String NombrePelicula, String tipoPelicula, String BidimencionPeli) {
        this.NombrePelicula = NombrePelicula;
        this.tipoPelicula = tipoPelicula;
        this.BidimencionPeli = BidimencionPeli;
        
    }

    

    public CineTicket() {
    }

    public String getTipoPelicula() {
        return tipoPelicula;
    }

    public void setTipoPelicula(String tipoPelicula) {
        this.tipoPelicula = tipoPelicula;
    }

    public String getNombrePelicula() {
        return NombrePelicula;
    }

    public void setNombrePelicula(String NombrePelicula) {
        this.NombrePelicula = NombrePelicula;
    }

    public String getBidimencionPeli() {
        return BidimencionPeli;
    }

    public void setBidimencionPeli(String BidimencionPeli) {
        this.BidimencionPeli = BidimencionPeli;
    }

   
    @Override
    public String toString() {
        return "Tiket :" + " Genero " + tipoPelicula + ", Nombre de la pelicula " + NombrePelicula + ", Formtato bidimencional " + BidimencionPeli + '.';
    }

}
