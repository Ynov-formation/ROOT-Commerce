package com.ynov.commerce.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.ynov.commerce.entities.LigneDeCommande}
 */
@Value
public class LigneDeCommandeDto implements Serializable {
    Long id;
    int quantite;
    double prixUnitaire;
    String designation;
}