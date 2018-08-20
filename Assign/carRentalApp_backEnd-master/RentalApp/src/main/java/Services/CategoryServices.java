package Services;

import Domain.Category;
/**
 * Created by Emma on 8/12/2018.
 */
public interface CategoryServices
{

    Category create(Category category);
    Category read(long id);
    Category update(Category category);
    void delete(long id);
    Category findByName(String name);
    Iterable<Category> readAll();//finds all
}
