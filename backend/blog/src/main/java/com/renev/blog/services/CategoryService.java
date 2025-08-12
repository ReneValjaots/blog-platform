package com.renev.blog.services;

import com.renev.blog.domain.entities.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    List<Category> getAllCategories();
    Category createCategory(Category category);
    void deleteCategory(UUID id);

}
