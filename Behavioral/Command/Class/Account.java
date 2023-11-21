package Behavioral.Command.Class;

public class Account {
    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void withdrawMoney(double mount){
        this.balance -= mount;
        System.out.println("tu saldo es "+ this.balance);
    }

    public void depocitMoney (double mount){
        this.balance += mount;
        System.out.println("tu saldo es "+ this.balance);
    }
}
