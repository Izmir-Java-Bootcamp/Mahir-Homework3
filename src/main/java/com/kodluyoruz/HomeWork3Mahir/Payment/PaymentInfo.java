package com.kodluyoruz.HomeWork3Mahir.Payment;

import com.kodluyoruz.HomeWork3Mahir.Product.Product;
import com.kodluyoruz.HomeWork3Mahir.Product.ProductInfo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class PaymentInfo {
    // TODO: 20.10.2021 secilen urun bilgilerini yazdırıcaz

    @Autowired
    private ProductInfo productInfo;

    public PaymentInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }


    public void paymentCash(){


    }
}
