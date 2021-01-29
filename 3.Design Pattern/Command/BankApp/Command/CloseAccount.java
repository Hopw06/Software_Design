package Command.BankApp.Command;

import Command.BankApp.Account;

public class CloseAccount implements Command{

    private Account mAccount;

    public CloseAccount(Account account) {
        this.mAccount = account;
    }

    @Override
    public void execute() {
        this.mAccount.close();
    }
}
