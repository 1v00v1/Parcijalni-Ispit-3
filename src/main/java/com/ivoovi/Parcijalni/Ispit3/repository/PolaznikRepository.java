package com.ivoovi.Parcijalni.Ispit3.repository;

import com.ivoovi.Parcijalni.Ispit3.model.Polaznik;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PolaznikRepository extends JpaRepository<Polaznik, Long> {

    Polaznik findById(long id);


}
