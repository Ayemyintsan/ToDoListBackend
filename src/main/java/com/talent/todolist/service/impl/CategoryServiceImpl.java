package com.talent.todolist.service.impl;

import com.talent.todolist.dto.NewCategoryRequest;
import com.talent.todolist.entity.Category;
import com.talent.todolist.repo.CategoryRepo;
import com.talent.todolist.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Category saveNewCategory(NewCategoryRequest request) {
//        Category category = new Category();
//        category.setName(request.getName());
//        category.setImageUrl(request.getImgUrl());
//        categoryRepo.save(category);
//        Category category = Category
//                .builder()
//                .name(request.getName())
//                .imageUrl(request.getImgUrl())
//                .build();

       Category category= mapper.map(request,Category.class);
        return categoryRepo.save(category);

    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }
}
