package tn.esprit.spring2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring2.Entity.Bloc;
import tn.esprit.spring2.Entity.Foyer;

public interface FoyerRepository  extends JpaRepository<Foyer, Long>
{
}
