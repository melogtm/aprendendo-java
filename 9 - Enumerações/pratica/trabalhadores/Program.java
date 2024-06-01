import entities.*;
import entities.enums.WorkerLevel;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale; 

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmtu = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmtdual = DateTimeFormatter.ofPattern("MM/yyyy/dd");
        
        Department departmentName = new Department(); 
        String name;
        WorkerLevel level; 
        Double baseSalary;  

        System.out.printf("Enter your department's name: ");
        departmentName.setName(sc.nextLine());

        System.out.println("Enter worker data: ");
        System.out.printf("Name: ");
        name = sc.nextLine(); 

        System.out.printf("Level: ");
        level = WorkerLevel.valueOf(sc.nextLine()); 

        System.err.printf("Base Salary: ");
        baseSalary = sc.nextDouble(); 

        Worker worker = new Worker(name, level, baseSalary, departmentName);

        short howManyContracts; 
        System.out.printf("How many contracts does %s have? ", name);
        howManyContracts = sc.nextShort(); 

        for (int i = 0; i < howManyContracts; i++) {
            sc.nextLine(); 
            HourContract contract = new HourContract(null, null, null);

            System.out.printf("Enter %d# contract data: \n", i + 1);
            
            System.out.printf("Date (DD/MM/YYYY): "); 
            LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmtu); 
            contract.setDate(contractDate);

            System.out.printf("Value per Hour: ");
            contract.setValuePerHour(sc.nextDouble());

            System.out.printf("Duration (hours): ");
            contract.setHours(sc.nextInt());

            worker.addContract(contract);
        }

        System.out.println(); 

        sc.nextLine(); 

        System.out.printf("Enter month and year to calculate income (MM/yyyy): ");
        String incomeDate; 
        incomeDate = sc.nextLine();
        incomeDate += "/01"; 

        LocalDate incomeDuration = LocalDate.parse(incomeDate, fmtdual);
        
        int month = incomeDuration.getMonthValue();
        int year = incomeDuration.getYear();

        System.out.println("Name: " + name);
        System.out.println("Department: " + departmentName.getName());
        System.out.println("Income for " + month + "/" + year + ": R$ " + worker.income(year, month));

        sc.close();
    }
}