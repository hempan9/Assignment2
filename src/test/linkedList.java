package test;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList <Integer> linkedList = new LinkedList<>();
        linkedList.add(2); linkedList.add(5);
        linkedList.addLast(4);
        linkedList.addFirst(args.length);
        System.out.println(linkedList);
        }
}
