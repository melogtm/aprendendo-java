package Fixacao;

public class Funcionario {
    public String name; 
    public double grossSalary; 
    public double tax;

    public String NetSalary() {
        return name + ", $ " + String.format("%.2f", (grossSalary - tax)); 
    }

    public void increaseSalary(double percentage) {
        double increase = (percentage / 100) * grossSalary;
        grossSalary += increase; 
    }
}
