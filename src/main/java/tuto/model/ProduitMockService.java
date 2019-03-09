package tuto.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitMockService implements IProduitService{

	@Autowired
	IProduitRepository produits;
	
	
	@Override
	public List<Produit> getProduits() {
		return produits.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		produits.save(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.delete(produit);
		produits.save(produit);
		
	}

	@Override
	public void deleteProduit(Long id) {
		Produit sup = produits.findById(id).get();
		produits.delete(sup);
		
	}

}
