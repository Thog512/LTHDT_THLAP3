
package lapth3;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Order order = new Order(1, LocalDate.of(2023, 5, 9));
        
        order.addLineItem(new Product("sp4","Nước tương", 8000), 10);
        order.addLineItem(new Product("sp1","Gạo",18000), 5);
        order.addLineItem(new Product("sp4", "Đường", 10000), 1);
        order.addLineItem(new Product("sp1", "Gạo", 18000), 1);
        
        System.out.println(order.toString());
    }
}
