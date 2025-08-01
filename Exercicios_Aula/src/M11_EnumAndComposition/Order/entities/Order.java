package M11_EnumAndComposition.Order.entities;

import M11_EnumAndComposition.Order.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus orderStatus;

    //Associações - Composição de Objetos
    private Client client; //Order possui 1 Client
    private List<OrderItem> items = new ArrayList<>(); //Order possui vários Items
    //List instanciada- não entra no constructor

    public Order(Date moment, OrderStatus orderStatus, Client client){
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    //List<OrderItem> sem get e set- List não pode ser trocada

    public void addItem(OrderItem item){
        items.add(item); //add item na list
    }
    public void removeItem(OrderItem item){
        items.remove(item); //remove item na list
    }

    public Double total(){
        double sum = 0.0;
        for (OrderItem it : items){
            sum += it.subTotal(); //delega calculo p item subtotsl
        }
        return sum;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(orderStatus + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items \n");
        for (OrderItem item : items){
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
