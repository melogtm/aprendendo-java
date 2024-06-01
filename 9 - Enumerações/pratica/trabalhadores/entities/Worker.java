package entities;
import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

    private String name; 
    private WorkerLevel level; 
    private Double baseSalary; 
    private Department department;

    private List<HourContract> contracts = new ArrayList<>(); // Não inclui no construtor, apenas inicializa.

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name; 
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department; 
    }
    
    public Double getBaseSalary() {
        return baseSalary;
    }
    public List<HourContract> getContracts() {
        return contracts;
    }
    public Department getDepartment() {
        return department;
    }
    public WorkerLevel getLevel() {
        return level;
    }
    public String getName() {
        return name;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract); 
    };

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        double sum = baseSalary; 

        for (HourContract contract : this.contracts) {
            int contract_year = contract.getDate().getYear();
            int contract_month = contract.getDate().getMonthValue();
            
            if ((year == contract_year) && (contract_month == month)) {
                sum += contract.totalValue(); 
            }
        }

        return sum; 
    }
    
}
