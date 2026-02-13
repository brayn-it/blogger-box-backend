package com.dauphine.blogger.controllers;

import com.dauphine.blogger.models.Category;
import com.dauphine.blogger.service.CategoryService;
import com.dauphine.blogger.service.impl.CategoryServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/categories")

public class CategoryController{
    private final List<Category> temporaryCategories = new ArrayList<Category>();

    public void CategoryServiceImpl(){

        temporaryCategories.add(new Category("my first category"));
        temporaryCategories.add(new Category("my second category"));
        temporaryCategories.add(new Category("my third category"));

    }

    private  final CategoryService service;

    public CategoryController(CategoryService service){
        this.service = service;
    }

    @GetMapping
    public List<Category> retrieveAllCategories(){
        return  temporaryCategories;
    }

    public List<Category> getAll() {
        return this.service.getAll();
    }

    @GetMapping("{id}")
    public Category getById(@PathVariable UUID id) {
        return this.service.getById(id);
    }

    @PostMapping
    public Category create(@RequestBody String name) {
        return this.service.create(name);
    }

    @PutMapping("{id}")
    public Category updateName(@PathVariable UUID id, @RequestBody String name) {
        return this.service.updateName(id,name);
    }

    @DeleteMapping("{id}")
    public boolean deleteById(@PathVariable UUID id) {
        return this.service.deleteById(id);
    }
}
