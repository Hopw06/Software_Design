package Command.BankApp.Command;

import Command.BankApp.Account;

public class OpenAccount implements Command{

    private Account mAccount;

    public OpenAccount(Account account) {
        this.mAccount = account;
    }

    @Override
    public void execute() {
        this.mAccount.open();
    }
}
