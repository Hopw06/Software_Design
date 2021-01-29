package Builder.BankAccount;

public class BankAccount {
    private final String name;
    private final String accountNumber;
    private final String address;
    private final String email;
    private final boolean newsletter;
    private final boolean mobileBanking;

    public BankAccount(String name, String accountNumber, String address, String email, boolean newsletter, boolean mobileBanking) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.email = email;
        this.newsletter = newsletter;
        this.mobileBanking = mobileBanking;
    }

    public static class Builder {
        private String name;
        private String accountNumber;
        private String address;
        private String email;
        private boolean newsletter;
        private boolean mobileBanking;

        public Builder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder wantNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public Builder wantMobileBanking(Boolean mobileBanking) {
            this.mobileBanking = mobileBanking;
            return this;
        }

        public BankAccount build() {
            validateUserObject();

            return new BankAccount(this.name, this.accountNumber
            , this.address, this.email, this.newsletter, this.mobileBanking);
        }

        private void validateUserObject() {
            if (this.newsletter && email == null) {
                throw new IllegalArgumentException("Email can't be null when user want to receiver newsletter.");
            }
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", newsletter=" + newsletter +
                ", mobileBanking=" + mobileBanking +
                '}';
    }
}
