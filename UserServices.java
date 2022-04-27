package com.boot.services;

import java.util.List;

import javax.validation.Valid;

import com.boot.entity.Admin;
import com.boot.entity.Users;

/**
 * Service which works with {@UserRepository}
 * @author admin
 *
 */
public interface UserServices {

	void save(Users user);

	Users findByEmailAndPassword(String email, String password);

	Users findByEmail(String email);

	List<Users> findAll(Users user);
	
	Users findUsersById(Long UserId);
	
	void updateStatus(Users login);

	// void deleteContact(Admin contact);
	 
}
