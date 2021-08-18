package com.GestionStock.dto;

import com.GestionStock.model.Fournisseur;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FournisseurDto {

    private Integer id;

    private String nomFournisseur;
    private String prenomFournisseur;

    private AdresseDto adresse;

    private String photoFournisseur;
    private String EmailFournisseur;
    private String numTelFournisseur;

    private Integer idEntreprise;

    @JsonIgnore
    private List<CommandeFournisseurDto> commandeFournisseur;


    public static FournisseurDto fromEntity(Fournisseur fournisseur) {
        if (fournisseur == null) {
            return null;
        }
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nomFournisseur(fournisseur.getNomFournisseur())
                .prenomFournisseur(fournisseur.getPrenomFournisseur())
                .adresse(AdresseDto.fromEntity(fournisseur.getAdresse()))
                .photoFournisseur(fournisseur.getPhotoFournisseur())
                .numTelFournisseur(fournisseur.getNumTelFournisseur())
                .idEntreprise(fournisseur.getIdEntreprise())
                .EmailFournisseur(fournisseur.getEmailFournisseur())
                .build();
    }
    public static Fournisseur toEntity(FournisseurDto fournisseurDto){
        if(fournisseurDto == null) {return null;}

        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNomFournisseur(fournisseurDto.getNomFournisseur());
        fournisseur.setPrenomFournisseur(fournisseurDto.getPrenomFournisseur());
        fournisseur.setAdresse(fournisseur.getAdresse());
        fournisseur.setNumTelFournisseur(fournisseurDto.getNumTelFournisseur());
        fournisseur.setPhotoFournisseur(fournisseurDto.getPhotoFournisseur());
        fournisseur.setIdEntreprise(fournisseurDto.getIdEntreprise());
        fournisseur.setEmailFournisseur(fournisseurDto.getEmailFournisseur());
            return (fournisseur);
    }



}
