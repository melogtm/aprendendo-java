package problemaFixacaoEntities;

public class Account {
    private int accountNumber; 
    private String accountHolder; 
    private double ideposit; 
    private final double taxa = 5.00; 

    public Account(String accountHolder, double ideposit, int accountNumber) {
        this.accountHolder = accountHolder;
        deposit(ideposit);
        this.accountNumber = accountNumber;
    }

    public Account(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        ideposit = 0;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber; 
    }

    public String getHolder() {
        return this.accountHolder; 
    }

    public void setHolder(String new_name) {
        this.accountHolder = new_name; 
    }

    public double getBalance() {
        return this.ideposit; 
    }

    public void deposit(double quantity) {
        // Sei que é opcional, mas para não perder o costume, usarei o this.
        this.ideposit += quantity; 
    }

    public void withdraw(double quantity) {
        this.ideposit -= (quantity + this.taxa);
    }
}
