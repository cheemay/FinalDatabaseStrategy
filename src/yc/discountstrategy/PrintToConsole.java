/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yc.discountstrategy;

/**
 *
 * @author Dell
 */
public class PrintToConsole implements PrintStrategy {

    @Override
    public final void print( String data) {
        System.out.println(data);
    }
}
