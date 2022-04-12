package com.gh90.example.api.admin.product;

import com.gh90.example.domain.product.Product;
import com.gh90.example.domain.user.User;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ProductInfoDto {
    private String productName;
    private String userName;
    private String price;

    public ProductInfoDto(User user, Product product){
        this.productName = product.getName();
        this.userName = user.getName();
        this.price = product.getPrice();
    }
}
