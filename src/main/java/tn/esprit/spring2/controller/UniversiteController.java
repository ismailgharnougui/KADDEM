package tn.esprit.spring2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring2.Entity.Universite;
import tn.esprit.spring2.service.IUniversiteService;
import tn.esprit.spring2.service.UniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
@Tag(name = "Universite")

public class UniversiteController {


    @Autowired

    IUniversiteService universiteService;//tahtha l'url aana spring2 nom application et universite nom controller et retireve-all-universites nom de la methode


    // http://localhost:8089/universite/retrieve-all-universites
    @Operation(description = "Recuperation de toutes les Universites")

    @GetMapping("/retrieve-all-universites")

    @ResponseBody

    public List<Universite> getUniversites() {

        List<Universite> listUniversites = universiteService.retrieveAllUniversites();

        return listUniversites;

    }

    // http://localhost:8089/universite/retrieve-universite/1
    @Operation(description = "Recuperation d'une Universites")

    @GetMapping("/retrieve-universite/{universite-id}")

    @ResponseBody

    public Universite retrieveUniversite(@PathVariable("universite-id") Long idUniversite) {

        Universite universite = universiteService.retrieveUniversite(idUniversite);

        return universite;
    }

    // http://localhost:8089/universite/add-universite
    @Operation(description = "ajouter une universite")
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }

    @Operation(description = "supprimer une universite")
    // http://localhost:8089/universite/delete-universite/2
    @DeleteMapping("/delete-universite/{universite-id}")
    public void deleteUniversite(@PathVariable("universite-id") Long idUniversite) {
        universiteService.deleteUniversite(idUniversite);
    }

    @Operation(description = "modifier une universite")
    // http://localhost:8089/universite/update-universite
    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.updateUniversite(u);
        return universite;
    }

}
    /*

    @putMapping("/affecterFoyerToUniversite/{idFoyer}")
    @ResponseBody
            public Universite affecterFoyerToUniversite(@RequestBody Foyer f,@PathVariable("idFoyer") Integer idFoyer)
            Universite universite= universiteService.affecterFoyerAUniversite(idFoyer,nomUniversite)
                    return universite;
    {

    }
}
*/