package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }

    public List<Category> saveAllCategory(List<Category> categoryList){
        return categoryRepository.saveAll(categoryList);
    }

    public List<Category> getCategory(){
        return categoryRepository.findAll();
    }

    public Category getCategoryById(int categoryId){
        return categoryRepository.findById(categoryId).orElse(null);
    }

    public int deleteCategory(int categoryId){
         categoryRepository.deleteById(categoryId);
        return categoryId;
    }

    public Category updateCategory(Category category){
        Category oldCategory = categoryRepository.findById(category.getCategoryId()).orElse(null);
        oldCategory.setCategoryName(category.getCategoryName());
        oldCategory.setDescription(category.getDescription());
        return categoryRepository.save(oldCategory);
    }

}
