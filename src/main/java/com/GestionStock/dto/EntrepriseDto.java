package com.GestionStock.dto;

import com.GestionStock.model.Entreprise;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {

    private AdresseDto adresse;

    private Integer id;

    private String nomEntreprise;
    private String description;
    private String codeFiscal;
    private String photo;
    private String email;
    private String numtel;
    private String siteWeb;

    @JsonIgnore
    private List<UtilisateurDto> utilisateurs;


    public static EntrepriseDto fromEntity(Entreprise entreprise){
        if (entreprise == null) {return null;}

        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nomEntreprise(entreprise.getNomEntreprise())
                .description(entreprise.getDescription())
                .adresse(AdresseDto.fromEntity(entreprise.getAdresse()))
                .codeFiscal(entreprise.getCodeFiscal())
                .photo(entreprise.getPhoto())
                .email(entreprise.getEmail())
                .numtel(entreprise.getNumtel())
                .siteWeb(entreprise.getSiteWeb())
                .build();
    }

    public static Entreprise toEntity(EntrepriseDto entrepriseDto){
        if (entrepriseDto == null) {return null;}


        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setNomEntreprise(entrepriseDto.getNomEntreprise());
        entreprise.setDescription(entrepriseDto.getDescription());
        entreprise.setAdresse(AdresseDto.toEntity(entrepriseDto.getAdresse()));
        entreprise.setPhoto(entrepriseDto.getPhoto());
        entreprise.setEmail(entrepriseDto.getEmail());
        entreprise.setEmail(entrepriseDto.getEmail());
        entreprise.setSiteWeb(entreprise.getSiteWeb());
        entreprise.setCodeFiscal(entrepriseDto.getCodeFiscal());

            return entreprise;
    }
}
