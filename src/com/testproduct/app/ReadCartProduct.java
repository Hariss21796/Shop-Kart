package com.testproduct.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import com.test.model.Product;
import com.test.model.User;

public class ReadCartProduct {

	public static List<Product> readCartProduct(User user) {

		List<Product> pList = new LinkedList<Product>();
		try {
			File f = new File(user.getUserNmae() + "-shopmart-db-products.txt");
			if (f.exists()) {
				FileInputStream file = new FileInputStream(user.getUserNmae() + "-shopmart-db-products.txt");
				ObjectInputStream input = new ObjectInputStream(file);
				pList = (List<Product>) input.readObject();
				for (Product productList : pList) {
					System.out.println(productList);
					System.out.println("---------------------------------------------------------------------");

				}
				input.close();
				file.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" <<< Cart read failed! >>> ");
		}
		return pList;
	}

}
