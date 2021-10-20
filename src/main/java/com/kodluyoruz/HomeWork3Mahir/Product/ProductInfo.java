package com.kodluyoruz.HomeWork3Mahir.Product;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class ProductInfo {

    private  List<Product> productList;

    public ProductInfo(){
       productList = new ArrayList<>();
        createProduct();

    }

    public void createProduct(){
        Product apple = new Product("apple",5000.0,"fruit");
        Product pear = new Product("pear",300.0,"fruit");
        Product grape = new Product("grape",500.0,"fruit");
        Product tomato = new Product("tomato",284,"vegetable");
        Product pepper = new Product("pepper",100.0,"vegetable");
        Product eggplant = new Product("eggplant",710,"vegetable");
        Product lays = new Product("lays",1280,"chips");
        Product doritos = new Product("doritos",3400,"chips");
        Product ruffles = new Product("ruffles",5000.0,"chips");
        Product tadelle = new Product("tadelle",130,"chocolate");
        Product albeni = new Product("albeni",3300,"chocolate");
        Product metro = new Product("metro",55,"chocolate");
        Product hobby = new Product("hobby",100,"chocolate");
        Product full_fat = new Product("full_fat",250,"milk");
        Product low_fat = new Product("low_fat",50,"milk");
        Product lacto_free = new Product("lacto_free",27,"milk");
        Product cheddar = new Product("cheddar",840,"delicatessen");
        Product cheese = new Product("cheese",210,"delicatessen");
        Product salami = new Product("salami",387,"delicatessen");
        Product susage = new Product("susage",429,"delicatessen");
        Product olive = new Product("olive",654,"olive");

        productList.add(apple);
        productList.add(pear);
        productList.add(grape);
        productList.add(tomato);
        productList.add(pepper);
        productList.add(eggplant);
        productList.add(lays);
        productList.add(doritos);
        productList.add(ruffles);
        productList.add(tadelle);
        productList.add(albeni);
        productList.add(metro);
        productList.add(hobby);
        productList.add(full_fat);
        productList.add(low_fat);
        productList.add(lacto_free);
        productList.add(cheddar);
        productList.add(cheese);
        productList.add(salami);
        productList.add(susage);
        productList.add(olive);

    }





}
