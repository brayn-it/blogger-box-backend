package com.dauphine.blogger.service.impl;

import com.dauphine.blogger.models.Category;
import com.dauphine.blogger.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final List<Category> temporaryCategories = new ArrayList<Category>();

    public void CategoryServiceImpl(){

        temporaryCategories.add(new Category("my first category"));
        temporaryCategories.add(new Category("my second category"));
        temporaryCategories.add(new Category("my third category"));

    }
    @Override
    public List<Category> getAll() {
        return temporaryCategories;
    }

    @Override
    public Category getById(UUID id) {
        return temporaryCategories.stream().filter(category -> id.equals(category.getId())).findFirst().orElse(null);
    }

    @Override
    public Category create(String name) {
        Category cat = new Category(name);
        temporaryCategories.add(cat);
        return cat;
    }

    @Override
    public Category updateName(UUID id, String name) {
        return null;
    }

    @Override
    public boolean deleteById(UUID id) {
        return false;
    }
}
