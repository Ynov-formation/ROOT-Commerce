package com.ynov.commerce.service;


import com.ynov.commerce.dto.LigneDeCommandeDto;
import com.ynov.commerce.entities.LigneDeCommande;

import java.util.List;

public interface LigneCommandeService {
    LigneDeCommande saveLigneCommande(LigneDeCommande ligneCommande);
    LigneDeCommande updateLigneCommande(LigneDeCommande ligneCommande);
    void deleteLigneCommande(Long id);
    List<LigneDeCommandeDto> getAllLigneCommandes();
}
