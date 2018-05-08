package domain;


public class Dessert extends Menu {
    String dessertID;
    String foodItem;

    public Dessert(Builder builder) {
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

    public static class Builder{
        private String dessertID;
        private String foodItem;

        public Builder(){}

        public Builder dessertID(String value)
        {
            this.dessertID = value;
            return this;

        }

        public Builder foodItem(String value)
        {
            this.foodItem = value;
            return this;

        }


        public Builder copy(Dessert value) {
            this.dessertID = value.dessertID;
            this.foodItem = value.foodItem;

            return this;
        }

        public Dessert build()
        {
            return new Dessert(this);
        }

    }


    @Override
    public String toString() {
        return "Dessert{" +
                "dessertID='" + dessertID + '\'' +
                ", foodItem='" + foodItem + '\'' +
                '}';
    }
}
