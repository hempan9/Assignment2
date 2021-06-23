package com.hmp.AdvanceLabsTwo.Assignment2;

import java.util.HashSet;
import java.util.Set;

public class EntrySet {
    public void printSetRecords(Set<String> set){
        if (set.isEmpty()) System.out.println("Set is empty");
        else System.out.println("Set elements are: "+set);
    }

    public static void main(String[] args) {
        //Create Hashset and add somme entries to it
        Set<String> set = new HashSet<String>();
        set.add("First Entry");
        set.add("Second Entry");
        set.add("Third Entry");
        EntrySet entrySet = new EntrySet();
        entrySet.printSetRecords(set);
        Set<String>setOne = new HashSet<>();
        entrySet.printSetRecords(setOne);
    }
}
