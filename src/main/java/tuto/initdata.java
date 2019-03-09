package tuto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tuto.model.IProduitRepository;
import tuto.model.Produit;

@Component
public class initdata implements CommandLineRunner{

	@Autowired
	IProduitRepository produits;
	

	@Override
	public void run(String... args) throws Exception {
		if(produits.count() == 0){
			produits.save(new Produit("Livre", 50, 20));
			produits.save(new Produit("Cahier", 200, 5.25F));
			produits.save(new Produit("Stylo", 500, 2.10F));
		}
	}
}
