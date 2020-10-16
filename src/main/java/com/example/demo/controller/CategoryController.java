package com.example.demo.controller;


import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/addCategory")
    public Category addCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }

    @PostMapping("/addCategoryList")
    public List<Category> addAllCategory(@RequestBody List<Category> categoryList){
        return categoryService.saveAllCategory(categoryList);
    }

    @GetMapping("/getAllCategory")
    public List<Category> findAllCategory(){
        return categoryService.getCategory();
    }

    @GetMapping("/getCategory/{categoryId}")
    public Category findById(@PathVariable int categoryId){
        return categoryService.getCategoryById(categoryId);
    }

    @PutMapping("/updateCategory")
    public Category updateCategory(@RequestBody Category category){
        return categoryService.updateCategory(category);
    }

    @DeleteMapping("/deleteCategory/{categoryId}")
    public int deleteCategory(@PathVariable int categoryId){
     return categoryService.deleteCategory(categoryId);
    }
}
