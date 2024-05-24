package com.example.BreakdownTODOList.entity;

import java.util.List;

public class TodoList {

    private int id;
    private String title;
    private List<TodoList> list;

    public TodoList(int id, String title, List<TodoList> list){

        this.id = id;
        this.title = title;
        this.list = list;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<TodoList> getList() {
        return list;
    }

}
