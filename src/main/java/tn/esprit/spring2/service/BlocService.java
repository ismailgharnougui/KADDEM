package tn.esprit.spring2.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring2.Entity.Bloc;
import tn.esprit.spring2.repository.BlocRepository;


import java.util.List;


@Service
@AllArgsConstructor

public class BlocService implements IBlocService{

    @Autowired //dit à spring d'injecter un objet on le met toujours au dessus de l'objet
    BlocRepository blocRepository; //f miniscule c'est l'objet qu'on utilise ici pas la classe



    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();  //f miniscule c'est l'objet qu'on utilise ici pas la classe
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }


    @Override
    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }







}
