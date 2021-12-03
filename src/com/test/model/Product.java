package com.test.model;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String productName;
	private String prodDiscriptin;
	private double prodPrice;

	public Product(String id, String productName, String prodDiscriptin, double prodPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.prodDiscriptin = prodDiscriptin;
		this.prodPrice = prodPrice;
	}

	public Product() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProdDiscriptin() {
		return prodDiscriptin;
	}

	public void setProdDiscriptin(String prodDiscriptin) {
		this.prodDiscriptin = prodDiscriptin;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", prodDiscriptin=" + prodDiscriptin
				+ ", prodPrice=" + prodPrice + "]";
	}

}
