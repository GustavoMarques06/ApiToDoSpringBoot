package com.GustavoMarques06.ToDo.repository;

import com.GustavoMarques06.ToDo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {


}
