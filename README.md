# ToDo API – Spring Boot

API REST de **gerenciamento de tarefas (ToDo)** desenvolvida em **Java com Spring Boot**, implementando um CRUD completo com **Service, Repository e Entity**, além de documentação com **Swagger/OpenAPI**.

---
## Tecnologias utilizadas

- Java  
- Spring Boot
- Spring Web  
- Spring Data JPA  
- Hibernate  
- Maven  
- Swagger / OpenAPI  

---

## Funcionalidades

- Criar uma nova tarefa  
- Listar todas as tarefas  
- Buscar uma tarefa por ID  
- Atualizar todos os campos de uma tarefa  
- Deletar uma tarefa  

---

## Como executar o projeto

### 1- Clonar o repositório
```bash
git clone https://github.com/GustavoMarques06/ToDo.git
```

### 2- Entrar na pasta do projeto
```bash
cd ToDo
```

### 3- Executar a aplicação
```bash
mvn spring-boot:run
```

A aplicação será iniciada em:
```
http://localhost:8080
```

---

## 🔗 Endpoints da API

Base URL:
```
/todos
```

| Método | Endpoint | Descrição |
|------|---------|----------|
| POST | `/todos/criar` | Cria uma nova tarefa |
| GET | `/todos/receber` | Lista todas as tarefas |
| GET | `/todos/receber/{id}` | Busca uma tarefa pelo ID |
| PUT | `/todos/atualizar/{id}` | Atualiza uma tarefa |
| DELETE | `/todos/deletar/{id}` | Deleta uma tarefa |

---

## Exemplo de JSON (POST / PUT)

```json
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Revisar Service e Controller",
  "status": false
}
```

---

## Regras de negócio (Service)

- A tarefa é salva usando `TodoRepository`
- Busca por ID lança exceção se a tarefa não existir
- Atualização substitui título, descrição e status
- Exclusão é feita a partir do ID

---

## Documentação Swagger

Após iniciar a aplicação, acesse:
```
http://localhost:8080/swagger-ui/index.html
```
Interface do Swagger:

<img width="1437" height="653" alt="SwaggerToDo" src="https://github.com/user-attachments/assets/bdde3c2e-0955-44f3-8d86-aadf6e646a08" />

---

## Estrutura do projeto

```
src/main/java/com/GustavoMarques06/ToDo
 ├─ controller
 │   └─ TodoController
 ├─ service
 │   └─ TodoService
 ├─ repository
 │   └─ TodoRepository
 └─ entity
     └─ Todo
```

---
