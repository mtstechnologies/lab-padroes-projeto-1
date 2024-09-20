package com.br.mts.service;

import com.br.mts.model.Cliente;

/**
 * Interface que define o padrao <b>Strategy</b> no dominio de cliente. com
 * isso, se nessario, podemos ter multiplas implementacoes dessa mesma interface.
 * 
 * @author michael
 */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);
	
}
