package problemaFixacao;
import java.util.Scanner;
import java.util.Locale; 
import problemaFixacaoEntities.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        System.out.printf("Enter account number: ");
        int acNumber = sc.nextInt(); 
        sc.nextLine(); 
        System.out.printf("Enter account holder: ");
        String acHolder = sc.nextLine();
        System.out.printf("Is there an initial deposit? (y/n): "); 
        char hasInitialDeposit = sc.next().charAt(0);
        
        double iDeposit = 0.0, quantity; 

        if (hasInitialDeposit == 'y') {
            System.out.printf("Enter initial deposit: "); 
            iDeposit = sc.nextDouble(); 
        }

        Account alexgreen = new Account(acHolder, iDeposit, acNumber);

        System.out.println();

        System.out.println("Account data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", alexgreen.getAccountNumber(), alexgreen.getHolder(), alexgreen.getBalance());

        System.out.printf("Enter deposit: ");
        quantity = sc.nextDouble(); 

        alexgreen.deposit(quantity);

        System.out.println("Updated data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", alexgreen.getAccountNumber(), alexgreen.getHolder(), alexgreen.getBalance());

        System.out.printf("Enter withdraw: ");
        quantity = sc.nextDouble(); 

        alexgreen.withdraw(quantity);

        System.out.println("Updated data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", alexgreen.getAccountNumber(), alexgreen.getHolder(), alexgreen.getBalance());

        sc.close();
    }
}
