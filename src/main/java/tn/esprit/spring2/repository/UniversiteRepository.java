package tn.esprit.spring2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring2.Entity.Bloc;
import tn.esprit.spring2.Entity.Universite;

import java.util.List;

public interface UniversiteRepository  extends JpaRepository<Universite, Long>
{

    //Universite findByNomUniversite();
    //No need to code CRUD
    //Here we can code additional methods with keywords

    //keywords:
    //findAllBy...
}
