package com.GestionStock.dto;


import com.GestionStock.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {

    private Integer id;

    private BigDecimal quantite;
    private BigDecimal prixUnitaire;


    private ArticleDto article;
    private VentesDto vente;

    private Integer idEntreprise;


    public static LigneVenteDto fromEntity(LigneVente ligneVente) {
        if (ligneVente.equals(null)) {
            return null;
        }

        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .article(ArticleDto.fromEntity(ligneVente.getArticle()))
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .idEntreprise(ligneVente.getIdEntreprise())
                .build();
    }


    public  static LigneVente toEntity(LigneVenteDto ligneVenteDto){
        if (ligneVenteDto.equals(null)) {
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setVente(ligneVente.getVente());
        ligneVente.setArticle(ArticleDto.toEntity(ligneVenteDto.getArticle()));
        ligneVente.setQuantite(ligneVenteDto.getQuantite());
        ligneVente.setPrixUnitaire(ligneVente.getPrixUnitaire());
        ligneVente.setIdEntreprise(ligneVenteDto.getIdEntreprise());


            return ligneVente;
    }
}

