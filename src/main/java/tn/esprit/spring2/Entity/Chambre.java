package tn.esprit.spring2.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
    @Table( name = "Chambre")
    public class Chambre implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="idChambre")
        private long idChambre; // Clé primaire
        private Long numeroChambre;
        @Enumerated(EnumType.STRING)
        private TypeChambre typeC;

        @OneToMany(cascade = CascadeType.ALL)

        private Set<Reservation> Reservations;

        @ManyToOne
        @JsonIgnore
        Bloc bloc; //bloc b minuscule fi mappedBy khater houni minuscule hatineha

    // w Bloc B majuscule houni esm classe
    }

