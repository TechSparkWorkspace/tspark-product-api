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
                        .inStock(true)
                        .build(),
                ProductDTO.builder()
                        .id(2L)
                        .name("Keyboard")
                        .price(49.99)
                        .inStock(true)
                        .build(),
                ProductDTO.builder()
                        .id(3L)
                        .name("Mouse")
                        .price(25.00)
                        .inStock(false)
                        .build()
        );
    }

}
