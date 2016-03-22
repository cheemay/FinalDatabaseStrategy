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
public class NoDiscount implements DiscountStrategy{
    private double discountRate;
    
    private final int NO_DISCOUNT = 0;

    public NoDiscount() {
       
    }
    

    @Override
    public final double getDiscountAmt(int qty, double unitCost) {
        //needs validation
        
        return NO_DISCOUNT;
        
     }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
       if(discountRate < NO_DISCOUNT){
           throw new IllegalArgumentException("Sorry the "+ 
                   "discount rate not less than No discount rate.");
       }
        this.discountRate = discountRate;
    }

   
    
    
}
