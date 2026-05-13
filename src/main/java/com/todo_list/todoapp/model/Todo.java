package com.todo_list.todoapp.model;



public class Todo{
    private long id;
    private String title;
    private boolean completed = false;


    public Todo(){}


    public Todo(int id , String title){
        this.id = id;
        this.title = title;
    }



    // setters
    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setCompleted(boolean completed){
        this.completed = completed;
    }


    // getters
    public String getTitle(){
        return this.title;
    }

    public int getId(){
        return this.id;
    }
    public boolean getcompleted(){
        return this.completed;
    }

}