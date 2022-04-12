package com.gh90.example.api.admin.product;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @GetMapping("/api/product")
    public ResponseEntity product(Long id){
        return ResponseEntity.ok(productService.getProduct(id));
    }

    @GetMapping("/api/product-save")
    public ResponseEntity product(String userName, String productName, String productPrice){
        productService.saveProduct(userName,productName,productPrice);
        return ResponseEntity.ok().build();
    }
}
