package Creationals.Prototype.Java;

public class Main {
    public static void main(String[] args) {
        CuentaIml cuenta = new CuentaIml();
        cuenta.setCash(100);
        CuentaIml cuentaClonada = (CuentaIml) cuenta.clonar();
        if (cuentaClonada != null){
            System.out.println(cuentaClonada);
        }
        System.out.println(cuentaClonada == cuenta);
    }
}
