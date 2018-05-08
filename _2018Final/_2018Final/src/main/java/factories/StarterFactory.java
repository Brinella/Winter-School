package factories;

import domain.Starter;

import java.util.Map;

/**
 * Created by rodrique on 4/20/2018.
 */
public class StarterFactory
{
    public static Starter getStarter(Map<String,String> values)// , List<Chef> chefs)
    {
        Starter starter = new Starter
                .Builder()
                .starterID(values.get("main ID"))
                .foodItem(values.get("food Item"))


                .build();
        return starter;
    }
}
