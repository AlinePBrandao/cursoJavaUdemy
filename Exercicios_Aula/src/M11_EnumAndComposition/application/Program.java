package M11_EnumAndComposition.application;

import M11_EnumAndComposition.entities.Order;
import M11_EnumAndComposition.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
