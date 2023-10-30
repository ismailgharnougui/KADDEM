package tn.esprit.spring2.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring2.Entity.Reservation;
import tn.esprit.spring2.repository.ReservationRepository;

import java.util.List;


@Service
@AllArgsConstructor

public class ReservationService implements IReservationService{

    @Autowired //dit à spring d'injecter un objet on le met toujours au dessus de l'objet
    ReservationRepository reservationRepository; //f miniscule c'est l'objet qu'on utilise ici pas la classe



    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();  //f miniscule c'est l'objet qu'on utilise ici pas la classe
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }


    @Override
    public void deleteReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);

    }







}
