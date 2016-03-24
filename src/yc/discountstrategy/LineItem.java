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
public class LineItem {
    private Product product;
    private int qty;
    private static final int MIN_QTY = 0;

    public LineItem(String prodId, int qty,DatabaseStrategy db) {
        
        this.qty = qty;
        setProduct(db.findProductsById(prodId));
    }
    
    

    public final Product getProduct() {
        return product;
    }
    //Product not be null or empty
    //Product must be greater than zero
    public final void setProduct(Product product) {
       
        
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }
    //qty is not less than zero
    public final void setQty(int qty) throws IllegalArgumentException{
        if (qty > MIN_QTY){
            throw new QtyRangeException();
        }
        this.qty = qty;
    }
    
    
    
}
