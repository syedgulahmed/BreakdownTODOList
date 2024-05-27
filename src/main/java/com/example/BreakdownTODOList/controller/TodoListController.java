package com.example.BreakdownTODOList.controller;

import com.example.BreakdownTODOList.entity.TodoItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {

    @GetMapping("/list")
    public ResponseEntity<List<TodoItem>> getList(){

        TodoItem item1 = new TodoItem(1, "Do Something!");
        TodoItem item2 = new TodoItem(1, "Do Something!");
        TodoItem item3 = new TodoItem(1, "Do Something!");

        List<TodoItem> list = new ArrayList<>();
        list.add(item1);
        list.add(item2);
        list.add(item3);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}