package com.boot.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.boot.entity.Admin;
import com.boot.entity.Users;

import com.boot.repositorys.UsersRepository;

@Repository
@Transactional
public class UsersRespositorysimpl implements UsersRepository {

	// An EntityManager will be automatically injected from entityManagerFactory
	// setup on DatabaseConfig class.
	@PersistenceContext
	private EntityManager entityManager;

	public void save(Users user) {
		entityManager.persist(user);
	}

	public Users findByEmailAndPassword(String email, String password) {
		try {
			return (Users) entityManager.createQuery("from Users where email = :email and password = :password")
					.setParameter("email", email).setParameter("password", password).getSingleResult();
		} catch (NoResultException e) {
		}
		return null;

	}

	public List<Users>  findAll(Users user) {
		try {
		return entityManager.createQuery("from Users").getResultList();
		} catch (NoResultException e) {
		}
		return null;

	}
	
	public Users findByEmail(String email) {
		try {
			return (Users) entityManager.createQuery("from Users where email = :email").setParameter("email", email)
					.getSingleResult();
		} catch (NoResultException e) {
		}
		return null;

	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStatus(Users login) {
		System.out.println("working");
		entityManager.merge(login);
	}


	@Override
	public Users findUsersById(long userId) {
		try {
			return (Users) entityManager.createQuery("update login set login = :login" + 
				    " where UserId = :UserId").setParameter("userId", userId)
					.getSingleResult();
		} catch (NoResultException e) {
		}
		return null;
	}

	

}
