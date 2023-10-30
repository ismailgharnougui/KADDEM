package tn.esprit.spring2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring2.Entity.Foyer;
import tn.esprit.spring2.service.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
@Tag(name = " Foyer")

public class FoyerController {


        @Autowired

        IFoyerService foyerService;//tahtha l'url aana spring2 nom application et foyer nom controller et retireve-all-foyers nom de la methode


// http://localhost:8089/foyer/retrieve-all-foyers
    @Operation(description = "Recuperation de tout les Foyers")

        @GetMapping("/retrieve-all-foyers")

        @ResponseBody

        public List<Foyer> getFoyers() {

            List<Foyer> listFoyers = foyerService.retrieveAllFoyers();

            return listFoyers;

        }
    // http://localhost:8089/foyer/retrieve-foyer/1
     @Operation(description = "Recuperation d'un Foyer")

    @GetMapping("/retrieve-foyer/{foyer-id}")

    @ResponseBody

    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long idFoyer) {

        Foyer foyer = foyerService.retrieveFoyer(idFoyer);

        return foyer;
    }

    // http://localhost:8089/foyer/add-foyer
    @Operation(description = "ajouter un foyer")
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer  foyer = foyerService.addFoyer(f);
        return foyer;
    }

    @Operation(description = "supprimer une foyer")
    // http://localhost:8089/foyer/delete-foyer/2
    @DeleteMapping("/delete-foyer/{foyer-id}")
    public void deleteFoyer(@PathVariable("foyer-id") Long idFoyer) {
        foyerService.deleteFoyer(idFoyer);
    }

    @Operation(description = "modifier une foyer")
    // http://localhost:8089/foyer/update-foyer
    @PutMapping("/update-foyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        Foyer foyer= foyerService.updateFoyer(f);
        return foyer;
    }
}
