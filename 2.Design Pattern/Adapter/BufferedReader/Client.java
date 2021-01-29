package Adapter.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String s = br.readLine();
        System.out.println("Name: " + s);

        // Adapter is InputStreamReader
        // Target is BufferedReader
        // System.in is adaptee
    }
}
