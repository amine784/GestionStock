package com.GestionStock.model;





import javax.persistence.*;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "LigneDeCommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "idarcticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "idCmdFournisseur")
    private CommandeFournisseur commandeFournisseur;


    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixUnitaire")
    private BigDecimal prixUnitaire;



    @Column(name = "identreprise")
    private Integer idEntreprise;


}
