package com.gh90.example.api.admin.product;

import com.gh90.example.domain.product.Product;
import com.gh90.example.domain.product.ProductRepository;
import com.gh90.example.domain.user.User;
import com.gh90.example.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    @Transactional
    public void saveProduct(String userName, String productName, String price){
        User user =new User(userName);
        userRepository.save(user);

        Product product = new Product(productName,price);
        productRepository.save(product);
    }

    @Transactional
    public ProductInfoDto getProduct(Long id){
        User user = userRepository.getById(id);
        Product product = productRepository.getById(id);
        return new ProductInfoDto(user, product);
    }
}
