package tuto.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduitRepository extends JpaRepository<Produit, Long>{

	Produit findByRef(String ref);

}
