import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithDrawException;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter Account Data");
        System.out.print("Number: ");
        int number = sc.nextInt(); 

        sc.nextLine(); 

        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Withdraw limit: "); 
        double limit = sc.nextDouble(); 

        Account acc = new Account(number, holder, balance, limit);

        try {
            System.out.print("Enter amout for withdraw: ");
            double withdrawAmount = sc.nextDouble();

            acc.withdraw(withdrawAmount);

            System.out.println("New balance: " + acc.getBalance());

        } catch (WithDrawException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close(); 
        }
    
    }
}
