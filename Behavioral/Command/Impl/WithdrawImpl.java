package Behavioral.Command.Impl;

import Behavioral.Command.Class.Account;
import Behavioral.Command.Interfaces.IOperation;

public class WithdrawImpl implements IOperation {
    private Account account;
    private double mount;

    public WithdrawImpl(Account account, double mount) {
        this.account = account;
        this.mount = mount;
    }

    @Override
    public void execute() {
        this.account.withdrawMoney(this.mount);
    }
}
