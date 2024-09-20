package com.br.mts.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.mts.model.Cliente;
import com.br.mts.model.ClienteRepository;
import com.br.mts.model.Endereco;
import com.br.mts.model.EnderecoRepository;
import com.br.mts.service.ClienteService;
import com.br.mts.service.ViaCepService;

/***
 * Implementacao da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * uma injetada pelo spring (via {@link Autowired}). Com isso, como essa classe e um
 * {@link Service}, ela sera tratada como um <b>Singleton</b>.
 * 
 * @author michael
 */
@Service
public class ClienteServiceImpl implements ClienteService{
	
	//Singleton: Injetar os componentes do spring com @Autowired.
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;
	
	//Strategy: Implementar os metodos definidos na interface.
	//Facade: Abstrair integracoes com subsistemas, promovendo uma interface simples.

	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		//estou usando Optional porque ele pode ou nao retornar um cliente
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);		
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		//Buscar Cliente por ID, caso exista:
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if(clienteBd.isPresent()) {
			salvarClienteComCep(cliente);
		}
		
	}

	@Override
	public void deletar(Long id) {
		//Deletar Cliente por ID.
		clienteRepository.deleteById(id);
		
	}
	
	//para evitar repeticao de codigo no metodo inserir() e atualizar() aplicando o conceito  "Don't Repeat Yourself" (DRY)
		private void salvarClienteComCep(Cliente cliente) {
			//Verificar se o endereco do cliente ja existe (pelo CEP).
					//enderecoRepository.findById(cliente.getEndereco().getCep()); ou posso criar uma variavel
					String cep = cliente.getEndereco().getCep();
					Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
					//Caso nao exista, integrar com o ViaCEP e persistir o retorno.
						Endereco novoEndereco = viaCepService.consultarCep(cep);
						enderecoRepository.save(novoEndereco);
						return novoEndereco;
					});
					cliente.setEndereco(endereco);
					//Inserir Cliente, vinculando o endereco (novo ou existente).
					clienteRepository.save(cliente);
		}

}
