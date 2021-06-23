package com.hmp.AdvanceLabsTwo.Assignment4;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WellsBank {
    /*
     * creating an object of customer db to be accessed throughout
     * the application
     */
    private static final CustomerDB customerDB = new CustomerDB();

    private static final Login login = new Login();

    public static void main(String[] args) {
        Customer cust1 = new Customer(1001, "Tan", false);
        customerDB.saveCustomer(cust1);
//customer availing the online service
        login.addLogin(1001, "Wells123");
        Customer cust2 = new Customer(1002, "John", true);
        customerDB.saveCustomer(cust2);
//customer availing the online service
        login.addLogin(1002, "Wells123");
        Customer cust3 = new Customer(1003, "Sam", true);
        customerDB.saveCustomer(cust3);
//customer availing the online service
        login.addLogin(1003, "Mys@123");
        Customer cust4 = new Customer(1004, "Raj", false);
        customerDB.saveCustomer(cust4);
//customer availing the online service
        login.addLogin(1004, "Wells123");
        /*
         * displaying the details of the customers
         */
        List<Customer> customerList = customerDB.getAllCustomers();
//checking if the list is empty
        if (customerList.isEmpty()) {
//displaying the error message if the list is empty
            System.out.println("No Customers in the Bank");
        } else {
//calling method for displaying list of customers
            printCustomerList(customerList);
        }
        /*
         * displaying the list of all the customers who
         * have availed the loans
         */
        Set<Integer> loanAvailedCustomers =  customerDB.getAvailableCustomers();

        System.out.println("\nCustomers who have Availed the loan ");

                System.out.println(" ");
        for (int custId : loanAvailedCustomers) {
            System.out.println(custId);
        }
    }

    public static void printCustomerList(List<Customer>
                                                 customerList) {

        Iterator<Customer> custIterator = customerList.iterator();
//displaying the header of the report
        System.out.println(" Customer Details");
        System.out.println(" " +
                " ");
        System.out.println("cust Id\tcustomer Name\tLoan Availed");

        while (custIterator.hasNext()) {
//getting the customer from the list
            Customer customer = custIterator.next();
            System.out.print(customer.getCustomerId() + "\t");
            System.out.print(customer.getCustomerName() +
                    "\t");
//string for displaying if the loan is availed
            String displayString = "\t\tNO";
            if (customer.isLoanAvailed()) {
                displayString = "\t\tYES";
            }
            System.out.println(displayString);
        }
    }
}
