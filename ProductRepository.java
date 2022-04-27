package com.boot.repositorys;

import java.util.List;

import com.boot.entity.Admin;
import com.boot.entity.Product;


public interface ProductRepository {
	
	List<Product> getProducts();
	
	Product findProductByPid(int pId);
	
	void saveProduct(Product product);
	
	void deleteProduct(Product product);

	void updateProduct(Product product);
	
	void editProduct(Product product);


}
