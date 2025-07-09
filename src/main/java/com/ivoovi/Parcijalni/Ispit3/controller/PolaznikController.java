package com.ivoovi.Parcijalni.Ispit3.controller;

import com.ivoovi.Parcijalni.Ispit3.DTO.PolaznikDTO;
import com.ivoovi.Parcijalni.Ispit3.service.PolaznikSevices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polaznik")
@AllArgsConstructor
public class PolaznikController {

    private PolaznikSevices polaznikSevices;


    @GetMapping
    public ResponseEntity<List<PolaznikDTO>> getAllPolaznici(){
        return ResponseEntity.ok(polaznikSevices.getAllPolaznici());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PolaznikDTO> getPolaznikByID(@PathVariable long id){
        return ResponseEntity.ok(polaznikSevices.getPolaznikByID(id));
    }
    @PostMapping("/new")
    public ResponseEntity<?> savePolaznik(@Valid @RequestBody PolaznikDTO polaznikDTO){

        polaznikSevices.savePolaznik(polaznikDTO);
        return new ResponseEntity<>( HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePolaznik(@PathVariable long id){
        polaznikSevices.deletePolaznik(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }

}
