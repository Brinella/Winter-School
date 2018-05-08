package repository.Implement;

import domain.Employee;
import repository.EmployeeRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rodrique on 5/8/2018.
 */
public class EmpRepImpl implements EmployeeRepository
{
    private static EmpRepImpl respository = null;

    private Map<Long, Employee> empTable;

    private EmpRepImpl() {
        empTable = new HashMap<Long, Employee>();
    }

    public static EmpRepImpl getInstance() {
        if (respository == null)
            respository = new EmpRepImpl();
        return respository;
    }

    public Employee create(Employee employee) {
        empTable.put(employee.getId(), employee);
        Employee savedEmp = empTable.get(employee.getId());
        return savedEmp;
    }

    public Employee read(String id) {
        Employee employee = empTable.get(id);
        return employee;
    }

    public Employee update(Employee employee) {
        empTable.put(employee.getId(), employee);
        Employee savedEmp = empTable.get(employee.getId());
        return savedEmp;
    }

    public void delete(String id) {
        empTable.remove(id);

    }
}
