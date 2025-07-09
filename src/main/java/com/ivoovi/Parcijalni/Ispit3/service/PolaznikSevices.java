package com.ivoovi.Parcijalni.Ispit3.service;

import com.ivoovi.Parcijalni.Ispit3.DTO.PolaznikDTO;
import com.ivoovi.Parcijalni.Ispit3.model.Polaznik;

import java.util.List;

public interface PolaznikSevices {

    List<PolaznikDTO> getAllPolaznici();
    PolaznikDTO getPolaznikByID(long id);
    void savePolaznik(PolaznikDTO polaznikDTO);
    void deletePolaznik(long id);

}
