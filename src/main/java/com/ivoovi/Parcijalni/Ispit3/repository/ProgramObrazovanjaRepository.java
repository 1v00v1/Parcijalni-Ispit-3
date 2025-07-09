package com.ivoovi.Parcijalni.Ispit3.repository;

import com.ivoovi.Parcijalni.Ispit3.domain.ProgramObrazovanja;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProgramObrazovanjaRepository extends JpaRepository<ProgramObrazovanja, Long> {

    ProgramObrazovanja findById(long id);
}
