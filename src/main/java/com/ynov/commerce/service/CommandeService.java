package com.ynov.commerce.service;

import com.ynov.commerce.dto.CommandeDto;
import com.ynov.commerce.entities.Commande;

import java.util.List;

public interface CommandeService {
    Commande saveCommande(Commande commande);
    Commande updateCommande(Commande commande);
    void deleteCommande(Long id);
    List<CommandeDto> getAllCommandes();
}
