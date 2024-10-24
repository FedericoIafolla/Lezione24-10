package com.example.PizzeriaMenu.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Ordine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numeroOrdine;
    private String stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;

    @OneToMany(cascade = CascadeType.ALL)
    private List<MenuItem> elementi;
    private double importoTotale;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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