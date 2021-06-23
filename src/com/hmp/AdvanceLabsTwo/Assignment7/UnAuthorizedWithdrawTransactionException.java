package com.hmp.AdvanceLabsTwo.Assignment7;

public class UnAuthorizedWithdrawTransactionException extends Exception{
    public  UnAuthorizedWithdrawTransactionException(){
        super("The user is not authorized for the withdrawal");
    }
}
