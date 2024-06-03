package entities;

public class BAccount extends Account {
    private Double loanLimit;
    
    public BAccount() {
        super(); // Chama o construtor padrão da superclasse, se houver uma lógica lá 
    }

    public BAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount); // Chama o método da superclasse
        balance -= 2.0; // Tira mais 2.0
    
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            balance += amount + 10.0; // balance não é visível por ser private, precisamos defini-lo como protected
        }
    }

}
