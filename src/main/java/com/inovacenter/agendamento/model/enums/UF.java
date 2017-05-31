package com.inovacenter.agendamento.model.enums;

public enum UF {
	SP(1, "São Paulo"),
	AC(2, "Acre"),
	AL(3, "Alagoas"),
	AP(4, "Amapá"),
	AM(5, "Amazonas"),
	BA(6, "Bahia"),
	CE(7, "Ceará"),
	DF(8, "Distrito Federal"),
	ES(9, "Espírito Santo"),
	GO(10,"Goiás"),
	MA(11,"Maranhão"), 
	MT(12,"Mato Grosso"), 
	MS(13,"Mato Grosso do Sul"), 
	MG(14,"Minas Gerais"), 
	PA(15,"Pará"), 
	PB(16,"Paraíba"), 
	PR(17,"Paraná"), 
	PE(18,"Pernambuco"), 
	PI(19,"Piauí"), 
	RJ(20,"Rio de Janeiro"),
	RN(21,"Rio Grande do Norte"),
	RS(22,"Rio Grande do Sul"), 
	RO(23,"Rondônia"), 
	RR(24,"Roraima"), 
	SC(25,"Santa Catarina"),  
	SE(26,"Sergipe"), 
	TO(27,"Tocantins");
	
	private int id;
	private String descricao;
	
	private UF(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
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
