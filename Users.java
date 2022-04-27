package com.boot.entity;



import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	@Column(name = "login")
	private String login="users";
	@Column(nullable = false ,unique = true)
	
	private String email;
	@Column(nullable = false ,length = 20)
	private String firstName;
	@Column(nullable = false ,length = 38)
	private String lastName;
	@Column(nullable = false ,length = 255)
	private String password;
	//kristynazvakovaa
		
	@ManyToMany
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(name= "users_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")
			)
	private Set<Role> roles = new HashSet<>();
	
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
	private Collection<Admin> contactsCollection;
	*/
	public String getLogin() {
		return login;
	}
	/*public Collection<Admin> getContactsCollection() {
		return contactsCollection;
	}
	public void setContactsCollection(Collection<Admin> contactsCollection) {
		this.contactsCollection = contactsCollection;
	}*/
	public void setLogin(String login) {
		this.login = login;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public void addRole(Role role) {
		this.roles.add(role);
	}


	
}
