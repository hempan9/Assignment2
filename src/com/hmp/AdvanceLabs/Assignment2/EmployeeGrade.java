package com.hmp.AdvanceLabs.Assignment2;

public class EmployeeGrade {
    public static void main(String[] args) {
        //To-do: Calculate the average feedback of all the employees
        //To-do: Determine the grade of all the employees
        int employeeId[] = {1001, 1002,1003,1004,1005};
        float customer1Feedback[]= {4.1f, 3.8f, 4.5f, 2.9f,1.9f};
        float customer2Feedback[]= {3.5f, 2.9f, 3.7f, 4.1f,2.5f};
        float customer3Feedback[]= {3.7f, 3.9f, 4.2f, 2.9f,1.9f};
        float customer4Feedback[]= {2.5f, 3.5f, 4.0f, 1.9f,4.2f};
        float customer5Feedback[]= {2.7f, 4.5f, 3.9f, 1.2f,1.5f};
        float averageFeedback[] = new float[employeeId.length];
        char grade[]=new char[averageFeedback.length];
        for (int i = 0; i < employeeId.length; i++) {
            averageFeedback[i] = (customer1Feedback[i]+customer2Feedback[i]+
                    customer3Feedback[i]+customer4Feedback[i]+customer5Feedback[i])/5;
        }
        for (int i = 0; i < averageFeedback.length; i++) {
                if(averageFeedback[i]>=4)
                    grade[i] ='A';
               else if (averageFeedback[i]<4&&averageFeedback[i]>=3.5)
                    grade[i]='B';
                else if (averageFeedback[i]<3.5&&averageFeedback[i]>=3.0)
                    grade[i] = 'C';
                else if (averageFeedback[i]<3.0&& averageFeedback[i]>=2.5)
                    grade[i]='D';
                else
                    grade[i]='F';
            }
        for (int i = 0; i < employeeId.length; i++) {
            System.out.println("Employee Number: "+employeeId[i]+" Average feedback: "+averageFeedback[i]
            +" Grade: "+grade[i]);
        }
    }
}
