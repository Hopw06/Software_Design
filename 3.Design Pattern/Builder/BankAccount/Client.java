package Builder.BankAccount;

public class Client {
    public static void main(String[] args) {
        BankAccount account = new BankAccount.Builder("Phong", "xxxxxxxxx")
                                .withAddress("do not know")
                                .withEmail("vuxuanphongxxx@gmail.com")
                                .wantNewsletter(false)
                                .wantMobileBanking(true)
                                .build();
        System.out.println(account);
    }
}
