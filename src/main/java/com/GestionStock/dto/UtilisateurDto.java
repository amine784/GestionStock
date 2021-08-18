package com.GestionStock.dto;

import com.GestionStock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class UtilisateurDto {

    private AdresseDto adresse;

    private Integer id;

    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String mail;
    private String password;
    private String photo;
    private Instant dataNaissance;


    private EntrepriseDto entreprise;

    private List<RolesDto> roles;


    public static UtilisateurDto fromEntity(Utilisateur utilisateur){
        if(utilisateur.equals(null)){
            return null;
        }
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nomUtilisateur(utilisateur.getNomUtilisateur())
                .prenomUtilisateur(utilisateur.getPrenomUtilisateur())
                .mail(utilisateur.getMail())
                .password(utilisateur.getPassword())
                .dataNaissance(utilisateur.getDataNaissance())
                .adresse(AdresseDto.fromEntity(utilisateur.getAdresse()))
                .photo(utilisateur.getPhoto())
                .entreprise(EntrepriseDto.fromEntity(utilisateur.getEntreprise()))
                .roles(
                        utilisateur.getRoles() != null ?
                        utilisateur.getRoles().stream()
                                .map(RolesDto ::fromEntity)
                                .collect(Collectors.toList()) : null
                ).build();
    }


    public static Utilisateur toEntity(UtilisateurDto utilisateurDto){
        if(utilisateurDto.equals(null)){
            return null;
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setNomUtilisateur(utilisateurDto.getNomUtilisateur());
        utilisateur.setPrenomUtilisateur(utilisateurDto.getPrenomUtilisateur());
        utilisateur.setMail(utilisateurDto.getMail());
        utilisateur.setPassword(utilisateurDto.getPassword());
        utilisateur.setDataNaissance(utilisateurDto.getDataNaissance());
        utilisateur.setAdresse(AdresseDto.toEntity(utilisateurDto.getAdresse()));
        utilisateur.setPhoto(utilisateurDto.getPhoto());
        utilisateur.setEntreprise(utilisateur.getEntreprise());

            return utilisateur;
    }
}
