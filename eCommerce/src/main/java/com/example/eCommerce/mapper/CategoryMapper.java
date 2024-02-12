package com.example.eCommerce.mapper;

import com.example.eCommerce.dto.category.CategoryResponse;
import com.example.eCommerce.entities.Category;

import java.util.List;

public interface CategoryMapper {
    List<CategoryResponse> toDtos(List<Category> all);
}
