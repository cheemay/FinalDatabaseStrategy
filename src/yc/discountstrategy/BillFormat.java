package yc.discountstrategy;

import java.util.Random;

public class BillFormat implements BillFormatStrategy {
    double total=0;
    int totalqty=0;
    double totalsavings=0;
    String data = "";
    
    @Override
    public String format(Receipt receipts, String name) {
        LineItem [] items = receipts.getLineItems();
        
        data += "--------";
        data += "------------------------";
        data += "---------";
        data += "-------";
        data += "------------------";
        data += "\n";
        data += "Bill No. ";
        data += new Random().nextInt(100);
        data += "\n";
        data += BillFormatStrategy.GREET_CUSTOMER ;
        data += ", ";
        data += receipts.getCustomer().getCustName();
        data += "!";
        data += "\n";
        data += receipts.getReceiptDateTime().substring(0, 19);
        data += "\n";
        data += "--------";
        data += "------------------------";
        data += "---------";
        data += "-------";
        data += "------------------";
        data += "\n";
        data += String.format("%-7s", "ProdID");
        data += String.format("%-20s", "ProductName");
        data += String.format("%-8s", "Price");
        data += String.format("%-6s", "Qty");
        data += String.format("%-12s", "ExactPrice");
        data += String.format("%-10s", "Discount");
        data += "\n";
        data += "--------";
        data += "------------------------";
        data += "---------";
        data += "-------";
        data += "------------------";
        data += "\n";
       for(LineItem item : items){
           data += String.format("%-7s",item.getProduct().getProdId()) ;
           data += String.format("%-20s",item.getProduct().getProdName());
           data += String.format("%s %-8s",receipts.getCurrencySym(),  item.getProduct().getUnitCost());
           data += String.format("%-6s",  item.getQty());
           data += String.format("%s %.2f%-8s",receipts.getCurrencySym(),  (item.getProduct().getUnitCost() * item.getQty()),"");
           data += String.format("%s %.2f%-10s",receipts.getCurrencySym(), item.getProduct().getDiscount().getDiscountAmt(item.getQty(),(item.getProduct().getUnitCost() * item.getQty())),"");
           data +="\n";
           
           total += (item.getProduct().getUnitCost() * item.getQty());
           totalqty += item.getQty();
           totalsavings += item.getProduct().getDiscount().getDiscountAmt(item.getQty(),(item.getProduct().getUnitCost() * item.getQty()));
       }
        data += "--------";
        data += "------------------------";
        data += "---------";
        data += "-------";
        data += "------------------";
        data += "\n|";
        data += String.format("Item(s): [%d]",totalqty);
        data += "|\n|";
        data += String.format("Bill total: %s %.2f",receipts.getCurrencySym() ,total);
        data += "|\n|";
        data += String.format("Today's savings*: %s %.2f",receipts.getCurrencySym() ,totalsavings);
        data += "|\n";
        data += "--------";
        data += "------------------------";
        data += "---------";
        data += "-------";
        data += "------------------";
        data += "\n";
        
        data += THANK_YOU_START;
        data += "\"";
        data += receipts.getStoreName();
        data += "\",";
        data += THANK_YOU_END;
        return data;
    }
    @Override
    public final String greet(String name) {
        
        return "greeting";
        
    }
}
