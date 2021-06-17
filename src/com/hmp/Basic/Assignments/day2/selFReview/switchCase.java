package com.hmp.Basic.Assignments.day2.selFReview;

public class switchCase {
    public static void main(String[] args) {
        String comment;
        int val= 4 *3;
        switch (val){
            case 0:
                comment = "Case 0";
                break;
            case 1:
                comment = "Case 1";
                break;
            case 2:
                comment = "Case 2";
                break;
            default:comment="Oops -- something went wrong";

        }
        System.out.println(comment);
    }
}
