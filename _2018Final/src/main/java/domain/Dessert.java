package domain;


import java.io.Serializable;
/**
 * Created by rodrique on 4/18/2018.
 */

public class Dessert extends Menu 
{
    String dessertID;
    String foodItem;

    public Dessert() {
    }

    public Dessert(String dessertID, String foodItem) {
        this.dessertID = dessertID;
        this.foodItem = foodItem;
    }

    public String getDessertID() {
        return dessertID;
    }

    public void setDessertID(String dessertID) {
        this.dessertID = dessertID;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "dessertID='" + dessertID + '\'' +
                ", foodItem='" + foodItem + '\'' +
                '}';
    }
}