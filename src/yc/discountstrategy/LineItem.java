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
        if (product == null || product.length() < 0)
        
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        //Need validation
        this.qty = qty;
    }
    
    
    
}
