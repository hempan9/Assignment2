package com.hmp.AdvanceLabsTwo.Assignment6;

public class UnAuthorizedWithdrawTransactionException extends Exception{
    public  UnAuthorizedWithdrawTransactionException(){
        super("The user is not authorized for the withdrawal");
    }
}
