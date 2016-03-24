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
    
    private static final int NO_DISCOUNT = 0;
    private static final int MIN_QTY = 0;
    private static final double MIN_DIS_RATE = 0;
    private static final double MIN_UNITCOST = 0;

    public NoDiscount() {
       
    }
    

    @Override
    public final double getDiscountAmt(int qty, double unitCost) throws IllegalArgumentException{
        if(qty > MIN_QTY || unitCost > MIN_UNITCOST ){
            throw new QtyRangeException();
        }
        return NO_DISCOUNT;
        
     }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) throws IllegalArgumentException {
       if(discountRate < NO_DISCOUNT){
           throw new QtyRangeException();
       }
        this.discountRate = discountRate;
    }

   
    
    
}
