package com.hmp.AdvanceLabs.Assignment12.C;

public class Loan {
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;
    static int loanCounter; //loanCOunter counts the total number of objects
    private Loan(){
        loanCounter++;
    }
    private Loan(int accountNo, int customerNo, int loanDuration, float loanAmount,
                float interest){
        this.accountNo=accountNo;
        this.customerNo = customerNo;
        this.loanDuration=loanDuration;
        this.loanAmount=loanAmount;
        this.interest= interest;
        loanCounter++;

    }
    public float calculateInstallments(){
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
    public int getNumberOfObjects(){
        return loanCounter;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
        static {
        loanCounter=101;
        }
    public static Loan getLoanInstance(int accountNo, int customerNo, int loanDuration, float loanAmount, float interest){
        return new Loan(accountNo,customerNo,loanDuration,loanAmount,interest);
    }
}
class TestLoan{
    public static void main(String[] args) {

        Loan loan = Loan.getLoanInstance(10,1,2,12500.1f,4.5f);
        System.out.println("Number of instances: "+Loan.loanCounter);
        System.out.println("Total number of objects: "+loan.getNumberOfObjects());
    }
}