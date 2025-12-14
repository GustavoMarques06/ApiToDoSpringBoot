package com.GustavoMarques06.ToDo.service;

import com.GustavoMarques06.ToDo.entity.Todo;
import org.springframework.stereotype.Service;
import com.GustavoMarques06.ToDo.repository.TodoRepository;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public Todo CriarTodo(Todo todo) {
        todoRepository.save(todo);
        return todo;
    }
    public List<Todo> ListarTodos(){
        return todoRepository.findAll();
    }
    public Todo BuscarId(long id){
        return todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo não encontrado"));
    }
    public void DeletarTodo(long id)
    {
       todoRepository.deleteById(id);
    }
    public Todo AtualizarTodo(Long id, Todo dadosNovos)
    {
        Todo todoExistente = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo não encontrado"));

        todoExistente.setTitulo(dadosNovos.getTitulo());
        todoExistente.setDescricao(dadosNovos.getDescricao());
        todoExistente.setStatus(dadosNovos.isStatus());

        return todoRepository.save(todoExistente);
    }
}
