package com.GestionStock.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity{

    @Embedded
    private Adresse adresse;

    @Column(name = "nomUtilisateur")
    private String nomUtilisateur;

    @Column(name = "prenomUtilisateur")
    private String prenomUtilisateur;

    @Column(name = "Email")
    private String mail;

    @Column(name = "password")
    private String password;

    @Column(name = "photoUtilisateur")
    private String photo;

    @Column(name = "dateDeNaissance")
    private Instant dataNaissance;

    @ManyToOne
    @JoinColumn(name = "idEntreprise")
    private Entreprise entreprise;



    @OneToMany(fetch = FetchType.EAGER, mappedBy = "utilisateur")
    @JsonIgnore
    private List<Roles> roles;
}
