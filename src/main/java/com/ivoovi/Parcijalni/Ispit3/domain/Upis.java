package com.ivoovi.Parcijalni.Ispit3.domain;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Upis {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "polaznik_id")
    private Polaznik polaznik;

    @ManyToOne
    @JoinColumn(name = "PO_id")
    private ProgramObrazovanja programObrazovanja;


}