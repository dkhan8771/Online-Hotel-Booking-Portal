package com.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.Admin;
import com.boot.entity.Users;
import com.boot.repositorys.AdminRepository;
import com.boot.services.AdminServices;

@Service
public class AdminServiceImpl implements AdminServices {

	@Autowired
	AdminRepository adminRepository;

	@Override
	public List<Admin> getUserContacts(Users user) {
		if (user != null) {
			return adminRepository.getUserContacts(user);
		}
		return null;
	}

	@Override
	public Admin findContactById(Integer contactId) {
		if (contactId != null)
			return adminRepository.findContactById(contactId);
		return null;
	}

	@Override
	public void createContact(Admin contact) {
		if (contact != null)
			adminRepository.createContact(contact);

	}

	@Override
	public void deleteContact(Admin contact) {
		if (contact != null)
			adminRepository.deleteContact(contact);

	}

	@Override
	public void editContact(Admin contact) {
		if (contact != null)
			adminRepository.editContact(contact);

	}

}
