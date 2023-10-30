package tn.esprit.spring2.service;

import tn.esprit.spring2.Entity.Bloc;


import java.util.List;


public interface IBlocService {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc (Long idBloc);

    public Bloc addBloc (Bloc b);
    public Bloc updateBloc (Bloc b);

    public void deleteBloc(Long idBloc);



}
