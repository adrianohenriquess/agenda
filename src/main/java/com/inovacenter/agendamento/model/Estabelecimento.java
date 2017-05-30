package com.inovacenter.agendamento.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Estabelecimento implements Serializable {
	private static final long serialVersionUID = -2655846278803819092L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "Nome do estabelecimento não pode ser nulo")
	private String nomeEstabelecimento;
	@NotEmpty(message = "Telefone não pode ser nulo")
	private String telefone;
	@NotEmpty(message = "Endereço não pode ser nulo")
	private String endereco;
	private String horarioFuncionamento;
	private String observacao;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estabelecimento")
	private List<Profissional> profissionais;
	
	public Estabelecimento() {
		setProfissionais(new ArrayList<Profissional>());
	}
	
	public void addProfissional(Profissional profissional) {
		getProfissionais().add(profissional);
	}
	
	public void removeProfissional(Profissional profissional) {
		getProfissionais().remove(profissional);
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}

	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}
	
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}

	public List<Profissional> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}
	
}