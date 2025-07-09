package com.ivoovi.Parcijalni.Ispit3.DTO;


import com.ivoovi.Parcijalni.Ispit3.domain.ProgramObrazovanja;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProgramObrazovanjaDTO {

    private String naziv;
    private long CSVET;

    public ProgramObrazovanjaDTO(ProgramObrazovanja programObrazovanja) {
        this.naziv = programObrazovanja.getNaziv();
        this.CSVET = programObrazovanja.getCSVET();
    }
}
