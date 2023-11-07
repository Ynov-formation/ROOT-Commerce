package com.ynov.commerce.dto;

import com.ynov.commerce.entities.Categorie;
import lombok.*;

import java.io.Serializable;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategorieDto {
    Long id;
    String nom;
    String description;

    public CategorieDto(Categorie categorie) {
        this.id = categorie.getId();
        this.nom = categorie.getNom();
        this.description = categorie.getDescription();
    }
}