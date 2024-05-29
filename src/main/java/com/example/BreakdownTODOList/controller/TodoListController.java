package com.example.BreakdownTODOList.controller;

import com.example.BreakdownTODOList.entity.TodoItem;
import com.example.BreakdownTODOList.service.TodoListService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/list")
public class TodoListController {

    @Autowired
    TodoListService todoListService;

    @GetMapping()
    public ResponseEntity<List> getAll(){
        List<TodoItem> list = todoListService.getAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<TodoItem> get(@PathVariable ObjectId id){
        TodoItem todoItem = todoListService.get(id);
        return new ResponseEntity<>(todoItem, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<TodoItem> createTodoItem(@RequestBody TodoItem todoItem){
        TodoItem newItem = todoListService.saveEntry(todoItem);
        return new ResponseEntity<>(newItem, HttpStatus.OK);
    }

    @PutMapping("/id/{id}")
    public ResponseEntity<TodoItem> updateItem(@PathVariable ObjectId id, @RequestBody TodoItem todoItem){
        TodoItem newItem = todoListService.update(id, todoItem);
        return new ResponseEntity<>(newItem, HttpStatus.OK);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<TodoItem> deleteItem(@PathVariable ObjectId id){
        TodoItem newItem = todoListService.delete(id);
        return new ResponseEntity<>(newItem, HttpStatus.OK);
    }

}