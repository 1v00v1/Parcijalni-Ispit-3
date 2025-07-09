package com.ivoovi.Parcijalni.Ispit3.controller;

import com.ivoovi.Parcijalni.Ispit3.DTO.ProgramObrazovanjaDTO;
import com.ivoovi.Parcijalni.Ispit3.service.ProgramObrazovanjaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/po")
@AllArgsConstructor
public class ProgramObrazovanjaController {

    private ProgramObrazovanjaService programObrazovanjaService;


    @GetMapping
    public ResponseEntity<List<ProgramObrazovanjaDTO>> getAllPrograms(){
        return ResponseEntity.ok(programObrazovanjaService.getAllPrograms());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProgramObrazovanjaDTO> getProgramByID(@PathVariable long id){
        return ResponseEntity.ok(programObrazovanjaService.getProgramByID(id));
    }

    @PostMapping("/new")
    public ResponseEntity<?> saveProgram(@Valid @RequestBody ProgramObrazovanjaDTO program){
        programObrazovanjaService.saveProgram(program );
        return new ResponseEntity<>( HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProgram(@PathVariable long id){
        programObrazovanjaService.deleteProgram(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }
}
