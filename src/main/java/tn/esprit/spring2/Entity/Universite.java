package tn.esprit.spring2.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;



    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor


    @Table( name = "Universite")
    public class Universite implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column (name="idUniversite")
        private long idUniversite; // Clé primaire

        private String nomUniversite;
        private String adresse;

        @OneToOne
        @JsonIgnore
        private Foyer foyer;



        @Override
        public String toString() {
            return super.toString();
        }
    }

