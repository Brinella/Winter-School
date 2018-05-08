package domain;


public class Menu 
{
    String menuID;

    public Menu() {
    }

    public Menu(Builder builder) {
    }

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }

    public static class Builder{
        private String menuID;
        

        public Builder(){}

        public Builder menuID(String value) {
            return null;
        }

       
        public Builder copy(Menu value) {
            this.menuID = value.menuID;
            

            return this;
        }

        public Menu build()
        {
            return new Menu(this);
        }

    }

}
