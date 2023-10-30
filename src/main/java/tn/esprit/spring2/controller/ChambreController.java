package tn.esprit.spring2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring2.Entity.Chambre;
import tn.esprit.spring2.service.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
@Tag(name = " Chambre")

public class ChambreController {


        @Autowired

        IChambreService chambreService;//tahtha l'url aana spring2 nom application et chambre nom controller et retireve-all-chambres nom de la methode


// http://localhost:8089/chambre/retrieve-all-chambres
    @Operation(description = "Recuperation de tout les Chambres")

        @GetMapping("/retrieve-all-chambres")

        @ResponseBody

        public List<Chambre> getChambres() {

            List<Chambre> listChambres = chambreService.retrieveAllChambres();

            return listChambres;

        }
    // http://localhost:8089/chambre/retrieve-chambre/1
     @Operation(description = "Recuperation d'un Chambre")

    @GetMapping("/retrieve-chambre/{chambre-id}")

    @ResponseBody

    public Chambre retrieveChambre(@PathVariable("chambre-id") Long idChambre) {

        Chambre chambre = chambreService.retrieveChambre(idChambre);

        return chambre;
    }

    // http://localhost:8089/chambre/add-chambre
    @Operation(description = "ajouter un chambre")
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre  chambre = chambreService.addChambre(c);
        return chambre;
    }

    @Operation(description = "supprimer une chambre")
    // http://localhost:8089/chambre/delete-chambre/2
    @DeleteMapping("/delete-chambre/{chambre-id}")
    public void deleteChambre(@PathVariable("chambre-id") Long idChambre) {
        chambreService.deleteChambre(idChambre);
    }

    @Operation(description = "modifier une chambre")
    // http://localhost:8089/chambre/update-chambre
    @PutMapping("/update-chambre")
    public Chambre updateChambre(@RequestBody Chambre c) {
        Chambre chambre= chambreService.updateChambre(c);
        return chambre;
    }
}
