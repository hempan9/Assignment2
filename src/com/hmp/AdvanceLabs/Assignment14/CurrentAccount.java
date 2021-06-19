package com.hmp.AdvanceLabs.Assignment14;

public class CurrentAccount extends Account {
    private double currentAmount;

    public CurrentAccount() {
    }

    public CurrentAccount(int accountNo, Customer customer, double balance, double currentAmount) {
        super(accountNo, customer, balance);
        this.currentAmount = currentAmount;
    }

    public void withdraw(double amount) {
        if (amount <= (getEligibility()+balance-currentAmount)) {
            System.out.println("Eligible to withdraw: " + amount);
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Available balance: " + balance);
        } else {
            System.out.println("Ineligible amount to withdraw: "+amount);
        }
    }
    public double getEligibility() {
        return 10000;
    }
}
