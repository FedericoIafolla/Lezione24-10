package com.example.Pizzeria.model;

import java.time.LocalDateTime;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private String stato; // "in corso", "pronto", "servito"
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private List<MenuItem> elementi;
    private double importoTotale;

    public Ordine(int numeroOrdine, String stato, int numeroCoperti, LocalDateTime oraAcquisizione, List<MenuItem> elementi, double importoTotale) {
        this.numeroOrdine = numeroOrdine;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.elementi = elementi;
        this.importoTotale = importoTotale;
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(int numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public LocalDateTime getOraAcquisizione() {
        return oraAcquisizione;
    }

    public void setOraAcquisizione(LocalDateTime oraAcquisizione) {
        this.oraAcquisizione = oraAcquisizione;
    }

    public List<MenuItem> getElementi() {
        return elementi;
    }

    public void setElementi(List<MenuItem> elementi) {
        this.elementi = elementi;
    }

    public double getImportoTotale() {
        return importoTotale;
    }

    public void setImportoTotale(double importoTotale) {
        this.importoTotale = importoTotale;
    }
}
