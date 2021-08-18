package com.GestionStock.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "LigneDeVente")
public class LigneVente extends AbstractEntity{

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixUnitaire")
    private BigDecimal prixUnitaire;


    @Column(name = "identreprise")
    private Integer idEntreprise;



    @ManyToOne
    @JoinColumn(name = "idvente")
    private Ventes vente;


    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;



}
