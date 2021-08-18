package com.GestionStock.dto;

import com.GestionStock.model.Adresse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {

    private String adresseOne;
    private String adresseTwo;
    private String ville;
    private String codePostale;
    private String pays;


    public static AdresseDto fromEntity(Adresse adresse){
        if(adresse == null) {return null;}

        return AdresseDto.builder()
                .adresseOne(adresse.getAdresseOne())
                .adresseTwo(adresse.getAdresseTwo())
                .codePostale(adresse.getCodePostale())
                .ville(adresse.getVille())
                .build();
    }

    public static Adresse toEntity(AdresseDto adresseDto) {
        if(adresseDto == null) {return null;}

        Adresse adresse = new Adresse();
        adresse.setAdresseOne(adresseDto.getAdresseOne());
        adresse.setAdresseTwo(adresseDto.getAdresseTwo());
        adresse.setCodePostale(adresseDto.getCodePostale());
        adresse.setVille(adresseDto.getVille());
        adresse.setPays(adresseDto.getPays());
            return adresse;
    }
}
