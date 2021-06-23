package com.hmp.AdvanceLabs.Assignment12.C;

public class Loan {
    static int loanCounter; //loanCOunter counts the total number of objects

    static {
        loanCounter = 101;
    }

    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;

    private Loan() {
        loanCounter++;
    }

    private Loan(int accountNo, int customerNo, int loanDuration, float loanAmount,
                 float interest) {
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanDuration = loanDuration;
        this.loanAmount = loanAmount;
        this.interest = interest;
        loanCounter++;

    }

    public static Loan getLoanInstance(int accountNo, int customerNo, int loanDuration, float loanAmount, float interest) {
        //To-Do: create the object of loan class and return it
        return new Loan(accountNo, customerNo, loanDuration, loanAmount, interest);
    }

    public float calculateInstallments() {
        return 0;
    }

    public int getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(int loanNo) {
        this.loanNo = loanNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getNumberOfObjects() {
        return loanCounter;
    }
}

class TestLoan {
    public static void main(String[] args) {
//To-Do: create the instances of the Loan class using getInstance() method of Loan class
        Loan loan = Loan.getLoanInstance(10, 1, 2, 12500.1f, 4.5f);
        System.out.println("Number of instances: " + Loan.loanCounter);
        System.out.println("Total number of objects: " + loan.getNumberOfObjects());
    }
}