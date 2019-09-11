package com.wipro.ecart;

import java.awt.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
		//protected Logger logger = Logger.getLogger(ProductController.class.getName());
 
		

		@Autowired

		ProductRepository productRepository;

		

		@RequestMapping("/products")

		public Product[] all() {

			//logger.info("product-microservice all() invoked");

			java.util.List product = ((ProductRepository) productRepository).getAllProducts();

			//logger.info("product-microservice all() found: " + product.size());

			return (Product[]) product.toArray(new Product[product.size()]);

		}

		

		@RequestMapping("/products/{id}")

		public Product byId(@PathVariable("id") String id) {

			//logger.info("products-microservice byId() invoked: " + id);

			Product product = productRepository.getProduct(id);

			//logger.info("products-microservice byId() found: " + product);

			return product;

		}

	
}
