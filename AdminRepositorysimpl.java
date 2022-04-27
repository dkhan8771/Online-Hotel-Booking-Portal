package com.boot.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.boot.entity.Admin;
import com.boot.entity.Users;
import com.boot.repositorys.AdminRepository;

@Repository
@Transactional
public class AdminRepositorysimpl implements AdminRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Admin> getUserContacts(Users user) {
		System.out.println("working contacts");
		try {
			System.out.println("working");
			
			return entityManager.createQuery("from Admin where userId = :userId").setParameter("userId", user).getResultList();
		} catch (NoResultException e) {
		}
		return null;

	}

	public void createContact(Admin contact) {
		System.out.println("working");
		
		entityManager.persist(contact);
	}

	public void deleteContact(Admin contact) {
		System.out.println("working");
		if (entityManager.contains(contact))
			entityManager.remove(contact);
	}

	public void editContact(Admin contact) {
		System.out.println("working");
		entityManager.merge(contact);

	}

	public Admin findContactById(Integer contactId) {
		System.out.println("working");
		try {
			return (Admin) entityManager.createQuery("from Admin where contactId =:contactId")
					.setParameter("contactId", contactId).getSingleResult();
		} catch (NoResultException e) {
		}
		return null;

	}

}
