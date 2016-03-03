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
public class Register {
    private Receipt receipt;
    private String storeName;
    private BillFormatStrategy format;
    private PrintStrategy[] prints;
    
    public Register(String storeName) {
        this.storeName = storeName;
    }
    
    public final void startNewSale(String custId, DatabaseStrategy db,BillFormatStrategy format, PrintStrategy[] outputs, char currSym){
        receipt = new Receipt(storeName, custId, db,currSym);
        this.setFormat(format);
        this.setPrints(outputs);
    }
    public final void endSale(){
        
        String printData = format.format(receipt, storeName);
        for(PrintStrategy print : prints){
           print.print(printData);
        }
    }
    public final void addItemToSale(String prodId, int qty){
        receipt.addItemToReceipt(prodId, qty);
        
    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        //Need validation
        this.receipt = receipt;
    }

    public final String getStoreName() {
        return storeName;
    }

    public final void setStoreName(String storeName) {
        //Need Validation
        this.storeName = storeName;
    }

    /**
     * @return the format
     */
    public BillFormatStrategy getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(BillFormatStrategy format) {
        this.format = format;
    }

    /**
     * @return the prints
     */
    public PrintStrategy[] getPrints() {
        return prints;
    }

    /**
     * @param prints the prints to set
     */
    public void setPrints(PrintStrategy[] prints) {
        this.prints = prints;
    }
    
}
