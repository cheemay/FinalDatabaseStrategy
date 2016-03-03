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
    //Create constructator
    public Customer(String custId, String custName) {
       setCustId(custId);
       setCustName(custName);
    }
    
    //Create getter and setter
    // Make the method final so no one can change the date
    public final String getCustId() {
        return custId;
    }

    public final void setCustId(String custId) {
        //needs validation
        this.custId = custId;
    }

    public final String getCustName() {
        return custName;
    }

    public final void setCustName(String custName) {
        //Need validation
        this.custName = custName;
    }
    
    
}
