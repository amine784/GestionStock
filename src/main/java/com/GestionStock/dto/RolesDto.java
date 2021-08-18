package com.GestionStock.dto;

import com.GestionStock.model.Roles;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

    private Integer id;

    private String roleName;

    @JsonIgnore
    private UtilisateurDto utilisateur;



    public static RolesDto fromEntity(Roles roles){
        if(roles.equals(null)){
            return null;
        }
        return RolesDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName())
                .build();
    }

    public  static Roles toEntity(RolesDto rolesDto){
        if(rolesDto.equals(null)){
            return null;
        }

        Roles roles = new Roles();
        roles.setId(rolesDto.getId());
        roles.setRoleName(rolesDto.getRoleName());
        //roles.setUtilisateur(UtilisateurDto.toEntity(rolesDto.getUtilisateur()));

            return roles;
    }
}
