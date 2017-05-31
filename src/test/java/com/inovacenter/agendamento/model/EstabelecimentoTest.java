package com.inovacenter.agendamento.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.inovacenter.agendamento.model.enums.TipoLogradouro;


public class EstabelecimentoTest {
	private List<Estabelecimento> estabelecimentos;
	
	@Before
	public void init() {
		estabelecimentos = new ArrayList<Estabelecimento>();
		Estabelecimento estabelecimento = new Estabelecimento();
		estabelecimento.setEndereco("Joaquim Braz Sanvido");
		estabelecimento.setNomeEstabelecimento("Hair Style");
		estabelecimento.setNumero("121");
		estabelecimento.setTipoLogradouro(TipoLogradouro.RUA);
		estabelecimentos.add(estabelecimento);
	}
	
	@Test
	public void testInserirEstabelecimentoComEnderecoInvalido() {
		
	}
}
