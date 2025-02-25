package M6_OOJava.Estoque.entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){//ocorre ambiguidade entre o nome do atributo da classe e o parâmetro passado
    //para referenciar o atributo da classe é usada a palavra reservada this, faz autoreferencia ao objeto
        this.quantity += quantity; //this acessa o atributo da classe e não o parametro
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){ //sobreposição da operação toString padrão, pode-se implementar a versão toString desejada
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
