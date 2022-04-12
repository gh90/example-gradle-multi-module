package com.gh90.example.domain.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void 인서트테스트(){
        productRepository.save(new Product("과자", BigDecimal.valueOf(1000)));
        Product savedProduct = productRepository.getById(1L);
        assertThat(savedProduct.getName(),is("과자"));
    }
}