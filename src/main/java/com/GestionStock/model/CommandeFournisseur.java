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
@Table(name = "commandefournisseur")
public class CommandeFournisseur  extends AbstractEntity{





    @Column(name = "codeCmdFournisseur")
    private String codeCmdFournisseur;

    @Column(name = "dateCmdFournisseur")
    private Instant dateCommandeFournisseur;




    @Column(name = "identreprise")
    private Integer idEntreprise;


    @ManyToOne
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseursList;

}
