package Factories;

import Domain.Admin;

/**
 * Created by Emma on 8/11/2018.
 */
public class AdminFactory
{
    //AdminFactory
    public static Admin getAdmin(String name, String surname,String password, String role)
    {
        Admin ad=new Admin.Builder()
                .adminName(name)
                .adminSurname(surname)
                .password(password)
                .role(role)
                .build();
        return ad;
    }

    public static Admin getAdminByID(Long AdminID, String name, String surname,String password, String role)
    {
        Admin ad=new Admin.Builder()
                .AdminID(AdminID)
                .adminName(name)
                .adminSurname(surname)
                .password(password)
                .role(role)
                .build();
        return ad;
    }

}
