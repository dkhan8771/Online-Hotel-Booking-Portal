package com.boot.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.boot.entity.Product;
import com.boot.repositorys.ProductRepository;

@Repository
@Transactional
	public class ProductRepositoryImpl implements ProductRepository {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public List<Product> getProducts() {
		try {
			return entityManager.createQuery("from Product").getResultList();
		}catch (NoResultException e) {
		}
		return null;
		
	}

	@Override
	public Product findProductByPid(int pId) {
		try {
			return (Product) entityManager.createQuery("from Product where pId =:pId")
					.setParameter("pId", pId).getSingleResult();
		} catch (NoResultException e) {
		}
		return null;
		
	}

	@Override
	public void saveProduct(Product product) {
		entityManager.persist(product);	
		
	}

	@Override
	public void deleteProduct(Product product) {
		if (entityManager.contains(product))
			entityManager.remove(product);
		
	}

	@Override
	public void updateProduct(Product product) {
		entityManager.merge(product);
		
	}

	@Override
	public void editProduct(Product product) {
		entityManager.merge(product);
		
	}
		
	}


