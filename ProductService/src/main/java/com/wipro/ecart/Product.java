package com.wipro.ecart;

import java.io.Serializable;

public class Product implements Serializable{

	

		private static final long serialVersionUID = 1L;

		private Long productId;

		private String ProductNumber;

		private String ProductName;
		
		private String ProductDescription;
		
		private int  ProductQty;
		
		private double ProductPrice;

		
		
		public Product()
		{
			
		}
		/**
		 * @param productId
		 * @param productNumber
		 * @param productName
		 * @param productDescription
		 * @param productQty
		 * @param productPrice
		 */
		public Product(Long productId, String productNumber, String productName, String productDescription,
				int productQty, double productPrice) {
			super();
			this.productId = productId;
			ProductNumber = productNumber;
			ProductName = productName;
			ProductDescription = productDescription;
			ProductQty = productQty;
			ProductPrice = productPrice;
		}

		public Long getProductId() {
			return productId;
		}

		public void setProductId(Long productId) {
			this.productId = productId;
		}

		public String getProductNumber() {
			return ProductNumber;
		}

		public void setProductNumber(String productNumber) {
			ProductNumber = productNumber;
		}

		public String getProductName() {
			return ProductName;
		}

		public void setProductName(String productName) {
			ProductName = productName;
		}

		public String getProductDescription() {
			return ProductDescription;
		}

		public void setProductDescription(String productDescription) {
			ProductDescription = productDescription;
		}

		public int getProductQty() {
			return ProductQty;
		}

		public void setProductQty(int productQty) {
			ProductQty = productQty;
		}

		public double getProductPrice() {
			return ProductPrice;
		}

		public void setProductPrice(double productPrice) {
			ProductPrice = productPrice;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
		
		
		
}
