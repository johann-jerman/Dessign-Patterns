package Behavioral.Command.Impl;

import Behavioral.Command.Class.Account;
import Behavioral.Command.Interfaces.IOperation;

public class DepositImpl implements IOperation {
    private Account account;
    private double mount;

    public DepositImpl(Account account, double mount) {
        this.account = account;
        this.mount = mount;
    }

    @Override
    public void execute() {
        this.account.depocitMoney(this.mount);
    }
}
