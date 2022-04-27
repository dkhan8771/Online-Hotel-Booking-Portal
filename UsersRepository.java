package com.boot.repositorys;

import java.util.List;

import com.boot.entity.Admin;
import com.boot.entity.Users;

/**
 * Repository for user object
 * 
 * @author admin
 *
 */
public interface UsersRepository {

	/**
	 * Saves user in database
	 * 
	 * @param user
	 */
	void save(Users user);

	/**
	 * Get user from database by login and password
	 * 
	 * @param email
	 * @param password
	 * @return found user
	 */
	Users findByEmailAndPassword(String email, String password);

	/**
	 * Finds user by login
	 * 
	 * @param email
	 * @return user object
	 */
	Users findByEmail(String email);
	
	
	List<Users> findAll(Users user);

	List<Users> findAll();

	Users findById(Long id);

	Users findUsersById(long userId);

	void updateStatus(Users login);
}
