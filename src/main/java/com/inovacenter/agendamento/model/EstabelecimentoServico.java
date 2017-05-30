package com.inovacenter.agendamento.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EstabelecimentoServico implements Serializable {
	private static final long serialVersionUID = 1586983262109078770L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Estabelecimento estabelecimento;
	@ManyToOne(fetch = FetchType.LAZY)
	private Servico servico;
	private Integer quantidadeAtendimentosHora;
	private Integer duracaoServico;
	private BigDecimal valorServico;
	
	public EstabelecimentoServico() {
		this.estabelecimento = new Estabelecimento();
		this.servico = new Servico();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Integer getQuantidadeAtendimentosHora() {
		return quantidadeAtendimentosHora;
	}

	public void setQuantidadeAtendimentosHora(Integer quantidadeAtendimentosHora) {
		this.quantidadeAtendimentosHora = quantidadeAtendimentosHora;
	}

	public Integer getDuracaoServico() {
		return duracaoServico;
	}

	public void setDuracaoServico(Integer duracaoServico) {
		this.duracaoServico = duracaoServico;
	}

	public BigDecimal getValorServico() {
		return valorServico;
	}

	public void setValorServico(BigDecimal valorServico) {
		this.valorServico = valorServico;
	}
}
