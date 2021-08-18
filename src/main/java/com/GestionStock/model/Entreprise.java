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
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity{

    @Embedded
    private Adresse adresse;



    @Column(name = "nomEntreprise")
    private String nomEntreprise;

    @Column(name = "description")
    private String description;

    @Column(name = "codeFiscal")
    private String codeFiscal;

    @Column(name = "photo")
    private String photo;

    @Column(name = "Email")
    private String email;

    @Column(name = "numTel")
    private String numtel;

    @Column(name = "siteWeb")
    private String siteWeb;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;
}
