package com.testproduct.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import com.test.model.Product;
import com.test.model.User;

public class ReadProduct {

	public static List<Product> getProduct(User user) {

		List<Product> productList = new LinkedList<Product>();

		try {
			File f = new File(user.getUserNmae() + "-shopmart-db-product.txt");
			if (f.exists()) {
				FileInputStream file = new FileInputStream(user.getUserNmae() + "-shopmart-db-product.txt");
				ObjectInputStream input = new ObjectInputStream(file);

				productList = (List<Product>) input.readObject();
				for (Product prodList : productList) {
					System.out.println(prodList);
				}
				input.close();
				file.close();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return productList;
	}

}
