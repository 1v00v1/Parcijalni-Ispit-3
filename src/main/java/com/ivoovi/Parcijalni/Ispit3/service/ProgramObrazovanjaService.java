package com.ivoovi.Parcijalni.Ispit3.service;

import com.ivoovi.Parcijalni.Ispit3.DTO.ProgramObrazovanjaDTO;

import java.util.List;

public interface ProgramObrazovanjaService {

    List<ProgramObrazovanjaDTO> getAllPrograms();
    ProgramObrazovanjaDTO getProgramByID(long id);
    void saveProgram(ProgramObrazovanjaDTO program);
    void deleteProgram(long id);

}
