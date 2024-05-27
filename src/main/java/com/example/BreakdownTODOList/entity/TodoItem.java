package com.example.BreakdownTODOList.entity;

public class TodoItem {

    private int id;

    public TodoItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    private String title;
    private boolean isCompleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

}
