package factories;

import domain.Menu;

import java.util.Map;

/**
 * Created by rodrique on 4/20/2018.
 */
public class MenuFactory
{
    public static Menu getMainCourse(Map<String,String> values)// , List<Chef> chefs)
    {
        Menu mainCourse = new Menu
                .Builder()
                .menuID(values.get("menu ID"))
                .build();
        return mainCourse;
    }
}
