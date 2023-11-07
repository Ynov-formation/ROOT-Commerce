package com.ynov.commerce.dto;

import com.ynov.commerce.entities.Produit;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProduitDto implements Serializable {
    Long id;
    String nom;
    String description;
    double prix;
    int quantite;
    String image;
    String categorieName;
    Long categorieId;

    public ProduitDto(Produit produit) {
        this.id = produit.getId();
        this.nom = produit.getNom();
        this.description = produit.getDescription();
        this.prix = produit.getPrix();
        this.quantite = produit.getQuantite();
        this.image = produit.getImage();
        this.categorieName = produit.getCategorie()!=null?produit.getCategorie().getNom():"N/A";
        this.categorieId = produit.getCategorie()!=null?produit.getCategorie().getId():null;
    }
}