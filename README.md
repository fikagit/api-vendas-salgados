# API de Venda de Salgados

Esta API Spring Boot foi desenvolvida para gerenciar a venda de salgados, incluindo o controle de estoque e o registro de vendas. Ela permite operações como listar salgados disponíveis, adicionar novos salgados, atualizar o estoque e registrar vendas.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.3.5**
- **JPA/Hibernate**
- **Banco de Dados H2**
- **Lombok**

## Estrutura do Projeto
- **model**: Contém as entidades `Salgado` e `Venda`, que representam os dados manipulados pela API.
- **controller**: Controladores REST que expõem as rotas para operações relacionadas a salgados e vendas.
- **service**: Contém a lógica de negócios, como salvar salgados, atualizar estoque e realizar vendas.
- **repository**: Interfaces JPA que facilitam a comunicação com o banco de dados.

## Funcionalidades
### Salgado
- **GET /salgados**: Retorna uma lista de todos os salgados.
- **POST /salgados**: Adiciona um novo salgado.
- **PUT /salgados/{id}/{quantidade}/atualizar-estoque**: Atualiza a quantidade em estoque de um salgado específico.

### Venda
- **GET /vendas**: Retorna uma lista de todas as vendas realizadas.
- **POST /vendas/{salgadoId}/{quantidade}**: Registra uma nova venda, atualizando o estoque e calculando o valor total.

## Configuração e Execução
1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/seu-usuario/api-venda-salgados.git
   cd api-venda-salgados

Estrutura das Entidades
Salgado

    id: Identificador único.
    nome: Nome do salgado.
    preco: Preço do salgado.
    quantidadeEstoque: Quantidade disponível em estoque.

Venda

    id: Identificador único.
    dataVenda: Data e hora da venda.
    salgado: Relacionamento com a entidade Salgado.
    quantidadeVendida: Quantidade vendida na transação.
    valorTotal: Valor total da venda.

Rotas da API
SalgadoController

    GET /salgados: Lista todos os salgados.
    POST /salgados: Adiciona um novo salgado ao sistema.
    PUT /salgados/{id}/{quantidade}/atualizar-estoque: Atualiza a quantidade em estoque de um salgado.

VendaController

    GET /vendas: Lista todas as vendas.
    POST /vendas/{salgadoId}/{quantidade}: Registra uma nova venda.

Scripts de Banco de Dados

Os scripts para criação das tabelas estão localizados em src/main/resources/db/migration:

    V1_create-table-salgado.sql: Script para criar a tabela de salgados.
    V2_create-table-venda.sql: Script para criar a tabela de vendas.

Dependências Importantes

    Spring Boot Starter Web: Para construir APIs RESTful.
    Spring Boot Starter Data JPA: Para interagir com o banco de dados.
    Lombok: Para reduzir o código boilerplate.
    H2 Database (opcional para testes em memória).

Contribuição

    Faça um fork do projeto.
    Crie uma branch com sua feature: git checkout -b minha-feature.
    Commit suas mudanças: git commit -m 'Adiciona minha nova feature'.
    Envie para a branch principal: git push origin minha-feature.
    Abra um Pull Request.
