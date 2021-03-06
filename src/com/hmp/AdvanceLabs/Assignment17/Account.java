package com.hmp.AdvanceLabs.Assignment17;

public abstract class Account  {
    private int accountNo;
    private Customer customer;
    double balance;
    public Account(){}
    public abstract void withdraw(double amount);
    public Account(int accountNo, Customer customer, double balance){
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance=balance;

    }

    public Customer getCustomer() {
        return customer;
    }
    public double balanceEnquiry(){
        return balance;
    }
    public void deposit(double amount){
        balance = balance+amount;
        System.out.println("Available Balance: "+balance);
    }
}
