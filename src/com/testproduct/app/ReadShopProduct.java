package com.testproduct.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import com.test.model.Product;

public class ReadShopProduct {

	public static List<Product> getShopProduct(List<Product> prodList) {

		try {
			File f = new File("shopmart-db-products.txt");
			if (f.exists()) {
				FileInputStream file = new FileInputStream("shopmart-db-products.txt");
				ObjectInputStream input = new ObjectInputStream(file);
				List<Product> proList = (List<Product>) input.readObject();
				for (Product listProduct : proList) {
					System.out.println(listProduct);
				}
				file.close();
				input.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prodList;
	}

}
