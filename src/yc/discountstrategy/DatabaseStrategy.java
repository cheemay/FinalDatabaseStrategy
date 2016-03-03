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
public interface DatabaseStrategy {

    Customer findCustomrById(String custId);

    Product findProductsById(String prodId);
    
}
