package com.example.course.controller;

import com.example.course.entities.Category;
import com.example.course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    public CategoryService service;

    @GetMapping("/categorys")
    public ResponseEntity<List<Category>> fiadAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok(list);

    }
    @GetMapping("/categorys/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = service.findById(id);
        return ResponseEntity.ok(obj);
    }


}
