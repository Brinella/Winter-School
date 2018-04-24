package domain;


import java.io.Serializable;
/**
 * Created by rodrique on 4/19/2018.
 */


public abstract class Menu 
{
    String menuID;

    public Menu() {
    }

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }
}
