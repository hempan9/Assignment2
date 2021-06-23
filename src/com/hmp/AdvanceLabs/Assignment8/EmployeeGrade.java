package com.hmp.AdvanceLabs.Assignment8;

public class EmployeeGrade {
    private int empolyeeNo;
    private String employeeName;
    private float customer1Feedback;
    private float customer2Feedback;
    private float customer3Feedback;
    private float averageFeedback;
    private char grade;

    public void initilizeEmployee(int empolyeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback) {
        this.empolyeeNo = empolyeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;
        this.customer3Feedback = customer3Feedback;

    }

    public void calculateAverageFeedback() {
        averageFeedback = (customer1Feedback + customer2Feedback + customer3Feedback) / 3;
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
        // To-do: Create an instance (Elvis) for EmployeeGrade class.
        // To-do: Invoke methods for calculating Avg feedback & grade
        // To-do: Invoke method to display the employee information
        EmployeeGrade employeeGrade = new EmployeeGrade();
        employeeGrade.initilizeEmployee(101, "Saile Badal", 3.9f, 4.5f, 4.2f);
        employeeGrade.calculateAverageFeedback();
        employeeGrade.calculateGrade();
        employeeGrade.displayInfo();
    }
}