package com.ivoovi.Parcijalni.Ispit3.domain;

import com.ivoovi.Parcijalni.Ispit3.DTO.ProgramObrazovanjaDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProgramObrazovanja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "naziv")
    @NotNull
    private String naziv;

    @Column(name = "csvet")
    @NotNull
    private long CSVET;

    @ManyToOne
    @JoinColumn(name = "upis_id")
    private Upis upis;

    public ProgramObrazovanja(ProgramObrazovanjaDTO programObrazovanjaDTO) {
        this.naziv = programObrazovanjaDTO.getNaziv();
        this.CSVET = programObrazovanjaDTO.getCSVET();
    }
}
