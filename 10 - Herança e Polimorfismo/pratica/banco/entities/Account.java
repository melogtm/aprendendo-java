package entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }
    public String getHolder() {
        return holder;
    }
    public Integer getNumber() {
        return number;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        balance -= amount + 5.0;
    }

}
