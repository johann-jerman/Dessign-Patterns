package Structural.Proxy;

import Structural.Proxy.Interface.ICuenta;
import Structural.Proxy.Model.Cuenta;
import Structural.Proxy.Model.CuentaProxy;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, "jhon", 1000);

        ICuenta cuentaProxy = new CuentaProxy();
        cuentaProxy.getMoney(cuenta, 100);
        cuentaProxy.setMoney(cuenta, 50);
        cuentaProxy.getTotal(cuenta);
    }
}
