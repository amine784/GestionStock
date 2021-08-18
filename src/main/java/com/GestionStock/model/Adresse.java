package com.GestionStock.model;



import lombok.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse  implements Serializable {

    @Column(name = "adresse1")
    private String adresseOne;

    @Column(name = "adresse2")
    private String adresseTwo;

    @Column(name = "ville")
    private String ville;

    @Column(name = "codepostale")
    private String codePostale;

    @Column(name = "pays")
    private String pays;
}
