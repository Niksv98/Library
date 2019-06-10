package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "UserTable")
public class User {

	//mainigie
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_u")
	private int id_u;
	
	@NotNull
    @Size(min=2, max=30)
	@Column(name = "Username")
	private String username;
	
	@NotNull
    @Size(min=2, max=30)
	@Column(name = "Password")
	private String password;
	

	
	
	//konstruktori
	
	public User() {
	}
	
	public User(@NotNull @Size(min=2, max=30) String username, @NotNull @Size(min=2, max=30) String password) {
		super();
		setUsername(username);
		setPassword(password);
	}

	

	//set un get
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		String usernameTmp = "";
		for (int i = 0; i < username.length(); i++) {
			if(Character.isLetter(username.charAt(i))){
				usernameTmp += username.charAt(i);
			}
		}
		this.username = usernameTmp;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId_u() {
		return id_u;
	}

	
	
	@Override
	public String toString() {
		return "Username:" + username + ", password:" + password + ", ID:" + id_u;
	}
	

}
