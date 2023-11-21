package Structural.Proxy.Interface;

import Structural.Proxy.Model.Cuenta;

public interface ICuenta {
    Cuenta getMoney(Cuenta cuenta, double mount);
    Cuenta setMoney(Cuenta cuenta, double mount);
    void getTotal(Cuenta cuenta);
}
