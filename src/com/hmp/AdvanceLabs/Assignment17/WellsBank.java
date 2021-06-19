package com.hmp.AdvanceLabs.Assignment17;

public class WellsBank {
    public static void main(String[] args) {
        Customer john = new Customer(100, "John", "Fort Worth", 1221);
        SavingsAccount johnSA = new SavingsAccount(101, john, 1000);
        transction(johnSA, 1000);
        johnSA.withdraw(1600);
        System.out.println("=======================");
        System.out.println("Janny Overdraft account");
        Customer jenny = new Customer(101, "jenny", "Irving", 2323);
        CurrentAccount jennyOA = new CurrentAccount(201, jenny,
                500, 2000);
        transction(jennyOA, 1500);
        jennyOA.withdraw(1000);
        jennyOA.withdraw(4000);
        jennyOA.withdraw(3000);

    }

    public static void transction(Account account, double amount) {
        account.deposit(amount);
        account.withdraw(100);
    }
}
