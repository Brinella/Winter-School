package Services;

import Domain.Admin;
/**
 * Created by Emma on 8/12/2018.
 */
public interface AdminServices
{
    Admin create(Admin ad);
    Admin read(long Adid);
    Admin update(Admin ad);
    void delete(long id);
    Iterable<Admin> findAllAdmins();//find all
}
