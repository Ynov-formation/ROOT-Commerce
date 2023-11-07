package com.ynov.commerce.web;

import com.ynov.commerce.dto.CategorieDto;
import com.ynov.commerce.entities.Categorie;
import com.ynov.commerce.service.CategorieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("commerce/v1")
@CrossOrigin("*")
public class CategorieRestRessources {

    private CategorieService categorieService;

    public CategorieRestRessources(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping(value = "/categories")
    public ResponseEntity<?> getAllCategies() {
        return ResponseEntity.ok(categorieService.getAllCategories());
    }

    @PostMapping(value = "/categories")
    public ResponseEntity<?> saveCategorie(@RequestBody CategorieDto categorieDto) {
        return ResponseEntity.ok(categorieService.saveCategorie(categorieDto));
    }

    @PutMapping(value = "/categories")
    public ResponseEntity<?> updateCategorie(@RequestBody CategorieDto categorieDto,@RequestParam("id") Long id) {
        return ResponseEntity.ok(categorieService.updateCategorie(categorieDto,id));
    }
    @DeleteMapping(value = "/categories")
    public ResponseEntity<?> updateCategorie(@RequestParam("id") Long id) {
        categorieService.deleteCategorie(id);
        return ResponseEntity.ok("OK");
    }
}
