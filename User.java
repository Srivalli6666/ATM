package com.atm;

public class User {
    private String username = "admin";
    private String password = "1234";
    private double balance = 5000;

    public boolean login(String u, String p) {
        return username.equals(u) && password.equals(p);
    }

    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
