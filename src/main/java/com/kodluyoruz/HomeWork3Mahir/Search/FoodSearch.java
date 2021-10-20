package com.kodluyoruz.HomeWork3Mahir.Search;

import com.kodluyoruz.HomeWork3Mahir.Enum.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FoodSearch {


    public void searchList(String word) {

        // güzel olmadı düzenle

        List<Food> fruitList = Arrays.stream(Fruit.values()).collect(Collectors.toList());

        List<Food> vegetablesList = Arrays.stream(Vegetable.values()).collect(Collectors.toList());
        List<Food> chipsList = Arrays.stream(Chips.values()).collect(Collectors.toList());
        List<Food> milkList = Arrays.stream(Milk.values()).collect(Collectors.toList());
        List<Food> delicatessenList = Arrays.stream(Delicatessen.values()).collect(Collectors.toList());



        if(fullList(fruitList,word)){
            System.out.println("fruit secildi");

        }else if(fullList(vegetablesList,word)){
            
        }else if(fullList(chipsList,word)){

        }else if (fullList(milkList,word)){

        }else if (fullList(delicatessenList,word)){

        }

    }


    public boolean fullList(List<Food> list, String word){

        List<Food> foodList=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            foodList.add(list.get(i));
        }

        if(searching(foodList,word)){
            return true;
        }
        return false;
    }

    public boolean searching(List<Food> list, String word) {
        for (Food item : list) {
            if (word.equals(item)) {
                return true;
            }

        }
        return false;
    }

}
