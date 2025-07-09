package com.ivoovi.Parcijalni.Ispit3.repository;

import com.ivoovi.Parcijalni.Ispit3.model.Upis;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface UpisRepository extends JpaRepository<Upis, Long> {

    Upis findById(long id);

}