package com.ynov.commerce.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.ynov.commerce.entities.Client}
 */
@Value
public class ClientDto implements Serializable {
    Long id;
    String nom;
    String prenom;
    String email;
    String dateNaissance;
}