package Fixacao;
import java.util.Scanner;
import java.util.Locale;
import Fixacao.Funcionario; 

public class Segundo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in); 

        Funcionario js = new Funcionario(); 
        double percentage; 

        System.out.printf("Nome: ");
        js.name = sc.nextLine(); 
        System.out.printf("Salário Bruto: ");
        js.grossSalary = sc.nextDouble(); 
        System.out.printf("Imposto: ");
        js.tax = sc.nextDouble(); 

        System.out.println("Funcionário: " + js.NetSalary());
        
        System.out.printf("Que porcentagem aumentar o salário? ");
        percentage = sc.nextDouble(); 

        js.increaseSalary(percentage);

        System.out.println("Funcionário: " + js.NetSalary());

        sc.close();
    }
}
