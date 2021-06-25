package com.hmp.AdvanceLabs.Assignment14;

public class WellsBank {
    public static void main(String[] args) {
        // To-do: Create an instance (john) for Customer class. Call the overloaded constructor
        // To-do: display the balance available in account no 101
        // To-do: call the method to withdraw Rs.1600.
        // To-do: display the balance available.
        // To-do: Create an instance (jenny) for Customer class. Call the overloaded constructor
        // To-do: deposit Rs. 1500 to the account
        // To-do: display the balance available in account no 201 Note: available balance for Overdraft Account is balance+ Allowed negative amount
        // To-do: call the method to withdraw Rs. 1000// To-do: display the balance available
        // To-do: call the method to withdraw Rs. 4000
        // To-do: display the balance available
        // To-do: call the method to withdraw Rs. 3000
        // To-do: display the balance available
        Customer john = new Customer(100, "John", "Fort Worth", 1221);
        SavingsAccount johnSA = new SavingsAccount(101, john, 1000);
        johnSA.deposit(1000);
        johnSA.withdraw(1600);
        System.out.println("Remaining Bal: " + johnSA.balanceEnquiry());
        System.out.println("=======================");
        System.out.println("Janny Overdraft account");
        Customer jenny = new Customer(101, "jenny", "Irving", 2323);
        CurrentAccount jennyOA = new CurrentAccount(201, jenny,
                500, 2000);
        jennyOA.deposit(1500);
        jennyOA.withdraw(1000);
        jennyOA.withdraw(4000);
        jennyOA.withdraw(3000);
        jennyOA.withdraw(3000);
       // jennyOA.withdraw(3000);



    }
}
