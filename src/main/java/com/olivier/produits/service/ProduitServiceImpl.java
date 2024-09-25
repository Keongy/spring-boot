package com.olivier.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olivier.produits.entitites.Categorie;
import com.olivier.produits.entitites.Produit;
import com.olivier.produits.repos.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {
	
	@Autowired
	ProduitRepository produitRepository;

	@Override
	public Produit saveProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		 produitRepository.delete(p);
	}

	@Override
	public void deleteProduitById(Long id) {
		 produitRepository.deleteById(id);
	}

	@Override
	public Produit getProduit(Long id) {
		return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitRepository.findAll();
	}

	@Override
	public List<Produit> findByNomProduit(String nom) {
		return findByNomProduit(nom);
	}

	@Override
	public List<Produit> findByNomProduitContains(String nom) {
		return findByNomProduitContains(nom);
	}

	@Override
	public List<Produit> findByNomPrix(String nom, Double prix) {
		return findByNomPrix(nom, prix);
	}

	@Override
	public List<Produit> findByCategorie(Categorie categorie) {
		return findByCategorie(categorie);
	}

	@Override
	public List<Produit> findByCategorieIdCat(Long id) {
		return findByCategorieIdCat(id);
	}

	@Override
	public List<Produit> findByOrderByNomProduitAsc() {
		return findByOrderByNomProduitAsc();
	}

	@Override
	public List<Produit> trierProduitsNomsPrix() {
		return trierProduitsNomsPrix();
	}

}
