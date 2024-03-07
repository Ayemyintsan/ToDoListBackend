package com.talent.todolist.service;

import com.talent.todolist.dto.NewTaskRequest;
import com.talent.todolist.entity.Task;

import java.util.List;

public interface TaskService {
    Task saveNewTask(NewTaskRequest request);
    List<Task> findAll();
}
