package factories;

import domain.Employee;

import java.util.Map;

/**
 * Created by rodrique on 4/20/2018.
 */
public class EmployeeFactory
{
    public static Employee getEmployee(Map<String,String> values)// , List<Chef> chefs)
    {
        Employee employee = new Employee
                .Builder()
                .empNum(values.get("empNum"))
                .empName(values.get("empName"))
                .address(values.get("address"))
                .telephone(values.get("tel"))

                .build();
        return employee;
    }
}
