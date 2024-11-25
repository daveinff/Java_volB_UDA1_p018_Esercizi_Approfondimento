/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Definisci una classe Studente per rappresentare oggettistudente con il cognome, il nome, il codice
fiscale, il numero di matricola e con opportuni metodi d’istanza tra cui un metodo del tipo String
toString() per la sua descrizione.


/**
 *
 * @author Davide
 */
package esercizioquattro;
public class Studente {
    private String cognome;
    private String nome;
    private String fiscale;
    private int matricola;

    // Costruttore di default
    public Studente() {
        this.cognome = "xxxxxxx";
        this.nome = "xxxxxxxxx";
        this.fiscale = "xxxxxx";
        this.matricola = 0;
    }

    // Costruttore con parametri
    public Studente(String cognome, String nome, String fiscale, int matricola) {
        this.cognome = cognome;
        this.nome = nome;
        this.fiscale = fiscale;
        this.matricola = matricola;
    }

    // Metodo per stampare i parametri
    public void parametri() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Codice fiscale: " + fiscale);
        System.out.println("Matricola: " + matricola);
    }

    // Metodo main per testare la classe
    public static void main(String[] args) {
        Studente studente = new Studente("Aldo", "Giuseppini", "RGKGGDCTY987676", 12345);
        System.out.println("I parametri dello studente sono:");
        studente.parametri();
    }
}