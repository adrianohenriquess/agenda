package com.inovacenter.agendamento.model.enums;

public enum TipoLogradouro {
	RUA(1, "Rua"),
	AVENIDA(2, "Avenida");
	
	private int id;
	private String descricao;
	
	private TipoLogradouro(int id, String descricao) {
		this.setId(id);
		this.setDescricao(descricao);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
