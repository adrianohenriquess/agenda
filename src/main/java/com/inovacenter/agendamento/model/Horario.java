package com.inovacenter.agendamento.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Null;

@Entity
public class Horario implements Serializable {
	private static final long serialVersionUID = 3164324420163061336L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario usuario;
	@ManyToOne(fetch = FetchType.LAZY)
	private EstabelecimentoServico estabelecimentoServico;
	@ManyToOne(fetch = FetchType.LAZY)
	@Null
	private Profissional profissional;
	@Temporal(TemporalType.DATE)
	private Calendar data;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar hora;
	private String status;
	
	public Horario() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Calendar getHora() {
		return hora;
	}

	public void setHora(Calendar hora) {
		this.hora = hora;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public EstabelecimentoServico getEstabelecimentoServico() {
		return estabelecimentoServico;
	}

	public void setEstabelecimentoServico(EstabelecimentoServico estabelecimentoServico) {
		this.estabelecimentoServico = estabelecimentoServico;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

}
