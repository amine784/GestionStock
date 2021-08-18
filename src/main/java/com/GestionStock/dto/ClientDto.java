package com.GestionStock.dto;

import com.GestionStock.model.Client;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nomClient;
    private String prenomClient;
    private AdresseDto adresse;
    private String photoClient;
    private String EmailClient;
    private String numTelClient;
    private Integer idEntreprise;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;


    public static ClientDto fromEntity(Client client) {
        if (client == null) {
            return null;
        }

        return ClientDto.builder()
                .id(client.getId())
                .nomClient(client.getNomClient())
                .prenomClient(client.getPrenomClient())
                .adresse(AdresseDto.fromEntity(client.getAdresse()))
                .photoClient(client.getPhotoClient())
                .EmailClient(client.getEmailClient())
                .numTelClient(client.getNumTelClient())
                .idEntreprise(client.getIdEntreprise())
                .build();
    }

    public static Client toEntity(ClientDto clientDto) {
        if (clientDto == null) {
            return null;
        }

        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNomClient(clientDto.getNomClient());
        client.setPrenomClient(clientDto.getPrenomClient());
        client.setAdresse(AdresseDto.toEntity(clientDto.getAdresse()));
        client.setPhotoClient(clientDto.getPhotoClient());
        client.setEmailClient(clientDto.getEmailClient());
        client.setIdEntreprise(clientDto.getIdEntreprise());
        client.setNumTelClient(clientDto.getNumTelClient());
        return (client);
    }
}
