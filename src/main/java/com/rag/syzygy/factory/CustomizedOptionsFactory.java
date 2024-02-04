package com.rag.syzygy.factory;

import com.rag.syzygy.domains.customized_food_domains.*;
import com.rag.syzygy.util.FoodItemList;

import java.util.HashMap;
import java.util.Map;

public class CustomizedOptionsFactory {
    private static Map<String, CustomizedOptions> optionsCache = new HashMap<>();


    public static CustomizedOptions createCustomizedOptions(String optionName){

        if(!optionsCache.containsKey(optionName)){
            optionName = optionName.toUpperCase().replace(" ","_");
            if(FoodItemList.PIZZA.name().equals(optionName)){
                optionsCache.put(optionName,new CustomizedPizzaOptions());
            }
            if(FoodItemList.PASTA.name().equals(optionName)){
                optionsCache.put(optionName,new CustomizedPastaOptions());
            }
            if(FoodItemList.SALAD.name().equals(optionName)){
                optionsCache.put(optionName,new CustomizedSaladOptions());
            }
            if(FoodItemList.BURGER.name().equals(optionName)){
                optionsCache.put(optionName,new CustomizedBurgerOptions());
            }if(FoodItemList.ICE_CREAM.name().equals(optionName)){
                optionsCache.put(optionName,new CustomizedIceCreamOptions());
            }
        }
        return optionsCache.get(optionName);
    }


}
