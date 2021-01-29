package com.company.design_pattern.builder_pattern;

/*
    Builder pattern is useful when class has large arguments. Two step
    1. Make constructor private
    2. Make Builder class nested in class
*/
public class User {
    private String userName; // required
    private String emailAddress; // required

    private String firstName; // option
    private String lastName; // option
    private int phoneNumber; // option
    private String address; // option

    private User(Builder builder) {
        this.userName = builder.userName;
        this.emailAddress = builder.emailAddress;

        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        private String userName;
        private String emailAddress;

        private String firstName;
        private String lastName;
        private int phoneNumber;
        private String address;

        public Builder(String userName, String emailAddress) {
            this.userName = userName;
            this.emailAddress = emailAddress;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder phoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
