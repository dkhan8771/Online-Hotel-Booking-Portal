package com.boot.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.Users;
import com.boot.repositorys.UsersRepository;

import com.boot.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {

	@Autowired
	UsersRepository userRepository;

	@Override
	public void save(Users user) {
		if (user != null) {
			userRepository.save(user);
		}

	}

	@Override
	public Users findByEmailAndPassword(String email, String password) {
		Users user = null;
		if (email != null && password != null) {
			user = userRepository.findByEmailAndPassword(email, password);
		}
		return user;
	}

	@Override
	public Users findByEmail(String email) {
		if (email != null) {
			return userRepository.findByEmail(email);
		}
		return null;
	}

	@Override
	public List<Users> findAll(Users user) {
		if (user != null) {
			return userRepository.findAll(user);
		}
		return null;
	}

	/*@Override
	public void updateStatus(Users login) {
		if (Users != null)
			adminRepository.deleteContact(contact);
	}*/
	
	@Override
	public Users findUsersById(Long userId) {
		if (userId != null)
			return userRepository.findUsersById(userId);
		return null;
	}

	@Override
	public void updateStatus(Users login) {
		if (login != null)
			userRepository.updateStatus(login);
		
	}

	

	

	

}