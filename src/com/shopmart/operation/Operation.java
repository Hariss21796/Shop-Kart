package com.shopmart.operation;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.test.model.Product;
import com.test.model.User;
import com.testproduct.app.AddProduct;
import com.testproduct.app.AddProductToCart;
import com.testproduct.app.GetOneProduct;
import com.testproduct.app.ReadById;
import com.testproduct.app.ReadByName;
import com.testproduct.app.ReadShopProduct;
import com.testproduct.app.ShowById;
import com.testproduct.app.ShowByName;
import com.testproduct.app.ShowCartProduct;
import com.testuser.app.Login;
import com.testuser.app.Registration;

public class Operation {

	public static void main(String[] args) {

		Product prod = new Product();

		System.out.println("::::::::::: <<<     [ WELCOME TO SHOPMART ]     >>> :::::::::::");
		System.out.println("===============================================================");
		System.out.println(":::::::::: <<< [ PLEASE SELECT YOUR OPERATION ] >>> :::::::::: ");
		System.out.println("===============================================================");
		System.out.println("::::: <<< [ PRESS '1' FOR REGISTRATION ] >>> ::::: ");
		System.out.println("::::: <<< [ PRESS '2' FOR LOGIN ] >>> ::::: ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		switch (option) {
		case 1:
			User userReg = userRegistration();
			Registration.registration(userReg);
			break;

		case 2:
			User userLog = userLogin();
			boolean response = Login.login(userLog);
			if (response) {
				optionAfterLogin(userLog, prod);
			}
			break;

		default:
			break;
		}

	}

	public static User userRegistration() {
		User user = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("::::: <<< PLEASE ENTER YOUR DETAILS FOR REGISTRATION >>> ::::: ");
		System.out.println("SET YOUR ID: ");
		user.setId(sc.nextLine());
		System.out.println("ENTER YOUR NAME: ");
		user.setUserNmae(sc.nextLine());
		System.out.println("ENTER GMEIL ID: ");
		user.setGmail(sc.nextLine());
		System.out.println("ENTER PASSWORD: ");
		user.setPassword(sc.nextLine());
		System.out.println("CONFIRM PASSWORD: ");
		user.setCnfPassword(sc.nextLine());
		return user;

	}

	public static User userLogin() {
		User user = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("::::: <<< PLEASE ENTER YOUR DETAILS FOR LOGIN >>> ::::: ");
		System.out.println("ENTER USERNAME: ");
		user.setUserNmae(sc.nextLine());
		System.out.println("ENTER PASSWORD: ");
		user.setPassword(sc.nextLine());
		return user;

	}

	private static String showById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER PRODUCT ID: ");
		return sc.nextLine();
	}

	private static String showByName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER PRODUCT NAME: ");
		return sc.nextLine();
	}

	public static String addToCart() {
		Product prod = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER PRODUCT ID FOR ADD TO CART: ");
		return sc.nextLine();

	}

	public static void buyProduct() {
		System.out.println("::::: <<< PRESS '1' FOR PURCHASE >>> :::::");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("::::: <<< CONGRATULATIONS YOUR ORDER HAS BEEN SUCCESSFULLY PLACED >>> :::::");
			break;

		default:
			break;
		}
	}

	private static void chooseCartOperation(User userlog, List<Product> prodList, Product prod) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER PRODUCT ID: ");
		String productId = scanner.nextLine();
		Product product = GetOneProduct.getOneProduct(productId, userlog);
		AddProductToCart.addProductToCart(product, userlog);

	}

	private static void optionAfterLogin(User userLog, Product prod) {
		Scanner sc = new Scanner(System.in);
		System.out.println(":::::: <<< PRESS '1' FOR SHOW PRODUCTS  >>>  ::::::");
		System.out.println(":::::: <<< PRESS '2' FOR SHOW CART PRODUCT >>> ::::::");
		System.out.println(":::::: <<< PRESS '3' FOR SHOW CART PRODUCT BY ID >>> ::::::");
		System.out.println(":::::: <<< PRESS '4' FOR SHOW CART PRODUCT BY NAME >>> ::::::");
		int option = sc.nextInt();
		List<Product> prodList = new LinkedList<Product>();

		switch (option) {
		case 1:
			prodList = AddProduct.addProduct(userLog);
			ReadShopProduct.getShopProduct(prodList);
			System.out.println(":::::: <<< PRESS '1' FOR ADD PPRODUCT TO CART >>> ::::::");
			Scanner scanner = new Scanner(System.in);
			int option1 = sc.nextInt();

			switch (option1) {
			case 1:
				chooseCartOperation(userLog, prodList, prod);
				// buyProduct();
				break;
			default:
				break;
			}
		case 2:
			ShowCartProduct.fetchProducts(prod, userLog, prodList);
			buyProduct();
			break;
		case 3:
			String prodId = showById();
			List<Product> productList = ReadById.getProdById(userLog);
			ShowById.showProductById(productList, prodId);
			buyProduct();
		case 4:
			String prodName = showByName();
			List<Product> pList = ReadByName.getProductByName(userLog);
			ShowByName.showProdByName(pList, prodName);
			buyProduct();

		default:
			break;

		}
		sc.close();
	}

}
