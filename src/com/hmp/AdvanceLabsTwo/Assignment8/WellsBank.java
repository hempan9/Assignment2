package com.hmp.AdvanceLabsTwo.Assignment8;

public class WellsBank {
    public static void main(String[] args) {
        //initializing  the wellsbank fund
        BankFund wellsBankFund = new BankFund(90000);
        //creating an array of transactions
        LoanTransaction[] loanTransactions = new LoanTransaction[100];
        for (int index = 0; index < loanTransactions.length; index++) {
            loanTransactions[index]= new LoanTransaction(wellsBankFund,
                    (1000+index),25000);
        }
        //requesting for the loan at different branches
        for (int index = 0; index < loanTransactions.length; index++) {
            loanTransactions[index].run();
        }
    }
}
