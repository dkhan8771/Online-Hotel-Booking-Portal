package com.boot.repositorys;

import com.boot.entity.BookOnline;
import com.boot.entity.Users;

public interface BookOnlineRepository {
	
	/**
	 * Saves user in database
	 * 
	 * @param user
	 */
	void save(BookOnline bookonline);
	
	
	BookOnline findByEmail(String email);
	
	

}
