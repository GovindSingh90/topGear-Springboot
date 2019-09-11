package com.wipro.ecart;

import java.util.List;

public interface ProductRepository {

	java.util.List getAllProducts();
	Product getProduct(String ProductNumber);
	

}
