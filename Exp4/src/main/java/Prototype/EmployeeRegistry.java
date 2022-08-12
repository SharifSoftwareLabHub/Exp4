package Prototype;

import java.util.Hashtable;
import java.util.NoSuchElementException;

public class EmployeeRegistry {
    private static Hashtable<String, Employee> employeeMap = new Hashtable<String, Employee>();

    public static Employee getEmployee(String id){
        if (!employeeMap.containsKey(id))
            throw new NoSuchElementException();
        return (Employee) employeeMap.get(id).clone();
    }

    public static void addEmployee(Employee employee){
        employeeMap.put(employee.getId(), employee);
    }

}
