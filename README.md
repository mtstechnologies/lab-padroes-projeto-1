# Desafio: Explorando Padrões de Projeto - ViaCep API
Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java da plataforma  [DIGITAL INNOVATION ONE 💛🧡](https://web.dio.me/)". Especificamente, este projeto explorou alguns padrões usando o Spring Framework, são eles:

## Descrição
Este projeto em Java 17 utiliza o framework Spring Boot para consumir a API do ViaCep e cadastrar um cliente e aplicar padrões de projeto como 
- Singleton
-  Facade
-  Strategy
  
O  objetivo é demonstrar a implementação de boas práticas de arquitetura de software enquanto integra uma API externa para consulta de CEPs.

## Tecnologias
Java 17
- Spring Boot
- Maven
- Padrões de Projeto: Singleton, Facade, Strategy/Repository
- API ViaCep

## Estrutura do Projeto
- Singleton: Garantindo que exista apenas uma instância para a chamada da API.
- Facade: Simplificação da interface de comunicação com a API ViaCep.
- Strategy/Repository: Implementação de estratégias para gerenciar diferentes repositórios e operações com dados.

## Configuração

1. Clone o repositório:

> git clone https://github.com/mtstechnologies/lab-padroes-projeto-1.git

2. Navegue até o diretório do projeto:

> cd lab-padroes-projeto-1

3. Instale as dependências usando Maven:

> ./mvnw clean install

## Uso
Para executar o projeto, rode o seguinte comando:

> ./mvnw spring-boot:run

## Exemplo de Uso
1. Faça uma requisição para consultar um Cliente usando o Swagger:

![image](https://github.com/user-attachments/assets/29436982-dcef-4134-b7a3-6a9d3bf3799f)


> url http://localhost:8080/swagger-ui/index.html#/

## 🤝 Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir um PR ou uma issue.

## Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

Se possível:
⭐️ Star o projeto
