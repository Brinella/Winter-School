package domain;

import repository.RoleRepository;

public class POS_Cashier extends Employee implements RoleRepository {
    public String getJobDescription() {
        return "Cashier is responsible for recording all transactions and ensuring accurate stock take";
    }
}
