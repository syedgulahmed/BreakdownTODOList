package com.example.BreakdownTODOList.repository;

import com.example.BreakdownTODOList.entity.TodoItem;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoItemRepository extends MongoRepository<TodoItem, ObjectId> {


}
