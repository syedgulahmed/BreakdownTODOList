package com.example.BreakdownTODOList.controller;

import com.example.BreakdownTODOList.entity.TodoList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.SSLEngineResult;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {

    @GetMapping("/list")
    public ResponseEntity<TodoList> getList(){

        List<TodoList> list = new ArrayList<>();
        list.add(new TodoList(1, "Happy", null));
        list.add(new TodoList(2, "Sad", null));
        list.add(new TodoList(3, "Eating", null));
        list.add(new TodoList(4, "Safe", null));

        TodoList parent = new TodoList(5, "TodoList", list);

        return new ResponseEntity<>(parent, HttpStatus.OK);
    }

}