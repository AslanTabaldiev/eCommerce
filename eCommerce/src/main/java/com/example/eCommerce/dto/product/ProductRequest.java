package com.example.eCommerce.dto.product;

import com.example.eCommerce.Role.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {

    private String name;
    private Integer price;
    private String description;
    private String size;
    private String color;
    private String SKU;
    private String category;
    private Type type;
}
