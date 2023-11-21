package Structural.Proxy.Model;

import Structural.Proxy.Impl.BanckImpl;
import Structural.Proxy.Interface.ICuenta;

public class CuentaProxy implements ICuenta {
    private BanckImpl bank;
    @Override
    public Cuenta getMoney(Cuenta cuenta, double mount) {
        if (bank == null){
            bank = new BanckImpl();
            return bank.getMoney(cuenta, mount);
        }
        return bank.getMoney(cuenta, mount);
    }

    @Override
    public Cuenta setMoney(Cuenta cuenta, double mount) {
        if (bank == null){
            bank = new BanckImpl();
            return bank.setMoney(cuenta, mount);
        }
        return bank.setMoney(cuenta, mount);
    }

    @Override
    public void getTotal(Cuenta cuenta) {
        if (bank == null){
            bank = new BanckImpl();
            bank.getTotal(cuenta);
        }
        bank.getTotal(cuenta);
    }
}
