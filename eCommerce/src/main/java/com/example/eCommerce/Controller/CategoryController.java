package com.example.eCommerce.Controller;

import com.example.eCommerce.Service.CategoryService;
import com.example.eCommerce.dto.category.CategoryResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/category")
@RestController
public class CategoryController {
    private final CategoryService categoryService;
    @PostMapping("/add")
    public void addCategory(@RequestParam String name, @RequestHeader("Authorization") String token) {
        categoryService.addCategory(name, token);
    }

    @GetMapping("/list")
    public List<CategoryResponse> categories() {
        return categoryService.getAll();
    }


}
