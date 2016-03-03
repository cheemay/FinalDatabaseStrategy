/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yc.discountstrategy;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Dell
 */
public class PrintGUI implements PrintStrategy{

    @Override
    public void print(String data) {
        UIManager.put("OptionPane.minimumSize",new Dimension(500,400)); 

        JOptionPane.showMessageDialog(null, data);
    }
    
}
