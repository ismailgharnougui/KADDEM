package tn.esprit.spring2.service;

import tn.esprit.spring2.Entity.Foyer;
import tn.esprit.spring2.Entity.Foyer;

import java.util.List;
import java.util.Set;

public interface IFoyerService {
    public List<Foyer> retrieveAllFoyers();
    public Foyer retrieveFoyer (Long idFoyer);

    public Foyer addFoyer (Foyer f);
   public Foyer updateFoyer (Foyer f);

    public void deleteFoyer(Long idFoyer);



}
