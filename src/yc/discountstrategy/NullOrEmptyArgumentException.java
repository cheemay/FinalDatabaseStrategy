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
public class NullOrEmptyArgumentException extends IllegalArgumentException{
    
    private static final String ERR_MSG = "Sorry value is not match ";

    public NullOrEmptyArgumentException() {
        super (ERR_MSG);
    }

    public NullOrEmptyArgumentException(String s) {
        super(ERR_MSG);
    }

    public NullOrEmptyArgumentException(String message, Throwable cause) {
        super(ERR_MSG, cause);
    }

    public NullOrEmptyArgumentException(Throwable cause) {
        super(cause);
    }
    
    
}
