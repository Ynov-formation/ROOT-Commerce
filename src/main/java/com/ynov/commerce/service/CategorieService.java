package com.ynov.commerce.service;

import com.ynov.commerce.dto.CategorieDto;
import com.ynov.commerce.entities.Categorie;

import java.util.List;

public interface CategorieService {
    CategorieDto saveCategorie(CategorieDto categorie);
    CategorieDto updateCategorie(CategorieDto categorie,Long id);


    void deleteCategorie(Long id);
    List<CategorieDto> getAllCategories();

}
