package tn.esprit.spring2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring2.Entity.Bloc;
import tn.esprit.spring2.Entity.Reservation;

public interface ReservationRepository  extends JpaRepository<Reservation, Long>
{
}
