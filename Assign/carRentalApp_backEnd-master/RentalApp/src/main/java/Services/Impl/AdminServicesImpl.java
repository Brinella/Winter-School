package Services.Impl;

import Domain.Admin;
import Repository.AdminRepository;
import Services.AdminServices;

/**
 * Created by Emma on 8/12/2018.
 */
//needs fixing
@Component
public class AdminServicesImpl implements AdminServices
{

    @Autowired
    AdminRepository adminRepository;


    public Admin create(Admin ad)
    {
        return adminRepository.create(ad);
    }


    public Admin read(String AdminID)
    {
        return adminRepository.read(AdminID);
    }


    public Admin update(Admin ad) {
        return adminRepository.update(ad);
    }


    public void delete(String AdminID)
    {
        adminRepository.delete(AdminID);
    }

}
