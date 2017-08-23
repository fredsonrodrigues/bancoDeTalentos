package com.example.bdt.bancoDeTalentos.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.bdt.bancoDeTalentos.model.Pessoa;
import com.example.bdt.bancoDeTalentos.repository.PessoaRepository;

@Service
@Transactional
public class PessoaService {
	
	private final PessoaRepository ps;

	public PessoaService(PessoaRepository ps) {
		this.ps = ps;
	}
	
	public void salvar(Pessoa pessoa) {
		ps.save(pessoa);
	}
	public Pessoa selectPessoa(int id) {
		return ps.findOne(id);
	}
	public Iterable<Pessoa> selectAllPessoa() {
		return ps.findAll();
	}
	public boolean DeletePessoa(int id) {
		boolean rs = false;
		try {
			ps.delete(id);
			rs = true;
		} catch (Exception e) {
			rs = false;
		}
		return rs;
	}
}
