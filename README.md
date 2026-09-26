# Task API

REST API para gerenciamento de tarefas desenvolvida com **Java** e **Spring Boot**.

O projeto foi desenvolvido com o objetivo de praticar e aplicar conceitos de desenvolvimento backend, como criação de APIs REST, operações CRUD, persistência de dados com JPA e organização da aplicação em camadas.

## 🚀 Tecnologias

* Java 25
* Spring Boot 4.1.1
* Spring Data JPA
* Spring Web MVC
* H2 Database
* Lombok
* Maven

## 📌 Funcionalidades

A API permite trabalhar com tarefas através das operações básicas de um CRUD:

* Criar uma tarefa
* Consultar tarefas
* Atualizar uma tarefa
* Excluir uma tarefa

## 🏗️ Arquitetura

O projeto segue uma organização baseada em camadas, separando as responsabilidades da aplicação:

```text
src/
└── main/
    ├── java/
    │   └── com/
    │       └── migueldev/
    │           └── task/
    │
    └── resources/
```

A aplicação utiliza o Spring Boot como base e o Spring Data JPA para realizar a persistência das entidades.

## 🔄 Operações da API

A API segue o padrão REST e utiliza os principais métodos HTTP:

| Método   | Operação          |
| -------- | ----------------- |
| `GET`    | Consultar tarefas |
| `POST`   | Criar tarefa      |
| `PUT`    | Atualizar tarefa  |
| `DELETE` | Excluir tarefa    |

## 🗄️ Banco de dados

Durante o desenvolvimento, o projeto utiliza o **H2 Database**, permitindo executar a aplicação sem a necessidade de instalar ou configurar um banco de dados externo.

O projeto também possui dependências do Spring Data JPA para trabalhar com persistência utilizando o padrão ORM.

## ▶️ Como executar

### Pré-requisitos

Antes de executar o projeto, tenha instalado:

* Java 25
* Maven

### 1. Clone o repositório

```bash
git clone https://github.com/MiguelSouza011/Task_API.git
```

### 2. Entre no diretório

```bash
cd Task_API
```

### 3. Execute o projeto

No Windows:

```bash
mvnw.cmd spring-boot:run
```

Ou, caso o Maven esteja instalado globalmente:

```bash
mvn spring-boot:run
```

A aplicação será iniciada pelo Spring Boot.

## 🧪 Build do projeto

Para verificar e compilar o projeto:

```bash
mvnw.cmd clean package
```

## 📚 Objetivos de estudo

Este projeto faz parte da minha jornada de desenvolvimento backend com Java.

Os principais conceitos praticados são:

* Desenvolvimento de APIs REST
* Spring Boot
* Inversão de Controle e Injeção de Dependências
* Spring Data JPA
* Mapeamento objeto-relacional
* CRUD
* Métodos HTTP
* Organização em camadas
* Maven
* Persistência de dados
* Desenvolvimento de aplicações backend

## 👨‍💻 Autor

**Miguel Souza**

Desenvolvedor Backend em formação, estudando **Java, Spring Boot, bancos de dados e desenvolvimento de APIs REST**.

[GitHub](https://github.com/MiguelSouza011)

---

⭐ Projeto desenvolvido para prática e evolução no desenvolvimento backend com Java e Spring Boot.
