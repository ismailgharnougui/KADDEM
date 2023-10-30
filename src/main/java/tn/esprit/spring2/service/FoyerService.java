package tn.esprit.spring2.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring2.Entity.Foyer;
import tn.esprit.spring2.repository.FoyerRepository;


import java.util.List;


@Service
@AllArgsConstructor

public class FoyerService implements IFoyerService{

    @Autowired //dit à spring d'injecter un objet on le met toujours au dessus de l'objet
    FoyerRepository foyerRepository; //f miniscule c'est l'objet qu'on utilise ici pas la classe



    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();  //f miniscule c'est l'objet qu'on utilise ici pas la classe
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }


    @Override
    public void deleteFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);

    }







}
