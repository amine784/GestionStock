package com.GestionStock.dto;

import com.GestionStock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;


@Data
@Builder
public class CommandeFournisseurDto {

    private Integer id;

    private String codeCmdFournisseur;
    private Instant dateCommandeFournisseur;


    private FournisseurDto fournisseur;

    private Integer idEntreprise;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseursList;



    public  static  CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur) {
        if (commandeFournisseur == null) {
            return null;
        }

        return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .codeCmdFournisseur(commandeFournisseur.getCodeCmdFournisseur())
                .dateCommandeFournisseur(commandeFournisseur.getDateCommandeFournisseur())
                .idEntreprise(commandeFournisseur.getIdEntreprise())
                .fournisseur(FournisseurDto.fromEntity(commandeFournisseur.getFournisseur()))
                .build();
    }


    public static CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDtoo) {
        if (commandeFournisseurDtoo == null) {
            return null;
        }

        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();

        commandeFournisseur.setId(commandeFournisseurDtoo.getId());
        commandeFournisseur.setCodeCmdFournisseur(commandeFournisseurDtoo.getCodeCmdFournisseur());
        commandeFournisseur.setDateCommandeFournisseur(commandeFournisseurDtoo.getDateCommandeFournisseur());
        commandeFournisseur.setFournisseur(FournisseurDto.toEntity(commandeFournisseurDtoo.getFournisseur()));
        commandeFournisseur.setIdEntreprise(commandeFournisseurDtoo.getIdEntreprise());
        return (commandeFournisseur);

    }
}

