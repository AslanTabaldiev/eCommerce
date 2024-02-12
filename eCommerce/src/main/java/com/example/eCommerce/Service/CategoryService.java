package com.example.eCommerce.Service;

import com.example.eCommerce.dto.category.CategoryResponse;

import java.util.List;

public interface CategoryService {
    void addCategory(String name, String token);

    List<CategoryResponse> getAll();
}
