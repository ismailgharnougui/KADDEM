package tn.esprit.spring2.service;

import tn.esprit.spring2.Entity.Universite;
import tn.esprit.spring2.Entity.Foyer;

import java.util.List;
import java.util.Set;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite (Long idUniversite);

    public Universite addUniversite (Universite u);
   public Universite updateUniversite (Universite u);

    public void deleteUniversite(Long idUniversite);

   // public Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite) ;
 //   public Set<Foyer> retrieveFoyerByUniversite(Long idUniversite);

}
