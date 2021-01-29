package Factory.FactoryMethod;


public class Main {
    public static void main(String[] args) throws Exception {
        Bank bank = BankFactory.getBank(BankFactory.BankType.TPBANK);
        System.out.println(bank.getBankName());
    }
}