package com.baizhi.controller;

import com.baizhi.dto.CommonDTO;
import com.baizhi.entity.Category;
import com.baizhi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("queryLevels")
    public CommonDTO queryLevels(Integer page, Integer size, Integer levels, Integer parentId){
        return null;
    }

    @PostMapping("addCategory")
    public CommonDTO addCategory(@RequestBody Category category){
        return null;
    }

    @PostMapping("editName")
    public CommonDTO editName(@RequestBody Category category){
        return null;
    }

    @GetMapping("deleteCategory")
    public CommonDTO deleteCategory(Integer id){
        return null;
    }
}
