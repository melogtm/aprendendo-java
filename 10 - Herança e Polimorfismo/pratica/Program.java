public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BAccount bacc = new BAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc; // Uma BAccount é uma Account, por isso não dá erro.
        acc1.getBalance(); // 0.0
        Account acc2 = new BAccount(1003, "Bob", 0.0, 200.0); // Outra forma de fazer upcasting.
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01); // Outra forma de fazer upcasting.

        // DOWNCASTING

        BAccount acc4 = (BAccount) acc2; // Downcasting. Precisa de casting.
        acc4.getLoanLimit(); // 200.0

        // BAccount acc5 = (BAccount) acc3; // Erro em tempo de execução. SavingAccount não é uma BAccount.
        // Para prevenir, usar instanceof.

        if (acc3 instanceof BAccount) {
            BAccount acc5 = (BAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingAccount) {
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // Sobreposição

        Account acc6 = new Account(1005, "Alex", 1000.0);
        acc6.withdraw(200.0); 
        System.out.println(acc6.getBalance()); // 795.0

        Account acc7 = new SavingAccount(1006, "Alex", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance()); // 800.0

        Account acc8 = new BAccount(1007, "Alex", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance()); // 793.0;
    }
}
