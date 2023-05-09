
package lapth3;

public class OrderDetail{
    public int quantity;
    public Product product;


    public OrderDetail(Product product, int quantity) {
        this.quantity = quantity;
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "quantity=" + quantity + ", product=" + product + '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }   

}
