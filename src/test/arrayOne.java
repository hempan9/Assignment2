package test;

import java.util.Scanner;

public class arrayOne {
    public static void main(String[] args) {
        int[] Aarr = createArray(8);
            displayArray(Aarr);
    }
    public static int[]createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int)(Math.random()*20)+10;
        }
        return arr;
    }
    public static void displayArray(int[] arrr){
        for (int i = 0; i <arrr.length; i++) {
            System.out.print(arrr[i]+" ");
        }
    }
}
