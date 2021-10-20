package com.kodluyoruz.HomeWork3Mahir;

import com.kodluyoruz.HomeWork3Mahir.Enum.*;

import com.kodluyoruz.HomeWork3Mahir.Payment.PaymentControl;
import com.kodluyoruz.HomeWork3Mahir.Search.FoodSearch;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
@Data
public class Start implements CommandLineRunner {
    @Autowired
    private Scanner scanner;

    @Autowired
    private PaymentControl paymentControl;



    @Override
    public void run(String... args) throws Exception {



        int x=1; // TODO: 20.10.2021 degisken ismi degiltirilmeli

        do {


            System.out.println("Please, choose option");
            System.out.println("List of food ---> [ 1 ]");
            System.out.println("Search       ---> [ 2 ]");
            int choose = scanner.nextInt();

            if (choose == 1) {
                bak(x); // TODO: 20.10.2021 metod ismini degistir

            } else if (choose == 2) {
                FoodSearch foodSearch = new FoodSearch();
                System.out.println("Please, enter the word : ");
                String word = scanner.nextLine();
                foodSearch.searchList(word);
                // TODO: 20.10.2021 arama yaptırılacak

            }
            System.out.println("Page choose :");
            System.out.println("what do you want?");
            System.out.println("Enter 1 for Menu Page \n Enter 2 for Payment Page");
            x = scanner.nextInt();


        }while(x == 1);




    }

    public void bak(int x){

            System.out.println(Arrays.stream(Main.values()).collect(Collectors.toList()));


            System.out.println("please choose***** ");

            String mainCategoryChoose = scanner.next();

            switch (mainCategoryChoose){
                case "FRUIT":
                    System.out.println(Arrays.stream(Fruit.values()).collect(Collectors.toList()));
                    break;
                case "VEGETABLE":
                    System.out.println(Arrays.stream(Vegetable.values()).collect(Collectors.toList()));
                    break;
                case "CHIPS":
                    System.out.println(Arrays.stream(Chips.values()).collect(Collectors.toList()));
                    break;
                case "CHOCOLATE":
                    System.out.println(Arrays.stream(Chocolate.values()).collect(Collectors.toList()));
                    break;
                case "MILK":
                    System.out.println(Arrays.stream(Milk.values()).collect(Collectors.toList()));
                    break;
                case "DELICATESSEN":
                    System.out.println(Arrays.stream(Delicatessen.values()).collect(Collectors.toList()));
                    break;
            }





            paymentControl.control(mainCategoryChoose);




    }
}
