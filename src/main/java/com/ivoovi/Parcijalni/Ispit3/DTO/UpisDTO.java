package com.ivoovi.Parcijalni.Ispit3.DTO;


import com.ivoovi.Parcijalni.Ispit3.domain.Upis;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UpisDTO {
    private long polaznikID;
    private long ProgramObrazovanjaID;

    public UpisDTO(Upis upis) {
        this.polaznikID = upis.getPolaznikID();
        this.ProgramObrazovanjaID = upis.getProgramObrazovanjaID();
    }
}
