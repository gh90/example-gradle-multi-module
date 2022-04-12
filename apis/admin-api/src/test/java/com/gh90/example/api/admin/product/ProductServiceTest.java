package com.gh90.example.api.admin.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;


    @Test
    void 상품저장테스트(){
        productService.saveProduct("유저명","상품명", "1000");

        ProductInfoDto productInfoDto= productService.getProduct(1L);

        Assertions.assertThat(productInfoDto.getUserName()).isEqualTo("유저명");
        Assertions.assertThat(productInfoDto.getPrice()).isEqualTo("1000");
        Assertions.assertThat(productInfoDto.getProductName()).isEqualTo("상품명");
    }
}