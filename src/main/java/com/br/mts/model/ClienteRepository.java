package com.br.mts.model;

import org.springframework.data.repository.CrudRepository;
//a notacao @Repository e opcional
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

	/*
	 *  esclarecer as diferenças entre CrudRepository e JpaRepository no contexto do Spring Data JPA, e discutir qual abordagem pode ser mais 
	 *  adequada para o seu projeto.
	 *
	 *	1. Visão Geral das Interfaces
	 *	CrudRepository:
	 *	
	 *	Propósito: Fornece operações CRUD básicas (Create, Read, Update, Delete).
	 *	Principais Métodos: save(), findById(), findAll(), deleteById(), etc.
	 *	Quando Usar: Ideal para aplicações que necessitam apenas das operações CRUD básicas sem funcionalidades adicionais.
	 *
	 *	JpaRepository:
	 *	
	 *	Propósito: Estende CrudRepository e PagingAndSortingRepository, adicionando funcionalidades específicas do JPA.
	 *	Principais Métodos Adicionais:
	 *	Flushing: flush(), saveAndFlush()
	 *	Deletar em Massa: deleteInBatch(), deleteAllInBatch()
	 *	Configurações de Query: Suporte para especificar JPQL e consultas nativas.
	 *	Funcionalidades Adicionais: Suporte para paginação e ordenação integrada, métodos para contagem e existência de registros, etc.
	 *	Quando Usar: Ideal para aplicações que requerem funcionalidades avançadas de JPA além das operações CRUD básicas, como paginação, 
	 *  ordenação, operações em lote, etc.
	 * 
	 * */
}
