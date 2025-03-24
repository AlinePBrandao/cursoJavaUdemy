package M7_OO2.Estoque.entities;

import java.util.Date;

public class Order {

    private Date date;
    private Products products;

    public Order(Date date, Products products) {
        this.date = date;
        this.products = products;
        this.products.name = "TV"; //pode acessar o atributo e modificar porque está no mesmo pacote e name não tem modificador de acesso (private, public)
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Products getProducts() {
        return products;
    }
    public void setProducts(Products products) {
        this.products = products;
    }
}
