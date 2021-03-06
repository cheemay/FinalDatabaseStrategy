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
public class FakeDatabase implements DatabaseStrategy {
    //private Customer [] customers = new Customer [3];
    
    private Customer [] customers = {
        new Customer("100" , "Bob James"),
        new Customer("200" , "Sally Smith"),
        new Customer("300" , "Peter Piper"),
    
    };
   // private Product [] producsts = new Product [3];
    private Product [] products = {
        new Product ("11" , "Brewer's Hat" , 29.95 , new PercentOffDiscount(.10)),
        new Product("22", "Women's Blouse", 49.95 , new FlatAmtDiscount(5.00)),
        new Product("33", "Men's Black Belt" , 39.95, new NoDiscount())
    };
    @Override
    public final Product findProductsById(String prodId){
        Product product = null;
        for(Product p : products) {
            if(p.getProdId().equals(prodId)){
                product = p;
                break;
            }
        
    }
        return product;
        
    
    }
    @Override
    public final Customer findCustomrById(String custId)throws IllegalArgumentException{
        
        Customer customer = null;
        if(custId == null || custId.isEmpty() || custId.length() < 2)
            throw new IllegalArgumentException("Sorry wrong custid value");
        for  (Customer c : customers) {
            if(c.getCustId().equals(custId)){
                customer = c;
                break;
            }
        
    }
        return customer;
        
    }
    
}
