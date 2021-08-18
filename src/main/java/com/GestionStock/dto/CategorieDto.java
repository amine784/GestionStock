package com.GestionStock.dto;

import com.GestionStock.model.Categorie;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

import java.util.List;



@Data
@Builder
public class CategorieDto {

    private Integer id;

    private String codeCategorie;
    private String designationGategorie;
    private Integer idEntreprise;

    @JsonIgnore
    private List<ArticleDto> listArticle;



    public static CategorieDto fromEntity(Categorie categorie) {
        if (categorie == null) {
            return null; //throw an exception
        }

        return CategorieDto.builder()
                .id(categorie.getId())
                .codeCategorie(categorie.getCodeCategorie())
                .designationGategorie(categorie.getDesignationGategorie())
                .idEntreprise(categorie.getIdEntreprise())
                .build();
    }

    public static Categorie toEntity(CategorieDto categorieDto){
        if (categorieDto == null) {
            return null; // throw an exception
        }
        Categorie categorie = new Categorie();
        categorie.setId(categorieDto.getId());
        categorie.setCodeCategorie(categorieDto.getCodeCategorie());
        categorie.setDesignationGategorie(categorieDto.getDesignationGategorie());
        categorie.setIdEntreprise(categorieDto.getIdEntreprise());
            return (categorie);
    }


}
