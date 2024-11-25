/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*2 Crea una classe Prodotto con due metodi costruttori che inizializzino lo stato dell’oggetto, dotato
dei seguenti attributi:
– string proprietario
– string nomeNegozio
*/
package eserciziodue;

/**
 *
 * @author Davide
 */

public class Prodotto {
    private String proprietario;
    private String nomeNegozio;

    // Costruttore di default
    public Prodotto() {
        this.proprietario = "inesistente";
        this.nomeNegozio = "x";
    }

    // Costruttore con parametri
    public Prodotto(String proprietario, String nomeNegozio) {
        this.proprietario = proprietario;
        this.nomeNegozio = nomeNegozio; // Corretto l'assegnamento
    }

    // Metodo per stampare i parametri
    public void parametri() {
        System.out.println("Proprietario: " + proprietario);
        System.out.println("Nome negozio: " + nomeNegozio);
    }

    // Metodo main per testare la classe
    public static void main(String[] args) {
        // Creazione di un oggetto Prodotto usando il costruttore parametrico
        Prodotto prodotto1 = new Prodotto("Aldo Giuseppini", "Negozio di Aldo");

        // Stampa dei parametri del prodotto
        System.out.println("Descrizione del prodotto:");
        prodotto1.parametri();

        // Creazione di un oggetto Prodotto usando il costruttore di default
        Prodotto prodotto2 = new Prodotto();

        // Stampa dei parametri del prodotto
        System.out.println("\nDescrizione del prodotto di default:");
        prodotto2.parametri();
    }
}
