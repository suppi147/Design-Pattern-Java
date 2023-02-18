package DP.Command;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    public List<String> ingredient = new ArrayList<>();

    public Kitchen(){
        ingredient.add("eggs");
        ingredient.add("beef");
        ingredient.add("onions");
        ingredient.add("oil");
    }

    public void CookingFriedEgg(){
        System.out.println(ingredient.get(0)+" with "+ingredient.get(2));
    }
    public void CookingBeefSteak(){
        System.out.println(ingredient.get(1)+" with "+ingredient.get(3));
    }
}
