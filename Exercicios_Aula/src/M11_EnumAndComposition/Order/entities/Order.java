package M11_EnumAndComposition.Order.entities;

import M11_EnumAndComposition.Order.entities.enums.OrderStatus;

import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus orderStatus;

    //Associações - Composição de Objetos
    private Client client; //Order possui 1 Client
    private List<OrderItem> items; //Order possui vários Items

}
