package com.example.bdt.bancoDeTalentos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bdt.bancoDeTalentos.model.Pessoa;
import com.example.bdt.bancoDeTalentos.service.PessoaService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*", maxAge = 86_400)
@RequestMapping(value="/pessoa")
public class PessoaController {

	@Autowired
	PessoaService ps;
	
	@RequestMapping(value="/lista" , method = RequestMethod.GET)
	public Iterable<Pessoa> getPessoas() {
		return ps.selectAllPessoa();
	}
	
	@RequestMapping(value="/{id}" , method = RequestMethod.GET)
	public Pessoa selectPessoa(@PathVariable(name="id") int id) {
		return ps.selectPessoa(id);
	}
	
	@RequestMapping(value="/salvar" , method = RequestMethod.POST)
	public void savePessoa(Pessoa p) {
		ps.salvar(p);
	}
	
	@RequestMapping(value="/editar" , method = RequestMethod.PUT)
	public void editarPessoa(Pessoa p) {
		ps.salvar(p);
	}
	
	@RequestMapping(value="/excluir/{id}" , method = RequestMethod.DELETE)
	public void excluirPessoa(@PathVariable(name="id") int id) {
		ps.DeletePessoa(id);
	}
}
