package tn.esprit.spring2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring2.Entity.Bloc;
import tn.esprit.spring2.service.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
@Tag(name = " Bloc")

public class BlocController {


    @Autowired

    IBlocService blocService;//tahtha l'url aana spring2 nom application et bloc nom controller et retireve-all-blocs nom de la methode


    // http://localhost:8089/bloc/retrieve-all-blocs
    @Operation(description = "Recuperation de tout les Blocs")

    @GetMapping("/retrieve-all-blocs")

    @ResponseBody

    public List<Bloc> getBlocs() {

        List<Bloc> listBlocs = blocService.retrieveAllBlocs();

        return listBlocs;

    }
    // http://localhost:8089/bloc/retrieve-bloc/1
    @Operation(description = "Recuperation d'un Bloc")

    @GetMapping("/retrieve-bloc/{bloc-id}")

    @ResponseBody

    public Bloc retrieveBloc(@PathVariable("bloc-id") Long idBloc) {

        Bloc bloc = blocService.retrieveBloc(idBloc);

        return bloc;
    }

    // http://localhost:8089/bloc/add-bloc
    @Operation(description = "ajouter un bloc")
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc  bloc = blocService.addBloc(b);
        return bloc;
    }

    @Operation(description = "supprimer une bloc")
    // http://localhost:8089/bloc/delete-bloc/2
    @DeleteMapping("/delete-bloc/{bloc-id}")
    public void deleteBloc(@PathVariable("bloc-id") Long idBloc) {
        blocService.deleteBloc(idBloc);
    }

    @Operation(description = "modifier une bloc")
    // http://localhost:8089/bloc/update-bloc
    @PutMapping("/update-bloc")
    public Bloc updateBloc(@RequestBody Bloc b) {
        Bloc bloc= blocService.updateBloc(b);
        return bloc;
    }
}
