package Repository;

import Domain.Admin;

/**
 * Created by Emma on 8/11/2018.
 */
public interface AdminRepository extends CrudRepository <Admin, Long>
{
    Admin create(Admin ad);
    Admin read(String id);
    Admin update(Admin ad);
    void delete(String id);

}
