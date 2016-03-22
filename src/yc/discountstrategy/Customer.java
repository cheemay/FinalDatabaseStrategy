/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yc.discountstrategy;

/**
 *
 * @author ycheema
 */
public class Customer {
    
    private String custId;
    private String custName;
    private final int MIN_WORD_COUNT = 2;
    private final int MAX_WORD_COUNT = 15;
    //Create constructator
    public Customer(String custId, String custName) {
       setCustId(custId);
       setCustName(custName);
    }
    
    //The value not be null or empty
    
    public final String getCustId() {
        
        return custId;
    }

    public final void setCustId(String custId) throws IllegalArgumentException {
        if(custId == null || custId.isEmpty() || custId.length() < MIN_WORD_COUNT || 
                custId.length() > MAX_WORD_COUNT){
            throw new IllegalArgumentException
        ("The customer id must have value between 2 to 7 words");
        }
        this.custId = custId;
    }

    public final String getCustName() {
        return custName;
    }
    //Custname is not null and empty and custgomer name
    //customername is not greater than fifteen.
    public final void setCustName(String custName) throws IllegalArgumentException{
        if (custName == null || custName.isEmpty() ||
                custName.length() < MIN_WORD_COUNT || custName.length() > MAX_WORD_COUNT){
            throw new IllegalArgumentException("Sorry");
        }
        this.custName = custName;
    }
    
    
}
