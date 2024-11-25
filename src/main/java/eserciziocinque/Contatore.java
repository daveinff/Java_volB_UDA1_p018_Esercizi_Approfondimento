

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Definisci una classe Contatore che permetta di incrementare e decrementare una variabile di una
singola unità.


/**
 *
 * @author Davide
 */
package eserciziocinque;
public class Contatore {
    private int valore = 0; // Variabile di istanza per il conteggio

    // Metodo per incrementare il valore
    public void incrementa() {
        valore = valore + 1;
    }

    // Metodo per decrementare il valore
    public void decrementa() {
        valore = valore - 1;
    }

    // Metodo per ottenere il valore corrente
    public int getValore() {
        return valore;
    }

    // Metodo main per testare la classe
    public static void main(String[] args) {
        Contatore contatore = new Contatore(); // Crea un'istanza di Contatore

        // Incrementa il contatore 5 volte
        System.out.println("Incremento del contatore:");
        for (int i = 0; i < 5; i++) {
            contatore.incrementa(); // Chiama il metodo sull'istanza
            System.out.println("Valore corrente: " + contatore.getValore());
        }

        // Decrementa il contatore 3 volte
        System.out.println("\nDecremento del contatore:");
        for (int i = 0; i < 3; i++) {
            contatore.decrementa(); // Chiama il metodo sull'istanza
            System.out.println("Valore corrente: " + contatore.getValore());
        }
    }
}