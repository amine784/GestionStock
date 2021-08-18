package com.GestionStock.model;





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
@Table(name = "Commandeclient")
public class CommandeClient extends AbstractEntity {

    @Column(name = "codeCommande")
    private String codeCommande;

    @Column(name = "dateCommande")
    private Instant dateCommande;



    @Column(name = "identreprise")
    private Integer idEntreprise;


    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClient;
}
