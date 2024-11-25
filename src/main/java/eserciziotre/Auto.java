/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Definisci una classe Auto per rappresentare oggetti automobile con il nome della marca, il nome
del modello, la targa e l’anno di immatricolazione e con opportuni metodi d’istanza tra cui un
metodo del tipo String toString() per la sua descrizione.
*/
package eserciziotre;

/**
 *
 * @author Davide
 */

public class Auto {
    private String marca;
    private String modello;
    private String targa;
    private int anno;

    // Costruttore di default
    public Auto() {
        this.targa = "xxxxxxx";
        this.modello = "xxxxxxxxxx";
        this.marca = "xxxxxxx";
        this.anno = 0;
    }

    // Costruttore con parametri
    public Auto(String marca, String modello, String targa, int anno) {
        this.targa = targa;
        this.modello = modello;
        this.marca = marca;
        this.anno = anno;
    }

    // Metodo per stampare la descrizione dell'auto
    public void descrizione() {
        System.out.println("Marca: " + marca);
        System.out.println("Modello: " + modello);
        System.out.println("Targa: " + targa);
        System.out.println("Anno: " + anno);
    }

    // Metodo main per testare la classe
    public static void main(String[] args) {
        // Creazione di un oggetto Auto
        Auto auto = new Auto("bmw", "x2", "AB101CD", 2020);

        // Stampa della descrizione dell'auto
        System.out.println("Descrizione dell'auto:");
        auto.descrizione();
    }
}