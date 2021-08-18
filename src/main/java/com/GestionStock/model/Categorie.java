package com.GestionStock.model;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;



@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "gategorie")
public class Categorie extends AbstractEntity {


    @Column(name = "codeCategorie")
    private String codeCategorie;

    @Column(name = "designationGategorie")
    private String designationGategorie;


    @Column(name = "identreprise")
    private Integer idEntreprise;


    @OneToMany(mappedBy = "categorie")
    private List<Article> listArticles;




    @OneToMany(mappedBy = "categorie")
    private List<Article> listArticle;

}
