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
public class FlatAmtDiscount implements DiscountStrategy{
    private double discountRate = 5.00;

    public FlatAmtDiscount(double discountRate) {
        //we can do this way but we need validations so use setter and make them a final 
        //this.discountRate = discountRate;
        setDiscountRate(discountRate);
    }
    

    @Override
    public final double getDiscountAmt(int qty, double unitCost) {
        //needs validation
        return discountRate;
        
     }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        //needs validation
        this.discountRate = discountRate;
    }
    
}
