package com.example.bdt.bancoDeTalentos.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.bdt.bancoDeTalentos.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {
	
}
