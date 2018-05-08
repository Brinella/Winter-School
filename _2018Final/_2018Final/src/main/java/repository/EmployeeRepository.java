package repository;

import domain.Employee;

/**
 * Created by rodrique on 4/23/2018.
 */
public interface EmployeeRepository
{
    Employee create(Employee employee);


    Employee read(String id);

    Employee update(Employee employee);

    void delete(String id);
}
