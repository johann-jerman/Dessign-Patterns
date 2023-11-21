package Structural.Proxy.Impl;

import Structural.Proxy.Interface.ICuenta;
import Structural.Proxy.Model.Cuenta;

public class BanckImpl implements ICuenta {
    @Override
    public Cuenta getMoney(Cuenta cuenta, double mount) {
        double account = cuenta.getMoney() - mount;
        cuenta.setMoney(account);
        System.out.println("saldo inicial" + cuenta.getMoney());
        return cuenta;
    }

    @Override
    public Cuenta setMoney(Cuenta cuenta, double mount) {
        double account = cuenta.getMoney() + mount;
        cuenta.setMoney(account);
        System.out.println("saldo depositado" + cuenta.getMoney());
        return cuenta;
    }

    @Override
    public void getTotal(Cuenta cuenta) {
        System.out.println("saldo" + cuenta.getMoney());
    }
}
