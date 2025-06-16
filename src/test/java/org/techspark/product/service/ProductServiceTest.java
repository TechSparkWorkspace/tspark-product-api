package org.techspark.product.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.techspark.product.dto.ProductDTO;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Test
    void getAllProducts() {
        List<ProductDTO> result = productService.getAllProducts();

        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("Laptop", result.get(0).getName());

    }
}