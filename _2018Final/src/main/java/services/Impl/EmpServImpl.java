package services.Impl;

import domain.Employee;
import repository.EmployeeRepository;
import services.EmployeeService;
import java.util.Set;
/**
 * Created by rodrique on 5/8/2018.
 */
public class EmpServImpl implements EmployeeService
{
    private static EmpServImpl service = null;

    EmployeeRepository repository = (EmployeeRepository) EmpServImpl.getInstance();

    public static EmpServImpl getInstance()
    { if(service == null)
        service = new EmpServImpl();
        return service;
    }

    public Employee create(Employee employee)
    { return repository.create(employee);}

    public Employee readById(Long aLong) {
        return null;
    }

    public Set<Employee> readAll() {
        return null;
    }

    public Employee read(String id)
    {return repository.read(id);}

    public Employee update(Employee employee)
    {return repository.update(employee);}

    public void delete(Employee entity) {

    }

    public void delete(String id)
    {repository.delete(id);}
}

