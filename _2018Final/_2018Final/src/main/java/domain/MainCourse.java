package domain;


public class MainCourse extends Menu{
    String mainID;
    String foodItem;

    public MainCourse(Builder builder) {
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

    public static class Builder{
        private String mainID;
        private String foodItem;

        public Builder(){}

        public Builder mainID(String value)
        {
            this.mainID = value;
            return this;

        }

        public Builder foodItem(String value)
        {
            this.foodItem = value;
            return this;

        }


        public Builder copy(MainCourse value) {
            this.mainID = value.mainID;
            this.foodItem = value.foodItem;

            return this;
        }

        public MainCourse build()
        {
            return new MainCourse(this);
        }

    }


    @Override
    public String toString() {
        return "MainCourse{" +
                "foodItem='" + foodItem + '\'' +
                ", mainID='" + mainID + '\'' +
                '}';
    }
}
