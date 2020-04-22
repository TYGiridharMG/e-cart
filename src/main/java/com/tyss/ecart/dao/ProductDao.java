package com.tyss.ecart.dao;

import java.util.List;

import com.tyss.ecart.model.Product;

public interface ProductDao {

	List<Product> getAllProducts();

	Product getProductById(long productId);

	void deleteProduct(long productId);

	void addProduct(Product product);
	
	void editProduct(Product product);
	
}
