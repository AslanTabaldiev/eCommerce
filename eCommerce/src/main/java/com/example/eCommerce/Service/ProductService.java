package com.example.eCommerce.Service;

import com.example.eCommerce.dto.product.ProductRequest;
import com.example.eCommerce.dto.product.ProductResponse;

import java.util.List;

public interface ProductService {
    void addProduct(ProductRequest productRequest, String token);

    List<ProductResponse> getAll(String token);

    void buyProduct(Long productId, String token);
}
