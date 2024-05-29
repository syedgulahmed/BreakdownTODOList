package com.example.BreakdownTODOList.service;

import com.example.BreakdownTODOList.entity.TodoItem;
import com.example.BreakdownTODOList.repository.TodoItemRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoListService {

    @Autowired
    private TodoItemRepository todoItemRepository;

    public TodoItem get(ObjectId id){
        return todoItemRepository.findById(id).orElse(null);
    }

    public List<TodoItem> getAll(){
        return todoItemRepository.findAll();
    }

    public TodoItem saveEntry(TodoItem todoItem){
        return todoItemRepository.save(todoItem);
    }

    public TodoItem delete(ObjectId id){

        TodoItem todoItem = todoItemRepository.findById(id).orElse(null);

        if(todoItem == null) return null;

        todoItemRepository.deleteById(id);

        return todoItem;
    }

    public TodoItem update(ObjectId id, TodoItem newTodoItem){

        TodoItem todoItem = todoItemRepository.findById(id).orElse(null);

        if(todoItem == null) return todoItem;

        if(newTodoItem.getTitle() != null && !newTodoItem.getTitle().isEmpty())
            todoItem.setTitle(newTodoItem.getTitle());

        if(newTodoItem.getStatus() != null && !newTodoItem.getStatus().isEmpty())
            todoItem.setStatus(newTodoItem.getStatus());

        todoItemRepository.save(todoItem);

        return todoItem;
    }

}