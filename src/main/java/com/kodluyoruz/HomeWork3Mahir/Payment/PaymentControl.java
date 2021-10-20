package com.kodluyoruz.HomeWork3Mahir.Payment;



import com.kodluyoruz.HomeWork3Mahir.Enum.*;
import com.kodluyoruz.HomeWork3Mahir.Product.Product;
import com.kodluyoruz.HomeWork3Mahir.Product.ProductInfo;
import com.kodluyoruz.HomeWork3Mahir.Search.FoodSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Service
public class PaymentControl {
    @Autowired
    private Scanner scanner;

    @Autowired
    private PaymentInfo paymentInfo;

    @Autowired
    private ProductInfo productInfo;


    public void control(String s) {
        Product product = null;
        switch (s) {
            case "FRUIT":
                List<Fruit> fruits = Arrays.stream(Fruit.values()).collect(Collectors.toList());
                String str = scanner.next();
                for (Product p : productInfo.getProductList()) {
                    if (p.getProductName().equals(str)) {
                        product = p;
                        break;

                    }

                }
                break;
            case "VEGETABLE":
                List<Vegetable> vegetables = Arrays.stream(Vegetable.values()).collect(Collectors.toList());
                str = scanner.next();
                for (Product p : productInfo.getProductList()) {
                    if (p.getProductName().equals(str)) {
                        product = p;
                        break;
                    }

                }
                break;
            case "CHIPS":
                List<Chips> chips = Arrays.stream(Chips.values()).collect(Collectors.toList());
                str = scanner.next();
                for (Product p : productInfo.getProductList()) {
                    if (p.getProductName().equals(str)) {
                        product = p;
                        break;
                    }

                }
                break;
            case "CHOCOLATE":
                List<Chocolate> chocolates = Arrays.stream(Chocolate.values()).collect(Collectors.toList());
                str = scanner.next();
                for (Product p : productInfo.getProductList()) {
                    if (p.getProductName().equals(str)) {
                        product = p;
                        break;
                    }

                }
                break;
            case "MILK":
                List<Milk> milks = Arrays.stream(Milk.values()).collect(Collectors.toList());
                str = scanner.next();
                for (Product p : productInfo.getProductList()) {
                    if (p.getProductName().equals(str)) {
                        product = p;
                        break;
                    }

                }
                break;
            case "DELICATESSEN":
                List<Delicatessen> delicatessens = Arrays.stream(Delicatessen.values()).collect(Collectors.toList());
                str = scanner.next();
                for (Product p : productInfo.getProductList()) {
                    if (p.getProductName().equals(str)) {
                        product = p;
                        break;
                    }

                }
                break;
        }
        System.out.println(product.getProductName() + " : " + product.getProductPrice() + " TL");


        System.out.println(Arrays.stream(PaymentOption.values()).collect(Collectors.toList()));
        String choose = scanner.next();

        if (choose.equals("CASH")) {
            // TODO: 20.10.2021 urunun fiyat ve diger bilgileri gosterilmeli
            paymentInfo.paymentCash();
        } else if (choose.equals("CREDIT_CARD")) {
            // TODO: 20.10.2021 urun bilgileri gosterilirken cart komisyonu dusulmeli
        }
    }
}

