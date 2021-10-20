package com.kodluyoruz.HomeWork3Mahir.Product;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Data
@NoArgsConstructor
@Service
public class Product {

    private  String productName;
    private  double productPrice;
    private  String productDiscription;
    private  ProductInfo productInfo;


    public Product(String productName, double productPrice, String productDiscription) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDiscription = productDiscription;

    }
}
