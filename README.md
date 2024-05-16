# Sistema de Gerenciamento de Pedidos - API RESTful

Bem-vindo ao Sistema de Gerenciamento de Pedidos! Esta API RESTful oferece uma solução robusta para a criação, visualização e gestão de pedidos relacionados a produtos. 
Com esta plataforma, os usuários podem facilmente criar pedidos personalizados, explorar detalhes abrangentes sobre produtos, como nome, preço e quantidade, calcular o
total do pedido e monitorar o status de cada solicitação.

## Funcionalidades

- **Criação de Pedidos Personalizados:** Os usuários têm a liberdade de criar pedidos personalizados, selecionando os produtos desejados e especificando a quantidade desejada para cada item.
- **Detalhes de Produtos:** Todos os produtos disponíveis estão listados com detalhes completos, incluindo nome, preço e descrição.
- **Cálculo Automático do Total do Pedido:** O sistema realiza automaticamente o cálculo do valor total do pedido, com base nos produtos selecionados e suas quantidades.
- **Cadastro e Atualização de Produtos:** Os administradores podem facilmente adicionar novos produtos à plataforma e atualizar informações existentes conforme necessário.

## Endpoints

### Pedidos

- **GET /orders:** Retorna a lista de todos os pedidos.
- **GET /orders/{id}:** Retorna detalhes de um pedido específico com base no ID fornecido.
- **POST /orders:** Cria um novo pedido.
- **PUT /orders/{id}:** Atualiza o status de um pedido existente com base no ID fornecido.

### Produtos

- **GET /products:** Retorna a lista de todos os produtos disponíveis.
- **GET /products/{id}:** Retorna detalhes de um produto específico com base no ID fornecido.
- **POST /products:** Cria um novo produto.
- **PUT /products/{id}:** Atualiza os dados de um produto existente com base no ID fornecido.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- PostgreSQL
- JPA
- Swagger

## Documentação dos Endpoints

Para uma documentação mais detalhada dos endpoints, consulte o Swagger:

[Swagger UI](http://localhost:8080/swagger-ui/index.html)

## Execução

Para executar o projeto localmente, siga estas etapas:

1. Clone este repositório: `https://github.com/WerleyL/OrderMaster-API.git`
2. Navegue até o diretório do projeto: `cd OrderMaster-API`
3. Execute o comando Maven para compilar e iniciar a aplicação: `mvn spring-boot:run`

A API estará disponível em `http://localhost:8080`.
