package com.br.mts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Os atributos desse modelo foram gerados automaticamento pelo site
 * jsonschema2pojo.org. Para isso, usamos o JSON de retorno da API do ViaCEP.
 * 
 * @see <a href="https://www.jsonschema2pojo.org">jsonschema2pojo.org</a>
 * @see <a href="https://viacep.com.br>ViaCEP</a>
 * 
 * @author michael
 */
@Data
@Entity
public class Endereco {
	
	@Id
	private String cep;
	private String logradouro;
	private String complemento;
	private String unidade;
	private String bairro;
	private String localidade;
	private String uf;
	private String estado;
	private String regiao;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;
}
