package tn.esprit.spring2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring2.Entity.Etudiant;
import tn.esprit.spring2.service.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
@Tag(name = " Etudiant")

public class EtudiantController {


        @Autowired

        IEtudiantService etudiantService;//tahtha l'url aana spring2 nom application et etudiant nom controller et retireve-all-etudiants nom de la methode


// http://localhost:8089/etudiant/retrieve-all-etudiants
    @Operation(description = "Recuperation de tout les Etudiants")

        @GetMapping("/retrieve-all-etudiants")

        @ResponseBody

        public List<Etudiant> getEtudiants() {

            List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();

            return listEtudiants;

        }
    // http://localhost:8089/etudiant/retrieve-etudiant/1
     @Operation(description = "Recuperation d'un Etudiant")

    @GetMapping("/retrieve-etudiant/{etudiant-id}")

    @ResponseBody

    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long idEtudiant) {

        Etudiant etudiant = etudiantService.retrieveEtudiant(idEtudiant);

        return etudiant;
    }

    // http://localhost:8089/etudiant/add-etudiant
    @Operation(description = "ajouter un etudiant")
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant  etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }

    @Operation(description = "supprimer une etudiant")
    // http://localhost:8089/etudiant/delete-etudiant/2
    @DeleteMapping("/delete-etudiant/{etudiant-id}")
    public void deleteEtudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);
    }

    @Operation(description = "modifier une etudiant")
    // http://localhost:8089/etudiant/update-etudiant
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= etudiantService.updateEtudiant(e);
        return etudiant;
    }
}
