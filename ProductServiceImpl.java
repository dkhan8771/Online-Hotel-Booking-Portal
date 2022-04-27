package com.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.Product;
import com.boot.repositorys.ProductRepository;
import com.boot.services.ProductServices;


@Service
public class ProductServiceImpl implements ProductServices{
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product findProductByPid(Integer pId) {
		if (pId != null)
			return productRepository.findProductByPid(pId);
		return null;
	}

	@Override
	public void deleteProduct(Product product) {
		if (product != null)
			productRepository.deleteProduct(product);

		
	}

	@Override
	public void editProduct(Product product) {
		if (product != null)
			productRepository.editProduct(product);
		
	}

	@Override
	public void updateProduct(Product product) {
		
			if (product != null)
				productRepository.updateProduct(product);
			
		
		
	}

	

}
