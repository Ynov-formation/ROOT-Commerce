package com.ynov.commerce.web;

import com.ynov.commerce.dto.ProduitDto;
import com.ynov.commerce.service.ProduitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("commerce/v1")
@CrossOrigin("http://localhost:4200")
public class ProduitRestRessources {

    private ProduitService produitService;

    public ProduitRestRessources(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping(value = "/produits")
    public ResponseEntity<?> getAllCategies() {
        return ResponseEntity.ok(produitService.getAllProduits());
    }

    @PostMapping(value = "/produits")
    public ResponseEntity<?> saveProduit(@RequestBody ProduitDto produitDto) {
        return ResponseEntity.ok(produitService.saveProduit(produitDto));
    }

    @PutMapping(value = "/produits")
    public ResponseEntity<?> updateProduit(@RequestBody ProduitDto produitDto,@RequestParam("id") Long id) {
        return ResponseEntity.ok(produitService.updateProduit(produitDto,id));
    }
    @DeleteMapping(value = "/produits")
    public ResponseEntity<?> updateProduit(@RequestParam("id") Long id) {
        produitService.deleteProduit(id);
        return ResponseEntity.ok("OK");
    }
}
