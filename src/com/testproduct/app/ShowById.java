package com.testproduct.app;

import java.util.List;

import com.test.model.Product;

public class ShowById {

	public static void showProductById(List<Product> prodList, String ProdId) {

		try {
			int match = 0;
			for (Product userProd : prodList) {

				if (userProd.getId().equals(ProdId)) {
					System.out.println("Product ID: " + userProd.getId());
					System.out.println("Product Name: " + userProd.getProductName());
					System.out.println("Description: " + userProd.getProdDiscriptin());
					System.out.println("Price: " + userProd.getProdPrice());
					match++;
				}

			}
			if (match == 0) {
				System.out.println(" <<< Product Id does not match please try agin! >>> ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
