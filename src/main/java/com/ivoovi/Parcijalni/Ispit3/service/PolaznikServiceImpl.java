package com.ivoovi.Parcijalni.Ispit3.service;

import com.ivoovi.Parcijalni.Ispit3.DTO.PolaznikDTO;
import com.ivoovi.Parcijalni.Ispit3.model.Polaznik;
import com.ivoovi.Parcijalni.Ispit3.repository.PolaznikRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PolaznikServiceImpl implements PolaznikSevices{

    private PolaznikRepository polaznikRepository;


    @Override
    public List<PolaznikDTO> getAllPolaznici() {
        return polaznikRepository.findAll().stream().map(PolaznikDTO::new).toList();
    }

    @Override
    public PolaznikDTO getPolaznikByID(long id) {
        Polaznik p = polaznikRepository.findById(id);
        return new PolaznikDTO(p);
    }

    @Override
    public void savePolaznik(PolaznikDTO polaznikDTO) {
        polaznikRepository.save(new Polaznik(polaznikDTO));
    }

    @Override
    public void deletePolaznik(long id) {
        polaznikRepository.deleteById(id);
    }




}
