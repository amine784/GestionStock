package com.GestionStock.dto;

import com.GestionStock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {

    private Integer id;

    private String codeCommande;
    private Instant dateCommande;


    private ClientDto client;

    private Integer idEntreprise;

    private List<LigneCommandeClientDto> ligneCommandeClients;

    public static  CommandeClientDto fromEntity(CommandeClient commandeClient) {
        if (commandeClient == null) {
            return null;
        }

        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .codeCommande(commandeClient.getCodeCommande())
                .dateCommande(commandeClient.getDateCommande())
                .client(ClientDto.fromEntity(commandeClient.getClient()))
                .idEntreprise(commandeClient.getIdEntreprise())
                .build();
    }
        public static CommandeClient toEntity(CommandeClientDto commandeClientDto) {
            if (commandeClientDto == null) {
                return null;
            }


            CommandeClient commandeClient = new CommandeClient();
            commandeClient.setId(commandeClientDto.getId());
            commandeClient.setCodeCommande(commandeClientDto.getCodeCommande());
            commandeClient.setDateCommande(commandeClient.getDateCommande());
            commandeClient.setIdEntreprise(commandeClientDto.getIdEntreprise());
            commandeClient.setClient(ClientDto.toEntity(commandeClientDto.getClient()));

            return commandeClient;
        }
}
