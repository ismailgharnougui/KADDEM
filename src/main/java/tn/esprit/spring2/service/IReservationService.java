package tn.esprit.spring2.service;

import tn.esprit.spring2.Entity.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation (Long idReservation);

    public Reservation addReservation (Reservation r);
   public Reservation updateReservation (Reservation r);

    public void deleteReservation(Long idReservation);



}
