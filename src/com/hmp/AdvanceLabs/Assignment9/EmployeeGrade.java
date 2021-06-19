package com.hmp.AdvanceLabs.Assignment9;

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
    //Method overridind
    public void initilizeEmployee(int empolyeeNo, String employeeName, float customer1Feedback, float customer2Feedback) {
        this.empolyeeNo = empolyeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;

    }
    public void calculateAverageFeedback(float customer1Feedback, float customer2Feedback, float customer3Feedback) {
        averageFeedback = (this.customer1Feedback + this.customer2Feedback +this.customer3Feedback) / 3;
    }
    public void calculateAverageFeedback(float customer1Feedback, float customer2Feedback) {
        averageFeedback = (this.customer1Feedback + this.customer2Feedback + this.customer3Feedback) / 2;
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

class wells{
    public static void main(String[] args) {
        EmployeeGrade elvis = new EmployeeGrade();
        elvis.initilizeEmployee(101,"Elvis Badal", 3.9f,4.5f,4.2f);
        elvis.calculateAverageFeedback(4.1f,3.9f, 4.2f);
        elvis.calculateGrade();
        elvis.displayInfo();
        EmployeeGrade martha = new EmployeeGrade();
        martha.initilizeEmployee(103,"Martha",4.2f,4.4f);
        martha.calculateAverageFeedback(4.2f,4.4f);
        martha.calculateGrade();
        martha.displayInfo();
    }
}