package com.talent.todolist.controller;

import com.talent.todolist.dto.NewTaskRequest;
import com.talent.todolist.entity.Category;
import com.talent.todolist.entity.Task;
import com.talent.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/tasks")
    public ResponseEntity<Task> saveTask(@RequestBody NewTaskRequest request){
        Task task = taskService.saveNewTask(request);
        return new ResponseEntity<>(task, HttpStatus.CREATED);
    }
    @GetMapping("tasks")
    public ResponseEntity<List<Task>> showTask(){
        List<Task> tasks = taskService.findAll();
       return new ResponseEntity<>(tasks,HttpStatus.OK);
    }

}
