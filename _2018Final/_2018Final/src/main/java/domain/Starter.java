package domain;


public class Starter extends Menu {
    String starterID;
    String foodItem;

    public Starter(Builder builder) {
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

    public static class Builder{
        private String starterID;
        private String foodItem;

        public Builder(){}

        public Builder starterID(String value)
        {
            this.starterID = value;
            return this;

        }

        public Builder foodItem(String value)
        {
            this.foodItem = value;
            return this;

        }


        public Builder copy(Starter value) {
            this.starterID = value.starterID;
            this.foodItem = value.foodItem;

            return this;
        }

        public Starter build()
        {
            return new Starter(this);
        }

    }


    @Override
    public String toString() {
        return "Starter{" +
                "starterID='" + starterID + '\'' +
                ", foodItem='" + foodItem + '\'' +
                '}';
    }
}
