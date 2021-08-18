package com.GestionStock.dto;


import com.GestionStock.model.MouvementStock;
import com.GestionStock.model.TypeMouvementStock;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MouvementStockDto {

    private Integer id;

    private Instant dateMouvementStock;
    private BigDecimal quantite;


    private TypeMouvementStock typeMouvementStock;

    private ArticleDto article;

    private Integer idEntreprise;


    public static MouvementStockDto fromEntity(MouvementStock mouvementStock) {
        if (mouvementStock.equals(null)) {
            return null;
        }

        return MouvementStockDto.builder()
                .id(mouvementStock.getId())
                .dateMouvementStock(mouvementStock.getDateMouvementStock())
                .quantite(mouvementStock.getQuantite())
                .article(ArticleDto.fromEntity(mouvementStock.getArticle()))
                .typeMouvementStock(mouvementStock.getTypeMouvementStock())
                .idEntreprise(mouvementStock.getIdEntreprise())
                .build();

    }

    public static MouvementStock toEntity(MouvementStockDto mouvementStockDto){
        if (mouvementStockDto.equals(null)) {
            return null;
        }
        MouvementStock mouvementStock = new MouvementStock();
        mouvementStock.setId(mouvementStockDto.getId());
        mouvementStock.setDateMouvementStock(mouvementStock.getDateMouvementStock());
        mouvementStock.setArticle(ArticleDto.toEntity(mouvementStockDto.getArticle()));
        mouvementStock.setQuantite(mouvementStock.getQuantite());
        mouvementStock.setTypeMouvementStock(mouvementStock.getTypeMouvementStock());
        mouvementStock.setIdEntreprise(mouvementStockDto.getIdEntreprise());



            return (mouvementStock);
    }




}
