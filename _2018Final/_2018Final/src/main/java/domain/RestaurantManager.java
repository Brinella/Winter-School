package domain;


import repository.RoleRepository;

public class RestaurantManager extends Employee implements RoleRepository {
    public String getjobDescription()
    {
        return "Manages the restaurant, makes sure everyone is working an dbusiness is running smoothly";
    }
}
