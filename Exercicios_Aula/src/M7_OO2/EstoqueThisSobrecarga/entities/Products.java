package M7_OO2.EstoqueThisSobrecarga.entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    } //construtor não recebe tipo de retorno - int, double- e executa na instanciação do objeto

    public Products(String name, double price){
        this.name = name;
        this.price = price;
        quantity = 0; //opcional - java inicia números de objetos e arrays com valor 0;
    } //quantity não precisa de this porque não existe mais ambiguidade (quem é parâmtro e atributo)

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity; //this acessa o atributo da classe e não o parametro, referencia o atributo da classe
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){ //sobreposição da operação toString padrão, pode-se implementar a versão toString desejada
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
