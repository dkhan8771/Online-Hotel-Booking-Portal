package com.boot.repositorys;

import java.util.List;

import com.boot.entity.Admin;
import com.boot.entity.Users;

/**
 * Interface that contains methods for contactRepositoryImpl
 * 
 * @author admin
 *
 */
public interface AdminRepository {

	/**
	 * Gets contacts of user
	 * 
	 * @param user
	 * @return List of contacts
	 */
	List<Admin> getUserContacts(Users user);

	/**
	 * Finds contact by contactId
	 * 
	 * @param contactId
	 * @return contact object
	 */
	Admin findContactById(Integer contactId);

	/**
	 * Saves contact in database
	 * 
	 * @param contact
	 */
	void createContact(Admin contact);

	/**
	 * Removes contact from database
	 * 
	 * @param contact
	 */
	void deleteContact(Admin contact);

	/**
	 * Edits existing contact
	 * 
	 * @param contact
	 */
	void editContact(Admin contact);
}
