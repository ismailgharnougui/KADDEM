package tn.esprit.spring2.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring2.Entity.Chambre;
import tn.esprit.spring2.repository.ChambreRepository;

import java.util.List;


@Service
@AllArgsConstructor

public class ChambreService implements IChambreService{

    @Autowired //dit à spring d'injecter un objet on le met toujours au dessus de l'objet
    ChambreRepository chambreRepository; //f miniscule c'est l'objet qu'on utilise ici pas la classe



    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();  //f miniscule c'est l'objet qu'on utilise ici pas la classe
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }


    @Override
    public void deleteChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);

    }







}
