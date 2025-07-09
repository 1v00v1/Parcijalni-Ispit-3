package com.ivoovi.Parcijalni.Ispit3.service;

import com.ivoovi.Parcijalni.Ispit3.DTO.ProgramObrazovanjaDTO;
import com.ivoovi.Parcijalni.Ispit3.model.ProgramObrazovanja;
import com.ivoovi.Parcijalni.Ispit3.repository.ProgramObrazovanjaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProgramObrazovanjaServiceImpl implements ProgramObrazovanjaService{

    private ProgramObrazovanjaRepository programObrazovanjaRepository;

    @Override
    public List<ProgramObrazovanjaDTO> getAllPrograms() {
        return programObrazovanjaRepository.findAll().stream().map(ProgramObrazovanjaDTO::new).toList();
    }

    @Override
    public ProgramObrazovanjaDTO getProgramByID(long id) {
        return new ProgramObrazovanjaDTO( programObrazovanjaRepository.findById(id));
    }

    @Override
    public void saveProgram(ProgramObrazovanjaDTO program) {
        programObrazovanjaRepository.save(new ProgramObrazovanja(program));
    }


    @Override
    public void deleteProgram(long id) {
        programObrazovanjaRepository.deleteById(id);

    }

}
