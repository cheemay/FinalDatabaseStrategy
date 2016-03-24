/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yc.discountstrategy;

/**
 *
 * @author Dell
 */
public class DiscountException extends Exception{
    private static final String ERR_MSG = "Sorry the value is between 0 and 75";

    public DiscountException() {
        super(ERR_MSG);
    }

    public DiscountException(String message) {
        super(ERR_MSG);
    }

    public DiscountException(String message, Throwable cause) {
        super(ERR_MSG, cause);
    }

    public DiscountException(Throwable cause) {
        super(cause);
    }

    public DiscountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(ERR_MSG, cause, enableSuppression, writableStackTrace);
    }
    
    
}
