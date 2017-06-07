package com.inovacenter.agendamento.integration;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.inovacenter.agendamento.model.Estabelecimento;
import com.inovacenter.agendamento.repository.EstabelecimentoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EstabelecimentoTest {
	private List<Estabelecimento> estabelecimentos;
	
	@Autowired
	private EstabelecimentoRepository repository;
	
	/**
	 * 
	 */
	@Test
	public void testSelecionarEstabelecimentoPorEndereco() {
		Iterable<Estabelecimento> findAll = repository.findAll();
		for (Estabelecimento estabelecimento : findAll) {
			System.out.println(estabelecimento.toString());
		}
	}
}
