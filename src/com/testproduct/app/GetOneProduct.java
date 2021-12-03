package com.testproduct.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import com.test.model.Product;
import com.test.model.User;

public class GetOneProduct {

	public static Product getOneProduct(String productId, User users) {
		List<Product> productList = new LinkedList<Product>();

		try {
			File f = new File("shopmart-db-products.txt");
			if (f.exists()) {
				FileInputStream file = new FileInputStream("shopmart-db-products.txt");
				ObjectInputStream input = new ObjectInputStream(file);
				productList = (List<Product>) input.readObject();
				for (Product prod : productList) {
					if (prod.getId().equals(productId)) {
						System.out.println(prod);
						return prod;

					}
					file.close();
					input.close();
				}
			}
		} catch (Exception e) {

		}
		return null;
	}

}
