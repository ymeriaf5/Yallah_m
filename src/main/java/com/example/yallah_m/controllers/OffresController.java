package com.example.yallah_m.controllers;

import com.example.yallah_m.entities.Offres;
import com.example.yallah_m.services.AdminService;
import com.example.yallah_m.services.OffresService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class OffresController {
    @Autowired
    private OffresService offresService;
    @GetMapping("/listoffres")
    public List<Offres> offres(){
        return offresService.listOffres();
    }
    @PostMapping("/ajouteroffres")
    public String ajouteroffres(@Valid Offres offres){
        offresService.ajouterOffres(offres);
        return "Offres Ajouter";
    }
    @GetMapping("/suppoffres")
    public void suppOffres(Integer id){
        offresService.supprimerOffres(id);
    }

}
