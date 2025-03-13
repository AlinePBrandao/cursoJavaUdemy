package M7_ConstructorsAndThis.EstoqueThis.entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public Products(String name, double price, int quantity){ //convenção usar o mesmo nome dos atributos no parametro
        this.name = name; //1° name referencia o atributo do objeto e não o parametro do método
        this.price = price;
        this.quantity = quantity;
    }//construtor não recebe tipo de retorno - int, double- e executa na instanciação do objeto

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){//ocorre ambiguidade entre o nome do atributo da classe e o parâmetro passado
        this.quantity += quantity; //this acessa o atributo da classe e não o parametro, referencia o atributo da classe
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){ //sobreposição da operação toString padrão, pode-se implementar a versão toString desejada
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
