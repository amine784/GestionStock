package com.GestionStock.dto;

import com.GestionStock.model.LigneVente;
import com.GestionStock.model.Ventes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class VentesDto {

    private Integer id;

    private String codeVente;
    private Instant dateVente;
    private String commentaire;

    private Integer idEntreprise;

    @JsonIgnore
    private List<LigneVenteDto> ligneVentes;


    public static VentesDto fromEntity(Ventes vente) {
        if (vente.equals(null)) {
            return null;
        }

        return VentesDto.builder()
                .id(vente.getId())
                .codeVente(vente.getCodeVente())
                .commentaire(vente.getCommentaire())
                .idEntreprise(vente.getIdEntreprise())
                .build();
    }



    public static Ventes toEntity(VentesDto ventesDto){
        if (ventesDto.equals(null)) {
            return null;
        }
        Ventes ventes = new Ventes();
        ventes.setId(ventes.getId());
        ventes.setCodeVente(ventes.getCodeVente());
        ventes.setCommentaire(ventesDto.getCommentaire());
        ventes.setIdEntreprise(ventes.getIdEntreprise());

            return (ventes);
    }

}
