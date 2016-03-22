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
    
    //QTY and UnitCost can't be less than zero
    @Override
    public final double getDiscountAmt(int qty, double unitCost) throws IllegalArgumentException{
        if (qty,unitCost < 0 ){
        throw new IllegalArgumentException("Sorry qty must be greater than zero");
    }
        
        return discountRate;
        
     }

    public final double getDiscountRate() {
        return discountRate;
    }
    //Discount rate is not less than zero and greater than 5
    public final void setDiscountRate(double discountRate)throws IllegalArgumentException {
        if(discountRate < 0 || discountRate > 5){
            throw new IllegalArgumentException("Sory");
        }
        
        this.discountRate = discountRate;
    }
    
}
