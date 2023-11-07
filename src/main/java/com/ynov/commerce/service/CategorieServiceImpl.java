package com.ynov.commerce.service;

import com.ynov.commerce.dao.CategorieRepository;
import com.ynov.commerce.dto.CategorieDto;
import com.ynov.commerce.entities.Categorie;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class CategorieServiceImpl implements CategorieService{

    private CategorieRepository categorieRepository;

    public CategorieServiceImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public CategorieDto saveCategorie(CategorieDto categorieDto) {
        Categorie categorie = Categorie.builder()
                .nom(categorieDto.getNom())
                .description(categorieDto.getDescription())
                .build();

        return new CategorieDto(categorieRepository.save(categorie));
    }

    @Override
    public CategorieDto updateCategorie(CategorieDto categorieDto, Long id) {
        Categorie categorie = categorieRepository.findById(id).orElse(null);
        if(categorie == null) {
            return null;
        }
        categorie.setNom(categorieDto.getNom());
        categorie.setDescription(categorieDto.getDescription());

        return new CategorieDto(categorieRepository.save(categorie));
    }

    @Override
    public void deleteCategorie(Long id) {
        Categorie categorie = categorieRepository.findById(id).orElse(null);
        if(categorie == null) {
            return;
        }
        categorie.getProduits().forEach(produit -> {
            produit.setCategorie(null);
        });
        categorieRepository.deleteById(id);

    }

    @Override
    public List<CategorieDto> getAllCategories() {
        List<CategorieDto> toReturn = new ArrayList<>();
        categorieRepository.findAll().forEach(categorie -> {
           CategorieDto categoryDto = new CategorieDto(categorie);
           toReturn.add(categoryDto);
        });
        return toReturn;
    }
}
