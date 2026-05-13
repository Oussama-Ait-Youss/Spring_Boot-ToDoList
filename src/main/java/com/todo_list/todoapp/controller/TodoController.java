package com.todo_list.todoapp.controller;



public class TodoController{
    private TodoService service;


    @GetMapping
    public List<Todo> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return service.save(todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    
    @PutMapping("/{id}")
    public Todo update(@PathVariable Long id, @RequestBody Todo todoDetails) {
        Todo todo = service.findById(id);
        todo.setTitle(todoDetails.getTitle());
        todo.setCompleted(todoDetails.isCompleted());
        return service.save(todo);
    }

}