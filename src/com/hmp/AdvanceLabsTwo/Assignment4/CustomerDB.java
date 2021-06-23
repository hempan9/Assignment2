package com.hmp.AdvanceLabsTwo.Assignment4;

import java.util.*;

import com.hmp.AdvanceLabsTwo.Assignment4.Customer;
public class CustomerDB {
    private List<Customer> customerList = new ArrayList<Customer>();
    public boolean saveCustomer(Customer customer){
        boolean status = false;
        status = customerList.add(customer);
        return status;
    }
    public List<Customer> getAllCustomers(){
        return customerList;
    }
    public Set<Integer> getAvailableCustomers(){
        Set<Integer> loanAvailableCustomers = new TreeSet<Integer>();
        Iterator <Customer> customerIterator = customerList.iterator();
        while(customerIterator.hasNext()){
            Customer customer = customerIterator.next();
            if(customer.isLoanAvailed()){
                loanAvailableCustomers.add(customer.getCustomerId());
            }
        }
        return loanAvailableCustomers;
    }

}
