package factories;

import domain.Chef;
/**
 * Created by rodrique on 4/20/2018.
 */
public class ChefFactory
{
    public static Chef getChef(Long id, String username, String password) {
        Chef chef = new Chef
                .Builder()
                .id(id)
                .userName(username)
                .password(password)
                .build();
        return chef;
    }
}
