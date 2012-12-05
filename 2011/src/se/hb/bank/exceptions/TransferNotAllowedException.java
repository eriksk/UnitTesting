package se.hb.bank.exceptions;

public class TransferNotAllowedException extends Exception{

    public TransferNotAllowedException(String message) {
        super(message);
    }
    
}