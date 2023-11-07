package com.ynov.commerce.service;

import com.ynov.commerce.dto.ProduitDto;
import com.ynov.commerce.entities.Produit;

import java.util.List;

public interface ProduitService {
    ProduitDto saveProduit(ProduitDto produitDto);
    ProduitDto updateProduit(ProduitDto produitDto,Long id);
    void deleteProduit(Long id);
    List<ProduitDto> getAllProduits();
}
