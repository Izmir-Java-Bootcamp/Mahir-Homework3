package com.kodluyoruz.HomeWork3Mahir;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Data
@RequiredArgsConstructor
@Configuration
public class PageOfCategoryPrint {


    public static void mainPrint(){
        System.out.println("------------MainCategory------------");
        System.out.println("fruit \n snack \n breakfast");

    }
    public static void subPrint(){
        System.out.println("------------SubCategory------------");
        System.out.println("fruit \n vegetable \n Chips \n Chocolate \n Milk \n Delicatessen");
    }
}
