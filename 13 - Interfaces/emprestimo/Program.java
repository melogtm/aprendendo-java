package emprestimo;

import java.util.Locale;
import java.util.Scanner;

import emprestimo.models.services.BrazilInterestService;

public class Program {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amout: ");
        double amount = sc.nextDouble(); 

        System.out.print("Months: ");
        int months = sc.nextInt();

        // Instanciando a classe BrazilInterestService
        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        sc.close(); 

    }
}
