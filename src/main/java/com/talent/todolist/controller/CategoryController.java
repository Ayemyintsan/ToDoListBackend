package com.talent.todolist.controller;

import com.talent.todolist.domain.HttpResponse;
import com.talent.todolist.dto.NewCategoryRequest;
import com.talent.todolist.entity.Category;
import com.talent.todolist.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping ("/categories")
//    public ResponseEntity<Category> saveNewCategory(@RequestBody NewCategoryRequest request){
//        Category category = categoryService.saveNewCategory(request);
//        return new ResponseEntity<>(category, HttpStatus.CREATED);
//    }

    public ResponseEntity<Category> saveNewCategory(@RequestBody NewCategoryRequest request){
        Category category = categoryService.saveNewCategory(request);
//        HttpResponse httpResponse =new HttpResponse(category,HttpStatus.CREATED);
        return new ResponseEntity<>(category, HttpStatus.CREATED);

    }

    @GetMapping("/categories")
    public ResponseEntity <List<Category>> showCategory(){
        List<Category> categories = categoryService.findAll();
        return new   ResponseEntity<>(categories,HttpStatus.OK);

    }
}
