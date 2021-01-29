package com.company.design_pattern.builder_pattern;

public class App {
    public static void main(String[] args) {
        User webUser = new User.Builder("Hopw06", "vuxuanphong0x@gmail.com")
                .firstName("Phong")
                .lastName("Vu")
                .phoneNumber(12345135)
                .address("Vn")
                .build();
        System.out.println(webUser);

        Vehicle car = new Vehicle.Builder()
                    .price(10300.76)
                    .type("car")
                    .make("Honda")
                    .horsePower(150)
                    .model("Accord")
                    .color("red")
                    .doors(4)
                    .build();
        System.out.println(car);
    }
}
