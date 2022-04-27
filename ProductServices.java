package com.boot.services;


import org.springframework.stereotype.Service;

import com.boot.entity.Admin;
import com.boot.entity.Product;
import com.boot.entity.Users;



public interface ProductServices {
	
	Product findProductByPid(Integer pId);
	
	void deleteProduct(Product product);
	
	void editProduct(Product product);
	
	void updateProduct(Product product);
	
	

}
