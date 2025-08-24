# 🚀 **DSList-Backend: Uma Jornada de Aprendizado em Java Spring Boot**

Este projeto é a implementação de uma API Back end construída do zero, baseada no `Intensivão Java Spring` do DevSuperior. Mais do que um simples repositório, ele documenta minha jornada de aprendizado, desde os conceitos fundamentais até a superação de desafios técnicos complexos.

O objetivo foi criar uma API para gerenciar listas de jogos, com funcionalidades como listagem, busca por ID e, o mais importante, a reorganização de itens.

## 🛠️ **Tecnologias Utilizadas**

-   **Linguagem:** Java 21
-   **Framework:** Spring Boot 3
-   **Banco de Dados:** PostgreSQL
-   **Mapeamento:** JPA / Hibernate
-   **Ferramentas:** Docker, Docker Compose, Postman

## 🗺️ **Jornada de Desenvolvimento (Passo a Passo)**

### **Fase 1: Fundamentos e Setup**

A base do projeto foi a arquitetura em **camadas** (Controller, Service, Repository) e a comunicação **REST** via JSON. O primeiro grande desafio foi a configuração do ambiente, superando erros com o **Docker** no PowerShell para levantar os containers de PostgreSQL e pgAdmin. A solução validou meu conhecimento sobre o uso de ferramentas de contêineres e a importância de um ambiente de desenvolvimento robusto e replicável.

### **Fase 2: Modelagem e Otimização**

Nesta etapa, o foco foi na eficiência e na estrutura de dados.
-   **Relacionamentos Muitos-para-Muitos (N-N):** Modelei a relação entre `Game` e `GameList` usando uma tabela de associação (`tb_belonging`).
-   **Otimização de Queries:** Para evitar o "problema do N+1", utilizei **Projections** com Spring Data JPA para buscar apenas os campos necessários, melhorando significativamente a performance da API.
-   **Perfis de Ambiente:** Configurei diferentes perfis (`dev`, `prod`, `test`) para gerenciar as configurações do banco de dados de forma organizada.

### **Fase 3: O Desafio de Depuração**

A última fase foi a prova de fogo. Ao implementar o endpoint `POST /lists/{listId}/replacement`, me deparei com um erro `500 Internal Server Error` no Postman.

O log foi a minha principal ferramenta de investigação. O erro `IndexOutOfBoundsException` me mostrou que a lógica para manipular os índices da lista estava incorreta. A solução foi analisar o fluxo da aplicação e garantir que os índices de origem e destino estivessem dentro dos limites da lista. Este processo consolidou minha habilidade em **depuração** e a importância de uma abordagem metódica para a resolução de problemas.

## ⚙️ **Como Rodar o Projeto**

1.  **Clone o repositório:** `git@github.com:HERBERT-EMIDIO/dslist.git`
2.  **Configure o Docker:** Certifique-se de que o Docker Desktop está rodando e que a integração com o WSL está ativada.
3.  **Inicie os contêineres:** No terminal, navegue até a pasta raiz do projeto e execute: `docker-compose up -d`.
4.  **Inicie a aplicação:** Abra o projeto em sua IDE (como VSCode ou IntelliJ) e execute a classe principal `DslistApplication.java`.
5.  **Teste a API:** Use o Postman para testar os endpoints. A documentação completa pode ser encontrada em `[Insira link para sua documentação se houver]`

---

### **Autor**

**[Herbert Emidio]**
-   **LinkedIn:** [https://www.linkedin.com/in/herbertemidio/]
-   **GitHub:** [git@github.com:HERBERT-EMIDIO/dslist.git]
