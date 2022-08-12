package Prototype;

public class Employee implements ICloneable{
    private final String id;
    private String name;
    private int salary;

    public Employee(String id){
        this.id = id;
    }
    public Employee(String id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public ICloneable clone() {
        return new Employee(this.id, this.name, this.salary);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
