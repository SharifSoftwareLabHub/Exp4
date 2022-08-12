package Prototype;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class EmployeeTest {
    public Employee employee1;
    public Employee employee2;

    public Employee e;

    @Before
    public void beforeTest(){
        employee1 = new Employee("1", "Mahdi", 1000);
        employee2 = new Employee("2", "Amir hossein", 2000);
        e = new Employee("3");

        EmployeeRegistry.addEmployee(employee1);
        EmployeeRegistry.addEmployee(employee2);

    }

    @Test
    public void getIdTest(){
        Assert.assertEquals("1",employee1.getId());
        Assert.assertEquals("2",employee2.getId());
    }

    @Test
    public void getNameTest(){
        Assert.assertEquals("Mahdi",employee1.getName());
        Assert.assertEquals("Amir hossein",employee2.getName());
    }

    @Test
    public void getSalaryTest(){

        Assert.assertEquals(1000,employee1.getSalary());
        Assert.assertEquals(2000,employee2.getSalary());
    }

    @Test
    public void setNameTest(){
        e.setName("Ali");
        Assert.assertEquals("Ali", e.getName());
    }

    @Test
    public void setSalaryTest(){
        e.setSalary(1);
        Assert.assertEquals(1, e.getSalary());
    }

    @Test
    public void cloneTest(){
        Employee emp1 = new Employee("4", "Ali", 1);
        Employee cloned = (Employee) emp1.clone();
        Assert.assertEquals("4",cloned.getId());
        Assert.assertEquals("Ali",cloned.getName());
        Assert.assertEquals(1,cloned.getSalary());
    }

    @Test
    public void registryGetTest(){
        Employee emp1 = EmployeeRegistry.getEmployee("1");
        Assert.assertEquals("1", emp1.getId());
        Assert.assertEquals("Mahdi", emp1.getName());
        Assert.assertEquals(1000, emp1.getSalary());
        Assert.assertThrows(NoSuchElementException.class, () -> EmployeeRegistry.getEmployee("3"));
    }

    @Test
    public void registryAddTest(){
        Employee emp1 = new Employee("4", "Ali", 1);

        Assert.assertThrows(NoSuchElementException.class, () -> EmployeeRegistry.getEmployee("3"));
        EmployeeRegistry.addEmployee(emp1);
        Employee cloned = EmployeeRegistry.getEmployee("4");
        Assert.assertEquals("4", cloned.getId());
        Assert.assertEquals("Ali", cloned.getName());
        Assert.assertEquals(1, cloned.getSalary());
    }

}
