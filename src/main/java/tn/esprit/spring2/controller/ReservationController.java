package tn.esprit.spring2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring2.Entity.Reservation;
import tn.esprit.spring2.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
@Tag(name = "Reservation")

public class ReservationController {


        @Autowired

        IReservationService reservationService;//tahtha l'url aana spring2 nom application et reservation nom controller et retireve-all-reservations nom de la methode


// http://localhost:8089/reservation/retrieve-all-reservations
    @Operation(description = "Recuperation de tout les Reservations")

        @GetMapping("/retrieve-all-reservations")

        @ResponseBody

        public List<Reservation> getReservations() {

            List<Reservation> listReservations = reservationService.retrieveAllReservations();

            return listReservations;

        }
    // http://localhost:8089/reservation/retrieve-reservation/1
     @Operation(description = "Recuperation d'un Reservation")

    @GetMapping("/retrieve-reservation/{reservation-id}")

    @ResponseBody

    public Reservation retrieveReservation(@PathVariable("reservation-id") Long idReservation) {

        Reservation reservation = reservationService.retrieveReservation(idReservation);

        return reservation;
    }

    // http://localhost:8089/reservation/add-reservation
    @Operation(description = "ajouter un reservation")
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        Reservation  reservation = reservationService.addReservation(r);
        return reservation;
    }

    @Operation(description = "supprimer une reservation")
    // http://localhost:8089/reservation/delete-reservation/2
    @DeleteMapping("/delete-reservation/{reservation-id}")
    public void deleteReservation(@PathVariable("reservation-id") Long idReservation) {
        reservationService.deleteReservation(idReservation);
    }

    @Operation(description = "modifier une reservation")
    // http://localhost:8089/reservation/update-reservation
    @PutMapping("/update-reservation")
    public Reservation updateReservation(@RequestBody Reservation r) {
        Reservation reservation= reservationService.updateReservation(r);
        return reservation;
    }
}
