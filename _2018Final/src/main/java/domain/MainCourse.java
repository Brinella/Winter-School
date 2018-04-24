package domain;


import java.io.Serializable;
/**
 * Created by rodrique on 4/19/2018.
 */


public class MainCourse extends Menu{
    String mainID;
    String foodItem;

    public MainCourse() {
    }

    public MainCourse(String mainID, String foodItem) {
        this.mainID = mainID;
        this.foodItem = foodItem;
    }

    public String getMainID() {
        return mainID;
    }

    public void setMainID(String mainID) {
        this.mainID = mainID;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "MainCourse{" +
                "foodItem='" + foodItem + '\'' +
                ", mainID='" + mainID + '\'' +
                '}';
    }
}