package tn.esprit.spring2.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring2.Entity.Etudiant;
import tn.esprit.spring2.repository.EtudiantRepository;

import java.util.List;


@Service
@AllArgsConstructor

public class EtudiantService implements IEtudiantService{

    @Autowired //dit à spring d'injecter un objet on le met toujours au dessus de l'objet
    EtudiantRepository etudiantRepository; //e miniscule c'est l'objet qu'on utilise ici pas la classe



    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();  //e miniscule c'est l'objet qu'on utilise ici pas la classe
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }


    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);

    }







}
