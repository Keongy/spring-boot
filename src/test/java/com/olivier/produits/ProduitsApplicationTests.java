package com.olivier.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.olivier.produits.entitites.Produit;
import com.olivier.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;

	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("PC DELL", 2200.500, new Date());
		produitRepository.save(prod);
	}
	
	@Test
	public void testCreateProduit2() {
		Produit prod = new Produit("Voiture", 25000.0, new Date());
		produitRepository.save(prod);
	}
	
	@Test
	public void testCreateProduit3() {
		Produit prod = new Produit("PS5", 12456.0, new Date());
		produitRepository.save(prod);
	}

	@Test
	public void testFindProduit() {
		Produit p = produitRepository.findById(1L).get();
		System.out.println(p);
	}

	@Test
	public void testUpdateProduit() {
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(1000.0);
		produitRepository.save(p);
	}

	@Test
	public void testDeleteProduit() {
		produitRepository.deleteById(1L);
		;
	}

	@Test
	public void testListerTousProduits() {
		List<Produit> prods = produitRepository.findAll();
		for (Produit p : prods) {
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindProduitByNom() {
		List<Produit> prods = produitRepository.findByNomProduit("PS5");
		
		for(Produit p:prods)
			System.out.println(p);
	}
	
	
	@Test
	public void testFindProduitByContain() {
		List<Produit> prods = produitRepository.findByNomProduitContains("p");
		
		for(Produit p:prods)
			System.out.println(p);
	}
	
	

}
