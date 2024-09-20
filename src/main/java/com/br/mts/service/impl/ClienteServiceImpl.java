package com.br.mts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.mts.model.Cliente;
import com.br.mts.service.ClienteService;

/***
 * Implementacao da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * uma injetada pelo spring (via {@link Autowired}). Com isso, como essa classe e um
 * {@link Service}, ela sera tratada como um <b>Singleton</b>.
 * 
 * @author michael
 */
@Service
public class ClienteServiceImpl implements ClienteService{
	
	//TODO Singleton: Injetar os componentes do spring com @Autowired.
	//TODO Strategy: Implementar os metodos definidos na interface.
	//TODO Facade: Abstrair integracoes com subsistemas, promovendo uma interface simples.

	@Override
	public Iterable<Cliente> buscarTodos() {
		// FIXME buscar todos os Clientes.
		return null;
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// FIXME buscar Cliente por ID.
		return null;
	}

	@Override
	public void inserir(Cliente cliente) {
		// FIXME Verificar se o endereco do cliente ja existe (pelo CEP).
		// FIXME Caso nao exista, integrar com o ViaCEP e persistir o retorno.
		// FIXME Inserir Cliente, vinculando o endereco (novo ou existente).
		
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		// FIXME Buscar Cliente por ID, caso exista:
		// FIXME Verificar se o endereco do cliente ja existe (pelo CEP).
		// FIXME Caso nao exista, integrar com o ViaCEP e persistir o retorno.
		// FIXME Alterar Cliente, vinculando o endereco (novo ou existente).
		
	}

	@Override
	public void deletar(Long id) {
		// FIXME Deletar Cliente por ID.
		
	}

}
