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
@Table(name = "ligneDeCommandeClient")
public class LigneCommandeClient extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "idcommandeClient")
    private  CommandeClient commandeClient;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixUnitaire")
    private BigDecimal prixUnitaire;


    @Column(name = "identreprise")
    private Integer idEntreprise;


}
