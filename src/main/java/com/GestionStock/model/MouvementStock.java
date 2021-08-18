package com.GestionStock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "mouvementDeStock")
public class MouvementStock extends AbstractEntity{

    @Column(name = "datemvmntStock")
    private Instant dateMouvementStock;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "identreprise")
    private Integer idEntreprise;


    @Column(name = "typeMvtStock")
    @Enumerated(EnumType.STRING)
    private TypeMouvementStock typeMouvementStock;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

}
