package com.testproduct.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import com.test.model.Product;
import com.test.model.User;

public class AddProduct {

	public static List<Product> addProduct(User user) {

		Product product1 = new Product("1001", "Lenovo IdeaPad Gaming Laptop", "It is a 4k Gaming Laptop", 57990);
		Product product2 = new Product("1002", "DELL Inspiron Core i5 11th Gen Laptop",
				"Inspiron 3501 Thin and Light Laptop", 54990);
		Product product3 = new Product("1003", "APPLE iPhone 12", "Black-128 GB ROM", 62999);
		Product product4 = new Product("1004", "APPLE Airpods", " Bluetooth Headset-(White, True Wireless)", 18500);
		Product product5 = new Product("1005", "realme Watch 2", "Black Strap, Regular", 3499);
		Product product6 = new Product("1006", "SONY PlayStation 5", " 825 GB with Astro's Playroom-(White)", 49990);

		List<Product> prodList = new LinkedList<Product>();
		prodList.add(product1);
		prodList.add(product2);
		prodList.add(product3);
		prodList.add(product4);
		prodList.add(product5);
		prodList.add(product6);

		try {
			FileOutputStream file = new FileOutputStream("shopmart-db-products.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(prodList);
			file.close();
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();

		}
		return prodList;

	}

}
