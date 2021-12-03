package com.testproduct.app;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import com.test.model.Product;
import com.test.model.User;

public class AddProductToCart {

	public static boolean addProductToCart(Product prod, User user) {

		List<Product> prodList = ReadProduct.getProduct(user);
		if (!prodList.isEmpty()) {
			prodList = ReadProduct.getProduct(user);

		} else {
			prodList = new LinkedList<Product>();
			System.out.println(" <<< First product is successfully added to cart! >>> ");
		}
		prodList.add(prod);

		try {

			FileOutputStream file = new FileOutputStream(user.getUserNmae() + "-shopmart-db-product.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(prodList);
			out.close();
			file.close();
			System.out.println("<<< Product is added to cart successfully! >>>");
		} catch (Exception e) {
			System.out.println(" <<< Failed to add product. Please try again! >>> ");
		}
		return true;
	}

}
