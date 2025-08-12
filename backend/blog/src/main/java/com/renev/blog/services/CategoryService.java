package com.renev.blog.services;

import com.renev.blog.domain.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category createCategory(Category category);

}
