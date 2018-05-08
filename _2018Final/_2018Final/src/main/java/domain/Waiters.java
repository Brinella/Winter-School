package domain;


import domain.Role;
import repository.RoleRepository;

public class Waiters extends Employee implements RoleRepository
{

    public String getJobDescription() {
        return "Serve designated tables, ensure customers are well taken care of";
    }
}
