package com.ivoovi.Parcijalni.Ispit3.DTO;

import com.ivoovi.Parcijalni.Ispit3.model.Polaznik;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class PolaznikDTO {

    private String ime;
    private String prezime;


    public PolaznikDTO(Polaznik polaznik) {
        this.ime = polaznik.getIme();
        this.prezime = polaznik.getPrezime();
    }
}
