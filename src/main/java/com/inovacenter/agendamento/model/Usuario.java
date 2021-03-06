package com.inovacenter.agendamento.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = -1554981704723231258L;
	@Id
	private String userName;
	private String password;
	private String nome;
	private String celular;
	@ManyToOne(fetch = FetchType.EAGER)
	private Endereco endereco;
	@ManyToMany
	@JoinTable(
			name = "users_roles", 
			joinColumns = @JoinColumn(name = "username"), 
			inverseJoinColumns = @JoinColumn(name = "rolename")
	)
	private List<Role> roles;

	public Usuario() {}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
