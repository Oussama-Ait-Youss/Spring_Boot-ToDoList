package com.todo_list.todoapp.service;

import com.todo_list.todoapp.model.Todo;
import com.todo_list.todoapp.repository.TodoRepository;
import java.util.List;
import org.springframework.stereotype.Service;




@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }



    public List<Todo> findAll() {
        return repository.findAll();
    }

    public Todo save(Todo todo) {
        return repository.save(todo);
    }

    public Todo findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Todo not found: " + id));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }



}