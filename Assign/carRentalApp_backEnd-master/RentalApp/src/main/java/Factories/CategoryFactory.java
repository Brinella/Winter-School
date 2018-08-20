package Factories;

import Domain.Category;

/**
 * Created by Emma on 8/11/2018.
 */
public class CategoryFactory
{
//CatFcatory
    public static Category getCategory(String name, double price)
    {
        Category cat = new Category.Builder()
                .catName(name)
                .catPrice(price)
                .build();
        return cat;
    }

}
