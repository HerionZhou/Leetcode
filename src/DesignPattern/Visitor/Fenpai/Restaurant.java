package DesignPattern.Visitor.Fenpai;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Food> prepareFoods() {
        List<Food> foods = new ArrayList<>();
        foods.add(new Apple());
        foods.add(new Banana());
        return foods;
    }

    public void welcome(IVisitor visitor){
        List<Food> foods = prepareFoods();
        for (Food food : foods){
            food.accept(visitor);
        }
    }
}
