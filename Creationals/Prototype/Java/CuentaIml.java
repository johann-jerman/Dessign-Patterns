package Creationals.Prototype.Java;

public class CuentaIml implements  Icuenta{
    private String type;
    private double cash;

    @Override
    public String toString() {
        return "CuentaIml{" +
                "type='" + type + '\'' +
                ", cash=" + cash +
                '}';
    }

    @Override
    public Icuenta clonar() {
        CuentaIml cuenta = null;
        try {
            cuenta = (CuentaIml) clonar();
        } catch (Exception e){
            e.printStackTrace();
        }
        return cuenta;
    }

    public CuentaIml() {
        this.type = "Ahorro";
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
