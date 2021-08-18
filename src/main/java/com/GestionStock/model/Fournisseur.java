package com.GestionStock.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "fournisseur")
public class Fournisseur extends  AbstractEntity{

    @Column(name = "nom")
    private String nomFournisseur;

    @Column(name = "prenom")
    private String prenomFournisseur;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photoFournisseur;

    @Column(name = "mail")
    private String EmailFournisseur;

    @Column(name = "tel")
    private String numTelFournisseur;


    @Column(name = "identreprise")
    private Integer idEntreprise;


    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseur;
}
