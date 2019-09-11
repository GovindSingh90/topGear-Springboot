package com.wipro.ecart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

@Repository

	public class StubProductRepository implements ProductRepository {

		

		private Map<String, Product> productByNumber = new HashMap<String, Product>();

		

		public StubProductRepository() {

			Product product = new Product(1L, "BF001" , "SydneySheldon Book", "Story books", 4, 2000.00);

			productByNumber.put("BF001", product);

			product = new Product(2L, "BF002" , "Adventure Dinausaor" , "Movie CD" , 6, 2000.00);

			productByNumber.put("BF002", product);

			

			//Logger.getLogger(StubProductRepository.class).info("Created StubProductRepository");

		}

		

		@Override

		public List<Product> getAllProducts() {

			return new ArrayList<Product>(productByNumber.values());

		}



		@Override

		public Product getProduct(String ProductNumber) {

			return productByNumber.get(ProductNumber);

		}



	}

