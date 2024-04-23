package entity;

public class Employer {
    private Integer id; 
    private String name;
    private Double salary;  

    public String getName() {
        return name;
    }
    
    public Integer getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    private void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employer(String name, int id, double salary) {
        this.name = name; 
        this.id = id; 
        this.salary = salary; 
    }

    public String toString() {
        return id + ", " + name + ", " + salary; 
    }

    public void bonus(double value) {
        double valueInPercentage = value / 100.00; 

        double increase = (this.salary * valueInPercentage) + this.salary; 

        setSalary(increase); 
    }

}
