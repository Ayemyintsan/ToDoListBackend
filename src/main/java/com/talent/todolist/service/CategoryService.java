package com.talent.todolist.service;

import com.talent.todolist.dto.NewCategoryRequest;
import com.talent.todolist.entity.Category;

import java.util.List;

public interface CategoryService {
    Category saveNewCategory(NewCategoryRequest request);
    List<Category> findAll();

}
