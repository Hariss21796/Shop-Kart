package com.testproduct.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import com.test.model.Product;
import com.test.model.User;

public class ShowCartProduct {

	public static List<Product> fetchProducts(Product product, User user, List<Product> proList) {

		try {
			File f = new File(user.getUserNmae() + "-shopmart-db-product.txt");
			if (f.exists()) {
				FileInputStream file = new FileInputStream(user.getUserNmae() + "-shopmart-db-product.txt");
				ObjectInputStream input = new ObjectInputStream(file);
				List<Product> prodList = (List<Product>) input.readObject();

				int match = 0;
				for (Product pList : prodList) {

					System.out.println("Product Id: " + pList.getId());
					System.out.println("Product Name: " + pList.getProductName());
					System.out.println("Description: " + pList.getProdDiscriptin());
					System.out.println("Price: " + pList.getProdPrice());
					System.out.println("-----------------------------------------------------------------");

					match++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proList;

	}
}
