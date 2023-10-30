package tn.esprit.spring2.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Reservation")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservation")
    private Long idReservation;

    private boolean estValide;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    @ManyToMany(mappedBy="reservations", cascade = CascadeType.ALL)
    @JsonIgnore


    private Set<Etudiant> etudiants;


}
