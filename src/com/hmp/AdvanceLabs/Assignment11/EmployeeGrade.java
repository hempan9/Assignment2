package com.hmp.AdvanceLabs.Assignment11;

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
        EmployeeGrade employee[] = new EmployeeGrade[5];
        for (int i = 0; i < employee.length; i++) {
            employee[i]=new EmployeeGrade(100,"Mufasa",3.8f,3.7f,2.7f);
            employee[i].calculateAverageFeedback();
            employee[i].calculateGrade();
            employee[i].displayInfo();
        }
    }
}