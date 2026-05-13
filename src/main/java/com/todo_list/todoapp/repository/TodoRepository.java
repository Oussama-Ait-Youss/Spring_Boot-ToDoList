package com.todo_list.todoapp.repository;
import com.example.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long>{




}