package yc.discountstrategy;

//
public interface BillFormatStrategy {
    
    public final static String GREET_CUSTOMER = "Hello";
    public final static String THANK_YOU_START = "Thank you for shopping at ";
    public final static String THANK_YOU_END = "  Visit again";
    public final static String BILL_NUM = "BILL No: ";
    public final static String ITEM_ID = "ID";
    public final static String ITEM_NAME = "Item";
    public final static String UNIT_COST = "Unit Cost";
    public final static String QTY = "Qty";
    public final static String PRICE = "Price";
    public final static String DISCOUNT_AMT = "Discount";
    public final static String GRAND_TOTALS = "Grand Totals:";
    public final static String TOTAL_BEFORE_DISCOUNT = "Total Before Discount: ";
    public final static String TOTAL_AFTER_DISCOUNT = "Total After Discount: ";

    public abstract String format(Receipt receipt, String name);
     public abstract String greet(String name);
}
