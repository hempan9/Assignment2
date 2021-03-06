package com.hmp.AdvanceLabsTwo.Assignment3.com.WellBank.login;

import java.util.*;

public class LoginDetails {
    public  void addSameKey(Map<Integer, String> map){
        if (map.containsKey(1003)){
            System.out.println("Key os already present in map");
        }
        map.put(1003,"John");
    }
    /**
     * <h3>Description :</h3> This method will take
     * Map<Integer,String> as input and create a Set of
     * keys(userid) and then print all the userid
     * @param map The map containing the details of userid and
     * the password
     */
    public void printLoginDetails(Map<Integer, String > map){
        //Creating a set of keys of map
        Set<Integer> set = map.keySet();
        Iterator <Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    /**
     * <h3>Description :</h3> The starter method for the application
     * @param Sting [] args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, String> map= new LinkedHashMap<Integer,String>();
        map.put(1000,"Sam");
        map.put(1001,"Tom");
        map.put(1002,"Zen");
        map.put(1003,"Zen");

        System.out.println("Map before adding the same key 1003 "+map);
        LoginDetails loginDetails = new LoginDetails();
        loginDetails.addSameKey(map);
        System.out.println("Value for 1003, after addSameKey() : "+map.get(1003));
        System.out.println("Map after adding the same key 1003 "+map);

loginDetails.printLoginDetails(map);
    }
}
