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
public class QtyRangeException extends IllegalArgumentException{
    private static final String ERR_MESG = "Sorry value not be less than zero";

    public QtyRangeException() {
        super(ERR_MESG);
    }

    public QtyRangeException(String s) {
        super(ERR_MESG);
    }

    public QtyRangeException(String message, Throwable cause) {
        super(ERR_MESG, cause);
    }

    public QtyRangeException(Throwable cause) {
        super(cause);
    }
    
    
}
