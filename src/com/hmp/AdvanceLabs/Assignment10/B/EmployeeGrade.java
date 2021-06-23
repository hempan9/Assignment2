package com.hmp.AdvanceLabs.Assignment10.B;

public class EmployeeGrade {
    private int empolyeeNo;
    private String employeeName;
    private float customer1Feedback;
    private float customer2Feedback;
    private float customer3Feedback;
    private float averageFeedback;
    private char grade;

    public EmployeeGrade() {
        empolyeeNo = 101;
        employeeName = "Ram";
        customer1Feedback = 4.1f;
        customer2Feedback = 4.0f;
        customer3Feedback = 4.3f;
    }
public EmployeeGrade(int empolyeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback){
        this.empolyeeNo= empolyeeNo;
        this.employeeName=employeeName;
        this.customer1Feedback=customer1Feedback;
        this.customer2Feedback=customer2Feedback;
        this.customer3Feedback=customer3Feedback;
}
    public void calculateAverageFeedback() {
        averageFeedback = (this.customer1Feedback + this.customer2Feedback + this.customer3Feedback) / 3;
    }

    public void calculateGrade() {
        if (averageFeedback >= 4)
            grade = 'A';
        else if (averageFeedback < 4 && averageFeedback >= 3.5)
            grade = 'B';
        else if (averageFeedback < 3.5 && averageFeedback >= 3.0)
            grade = 'C';
        else if (averageFeedback < 3.0 && averageFeedback >= 2.5)
            grade = 'D';
        else
            grade = 'F';
    }

    public void displayInfo() {
        System.out.println("Employee number: " + empolyeeNo);
        System.out.println("Employee name: " + employeeName);
        System.out.println("Employee's average feedback: " + averageFeedback);
        System.out.println("Student grade: " + grade);
    }
}

class wells {
    public static void main(String[] args) {
        //To-do: Invoke methods for calculating Avg feedback & grade for both the employees
        // To-do: Invoke method to display the employee information for both the employees
        EmployeeGrade ram = new EmployeeGrade();
        ram.calculateAverageFeedback();
        ram.calculateGrade();
        ram.displayInfo();
        EmployeeGrade james = new EmployeeGrade(102,"James",4.2f,4.4f,4.1f);
        james.calculateAverageFeedback();
        james.calculateGrade();
        james.displayInfo();
    }
}