package yc.discountstrategy;

import java.time.LocalDate;
import java.time.LocalTime;


public class Receipt {
    private static int receiptNo;
    private String receiptDateTime;
    private String storeName;
    private DatabaseStrategy db;
    private Customer customer;
    private LineItem[] items;
    private char currencySym;

    /**
     * Custom constructor initializes required fields.
     * @param storeName - name of seller
     * @param custId - an unique customer id
     * @param db - the persistence solution
     */
    public Receipt(String storeName, String custId, DatabaseStrategy db, char currencySym) {
        setStoreName(storeName);
        receiptNo++;
        receiptDateTime = LocalDate.now() +  " " + LocalTime.now();
        setDb(db);
        setCustomer(db.findCustomrById(custId));
        items = new LineItem[0];
        setCurrencySym(currencySym);
    }
    
    /**
     * Adds a sale item to the receipt
     * @param prodId - the unique id of a product which simulates what a
     * bar code scanner would capture. NOTE: not currently validated.
     * @param qty - the number of this product being purchased
     */
    public final void addItemToReceipt(String prodId, int qty) {
        // needs validation for all arguments passed in
        LineItem item = new LineItem(prodId, qty, db);
        addItemToArray(items, item);
        
        /// OTHER OPTIONS NOT CURRENTLY USED ////
        
//        LineItem[] tempArray = new LineItem[lineItems.length + 1];
//        
//        System.arraycopy(lineItems, 0, tempArray, 0, lineItems.length);
//        tempArray[tempArray.length - 1] = item;
//        lineItems = tempArray;
        
//        for(int i=0; i < lineItems.length; i++) {
//            tempArray[i] = lineItems[i];
//        }
//        tempArray[tempArray.length - 1] = item;
//        lineItems = tempArray;
    }
    
    // proper encapsulation -- hide this helper method because it is not
    // needed anywhere else
    private final void addItemToArray(LineItem[] origArray, LineItem item) {
        LineItem[] tempArray = new LineItem[origArray.length + 1];
        System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
        tempArray[tempArray.length - 1] = item;
       origArray = tempArray;
       items = origArray;
    }
    
    /**
     * Removes a sale item from a receipt.
     * @param prodId - the unique id of a product which simulates what a
     * bar code scanner would capture. NOTE: not curretly validated.
     * @param qty - the number of this product being purchased
     */
    public final void removeItemFromArray(String prodId, int qty) {
        // needs validation for all arguments passed in
        for(int i=0; i < items.length; i++) {
            if(items[i].getProduct().getProdId().equals(prodId)) {
                // delete from memory if found
                items[i] = null;
                break;
            }
        }
        shrinkArray(items);
    }
    
    // proper encapsulation -- hide this helper method because it is not
    // needed anywhere else
    private void shrinkArray(LineItem[] origArray) {
        // Make a new array one size smaller than original
        LineItem[] tempArray = new LineItem[items.length-1];
        
        // copy items into new temporary array if not null
        for(int i=0, j=0; i < origArray.length; i++) {
            if(origArray[i] != null) {
                tempArray[j++] = origArray[i];
            }
        }
        
        // replace original with temp, which is now one smaller
        items = tempArray;
    }
    
    ///// GETTERS/SETTERS DON'T NEED DOCS UNTIL VALIDATION CODE ADDED /////

    public final DatabaseStrategy getDb() {
        return db;
    }

    public final void setDb(DatabaseStrategy db) {
        //needs validation
        this.db = db;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        // needs validation
        this.customer = customer;
    }

    public final LineItem[] getLineItems() {
        return items;
    }

    public final void setLineItems(LineItem[] lineItems) {
        // needs validaiton
        this.items = lineItems;
    }

    public static int getReceiptNo() {
        return receiptNo;
    }

    public final String getStoreName() {
        return storeName;
    }

    public final void setStoreName(String storeName) {
        // needs validation
        this.storeName = storeName;
    }

    /**
     * @param receiptDateTime the receiptDateTime to set
     */
    public final void setReceiptDateTime(String receiptDateTime) {
        this.receiptDateTime = receiptDateTime;
    }

    /**
     * @param currencySymbol the currencySymbol to set
     */
    public final void setCurrencySym(char currencySymbol) {
        this.currencySym = currencySymbol;
    }

    /**
     * @return the receiptDateTime
     */
    public String getReceiptDateTime() {
        return receiptDateTime;
    }

    /**
     * @return the currencySym
     */
    public char getCurrencySym() {
        return currencySym;
    }

    
    
}
