package dao;

import java.util.List;

import metier.entities.Produit;

public class TestDao {

	public static void main(String[] args) {
		ProduitDaoImpl pdao= new ProduitDaoImpl();
		Produit prod = pdao.save(new Produit("prod1", 2000));
		System.out.println(prod);
		
		List<Produit> prods = pdao.produitsParMC("prod");
		for( Produit p : prods )
			System.out.println(p);
		
		
	}

}
