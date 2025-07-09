package com.ivoovi.Parcijalni.Ispit3.model;

import com.ivoovi.Parcijalni.Ispit3.DTO.PolaznikDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Polaznik {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "ime")
    @NotNull
    private String ime;

    @Column(name = "prezime")
    @NotNull
    private String prezime;

public Polaznik(PolaznikDTO polaznikDTO) {
    this.ime = polaznikDTO.getIme();
    this.prezime = polaznikDTO.getPrezime();
}
}
