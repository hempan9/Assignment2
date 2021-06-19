package com.hmp.AdvanceLabs.Assignment12.B;

public class Loan {
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;
    static int loanCounter; //loanCOunter counts the total number of objects
    public Loan(){
        loanCounter++;
    }
    public Loan(int accountNo, int customerNo, int loanDuration, float loanAmount,
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

    public void setInterest(float interest) {
        this.interest = interest;
    }
        static {
        loanCounter=101;
        }
    public static void main(String[] args) {
        Loan l[] =new Loan[3];
        for (int i = 0; i < l.length; i++) {
            l[i]=new Loan(101,1,2,255000,4.5f);
        }
        Loan ll[] =new Loan[3];
        for (int i = 0; i < ll.length; i++) {
            ll[i]=new Loan();
        }
        System.out.println("Number of instances: "+loanCounter);
    }
}
