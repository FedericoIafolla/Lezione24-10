package com.example.Pizzeria.model;

public class Tavolo {
    private int numero;
    private int numeroCopertiMassimo;
    private String stato; // "libero" o "occupato"

    public Tavolo(int numero, int numeroCopertiMassimo, String stato) {
        this.numero = numero;
        this.numeroCopertiMassimo = numeroCopertiMassimo;
        this.stato = stato;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroCopertiMassimo() {
        return numeroCopertiMassimo;
    }

    public void setNumeroCopertiMassimo(int numeroCopertiMassimo) {
        this.numeroCopertiMassimo = numeroCopertiMassimo;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}
