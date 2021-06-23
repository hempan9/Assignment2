package com.hmp.AdvanceLabsTwo.Assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddCustomer {
    public void printCustomers(List<String>arrayList){
        //Create the iterator to iterate over the list
        Iterator<String> iterator = arrayList.iterator();
        System.out.println("Customers are: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        //Create reference of List and Object of ArrayList
        List<String> list = new ArrayList<String>();
        list.add("Jack");
        list.add("Harry");
        list.add("Tabrez");
        list.add("Leezu");
        AddCustomer addCustomer = new AddCustomer();
        System.out.println(list);
        //Call printCustomer () print the contents of list
        addCustomer.printCustomers(list);

}}
