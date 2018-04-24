package domain;


import java.io.Serializable;
/**
 * Created by rodrique on 4/19/2018.
 */



public class Starter extends Menu 
{
    String starterID;
    String foodItem;

    public Starter() {
    }

    public Starter(String starterID, String foodItem) {
        this.starterID = starterID;
        this.foodItem = foodItem;
    }

    public String getStarterID() {
        return starterID;
    }

    public void setStarterID(String starterID) {
        this.starterID = starterID;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "Starter{" +
                "starterID='" + starterID + '\'' +
                ", foodItem='" + foodItem + '\'' +
                '}';
    }
}
