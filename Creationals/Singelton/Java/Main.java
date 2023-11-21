package Creationals.Singelton.Java;

public class Main {
    public static void main(String[] args) {
        Conection DbConection = Conection.getInstance();
        Conection DbConection2 = Conection.getInstance();
        DbConection.connect();
        if (DbConection instanceof  Conection && DbConection2 instanceof Conection) {
            System.out.println("Singelton Design Pattern");
        }
    }
}
