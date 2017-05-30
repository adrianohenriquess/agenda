package com.inovacenter.agendamento;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class AgendamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendamentoApplication.class, args);
	}
	
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/agendamento");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
}
