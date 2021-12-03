package com.testproduct.app;

import java.util.List;

import com.test.model.Product;

public class ShowByName {

	public static void showProdByName(List<Product> productList, String prodName) {
		try {
			int match = 0;
			for (Product userProd : productList) {
				if (userProd.getProductName().equals(prodName)) {
					System.out.println("Product ID: " + userProd.getId());
					System.out.println("Product Name: " + userProd.getProductName());
					System.out.println("Description: " + userProd.getProdDiscriptin());
					System.out.println("Peice: " + userProd.getProdPrice());
					match++;
				}

			}
			if (match == 0) {
				System.out.println(" <<< Product Name does not match please try again! >>> ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
