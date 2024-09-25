package com.olivier.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olivier.produits.entitites.Produit;
import com.olivier.produits.service.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {

	@Autowired
	ProduitService produitService;

	@GetMapping
	public List<Produit> getAllProduit() {
		return produitService.getAllProduits();
	}

	@GetMapping("/{id}")
	public Produit getProduitById(@PathVariable Long id) {
		return produitService.getProduit(id);
	}

	@PostMapping
	public Produit postProduit(@RequestBody Produit produit) {
		return produitService.saveProduit(produit);
	}

	@PutMapping
	public Produit updateProduit(@RequestBody Produit produit) {
		return produitService.updateProduit(produit);
	}

	@DeleteMapping("/{id}") 
	public void deleteProduit(@PathVariable Long id) {
		produitService.deleteProduitById(id);
	}

}
