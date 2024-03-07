package com.talent.todolist.service.impl;

import com.talent.todolist.dto.NewTaskRequest;
import com.talent.todolist.entity.Category;
import com.talent.todolist.entity.Task;
import com.talent.todolist.repo.CategoryRepo;
import com.talent.todolist.repo.TaskRepo;
import com.talent.todolist.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepo taskRepo;
    @Autowired
    private ModelMapper mapper;

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Task saveNewTask(NewTaskRequest request) {
        Task task = mapper.map(request,Task.class);
//        Category category= categoryRepo.findById(request.getCategoryId()).get();
//        task.setCategory(category);
        return taskRepo.save(task);
    }

    @Override
    public List<Task> findAll() {
        return taskRepo.findAll();
    }
}
