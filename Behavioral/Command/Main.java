package Behavioral.Command;

import Behavioral.Command.Class.Account;
import Behavioral.Command.Class.Invoker;
import Behavioral.Command.Impl.DepositImpl;
import Behavioral.Command.Impl.WithdrawImpl;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1, 123456);

        DepositImpl deposit = new DepositImpl(account, 2222);
        WithdrawImpl withdraw = new WithdrawImpl(account, 2311);

        Invoker invoker = new Invoker();
        invoker.getOperations(deposit);
        invoker.getOperations(withdraw);
        invoker.operate();
    }
}
