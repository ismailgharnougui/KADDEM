package tn.esprit.spring2.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


    @Table( name = "Bloc")
    public class Bloc implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column (name="idBloc")
        private long idBloc; // Clé primaire

        private String nomBloc;
        private long capaciteBloc;

        @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")

        private Set<Chambre> chambres;

    @ManyToOne
    @JsonIgnore
    Foyer foyer;


    }


