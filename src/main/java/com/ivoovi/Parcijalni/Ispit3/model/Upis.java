package com.ivoovi.Parcijalni.Ispit3.model;

import com.ivoovi.Parcijalni.Ispit3.DTO.UpisDTO;
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
public class Upis {

    @Id
    @GeneratedValue (strategy =IDENTITY)
    private Long id;

    @Column(name = "polaznik_id")
    @NotNull
   private long polaznikID;

    @Column(name = "PO_id")
    @NotNull
   private long ProgramObrazovanjaID;

    public Upis(UpisDTO upisDTO){
        this.polaznikID = upisDTO.getPolaznikID();
        this.ProgramObrazovanjaID = upisDTO.getProgramObrazovanjaID();
    }
}
