package Repository;

import Domain.Category;

/**
 * Created by Emma on 8/11/2018.
 */
public interface CategoryRepository CrudRepository <Category, Long>
{

    Category create(Category category);
    Category read(long id);
    Category update(Category category);
    void delete(long id);
    Category findByName(String name);
    Iterable<Category> readAll();
}
