package com.br.mts.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.mts.model.Endereco;

/**
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCEP</b>.
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @author michael
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
	
	@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);

	/**
	 * Consumindo a API do ViaCEP
	 * @GetMapping("/{ceo}/json") usando as notacoes do proprio spring ou do Feign
	 * @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
	 */
}
