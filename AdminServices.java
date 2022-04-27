package com.boot.services;

import java.util.List;

import com.boot.entity.Admin;
import com.boot.entity.Users;

/**
 * Service which works with contact repository {@ContactRepository}
 * @author admin
 *
 */
public interface AdminServices {
	
	List<Admin> getUserContacts(Users user);

	Admin findContactById(Integer contactId);

	void createContact(Admin contact);

	void deleteContact(Admin contact);

	void editContact(Admin contact);
}
