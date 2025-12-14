package com.GustavoMarques06.ToDo.controller;

import com.GustavoMarques06.ToDo.entity.Todo;
import com.GustavoMarques06.ToDo.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todos")
@Tag(name = "Gerenciador de Tarefas", description = "CRUD gerenciador de tarefas")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }
    @Operation(description = "Cria uma tarefa nova")
    @PostMapping("/criar")
    public Todo PostTodo(@RequestBody Todo todo)
    {
        return todoService.CriarTodo(todo);
    }

    @Operation(description = "Busca todas as tarefas")
    @GetMapping("/receber")
    public List<Todo> GetTodo()
    {
        return todoService.ListarTodos();
    }

    @Operation(description = "Busca uma tarefa apartir de um ID")
    @GetMapping("/receber/{id}")
    public Todo GetByIdTodo(@PathVariable long id)
    {
        return  todoService.BuscarId(id);
    }

    @Operation(description = "Deleata uma tarefa apartir de um ID")
    @DeleteMapping("/deletar/{id}")
    public void DeleteTodo(@PathVariable long id)
    {
        todoService.DeletarTodo(id);
    }

    @Operation(description = "Atualiza todos os campos de uma tarefa apartir de um ID")
    @PutMapping("/atualizar/{id}")
    public Todo UpdateTodo(@PathVariable long id,  @RequestBody Todo todoAtualizado) {
        return todoService.AtualizarTodo(id, todoAtualizado);
    }
}
