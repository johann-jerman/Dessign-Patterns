package Structural.Proxy.Model;

public class Cuenta {
    private int id;
    private String user;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Cuenta(int id, String user, double money) {
        this.id = id;
        this.user = user;
        this.money = money;
    }
}
