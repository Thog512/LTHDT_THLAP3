
package lapth3b1;

import java.time.LocalDate;

public class Order extends OrderDetail{

    public Order(int quatity, Product product) {
        super(product, quatity);
    }    
    public int orderID;
    public LocalDate orderDate;
    public OrderDetail[] lineItems;
    public int count;
    public double thanhTien;
    
    public void addLineItem(Product p, int q){
        lineItems[count] = new OrderDetail(p, q);
        count++;
    }
    
    
    public double gettongThanhTien(){
        double tongThanhTien = 0;
        for(int i = 0; i < count; i++){    
            tongThanhTien += thanhTien;
        }
        return tongThanhTien;
    }


    public Order(int orderID, LocalDate orderDate, OrderDetail[] lineItems, int count, int quatity, Product product) {
        super(product, quatity);
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = lineItems;
        this.count = count;
    }
    

    
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public OrderDetail[] getLineItems() {
        return lineItems;
    }


    public int getCount() {
        return count;
    }

}
