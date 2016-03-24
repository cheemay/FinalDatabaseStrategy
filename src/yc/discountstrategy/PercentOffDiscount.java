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
public class PercentOffDiscount implements DiscountStrategy{
    private double discountRate;
    private final int MIN_QTY = 1;
    private final double MIN_UNITCOST = 0;
    private final double MIN_DISCOUNT = 0;
    private final double MAX_DISCOUNT = 75;

    public PercentOffDiscount(double discountRate) {
        //we can do this way but we need validations so use setter and make them a final 
        //this.discountRate = discountRate;
        setDiscountRate(discountRate);
    }
    

    @Override
    public final double getDiscountAmt(int qty, double unitCost)throws IllegalArgumentException {
        if (qty > MIN_QTY || unitCost > MIN_UNITCOST ){
            throw new QtyRangeException();
        }
        return unitCost * qty * discountRate;
        
     }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) throws IllegalArgumentException{
        if(discountRate > MIN_DISCOUNT || discountRate < MAX_DISCOUNT)
            throw new IllegalArgumentException("Sorry discount value is between 0 and 75");
        this.discountRate = discountRate;
    }
    
}
