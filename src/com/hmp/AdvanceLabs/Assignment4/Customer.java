package com.hmp.AdvanceLabs.Assignment4;

public class Customer {
    private String customerId;
    private String customerName;
    private String address;
    private int pinCode;

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.customerId ="1234";
        customer.customerName ="Jayant";
        customer.address = "PHA-Sawan Apts, Yadavgiri, Mysore";
        customer.pinCode = 570020; //statement 5
        System.out.println("CustomerID " + customer.customerId);
        System.out.println("Customer Name" + customer.customerName);
        System.out.println("Customer Address " + customer.address);
        System.out.println("Customer Pin Code " + customer.pinCode);

    }
}
