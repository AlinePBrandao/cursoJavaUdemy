package M7_OO2.Products.entities;

public class Product {
    private int code;
    private String name;
    private int quantity;

    //constructor
    public Product(int code, String name, int quantity){
        this.code = code;
        this.name = name;
        this.quantity = quantity;
    }

    //métodos de acesso
    public int getId(){ //ID não pode ser modificado
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Entrada e saída de estoque
    public void addProduct(int quantity){
        this.quantity += quantity;
    }
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }
    //retorno
    public String toString(){
        return "Code: " + code + ", Name: " + name + ", Stock: " + quantity;
    }

}
