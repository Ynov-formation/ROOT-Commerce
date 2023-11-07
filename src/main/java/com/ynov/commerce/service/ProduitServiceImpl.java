package com.ynov.commerce.service;

import com.ynov.commerce.dao.CategorieRepository;
import com.ynov.commerce.dao.ProduitRepository;
import com.ynov.commerce.dto.ProduitDto;
import com.ynov.commerce.entities.Categorie;
import com.ynov.commerce.entities.Produit;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProduitServiceImpl implements ProduitService{
    private ProduitRepository produitRepository;
    private CategorieRepository categorieRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository, CategorieRepository categorieRepository) {
        this.produitRepository = produitRepository;
        this.categorieRepository = categorieRepository;
    }

    @Override
    public ProduitDto saveProduit(ProduitDto produitDto) {
        Produit produit = Produit.builder()
                .nom(produitDto.getNom())
                .description(produitDto.getDescription())
                .prix(produitDto.getPrix())
                .quantite(produitDto.getQuantite())
                .build();
        if(produitDto.getCategorieId()!=null && produitDto.getCategorieId()!=0L){
            Categorie categorie = categorieRepository.findById(produitDto.getCategorieId()).orElse(null);
            produit.setCategorie(categorie);
        }

        return new ProduitDto(produitRepository.save(produit));
    }

    @Override
    public ProduitDto updateProduit(ProduitDto produitDto, Long id) {
        Produit produit = produitRepository.findById(id).orElse(null);
        if(produit == null) {
            return null;
        }
        if(produitDto.getCategorieId()!=null && produitDto.getCategorieId()!=0L){
            Categorie categorie = categorieRepository.findById(produitDto.getCategorieId()).orElse(null);
            produit.setCategorie(categorie);
        }
        produit.setNom(produitDto.getNom());
        produit.setDescription(produitDto.getDescription());
        produit.setPrix(produitDto.getPrix());
        produit.setQuantite(produitDto.getQuantite());

        return new ProduitDto(produitRepository.save(produit));
    }

    @Override
    public void deleteProduit(Long id) {
        Produit produit = produitRepository.findById(id).orElse(null);
        if(produit == null) {
            return;
        }

        if(produit.getLigneDeCommande()!=null){
            produit.getLigneDeCommande().setProduit(null);
        }

        produitRepository.deleteById(id);

    }

    @Override
    public List<ProduitDto> getAllProduits() {
        List<ProduitDto> toReturn = new ArrayList<>();
        produitRepository.findAll().forEach(produit -> {
            ProduitDto categoryDto = new ProduitDto(produit);
            toReturn.add(categoryDto);
        });
        return toReturn;
    }
}
