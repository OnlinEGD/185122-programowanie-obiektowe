package lab03;

public class BankAccount {
    private String owner;
    private double balance;

    public String getOwner()
    {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public void withdraw(double amount)
    {
        if(this.balance <= 0 || this.balance < amount){ return; }
        this.balance -= amount;
    }
}
