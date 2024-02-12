package com.example.eCommerce.Service.Impl;

import com.example.eCommerce.Repository.CategoryRepository;
import com.example.eCommerce.Repository.ProductRepository;
import com.example.eCommerce.Service.ProductService;
import com.example.eCommerce.dto.product.ProductRequest;
import com.example.eCommerce.dto.product.ProductResponse;
import com.example.eCommerce.entities.Category;
import com.example.eCommerce.entities.Product;
import com.example.eCommerce.entities.User;
import com.example.eCommerce.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;


    @Override
    public void addProduct(ProductRequest productRequest, String token) {
        if(productRepository.findBySKU(productRequest.getSKU()).isPresent()){
            throw new NotFoundException("product with this SKU is already exist!: "+productRequest.getSKU(),
                    HttpStatus.BAD_REQUEST);
        }
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(product.getDescription());
        product.setSize(product.getSize());
        product.setColor(product.getColor());
        product.setSKU(product.getSKU());
        product.setPrice(product.getPrice());
        product.setDate(LocalDateTime.now().toString());
        product.setType(productRequest.getType());
        product.setExist(true);
        Optional<Category> category = categoryRepository.findByName(productRequest.getCategory());
        if(category.isEmpty()) {
            throw new NotFoundException("No category with name: " + productRequest.getCategory(),HttpStatus.BAD_REQUEST);
        }
        product.setCategory(category.get());
        productRepository.save(product);

    }

    @Override
    public List<ProductResponse> getAll(String token) {
//        User user = authService.getUsernameFromToken(token);
//        if(!user.getRole().equals(Role.ADMIN)) {
//            System.out.println("user");
//            List<ProductResponse> phoneResponses = productMapper.toDtoS(productRepository.findAllByIsExist(true));
//            return phoneResponses;
//        }
//        return productMapper.toDtoS(productRepository.findAll());
        return null;
    }

    @Override
    public void buyProduct(Long productId, String token) {


    }
}
