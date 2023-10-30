package tn.esprit.spring2.service;

import tn.esprit.spring2.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiants();
    public Etudiant retrieveEtudiant (Long idEtudiant);

    public Etudiant addEtudiant (Etudiant e);
   public Etudiant updateEtudiant (Etudiant e);

    public void deleteEtudiant(Long idEtudiant);



}
