package tn.esprit.spring2.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring2.Entity.Foyer;
import tn.esprit.spring2.Entity.Universite;
import tn.esprit.spring2.repository.FoyerRepository;
import tn.esprit.spring2.repository.UniversiteRepository;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor

public class UniversiteService implements IUniversiteService {

    @Autowired //dit à spring d'injecter un objet on le met toujours au dessus de l'objet
    UniversiteRepository universiteRepository; //u miniscule c'est l'objet qu'on utilise ici pas la classe
    @Autowired
    FoyerRepository foyerRepository;


    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();  //u miniscule c'est l'objet qu'on utilise ici pas la classe
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }


    @Override
    public void deleteUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);

    }


    /*@Override
    public Set<Foyer> retrieveFoyerByUniversite(Long idUniversite) {
        return null;
    }
/*
    FoyerRepository foyerRepo;

/
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Universite universite = universiteRepository.findByNomUniversite();

        Foyer f = foyerRepo.findById(idFoyer).get();
Foyer foyer =foyerRepo.save(f);
        universite.setFoyer(foyer);
        universiteRepository.save(universite);
        return universite;


    }*/

}




