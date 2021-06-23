package com.hmp.AdvanceLabs.Assignment28;

public class Customer {
    private int customerId;
    private  String customerName;
    private String customerAddress;
    private int pinCode;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
class WellBank{
    public static void main(String[] args) {
        // To-do: Create an instance (john) for Customer class.
        //Set the values of all the member variables for „john‟
        Customer john = new Customer();
        john.setCustomerId(101);
        john.setCustomerName("John Smith");
        john.setPinCode(1214);
        john.setCustomerAddress("Fort Worth");
        //To-do: Retrieve and display all the other member variables
        System.out.println(john.getCustomerId()+" "+john.getCustomerName()+" "+
                john.getPinCode()+" "+john.getCustomerAddress());

    }
}