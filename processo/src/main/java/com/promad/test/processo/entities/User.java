package com.promad.test.processo.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeenv;
	private String nomerepre;
	private String juizresp;
	private String tribunal;
	private String phone;
	private String email;
	
	public User() {
		
	}

	public User(Long id, String nomeenv, String nomerepre, String juizresp, String tribunal, String phone,
			String email) {
		super();
		this.id = id;
		this.nomeenv = nomeenv;
		this.nomerepre = nomerepre;
		this.juizresp = juizresp;
		this.tribunal = tribunal;
		this.phone = phone;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeenv() {
		return nomeenv;
	}

	public void setNomeenv(String nomeenv) {
		this.nomeenv = nomeenv;
	}

	public String getNomerepre() {
		return nomerepre;
	}

	public void setNomerepre(String nomerepre) {
		this.nomerepre = nomerepre;
	}

	public String getJuizresp() {
		return juizresp;
	}

	public void setJuizresp(String juizresp) {
		this.juizresp = juizresp;
	}

	public String getTribunal() {
		return tribunal;
	}

	public void setTribunal(String tribunal) {
		this.tribunal = tribunal;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
