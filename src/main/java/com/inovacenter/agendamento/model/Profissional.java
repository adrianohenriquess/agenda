package com.inovacenter.agendamento.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Profissional implements Serializable {
	private static final long serialVersionUID = -6426765601555510512L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String telefone;
	private String celular;
	private Boolean mostraCelular;
	@ManyToOne(fetch = FetchType.LAZY)
	private Estabelecimento estabelecimento;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "profissional_servico")
	private List<Servico> servicos;
	
	public Profissional() {
		setServicos(new ArrayList<Servico>());
	}
	
	public void addServico(Servico servico) {
		getServicos().add(servico);
	}
	
	public void removeServico(Servico servico) {
		getServicos().remove(servico);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Boolean getMostraCelular() {
		return mostraCelular;
	}

	public void setMostraCelular(Boolean mostraCelular) {
		this.mostraCelular = mostraCelular;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
}
