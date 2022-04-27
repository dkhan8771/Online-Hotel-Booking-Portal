package com.boot.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.boot.entity.Role;
import com.boot.entity.Users;
import com.boot.repositorys.RoleRepository;
import com.boot.repositorys.UsersRepository;

@Service
public class RoleServices {

	@Autowired
	private UsersRepository userRepo;
	
	@Autowired RoleRepository roleRepo;
	
	
	
	public void registerDefaultUser(Users user) {
		Role roleUser = roleRepo.findByName("User");
		user.addRole(roleUser);
		
		userRepo.save(user);
	}
	
	public List<Users> listAll() {
		return userRepo.findAll();
	}

	public Users get(Long id) {
		return  userRepo.findById(id);
	}
	
	public List<Role> listRoles() {
		return roleRepo.findAll();
	}
	
	public void save(Users user) {
		
		userRepo.save(user);
	}
	
	private void encodePassword(Users user) {
		String password = (user.getPassword());
		user.setPassword(password);		
	}
}
