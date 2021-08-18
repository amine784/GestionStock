package com.GestionStock.dto;

import com.GestionStock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDto {

    private Integer id;

    private BigDecimal quantite;
    private BigDecimal prixUnitaire;


    private ArticleDto article;

    private Integer idEntreprise;


    private CommandeFournisseurDto commandeFournisseur;


     public static LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur){
         if(ligneCommandeFournisseur.equals(null)){
             return null;
         }
         return LigneCommandeFournisseurDto.builder()
                 .id(ligneCommandeFournisseur.getId())
                 .article(ArticleDto.fromEntity(ligneCommandeFournisseur.getArticle()))
                 .quantite(ligneCommandeFournisseur.getPrixUnitaire())
                 .idEntreprise(ligneCommandeFournisseur.getIdEntreprise())
                 .build();
     }


     public static  LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto){
         if(ligneCommandeFournisseurDto.equals(null)){
             return null;
         }

         LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
         ligneCommandeFournisseur.setId(ligneCommandeFournisseurDto.getId());
         ligneCommandeFournisseur.setArticle(ArticleDto.toEntity(ligneCommandeFournisseurDto.getArticle()));
         ligneCommandeFournisseur.setPrixUnitaire(ligneCommandeFournisseurDto.getPrixUnitaire());
         ligneCommandeFournisseur.setQuantite(ligneCommandeFournisseurDto.getQuantite());
         ligneCommandeFournisseur.setIdEntreprise(ligneCommandeFournisseurDto.getIdEntreprise());

            return ligneCommandeFournisseur;
     }
}
