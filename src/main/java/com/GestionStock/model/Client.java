package com.GestionStock.model;


import lombok.*;

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
@Table(name = "client")
public class Client extends AbstractEntity{

    @Column(name = "nom")
    private String nomClient;

    @Column(name = "prenom")
    private String prenomClient;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photoClient;

    @Column(name = "mail")
    private String EmailClient;

    @Column(name = "tel")
    private String numTelClient;


    @Column(name = "identreprise")
    private Integer idEntreprise;




    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;
}
