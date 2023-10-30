package tn.esprit.spring2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring2.Entity.Bloc;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BlocRepository extends JpaRepository<Bloc, Long>
{    //1 CRUD
    //0 code: predefinie dans spring

    //2 : SELECT avec Keywords
    //on met n'importe quel attribut de notre entité Bloc comme attribut
  //  List<Bloc> findBynomBloc(Bloc nomB ); //CapaciteBloc avec C majuscule

    //3 : SELECT avanvé
}
