package com.code_felici.backend.controller;

import com.code_felici.backend.model.Cane;
import com.code_felici.backend.repository.CaneRepository;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/cani")
@CrossOrigin(origins = "*") // oppure "http://localhost:3000"
public class CaneController {

  @Autowired
  private CaneRepository caneRepository;

  @GetMapping
  public List<Cane> getCani() {
    return caneRepository.findAll();
  }

  @PostMapping
  public Cane aggiungiCane(@RequestBody Cane cane) {
    return caneRepository.save(cane);
  }
}
