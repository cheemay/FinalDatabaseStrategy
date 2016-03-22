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
public class Product {
    private String prodId;
    private String prodName;
    private double unitCost;
    private DiscountStrategy discount;

    public Product(String prodId, String prodName, double unitCost, DiscountStrategy discount) {
        setProdId(prodId);
        setProdName(prodName);
        setUnitCost(unitCost);
        setDiscount(discount);
    }
    
    

    public String getProdId() {
        return prodId;
    }
    //ProdId can't be null or empty
    //ProdId must be between 2 and 6 words or number
    public final void setProdId(String prodId) throws IllegalArgumentException{
        if(prodId == null || prodId.isEmpty() || 
                 prodId.length() < 2 || prodId.length() > 6){
        throw new IllegalArgumentException("Sorry the prodId not be null or empty");
    }
        this.prodId = prodId;
    }

    public final String getProdName() {
        return prodName;
    }

    public final void setProdName(String prodName) {
        //Needs validation
        this.prodName = prodName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        //Needs validation
        this.unitCost = unitCost;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        //Needs validation
        this.discount = discount;
    }
    
    
    
}
