package com.GestionStock.dto;

import com.GestionStock.model.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private Integer id;

    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaireHT;
    private BigDecimal TVA;
    private BigDecimal prixUnitaireTTC;
    private String photoArticle;
    private Integer idEntreprise;

    private CategorieDto categorie;

    public static ArticleDto fromEntity(Article article) {
        if (article == null) {
            return null;
        }

        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .photoArticle(article.getPhotoArticle())
                .prixUnitaireHT(article.getPrixUnitaireHT())
                .prixUnitaireTTC(article.getPrixUnitaireHT())
                .TVA(article.getTVA())
                .idEntreprise(article.getIdEntreprise())
                .categorie(CategorieDto.fromEntity(article.getCategorie()))
                .build();
    }

    public static Article toEntity(ArticleDto articleDto) {
        if (articleDto == null) {
            return null;
        }

        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setPrixUnitaireHT(articleDto.getPrixUnitaireHT());
        article.setPrixUnitaireTTC(articleDto.getPrixUnitaireTTC());
        article.setTVA(articleDto.getTVA());
        article.setIdEntreprise(articleDto.getIdEntreprise());
        article.setCategorie(CategorieDto.toEntity(articleDto.getCategorie()));

        return (article);
    }
}
