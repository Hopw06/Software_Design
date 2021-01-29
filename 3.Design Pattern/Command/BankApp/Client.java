package Command.BankApp;

import Command.BankApp.Command.CloseAccount;
import Command.BankApp.Command.OpenAccount;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("Phong");

        Bank bank = new Bank();
        bank.clickOpenAccount(new OpenAccount(account));
        bank.clickCloseAccount(new CloseAccount(account));
    }
}
