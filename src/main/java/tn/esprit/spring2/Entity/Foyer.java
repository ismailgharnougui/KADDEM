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
    @Table( name = "Foyer")
    public class Foyer implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column (name="idFoyer")
        private long idFoyer; // Clé primaire

        private String nomFoyer;
        private long capaciteFoyer;

        @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
        private Set<Bloc> Blocs;

    @OneToOne(mappedBy="foyer")
    @JsonIgnore
    private Universite universite;


    }

