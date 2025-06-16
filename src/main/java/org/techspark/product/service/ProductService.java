package org.techspark.product.service;

import org.springframework.stereotype.Service;
import org.techspark.product.dto.ProductDTO;

import java.util.List;

@Service
public class ProductService {

    public List<ProductDTO> getAllProducts() {
        return List.of(
                ProductDTO.builder()
                        .id(1L)
                        .name("Laptop")
                        .price(999.99)
                        .description("High-performance laptop with 16GB RAM and 512GB SSD")
                        .inStock(true)
                        .category("Electronics")
                        .build(),
                ProductDTO.builder()
                        .id(2L)
                        .name("Keyboard")
                        .description("Mechanical keyboard with customizable RGB lighting")
                        .price(49.99)
                        .inStock(true)
                        .category("Accessories")
                        .build(),
                ProductDTO.builder()
                        .id(3L)
                        .name("Mouse")
                        .description("Wireless mouse with ergonomic design")
                        .price(25.00)
                        .inStock(false)
                        .category("Accessories")
                        .build()
        );
    }

}
