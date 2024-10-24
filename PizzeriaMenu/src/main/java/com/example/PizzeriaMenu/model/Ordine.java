package com.example.PizzeriaMenu.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Ordine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numeroOrdine;
    private String stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ordine_id")
    private List<MenuItem> elementi;

    private double importoTotale;
}
