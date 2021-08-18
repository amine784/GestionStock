package com.GestionStock.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "RolesUtilisateur")
public class Roles extends AbstractEntity{

    @Column(name = "rolename")
    private String roleName;

    @ManyToOne
    @JoinColumn(name = "utilisateur")

    @JoinColumn(name = "idutilisateur")

    private Utilisateur utilisateur;
}
